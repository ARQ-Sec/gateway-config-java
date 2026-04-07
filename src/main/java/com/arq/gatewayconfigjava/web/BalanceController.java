package com.arq.gatewayconfigjava.web;

import com.arq.gatewayconfigjava.dto.BalanceResponse;
import com.arq.gatewayconfigjava.service.BalanceService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/balance")
public class BalanceController {
    private final BalanceService service;

    public BalanceController(BalanceService service) {
        this.service = service;
    }

    @GetMapping
    public List<BalanceResponse> list() {
        return service.summarize();
    }
}
