package com.builder.domain;

public class Phone {

    private String phoneNumber;
    private String typeNumber;

    public Phone() {
    }

    public Phone(String phoneNumber, String typeNumber) {
        this.phoneNumber = phoneNumber;
        this.typeNumber = typeNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", typeNumber='" + typeNumber + '\'' +
                '}';
    }

}
