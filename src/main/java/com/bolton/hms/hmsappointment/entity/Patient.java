package com.bolton.hms.hmsappointment.entity;

import javax.persistence.*;
import javax.print.Doc;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patID;
    private String patName;
    private String patMail;
    private String patPassword;
    private String patMobile;
    private String patAddress;

    @ManyToOne
    @JoinColumn(name = "docNIC",nullable = false)
    private Doctor doctor;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointmentList;

    public Patient() {
    }

    public Patient(String patName, String patMail, String patPassword, String patMobile, String patAddress, Doctor doctor) {
        this.patName = patName;
        this.patMail = patMail;
        this.patPassword = patPassword;
        this.patMobile = patMobile;
        this.patAddress = patAddress;
        this.doctor = doctor;
    }


    public int getPatID() {
        return patID;
    }

    public void setPatID(int patID) {
        this.patID = patID;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getPatMail() {
        return patMail;
    }

    public void setPatMail(String patMail) {
        this.patMail = patMail;
    }

    public String getPatPassword() {
        return patPassword;
    }

    public void setPatPassword(String patPassword) {
        this.patPassword = patPassword;
    }

    public String getPatMobile() {
        return patMobile;
    }

    public void setPatMobile(String patMobile) {
        this.patMobile = patMobile;
    }

    public String getPatAddress() {
        return patAddress;
    }

    public void setPatAddress(String patAddress) {
        this.patAddress = patAddress;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patID=" + patID +
                ", patName='" + patName + '\'' +
                ", patMail='" + patMail + '\'' +
                ", patPassword='" + patPassword + '\'' +
                ", patMobile='" + patMobile + '\'' +
                ", patAddress='" + patAddress + '\'' +
                ", doctor=" + doctor +
                ", appointmentList=" + appointmentList +
                '}';
    }
}
