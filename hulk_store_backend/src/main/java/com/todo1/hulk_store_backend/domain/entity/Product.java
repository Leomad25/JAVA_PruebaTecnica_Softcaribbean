package com.todo1.hulk_store_backend.domain.entity;

import com.todo1.hulk_store_backend.domain.entity.compound.InvoiceHasProduct;

import java.util.List;

public class Product {
    private long idProduct;
    private String name;
    private String reference;
    private List<InvoiceHasProduct> invoicesHasProducts;

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<InvoiceHasProduct> getInvoicesHasProducts() {
        return invoicesHasProducts;
    }

    public void setInvoicesHasProducts(List<InvoiceHasProduct> invoicesHasProducts) {
        this.invoicesHasProducts = invoicesHasProducts;
    }
}
