package com.todo1.hulk_store_backend.domain.entity.compound;

import com.todo1.hulk_store_backend.domain.entity.*;

import java.math.BigDecimal;

public class InvoiceHasProduct {
    private InvoiceHasProductPK id;
    private Integer count;
    private Integer selled;
    private BigDecimal value;
    private Invoice invoice;
    private Product product;

    public InvoiceHasProductPK getId() {
        return id;
    }

    public void setId(InvoiceHasProductPK id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSelled() {
        return selled;
    }

    public void setSelled(Integer selled) {
        this.selled = selled;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
