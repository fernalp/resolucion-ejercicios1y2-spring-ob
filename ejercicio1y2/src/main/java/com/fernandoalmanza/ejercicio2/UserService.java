package com.fernandoalmanza.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
        System.out.println("Se instancia la clase UserService");
    }
}
