package Homework5.presenters;

import java.util.Collection;

import Homework5.models.Table;

public interface View {

    void setObserver(ViewObserver observer);

    void showTables(Collection<Table> tables);

    void showReservationRresult(int reservationNo);

    void showChangeReservationResult(int reservationNo);
    
    
}
