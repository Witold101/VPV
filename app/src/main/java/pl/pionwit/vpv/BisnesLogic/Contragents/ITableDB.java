package pl.pionwit.vpv.BisnesLogic.Contragents;

import java.util.Date;

// Интерфейс описывающий поведение таблицы БД

public interface ITableDB <T> {
    void add(T table);
    boolean dell(int id);
    boolean edit(T table);
    void setDateTimeTable(Date dateTime, int id);
    T getItem(int id);
}
