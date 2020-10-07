package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength(){
        CashMachine machine = new CashMachine();
        int[] values = machine.getValues();
        assertEquals(0,values.length);

    }
    @Test
    public void shouldAddAnElementToTheArray(){
        CashMachine machine = new CashMachine();
        machine.addTrans(350);

        int[] values = machine.getValues();
        assertEquals(1,values.length);
        assertEquals(350,values[0]);
    }
    @Test
    public void shouldCountTransactions(){
        CashMachine machine = new CashMachine();
        machine.addTrans(400);
        machine.addTrans(1000);
        machine.addTrans(-700);
        machine.addTrans(0);

        assertEquals(4,machine.getTransNumber());
    }
    @Test
    public void shouldGetBalance() {
        CashMachine machine = new CashMachine();
        machine.addTrans(-800);
        machine.addTrans(1000);
        machine.addTrans(-700);
        machine.addTrans(0);

        assertEquals(-500,machine.getBalance());
    }
}
