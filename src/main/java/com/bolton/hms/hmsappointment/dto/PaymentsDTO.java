package com.bolton.hms.hmsappointment.dto;

import java.util.Date;

public class PaymentsDTO {

    private String payID;
    private String payDesc;
    private Date payDate;
    private double payVal;

    private AppointmentDTO appointmentDto;

    private ChargesDTO chargesDto;

    public PaymentsDTO() {
    }

    public PaymentsDTO(String payID, String payDesc, Date payDate, double payVal, AppointmentDTO appointmentDto, ChargesDTO chargesDto) {
        this.payID = payID;
        this.payDesc = payDesc;
        this.payDate = payDate;
        this.payVal = payVal;
        this.appointmentDto = appointmentDto;
        this.chargesDto = chargesDto;
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

    public AppointmentDTO getAppointmentDto() {
        return appointmentDto;
    }

    public void setAppointmentDto(AppointmentDTO appointmentDto) {
        this.appointmentDto = appointmentDto;
    }

    public ChargesDTO getChargesDto() {
        return chargesDto;
    }

    public void setChargesDto(ChargesDTO chargesDto) {
        this.chargesDto = chargesDto;
    }

    @Override
    public String toString() {
        return "PaymentsDTO{" +
                "payID=" + payID +
                ", payDesc='" + payDesc + '\'' +
                ", payDate=" + payDate +
                ", payVal=" + payVal +
                ", appointmentDto=" + appointmentDto +
                ", chargesDto=" + chargesDto +
                '}';
    }
}

