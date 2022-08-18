package com.todo1.hulk_store_backend.persistence.entity.compound;

import com.todo1.hulk_store_backend.persistence.entity.Invoice;
import com.todo1.hulk_store_backend.persistence.entity.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "invoices_has_user")
public class InvoiceHasUser {
    // Columns
    @EmbeddedId
    private InvoiceHasUserPK id;

    // References
    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_invoice", insertable = false, updatable = false)
    private Invoice invoice;

    public InvoiceHasUser() {
    }

    public InvoiceHasUser(InvoiceHasUserPK id) {
        this.id = id;
    }

    public InvoiceHasUserPK getId() {
        return id;
    }

    public void setId(InvoiceHasUserPK id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "InvoiceHasUser{" +
                "id=" + id +
                ", user=" + user +
                ", invoice=" + invoice +
                '}';
    }
}
