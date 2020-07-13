package com.bolton.hms.hmsappointment.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String docNIC;
    private String docFirstName;
    private String docLastName;
    private String docMail;
    private String docMobile;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "adNIC", nullable = false)
    private Admin admin;

    @OneToMany(mappedBy = "doctor")
    private List<Patient> patientsList;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointmentList;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "cID", nullable = false)
    private Charges charges;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "catID", nullable = false)
    private Category category;

    public Doctor() {
    }

    public Doctor(String docNIC, String docFirstName, String docLastName, String docMail, String docMobile, Admin admin, Charges charges, Category category) {
        this.docNIC = docNIC;
        this.docFirstName = docFirstName;
        this.docLastName = docLastName;
        this.docMail = docMail;
        this.docMobile = docMobile;
        this.admin = admin;
        this.charges = charges;
        this.category = category;
    }

    public String getDocNIC() {
        return docNIC;
    }

    public void setDocNIC(String docNIC) {
        this.docNIC = docNIC;
    }

    public String getDocFirstName() {
        return docFirstName;
    }

    public void setDocFirstName(String docFirstName) {
        this.docFirstName = docFirstName;
    }

    public String getDocLastName() {
        return docLastName;
    }

    public void setDocLastName(String docLastName) {
        this.docLastName = docLastName;
    }

    public String getDocMail() {
        return docMail;
    }

    public void setDocMail(String docMail) {
        this.docMail = docMail;
    }

    public String getDocMobile() {
        return docMobile;
    }

    public void setDocMobile(String docMobile) {
        this.docMobile = docMobile;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Patient> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<Patient> patientsList) {
        this.patientsList = patientsList;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public Charges getCharges() {
        return charges;
    }

    public void setCharges(Charges charges) {
        this.charges = charges;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "docNIC='" + docNIC + '\'' +
                ", docFirstName='" + docFirstName + '\'' +
                ", docLastName='" + docLastName + '\'' +
                ", docMail='" + docMail + '\'' +
                ", docMobile='" + docMobile + '\'' +
                ", admin=" + admin +
                ", patientsList=" + patientsList +
                ", appointmentList=" + appointmentList +
                ", charges=" + charges +
                ", category=" + category +
                '}';
    }
}
