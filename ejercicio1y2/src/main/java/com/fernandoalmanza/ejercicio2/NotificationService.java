package com.fernandoalmanza.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService() {
        System.out.println("Se ah inicializado la Clase NotificationService");
    }

    public void imprimirSaludo(){
        System.out.println("Hola, este es un saludo desde notificación service");
    }
}
