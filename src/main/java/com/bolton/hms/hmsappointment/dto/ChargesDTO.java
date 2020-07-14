package com.bolton.hms.hmsappointment.dto;


import java.util.List;

public class ChargesDTO {

    private int cID;
    private double cValue;
    private String cDesc;

    private List<DoctorDTO> doctorListDto;

    private List<PaymentsDTO> paymentListDto;

    public ChargesDTO() {
    }

    public ChargesDTO(int cID, double cValue, String cDesc) {
        this.cID = cID;
        this.cValue = cValue;
        this.cDesc = cDesc;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public double getcValue() {
        return cValue;
    }

    public void setcValue(double cValue) {
        this.cValue = cValue;
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    public List<DoctorDTO> getDoctorListDto() {
        return doctorListDto;
    }

    public void setDoctorListDto(List<DoctorDTO> doctorListDto) {
        this.doctorListDto = doctorListDto;
    }

    public List<PaymentsDTO> getPaymentListDto() {
        return paymentListDto;
    }

    public void setPaymentListDto(List<PaymentsDTO> paymentListDto) {
        this.paymentListDto = paymentListDto;
    }

    @Override
    public String toString() {
        return "ChargesDTO{" +
                "cID=" + cID +
                ", cValue=" + cValue +
                ", cDesc='" + cDesc + '\'' +
                ", doctorListDto=" + doctorListDto +
                ", paymentListDto=" + paymentListDto +
                '}';
    }
}
