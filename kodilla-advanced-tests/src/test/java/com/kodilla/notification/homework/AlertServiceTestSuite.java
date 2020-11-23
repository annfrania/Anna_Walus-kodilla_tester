package com.kodilla.notification.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AlertServiceTestSuite {
    AlertService alertService = new AlertService();
    Customer customer = Mockito.mock(Customer.class);
    Alert alert = Mockito.mock(Alert.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void shouldAddNewCustomerAndSendAlert() {
        alertService.addCustomerToLocation(location, customer);
        alertService.sendAlertWithLocation(location, alert);

        Mockito.verify(customer,Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldRemoveCustomerFromOneLocation() {
        alertService.addCustomerToLocation(location, customer);
        alertService.sendAlertWithLocation(location,alert);
        alertService.removeCustomer(location,customer);

        Mockito.verify(customer, Mockito.never()).receive(alert);
    }

    @Test
    public void shouldRemoveCustomerFromAllLocations() {
        Location location2 = Mockito.mock(Location.class);
        alertService.addCustomerToLocation(location, customer);
        alertService.addCustomerToLocation(location2, customer);
        alertService.sendAlertWithLocation(location, alert);
        alertService.sendAlertWithLocation(location2, alert);
        alertService.removeCustomer(location,customer);
        alertService.removeCustomer(location2,customer);

        Mockito.verify(customer, Mockito.never()).receive(alert);

    }

    @Test
    public void shouldSendAlertsOnlyForCustomersOfOneLocation() {
        Location location2 = Mockito.mock(Location.class);
        alertService.addCustomerToLocation(location, customer);
        alertService.addCustomerToLocation(location2, customer);
        alertService.sendAlertWithLocation(location, alert);

        Mockito.verify(customer,Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldSendMessagesToAll() {
        Customer customer2 = Mockito.mock(Customer.class);
        Location location2 = Mockito.mock(Location.class);
        alertService.addCustomerToLocation(location, customer);
        alertService.addCustomerToLocation(location2, customer2);
        alertService.addCustomerToLocation(location, customer2);
        alertService.sendAlertToAll(alert);

        Mockito.verify(customer,Mockito.times(1)).receive(alert);
        Mockito.verify(customer2,Mockito.times(2)).receive(alert);

        //podwójny alert!
    }

    @Test
    public void shouldRemoveALocation() {
        //możliwość skasowania danej lokalizacji- w sensie usunięcia zupełnie?
        alertService.addCustomerToLocation(location, customer);
        alertService.sendAlertWithLocation(location, alert);

        alertService.locations.remove(location);

        Mockito.verify(customer, Mockito.never()).receive(alert);
    }
}