package pl.pionwit.vpv.BisnesLogic.Contragents;

import java.util.Date;

public class ContragentItem {
    private int id;
    private String contragent;
    private String contact;
    private String phone;
    private Boolean select;
    private int imgIcon;
    private Date dateLastChanges;

    public ContragentItem(String contragent,String contact, String phone,int imgIcon, Boolean select) {
        this.contragent = contragent;
        this.phone = phone;
        this.select = select;
        this.imgIcon=imgIcon;
        this.contact=contact;
    }

    public Date getDateLastChanges() {
        return dateLastChanges;
    }

    public void setDateLastChanges(Date dateLastChanges) {
        this.dateLastChanges = dateLastChanges;
    }

    public String getContact() {
        return contact;
    }

    public String getContragent() {
        return contragent;
    }

    public String getPhone() {
        return phone;
    }

    public Boolean getSelect() {
        return select;
    }

    public int getImgIcon() {
        return imgIcon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
}
