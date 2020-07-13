package com.bolton.hms.hmsappointment.service;

import com.bolton.hms.hmsappointment.dto.PaymentsDTO;

public interface PaymentService {

    public boolean addPay(PaymentsDTO paymentsDTO);
}
