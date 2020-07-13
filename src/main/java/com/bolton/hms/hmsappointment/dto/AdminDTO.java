package com.bolton.hms.hmsappointment.dto;

import java.util.List;

public class AdminDTO {

    private String adNIC ;
    private String adName;
    private String adMobile;
    private String adMail;
    private String adPassword;

    private List<DoctorDTO> doctorDtoList;

    private List<CategoryDTO> categoriesDtoList;

    public AdminDTO() {
    }

    public AdminDTO(String adNIC, String adName, String adMobile, String adMail, String adPassword) {
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

    public List<DoctorDTO> getDoctorDtoList() {
        return doctorDtoList;
    }

    public void setDoctorDtoList(List<DoctorDTO> doctorDtoList) {
        this.doctorDtoList = doctorDtoList;
    }

    public List<CategoryDTO> getCategoriesDtoList() {
        return categoriesDtoList;
    }

    public void setCategoriesDtoList(List<CategoryDTO> categoriesDtoList) {
        this.categoriesDtoList = categoriesDtoList;
    }

    @Override
    public String toString() {
        return "AdminDTO{" +
                "adNIC='" + adNIC + '\'' +
                ", adName='" + adName + '\'' +
                ", adMobile='" + adMobile + '\'' +
                ", adMail='" + adMail + '\'' +
                ", adPassword='" + adPassword + '\'' +
                ", doctorDtoList=" + doctorDtoList +
                ", categoriesDtoList=" + categoriesDtoList +
                '}';
    }
}
