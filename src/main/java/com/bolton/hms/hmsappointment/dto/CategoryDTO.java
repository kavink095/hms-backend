package com.bolton.hms.hmsappointment.dto;

import java.util.Date;
import java.util.List;

public class CategoryDTO {

    private String catID;
    private String catDesc;
    private Date creaDate;
    private String creaBy;

    private List<DoctorDTO> doctorsDtoList;

    public CategoryDTO() {
    }

    public CategoryDTO(String catID, String catDesc, Date creaDate, String creaBy) {
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

    public List<DoctorDTO> getDoctorsDtoList() {
        return doctorsDtoList;
    }

    public void setDoctorsDtoList(List<DoctorDTO> doctorsDtoList) {
        this.doctorsDtoList = doctorsDtoList;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "catID='" + catID + '\'' +
                ", catDesc='" + catDesc + '\'' +
                ", creaDate=" + creaDate +
                ", creaBy='" + creaBy + '\'' +
                ", doctorsDtoList=" + doctorsDtoList +
                '}';
    }
}
