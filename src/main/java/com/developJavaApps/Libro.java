package com.developJavaApps;

import java.util.Calendar;

public class Libro {
    private String   isbn;
    private Calendar fechaPublicacion;

    public Libro () {}

    public Libro (String isbn, Calendar fechaPublicacion ) {
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro (String isbn) {
        this.isbn = isbn;
        this.fechaPublicacion = Calendar.getInstance();
    }

    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn () {
        return this.isbn;
    }

    public void setFechaPublicacion (Calendar fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Calendar getFechaPublicacion () {
        return this.fechaPublicacion;
    }
}
