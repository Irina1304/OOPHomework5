package Homework5;

import java.util.Date;

import Homework5.models.TableModel;
import Homework5.presenters.BookingPresenter;
import Homework5.views.BookingView;

public class program {

    public static void main(String[] args) {

        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateTablesUI();

        view.reservationTable(new Date(), 1, "Ирина");

        view.changeReservationTable(100, new Date(), 1, "Ирина");
        
    }
    
}
