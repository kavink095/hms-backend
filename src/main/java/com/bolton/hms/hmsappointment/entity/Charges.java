package com.bolton.hms.hmsappointment.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.print.Doc;
import java.util.List;

@Entity
@Table(name = "charges")
public class Charges {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(generator="system-uuid")
//    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private int cID;
    private double cValue;
    private String cDesc;

    @OneToMany(mappedBy = "charges")
    private List<Doctor> doctorList;

    @OneToMany(mappedBy = "charges")
    private List<Payments> paymentList;


    public Charges() {
    }

    public Charges(int cID,double cValue, String cDesc) {
        this.cID = cID;
        this.cValue = cValue;
        this.cDesc = cDesc;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public double getcValue() {
        return cValue;
    }

    public void setcValue(double cValue) {
        this.cValue = cValue;
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public List<Payments> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payments> paymentList) {
        this.paymentList = paymentList;
    }

    @Override
    public String toString() {
        return "Charges{" +
                "cID=" + cID +
                ", cValue=" + cValue +
                ", cDesc='" + cDesc + '\'' +
                ", doctorList=" + doctorList +
                ", paymentList=" + paymentList +
                '}';
    }
}
