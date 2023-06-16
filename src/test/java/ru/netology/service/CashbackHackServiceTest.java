package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void correctAccrual() {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldAmountZero() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void purchaseAnAmountUpTo1000() {
        assertEquals(service.remain(999), 1);
    }
}
