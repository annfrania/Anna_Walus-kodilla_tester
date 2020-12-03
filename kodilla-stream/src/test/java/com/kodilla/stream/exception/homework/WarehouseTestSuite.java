package com.kodilla.stream.exception.homework;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTestSuite {

    @Test
    public void doesOrderExist() throws OrderDoesntExistException{

        Warehouse warehouse1 = new Warehouse();
        warehouse1.addOrder(new Order("2020/23"));
        Order o1 = warehouse1.getOrder("2020/23");
        assertEquals(o1.getNumber(), "2020/23");
    }

}