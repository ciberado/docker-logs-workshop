package com.capside.simplelogdemo;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication @Slf4j
public class App implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override @SneakyThrows
    public void run(String... strings) throws Exception {
        int i=0;
        while (true) {
            double rnd = Math.random();
            if (rnd > 0.95) log.error(String.format("Message %s.", i));
            else if (rnd > 0.7) log.warn(String.format("Message %s.", i));
            else if (rnd > 0.5) log.info(String.format("Message %s.", i));
            else log.debug(String.format("Message %s.", i));
                    
            i = i + 1;
            Thread.sleep(2*1000);
        } 
    }
}
