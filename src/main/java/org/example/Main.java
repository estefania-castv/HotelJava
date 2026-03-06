package org.example;

import application.domain.Bedroom;
import application.domain.service;
import application.domain.guest;


public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema del Hotel");


        Bedroom room = new Bedroom();
        room.setRoom("101");
        room.setRoomType("Suite");
        room.setPrice(120);

        System.out.println("Habitación: " + room.getRoom());
        System.out.println("Tipo: " + room.getRoomType());
        System.out.println("Precio: " + room.getPrice());


        service service = new service();
        service.setName("Spa");
        service.setPrice(50);

        System.out.println("Servicio: " + service.getName());
        System.out.println("Precio servicio: " + service.getPrice());


        guest guest = new guest();
        guest.setName("Juan");
        guest.setLastName("Perez");

        System.out.println("Huésped: " + guest.getName() + " " + guest.getLastName());
    }
}