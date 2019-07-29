package com.denk.demo.annotation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 */
@SpringBootApplication
public class App     {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class);
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }



//    @Bean
//    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
//        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
//        factory.setPort(9090);
//        return factory;
//    }
}
