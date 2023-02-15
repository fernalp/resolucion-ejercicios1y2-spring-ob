package com.fernandoalmanza.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);
		EquipoRepository equipoRepository = context.getBean(EquipoRepository.class);

		Equipo monitor = new Equipo(null, "Monitor Multiparámetros", "Mindray", "MEC2000", "123456789");

		System.out.println(equipoRepository.count());

		equipoRepository.save(monitor);

		System.out.println(equipoRepository.findAll());
		System.out.println(equipoRepository.count());

	}

}
