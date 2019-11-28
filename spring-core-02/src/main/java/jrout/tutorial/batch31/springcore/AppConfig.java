package jrout.tutorial.batch31.springcore;

import jrout.tutorial.batch31.springcore.service.IMusic;
import jrout.tutorial.batch31.springcore.service.impl.BoseMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "jrout.tutorial.batch31.springcore")
public class AppConfig {

    @Bean
    public IMusic getMusic(){
        IMusic music = new BoseMusic();
        return music;
    }
}
