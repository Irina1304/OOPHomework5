package Homework5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Homework5.presenters.Model;

public class TableModel implements Model{

    private Collection<Table> tables;

        /**
     * Получить список столиков
     */
    public Collection<Table> loadTables(){

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Метод, позволяющий бронировать столик
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер бронирования
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table t : tables){
            if (t.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                t.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**
     * TODO: Добавить реализацию в рамках выполнения домашней работы
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     * @return
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (Table table : tables){
            if (table.getNo() == tableNo){
                Collection<Reservation> reservations = table.getReservations();
                for (Reservation reservation : reservations) {
                    if(reservation.getId() == oldReservation){
                        reservations.remove(reservation);
                        return oldReservation;
                    }
                }
            }
        }
        return -1;
    }
    
}
