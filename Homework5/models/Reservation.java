package Homework5.models;

import java.util.Date;

public class Reservation {

    private static int counter = 100;
    private final int id;

    private Date date;
    private String name;

    {
        id = counter++;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }


    
}
