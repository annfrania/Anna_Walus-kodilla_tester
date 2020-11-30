package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite2 {
    Invoice invoice;

    @Test
    public void shouldAddNewItemsAndReturnCorrectSize(){
        invoice.addItem(new Item("toaster2",68.99));
        assertEquals(5,invoice.getSize());
    }

    @Test
    public void shouldAddNewItemsAndReturnOneOfThem(){
        Item item = invoice.getItem(2);

        assertEquals(45.99,item.getPrice(),0.01);
        assertEquals("lunch box",item.getName());
    }
    @Test
    public void shouldReturnNullWhenThereIsNegativeIndex(){

        assertNull(invoice.getItem(-5));
    }
    @Test
    public void shouldReturnNullWhenThereIsIndexOutOfRange(){

        assertNull(invoice.getItem(22));
    }
    @Test
    public void shouldClearTheInvoice(){

        invoice.clear();
        assertEquals(0,invoice.getSize());
    }
    @BeforeEach
    public void initializeInvoice(){
    invoice = new Invoice();
        invoice.addItem(new Item("toaster",68.99));
        invoice.addItem(new Item("iron",249.99));
        invoice.addItem(new Item("lunch box",45.99));
        invoice.addItem(new Item("shaker",75.99));
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}