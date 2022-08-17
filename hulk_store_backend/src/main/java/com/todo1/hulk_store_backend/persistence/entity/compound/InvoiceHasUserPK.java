package com.todo1.hulk_store_backend.persistence.entity.compound;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class InvoiceHasUserPK implements Serializable {
    @Column(name = "id_invoice")
    private Long idInvoice;
    @Column(name = "id_user")
    private Long idUser;

    public InvoiceHasUserPK() {
    }

    public InvoiceHasUserPK(Long idInvoice, Long idUser) {
        this.idInvoice = idInvoice;
        this.idUser = idUser;
    }

    public Long getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Long idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
