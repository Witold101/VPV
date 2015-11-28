package pl.pionwit.vpv.BisnesLogic.Contragents;

// Класс родитель для всех записей в табицах БД

import java.util.Date;

public class TableItem {
    private int id;
    private Date dateLastChanges;

    public TableItem( Date date){
        dateLastChanges=date;
    }


    public int getId() {
        return id;
    }

    public Date getDateLastChanges() {
        return dateLastChanges;
    }

    public void setDateLastChanges(Date dateLastChanges) {
        this.dateLastChanges = dateLastChanges;
    }
}
