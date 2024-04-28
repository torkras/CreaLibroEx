package com.developJavaApps;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("978-84-695-2690-3", Calendar.getInstance());
        System.out.println("Libro 1: ISBN: " + libro1.getIsbn());
        System.out.println("Libro 1: Fecha de publicación: " + libro1.getFechaPublicacion().getTime().toString());

        Libro libro2 = new Libro();
        libro2.setFechaPublicacion(new GregorianCalendar(2022, 12, 2, 14, 00, 00));
        System.out.println("Libro 1: Fecha de publicación: " + libro2.getFechaPublicacion().getTime().toString());
    }
}