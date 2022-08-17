package com.todo1.hulk_store_backend.persistence.entity.compound;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class InvoiceHasUserHasProductPK implements Serializable {
    @Column(name = "id_invoice")
    private Long idInvoice;
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "id_product")
    private Long idProduct;

    public InvoiceHasUserHasProductPK() {
    }

    public InvoiceHasUserHasProductPK(Long idInvoice, Long idUser, Long idProduct) {
        this.idInvoice = idInvoice;
        this.idUser = idUser;
        this.idProduct = idProduct;
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

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
}
