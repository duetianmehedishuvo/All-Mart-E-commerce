package com.tusu.santoecomerch.Pojo_Class;

public class Payment {
    String name,iuniyon,address,mobile,paymentMethod,tranistionId;

    public Payment(String name, String iuniyon, String address, String mobile, String paymentMethod, String tranistionId) {
        this.name = name;
        this.iuniyon = iuniyon;
        this.address = address;
        this.mobile = mobile;
        this.paymentMethod = paymentMethod;
        this.tranistionId = tranistionId;
    }

    public Payment(String name, String iuniyon, String address, String mobile, String paymentMethod) {
        this.name = name;
        this.iuniyon = iuniyon;
        this.address = address;
        this.mobile = mobile;
        this.paymentMethod = paymentMethod;
    }

    public Payment() {
    }

    public String getName() {
        return name;
    }

    public String getIuniyon() {
        return iuniyon;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getTranistionId() {
        return tranistionId;
    }
}
