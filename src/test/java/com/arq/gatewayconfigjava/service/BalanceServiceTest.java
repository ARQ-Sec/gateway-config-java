package com.arq.gatewayconfigjava.service;

import com.arq.gatewayconfigjava.repository.BalanceRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BalanceServiceTest {
    @Test
    void returnsSeedData() {
        BalanceService service = new BalanceService(new BalanceRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
