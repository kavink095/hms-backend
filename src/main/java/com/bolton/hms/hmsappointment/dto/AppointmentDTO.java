package com.bolton.hms.hmsappointment.dto;

import java.util.Date;

public class AppointmentDTO {

    private String apID;
    private Date apCreaDate;
    private Date apForDate;
    private String apTime;
    private String apDesc;

    private PatientDTO patientDto;

    private PaymentsDTO paymentsDto;

    private ChargesDTO chargesDto;

    private DoctorDTO doctorDTO;

    public AppointmentDTO() {
    }

    public AppointmentDTO(String apID, Date apCreaDate, Date apForDate, String apTime, String apDesc, PatientDTO patientDto, PaymentsDTO paymentsDto, ChargesDTO chargesDto, DoctorDTO doctorDTO) {
        this.apID = apID;
        this.apCreaDate = apCreaDate;
        this.apForDate = apForDate;
        this.apTime = apTime;
        this.apDesc = apDesc;
        this.patientDto = patientDto;
        this.paymentsDto = paymentsDto;
        this.chargesDto = chargesDto;
        this.doctorDTO = doctorDTO;
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

    public PatientDTO getPatientDto() {
        return patientDto;
    }

    public void setPatientDto(PatientDTO patientDto) {
        this.patientDto = patientDto;
    }

    public PaymentsDTO getPaymentsDto() {
        return paymentsDto;
    }

    public void setPaymentsDto(PaymentsDTO paymentsDto) {
        this.paymentsDto = paymentsDto;
    }

    public ChargesDTO getChargesDto() {
        return chargesDto;
    }

    public void setChargesDto(ChargesDTO chargesDto) {
        this.chargesDto = chargesDto;
    }

    public DoctorDTO getDoctorDTO() {
        return doctorDTO;
    }

    public void setDoctorDTO(DoctorDTO doctorDTO) {
        this.doctorDTO = doctorDTO;
    }

    @Override
    public String toString() {
        return "AppointmentDTO{" +
                "apID='" + apID + '\'' +
                ", apCreaDate=" + apCreaDate +
                ", apForDate='" + apForDate + '\'' +
                ", apTime='" + apTime + '\'' +
                ", apDesc='" + apDesc + '\'' +
                ", patientDto=" + patientDto +
                ", paymentsDto=" + paymentsDto +
                ", chargesDto=" + chargesDto +
                ", doctorDTO=" + doctorDTO +
                '}';
    }
}
