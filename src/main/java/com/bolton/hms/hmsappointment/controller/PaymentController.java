package com.bolton.hms.hmsappointment.controller;

import com.bolton.hms.hmsappointment.dto.PaymentsDTO;
import com.bolton.hms.hmsappointment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/saves")
    public boolean savePayment(@RequestBody PaymentsDTO paymentsDTO) {
        System.out.println("pay :- "+paymentsDTO.toString());
        paymentService.addPay(paymentsDTO);
        return true;
    }
}
