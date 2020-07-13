package com.bolton.hms.hmsappointment.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String catID;
    private String catDesc;
    private Date creaDate;
    private String creaBy;

    @OneToMany(mappedBy = "category")
    private List<Doctor> doctorList;

    public Category() {
    }

    public Category(String catID, String catDesc, Date creaDate, String creaBy) {
        this.catID = catID;
        this.catDesc = catDesc;
        this.creaDate = creaDate;
        this.creaBy = creaBy;
    }

    public String getCatID() {
        return catID;
    }

    public void setCatID(String catID) {
        this.catID = catID;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public Date getCreaDate() {
        return creaDate;
    }

    public void setCreaDate(Date creaDate) {
        this.creaDate = creaDate;
    }

    public String getCreaBy() {
        return creaBy;
    }

    public void setCreaBy(String creaBy) {
        this.creaBy = creaBy;
    }


    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catID='" + catID + '\'' +
                ", catDesc='" + catDesc + '\'' +
                ", creaDate=" + creaDate +
                ", creaBy='" + creaBy + '\'' +
                ", doctorList=" + doctorList +
                '}';
    }
}
