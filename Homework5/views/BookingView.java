package Homework5.views;

import java.util.Collection;
import java.util.Date;

import Homework5.models.Table;
import Homework5.presenters.View;
import Homework5.presenters.ViewObserver;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Устанавливаем наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     *
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            Имя
     */
    public void reservationTable(Date reservationDate, int tableNo, String name) {
        if (observer != null) {
            observer.onReservationTable(reservationDate, tableNo, name);
        }
    }

    @Override
    public void showReservationRresult(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Столик забронирован успешно, номер вашей брони: #%d \n", reservationNo);
        }
        else{
            System.out.println("Не удалось забронировать столик, попробуйте повторить бронирование позже");
        }
    }

    @Override
    public void showChangeReservationResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Отменена бронь #%d\n", reservationNo);
        } else {
            System.out.println("Не удалось удалить бронь. Проверьте ваши данные.");
        }
    }


    /**
     * TODO: Добавить реализацию в рамках выполнения домашней работы
     * Действие клиента (пользователь нажал на кнопку отмены бронирования), бронирование столика
     *
     * @param  oldReservation номер старого резерва
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        if (observer != null) {
            observer.onChangeReservationTable(oldReservation,reservationDate, tableNo, name);
        }
    }

    
}
