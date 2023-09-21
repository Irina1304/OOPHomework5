package Homework5.presenters;

import java.util.Collection;
import java.util.Date;

import Homework5.models.Table;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
    
}
