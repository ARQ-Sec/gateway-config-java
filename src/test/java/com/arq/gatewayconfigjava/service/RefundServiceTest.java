package com.arq.gatewayconfigjava.service;

import com.arq.gatewayconfigjava.repository.RefundRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class RefundServiceTest {
    @Test
    void returnsSeedData() {
        RefundService service = new RefundService(new RefundRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
