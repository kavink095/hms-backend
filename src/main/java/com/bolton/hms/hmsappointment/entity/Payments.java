package com.bolton.hms.hmsappointment.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String payID;
    private String payDesc;
    private Date payDate;
    private double payVal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "apID", nullable = false)
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(name = "cID", nullable = false)
    private Charges charges;

    public Payments() {
    }

    public Payments(String payDesc, Date payDate, double payVal, Appointment appointment, Charges charges) {
        this.payDesc = payDesc;
        this.payDate = payDate;
        this.payVal = payVal;
        this.appointment = appointment;
        this.charges = charges;
    }

    public String getPayID() {
        return payID;
    }

    public void setPayID(String payID) {
        this.payID = payID;
    }

    public String getPayDesc() {
        return payDesc;
    }

    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public double getPayVal() {
        return payVal;
    }

    public void setPayVal(double payVal) {
        this.payVal = payVal;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Charges getCharges() {
        return charges;
    }

    public void setCharges(Charges charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "payID=" + payID +
                ", payDesc='" + payDesc + '\'' +
                ", payDate=" + payDate +
                ", payVal=" + payVal +
                ", appointment=" + appointment +
                ", charges=" + charges +
                '}';
    }
}

