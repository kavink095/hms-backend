package com.bolton.hms.hmsappointment.dto;

import java.util.List;

public class PatientDTO {

    private int patID;
    private String patName;
    private String patMail;
    private String patPassword;
    private String patMobile;
    private String patAddress;

    private DoctorDTO doctorDto;

    private List<AppointmentDTO> appointmentDtoList;

    public PatientDTO() {
    }

    public PatientDTO(int patID, String patName, String patMail, String patPassword, String patMobile, String patAddress, DoctorDTO doctorDto) {
        this.patID = patID;
        this.patName = patName;
        this.patMail = patMail;
        this.patPassword = patPassword;
        this.patMobile = patMobile;
        this.patAddress = patAddress;
        this.doctorDto = doctorDto;
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

    public DoctorDTO getDoctorDto() {
        return doctorDto;
    }

    public void setDoctorDto(DoctorDTO doctorDto) {
        this.doctorDto = doctorDto;
    }

    public List<AppointmentDTO> getAppointmentDtoList() {
        return appointmentDtoList;
    }

    public void setAppointmentDtoList(List<AppointmentDTO> appointmentDtoList) {
        this.appointmentDtoList = appointmentDtoList;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patID=" + patID +
                ", patName='" + patName + '\'' +
                ", patMail='" + patMail + '\'' +
                ", patPassword='" + patPassword + '\'' +
                ", patMobile='" + patMobile + '\'' +
                ", patAddress='" + patAddress + '\'' +
                ", doctorDto=" + doctorDto +
                ", appointmentDtoList=" + appointmentDtoList +
                '}';
    }
}
