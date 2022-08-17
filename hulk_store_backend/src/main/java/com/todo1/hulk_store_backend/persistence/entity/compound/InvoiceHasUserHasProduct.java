package com.todo1.hulk_store_backend.persistence.entity.compound;

import com.todo1.hulk_store_backend.persistence.entity.Product;

import javax.persistence.*;

@Entity
@Table(name = "invoices_has_users_has_products")
public class InvoiceHasUserHasProduct {
    // Columns
    @EmbeddedId
    private InvoiceHasUserHasProductPK id;
    @Column(name = "count")
    private Integer count;

    // References
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", insertable = false, updatable = false),
            @JoinColumn(name = "id_user", insertable = false, updatable = false)
    })
    private InvoiceHasUser invoiceHasUser;
    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;

    public InvoiceHasUserHasProduct() {
    }

    public InvoiceHasUserHasProduct(InvoiceHasUserHasProductPK id, Integer count) {
        this.id = id;
        this.count = count;
    }

    public InvoiceHasUserHasProductPK getId() {
        return id;
    }

    public void setId(InvoiceHasUserHasProductPK id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public InvoiceHasUser getInvoiceHasUser() {
        return invoiceHasUser;
    }

    public void setInvoiceHasUser(InvoiceHasUser invoiceHasUser) {
        this.invoiceHasUser = invoiceHasUser;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "InvoiceHasUserHasProduct{" +
                "id=" + id +
                ", count=" + count +
                '}';
    }
}
