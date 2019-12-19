package jrout.tutorial.batch31.springbootjms2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@SpringBootTest
class SpringBootJms2ApplicationTests {

    @Autowired
    JmsTemplate jmsTemplate;

    @Test
    void contextLoads() {
    }


    @Test
    public void produceMessage() throws Exception {
        String queueName = "inbound.queue";
        /*jmsTemplate.send(queueName, session -> {
            TextMessage message = session.createTextMessage();
            message.setText("{\"name\":\"Jayram Rout\"}");
            return message;
        });*/

        jmsTemplate.send(queueName, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                textMessage.setText("Hello Peter");
                return textMessage;
            }
        });
    }

    @Test
    public void produceTopicMessage() throws Exception {
        String queueName = "inbound.topic";
        jmsTemplate.send(queueName, session -> {
            TextMessage message = session.createTextMessage();
            message.setText("{\"name\":\"Peter\"}");
            return message;
        });

        /*jmsTemplate.send(queueName, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                textMessage.setText("Hello Peter");
                return textMessage;
            }
        });

        jmsTemplate.send(queueName,new MyMessageCreator());*/
    }

    class MyMessageCreator implements MessageCreator{
        @Override
        public Message createMessage(Session session) throws JMSException {
            TextMessage textMessage = session.createTextMessage();
            textMessage.setText("Hello Peter");
            return textMessage;
        }
    }
}
