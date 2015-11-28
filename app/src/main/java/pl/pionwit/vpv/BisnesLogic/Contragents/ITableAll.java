package pl.pionwit.vpv.BisnesLogic.Contragents;

import java.util.Date;

// Интерфейс описывающий поведение объекта одной записи в таблице бд

public interface ITableAll {
    int getId();
    void setDate(Date date);
}
