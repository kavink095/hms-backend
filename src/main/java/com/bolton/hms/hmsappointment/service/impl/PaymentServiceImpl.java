package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.PaymentsDTO;
import com.bolton.hms.hmsappointment.entity.Appointment;
import com.bolton.hms.hmsappointment.entity.Charges;
import com.bolton.hms.hmsappointment.entity.Payments;
import com.bolton.hms.hmsappointment.repositories.AppointmentRepository;
import com.bolton.hms.hmsappointment.repositories.ChargesRepository;
import com.bolton.hms.hmsappointment.repositories.PaymentRepository;
import com.bolton.hms.hmsappointment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private ChargesRepository chargesRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean addPay(PaymentsDTO paymentsDTO) {
        Payments payments = new Payments();

        payments.setPayDesc(paymentsDTO.getPayDesc());
        payments.setPayDate(paymentsDTO.getPayDate());
        payments.setPayVal(paymentsDTO.getPayVal());

        payments.setCharges(chargesRepository.getOne(String.valueOf(paymentsDTO.getChargesDto().getcID())));

        payments.setAppointment(appointmentRepository.getOne(String.valueOf(paymentsDTO.getAppointmentDto().getApID())));

        System.out.println("PAy :- " + payments.toString());
        paymentRepository.save(payments);

        return true;
    }
}
