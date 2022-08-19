package com.todo1.hulk_store_backend.domain.entity;

import java.util.List;

public class User {
    private long idUser;
    private String nickName;
    private String password;
    private Person person;
    private Payment payment;
    private List<Invoice> invoicesBuyer;
    private List<Invoice> invoicesSeller;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Invoice> getInvoicesBuyer() {
        return invoicesBuyer;
    }

    public void setInvoicesBuyer(List<Invoice> invoicesBuyer) {
        this.invoicesBuyer = invoicesBuyer;
    }

    public List<Invoice> getInvoicesSeller() {
        return invoicesSeller;
    }

    public void setInvoicesSeller(List<Invoice> invoicesSeller) {
        this.invoicesSeller = invoicesSeller;
    }
}
