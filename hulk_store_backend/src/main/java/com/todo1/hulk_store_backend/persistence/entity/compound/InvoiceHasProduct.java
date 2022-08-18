package com.todo1.hulk_store_backend.persistence.entity.compound;

import com.todo1.hulk_store_backend.persistence.entity.Invoice;
import com.todo1.hulk_store_backend.persistence.entity.Product;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class InvoiceHasProduct {
    // Columns
    @EmbeddedId
    private InvoiceHasProductPK id;
    @Column(name = "count", nullable = false)
    private Integer count;
    @Column(name = "selled")
    private Integer selled;
    @Column(name = "value", nullable = false)
    private BigDecimal value;

    // References
    @ManyToOne
    @JoinColumn(name = "id_invoice", insertable = false, updatable = false)
    private Invoice invoice;
    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;

    public InvoiceHasProduct() {
    }

    public InvoiceHasProduct(InvoiceHasProductPK id, Integer count, Integer selled, BigDecimal value, Invoice invoice, Product product) {
        this.id = id;
        this.count = count;
        this.selled = selled;
        this.value = value;
        this.invoice = invoice;
        this.product = product;
    }

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

    @Override
    public String toString() {
        return "InvoiceHasProduct{" +
                "id=" + id +
                ", count=" + count +
                ", selled=" + selled +
                ", value=" + value +
                ", invoice=" + invoice +
                ", product=" + product +
                '}';
    }
}
