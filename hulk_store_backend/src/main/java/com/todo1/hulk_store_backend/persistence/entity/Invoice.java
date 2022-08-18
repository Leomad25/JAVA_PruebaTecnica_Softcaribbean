package com.todo1.hulk_store_backend.persistence.entity;

import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasUser;
import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProduct;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "invoices")
public class Invoice {
    // Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idInvoice;
    @Column(name = "refencence", length = 255, nullable = false)
    private String reference;

    // References
    @OneToMany(mappedBy = "invoice")
    private List<InvoiceHasUser> invoicesHasUsers;
    @OneToMany(mappedBy = "invoice")
    private List<InvoiceHasProduct> invoiceHasProducts;

    public Invoice() {
    }

    public Invoice(Long idInvoice, String reference) {
        this.idInvoice = idInvoice;
        this.reference = reference;
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

    public List<InvoiceHasUser> getInvoicesHasUsers() {
        return invoicesHasUsers;
    }

    public void setInvoicesHasUsers(List<InvoiceHasUser> invoicesHasUsers) {
        this.invoicesHasUsers = invoicesHasUsers;
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
                ", invoicesHasUsers=" + invoicesHasUsers +
                ", invoiceHasProducts=" + invoiceHasProducts +
                '}';
    }
}
