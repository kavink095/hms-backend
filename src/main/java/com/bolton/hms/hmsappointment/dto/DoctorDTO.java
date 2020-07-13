package com.bolton.hms.hmsappointment.dto;

import java.util.List;

public class DoctorDTO {

    private String docNIC;
    private String docFirstName;
    private String docLastName;
    private String docMail;
    private String docMobile;

    private AdminDTO adminDto;

    private List<PatientDTO> patientsDtoList;

    private ChargesDTO chargesDto;

    private CategoryDTO categoryDto;

    public DoctorDTO() {
    }

    public DoctorDTO(String docNIC, String docFirstName, String docLastName, String docMail, String docMobile, AdminDTO adminDto, ChargesDTO chargesDto, CategoryDTO categoryDto) {
        this.docNIC = docNIC;
        this.docFirstName = docFirstName;
        this.docLastName = docLastName;
        this.docMail = docMail;
        this.docMobile = docMobile;
        this.adminDto = adminDto;
        this.chargesDto = chargesDto;
        this.categoryDto = categoryDto;
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

    public AdminDTO getAdminDto() {
        return adminDto;
    }

    public void setAdminDto(AdminDTO adminDto) {
        this.adminDto = adminDto;
    }

    public List<PatientDTO> getPatientsDtoList() {
        return patientsDtoList;
    }

    public void setPatientsDtoList(List<PatientDTO> patientsDtoList) {
        this.patientsDtoList = patientsDtoList;
    }

    public ChargesDTO getChargesDto() {
        return chargesDto;
    }

    public void setChargesDto(ChargesDTO chargesDto) {
        this.chargesDto = chargesDto;
    }

    public CategoryDTO getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDTO categoryDto) {
        this.categoryDto = categoryDto;
    }

    @Override
    public String toString() {
        return "DoctorDTO{" +
                "docNIC='" + docNIC + '\'' +
                ", docFirstName='" + docFirstName + '\'' +
                ", docLastName='" + docLastName + '\'' +
                ", docMail='" + docMail + '\'' +
                ", docMobile='" + docMobile + '\'' +
                ", adminDto=" + adminDto +
                ", patientsDtoList=" + patientsDtoList +
                ", chargesDto=" + chargesDto +
                ", categoryDto=" + categoryDto +
                '}';
    }
}
