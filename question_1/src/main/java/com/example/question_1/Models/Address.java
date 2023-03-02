package com.example.question_1.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String employeeName;
    private String address;
    private int pincode;

    public Address() {
    }

    public Address(String employeeName, String address, int pincode) {
        this.employeeName = employeeName;
        this.address = address;
        this.pincode = pincode;
    }
}
