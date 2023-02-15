package com.fernandoalmanza.ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-ejercicio2.xml");

        UserService userService = (UserService) context.getBean("userService");

        userService.notificationService.imprimirSaludo();

    }
}
