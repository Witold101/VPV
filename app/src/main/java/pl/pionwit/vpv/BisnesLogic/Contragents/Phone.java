package pl.pionwit.vpv.BisnesLogic.Contragents;

import java.util.Date;

public class Phone extends TableItem implements ITableAll {
    private int countryId;
    private String namber;
    private int typePhone;
    private int contactId;

    public Phone(int countryId, String namber, int typePhone, int contactId, Date date) {
        super(date);
        this.countryId = countryId;
        this.namber = namber;
        this.typePhone = typePhone;
        this.contactId = contactId;
    }

    @Override
    public void setDate(Date date) {
        setDateLastChanges(date);
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getNamber() {
        return namber;
    }

    public void setNamber(String namber) {
        this.namber = namber;
    }

    public int getTypePhone() {
        return typePhone;
    }

    public void setTypePhone(int typePhone) {
        this.typePhone = typePhone;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
}
