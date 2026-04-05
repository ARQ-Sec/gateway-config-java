package com.arq.gatewayconfigjava.web;

import com.arq.gatewayconfigjava.dto.RefundResponse;
import com.arq.gatewayconfigjava.service.RefundService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/refund")
public class RefundController {
    private final RefundService service;

    public RefundController(RefundService service) {
        this.service = service;
    }

    @GetMapping
    public List<RefundResponse> list() {
        return service.summarize();
    }
}
