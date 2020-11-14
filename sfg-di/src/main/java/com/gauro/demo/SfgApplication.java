package com.gauro.demo;

import com.gauro.demo.controllers.*;
import com.gauro.demo.examplebeans.FakeDataSource;
import com.gauro.demo.examplebeans.FakeJmsBroker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
public class SfgApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgApplication.class, args);


        log.info("--------------MyController-from Primary Bean--");
        MyController myController = (MyController) ctx.getBean("myController");
        log.info(myController.sayHello());


        log.info("--------------PropertyInjectedController");
        log.info(ctx.getBean(PropertyInjectedController.class).sayHello());

        log.info("From Constructor====>");
        log.info(ctx.getBean(ConstructorInjectedController.class).sayHello());

        log.info("---------GetterInjectedController");
        log.info(ctx.getBean(GetterInjectedController.class).sayHello());

        log.info("---------fakeDataSource");
        FakeDataSource fakeDataSource=(FakeDataSource) ctx.getBean(FakeDataSource.class);
        log.info(fakeDataSource.getUser());
        log.info(fakeDataSource.toString());

        log.info("------FakeJMS");
        FakeJmsBroker fakeJmsBroker=(FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        log.info(fakeJmsBroker.toString());

    }

}
