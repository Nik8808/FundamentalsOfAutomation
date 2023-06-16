package ru.netology.service;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void correctAccrual() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldAmountZero() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void purchaseAnAmountUpTo1000() {
        assertEquals(1, service.remain(999));
    }
}
