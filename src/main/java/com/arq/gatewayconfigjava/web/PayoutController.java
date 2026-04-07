package com.arq.gatewayconfigjava.web;

import com.arq.gatewayconfigjava.dto.PayoutResponse;
import com.arq.gatewayconfigjava.service.PayoutService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payout")
public class PayoutController {
    private final PayoutService service;

    public PayoutController(PayoutService service) {
        this.service = service;
    }

    @GetMapping
    public List<PayoutResponse> list() {
        return service.summarize();
    }
}
