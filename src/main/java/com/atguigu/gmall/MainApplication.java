package com.atguigu.gmall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("provider.xml");
        ((ClassPathXmlApplicationContext) ac).start();

        System.in.read();//阻塞，不让程序退出
    }
}
