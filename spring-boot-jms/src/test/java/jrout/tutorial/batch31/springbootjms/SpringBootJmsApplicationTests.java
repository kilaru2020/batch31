package jrout.tutorial.batch31.springbootjms;

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
class SpringBootJmsApplicationTests {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void produceMessage() throws Exception {
        String queueName = "inbound.queue";
        jmsTemplate.send(queueName, session -> {
            TextMessage message = session.createTextMessage();
            message.setText("{\"name\":\"Jayram Rout\"}");
            return message;
        });
    }

    /**
     * Here we have to manually set the pubsubdomain to true.
     * @throws Exception
     */
    @Test
    public void produceTopicMessage() throws Exception {
        String queueName = "inbound.topic";
        jmsTemplate.setPubSubDomain(true);
        jmsTemplate.send(queueName, session -> {
            TextMessage message = session.createTextMessage();
            message.setText("{\"name\":\"Jayram Rout\"}");
            return message;
        });
    }
}
