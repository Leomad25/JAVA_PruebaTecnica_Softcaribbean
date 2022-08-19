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

    public Invoice(Long idInvoice, String reference, Long buyer, Long seller, List<InvoiceHasProduct> invoiceHasProducts, User userBuyer, User userSeller) {
        this.idInvoice = idInvoice;
        this.reference = reference;
        this.buyer = buyer;
        this.seller = seller;
        this.invoiceHasProducts = invoiceHasProducts;
        this.userBuyer = userBuyer;
        this.userSeller = userSeller;
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

    @Override
    public String toString() {
        return "Invoice{" +
                "idInvoice=" + idInvoice +
                ", reference='" + reference + '\'' +
                ", invoiceHasProducts=" + invoiceHasProducts +
                '}';
    }
}
