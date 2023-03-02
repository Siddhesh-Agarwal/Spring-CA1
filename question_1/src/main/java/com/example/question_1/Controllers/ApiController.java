package com.example.question_1.Controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.question_1.Models.Address;

@RestController
public class ApiController {
    @GetMapping("/")
    public Iterable<Address> getAddresses() {
        // Create a list of addresses
        ArrayList<Address> addresses = new ArrayList<Address>();
        // Add some addresses to the list
        addresses.add(new Address("John", "123 Main Street", 12345));
        addresses.add(new Address("Jane", "456 Main Street", 12345));
        addresses.add(new Address("Joe", "789 Main Street", 12345));
        // Return the list of addresses
        return addresses;
    }
}
