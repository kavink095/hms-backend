package com.bolton.hms.hmsappointment.entity;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String apID;
    private Date apCreaDate;
    private Date apForDate;
    private String apTime;
    private String apDesc;

    @ManyToOne
    @JoinColumn(name = "patID", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "docNIC", nullable = false)
    private Doctor doctor;

    @OneToOne(mappedBy = "appointment")
    private Payments payments;

    @ManyToOne
    @JoinColumn(name = "cID", nullable = false)
    private Charges charges;

    public Appointment() {
    }

    public Appointment(Date apCreaDate, Date apForDate, String apTime, String apDesc, Patient patient, Doctor doctor, Payments payments, Charges charges) {
        this.apCreaDate = apCreaDate;
        this.apForDate = apForDate;
        this.apTime = apTime;
        this.apDesc = apDesc;
        this.patient = patient;
        this.doctor = doctor;
        this.payments = payments;
        this.charges = charges;
    }

    public String getApID() {
        return apID;
    }

    public void setApID(String apID) {
        this.apID = apID;
    }

    public Date getApCreaDate() {
        return apCreaDate;
    }

    public void setApCreaDate(Date apCreaDate) {
        this.apCreaDate = apCreaDate;
    }

    public Date getApForDate() {
        return apForDate;
    }

    public void setApForDate(Date apForDate) {
        this.apForDate = apForDate;
    }

    public String getApTime() {
        return apTime;
    }

    public void setApTime(String apTime) {
        this.apTime = apTime;
    }

    public String getApDesc() {
        return apDesc;
    }

    public void setApDesc(String apDesc) {
        this.apDesc = apDesc;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    public Charges getCharges() {
        return charges;
    }

    public void setCharges(Charges charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "apID=" + apID +
                ", apCreaDate=" + apCreaDate +
                ", apForDate='" + apForDate + '\'' +
                ", apTime='" + apTime + '\'' +
                ", apDesc='" + apDesc + '\'' +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", payments=" + payments +
                ", charges=" + charges +
                '}';
    }

}
