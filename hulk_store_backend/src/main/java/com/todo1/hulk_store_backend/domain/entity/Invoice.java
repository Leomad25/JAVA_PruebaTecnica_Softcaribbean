package com.todo1.hulk_store_backend.domain.entity;

import com.todo1.hulk_store_backend.domain.entity.compound.InvoiceHasProduct;

import java.util.List;

public class Invoice {
    private Long idInvoice;
    private String reference;
    private Long buyer;
    private Long seller;
    private List<InvoiceHasProduct> invoiceHasProducts;
    private User userBuyer;
    private User userSeller;

    public Long getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Long idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getBuyer() {
        return buyer;
    }

    public void setBuyer(Long buyer) {
        this.buyer = buyer;
    }

    public Long getSeller() {
        return seller;
    }

    public void setSeller(Long seller) {
        this.seller = seller;
    }

    public List<InvoiceHasProduct> getInvoiceHasProducts() {
        return invoiceHasProducts;
    }

    public void setInvoiceHasProducts(List<InvoiceHasProduct> invoiceHasProducts) {
        this.invoiceHasProducts = invoiceHasProducts;
    }

    public User getUserBuyer() {
        return userBuyer;
    }

    public void setUserBuyer(User userBuyer) {
        this.userBuyer = userBuyer;
    }

    public User getUserSeller() {
        return userSeller;
    }

    public void setUserSeller(User userSeller) {
        this.userSeller = userSeller;
    }
}
