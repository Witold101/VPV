package pl.pionwit.vpv.BisnesLogic.Contragents;


import java.util.Date;

public class Mail extends TableItem implements ITableAll {
    private String mail;
    private int contactId;


    public Mail(Date date) {
        super(date);
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getContactId() {
        return contactId;
    }

    @Override
    public void setDate(Date date) {
        setDateLastChanges(date);
    }


}
