package com.bolton.hms.hmsappointment.service.impl;

import com.bolton.hms.hmsappointment.dto.PaymentsDTO;
import com.bolton.hms.hmsappointment.entity.Appointment;
import com.bolton.hms.hmsappointment.entity.Charges;
import com.bolton.hms.hmsappointment.entity.Payments;
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

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean addPay(PaymentsDTO paymentsDTO) {
        Payments payments = new Payments();

        payments.setPayID(paymentsDTO.getPayID());
        payments.setPayDesc(paymentsDTO.getPayDesc());
        payments.setPayDate(paymentsDTO.getPayDate());
        payments.setPayVal(paymentsDTO.getPayVal());

        payments.setCharges(new Charges(paymentsDTO.getChargesDto().getcValue(), paymentsDTO.getChargesDto().getcDesc()));

        paymentRepository.save(payments);

        return true;
    }
}
