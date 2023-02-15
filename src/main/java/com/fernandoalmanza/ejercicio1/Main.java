package com.fernandoalmanza.ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-ejercicio1.xml");
        Saludo saludo = (Saludo) context.getBean("saludo");

        saludo.imprimirSaludo();
    }
}
