package com.todo1.hulk_store_backend.persistence.entity;

import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProduct;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "invoices")
public class Invoice {
    // Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invoice")
    private Long idInvoice;
    @Column(name = "refencence", length = 255, nullable = false)
    private String reference;
    @Column(name = "buyer")
    private Long buyer;
    @Column(name = "seller")
    private Long seller;

    // References
    @OneToMany(mappedBy = "invoice")
    private List<InvoiceHasProduct> invoiceHasProducts;
    @ManyToOne
    @JoinColumn(name = "buyer", insertable = false, updatable = false)
    private User userBuyer;
    @ManyToOne
    @JoinColumn(name = "seller", insertable = false, updatable = false)
    private User userSeller;


    public Invoice() {
    }

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

    public List<InvoiceHasProduct> getInvoiceHasProducts() {
        return invoiceHasProducts;
    }

    public void setInvoiceHasProducts(List<InvoiceHasProduct> invoiceHasProducts) {
        this.invoiceHasProducts = invoiceHasProducts;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "idInvoice=" + idInvoice +
                ", reference='" + reference + '\'' +
                ", invoiceHasProducts=" + invoiceHasProducts +
                '}';
    }
}
