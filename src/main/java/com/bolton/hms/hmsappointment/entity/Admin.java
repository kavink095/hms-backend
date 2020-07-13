package com.bolton.hms.hmsappointment.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @Column(name = "adNIC")
    private String adNIC;
    private String adName;
    private String adMobile;
    private String adMail;
    private String adPassword;

    @OneToMany(mappedBy = "admin")
    private List<Doctor> doctorList;


    public Admin() {
    }

    public Admin(String adNIC, String adName, String adMobile, String adMail, String adPassword) {
        this.adNIC = adNIC;
        this.adName = adName;
        this.adMobile = adMobile;
        this.adMail = adMail;
        this.adPassword = adPassword;
    }

    public String getAdNIC() {
        return adNIC;
    }

    public void setAdNIC(String adNIC) {
        this.adNIC = adNIC;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdMobile() {
        return adMobile;
    }

    public void setAdMobile(String adMobile) {
        this.adMobile = adMobile;
    }

    public String getAdMail() {
        return adMail;
    }

    public void setAdMail(String adMail) {
        this.adMail = adMail;
    }

    public String getAdPassword() {
        return adPassword;
    }

    public void setAdPassword(String adPassword) {
        this.adPassword = adPassword;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "adNIC='" + adNIC + '\'' +
                ", adName='" + adName + '\'' +
                ", adMobile='" + adMobile + '\'' +
                ", adMail='" + adMail + '\'' +
                ", adPassword='" + adPassword + '\'' +
                ", doctorList=" + doctorList +
                '}';
    }
}
