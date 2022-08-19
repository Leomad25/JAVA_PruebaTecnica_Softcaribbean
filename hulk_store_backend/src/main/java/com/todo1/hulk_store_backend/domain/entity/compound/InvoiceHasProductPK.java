package com.todo1.hulk_store_backend.domain.entity.compound;

import javax.persistence.Column;
import java.io.Serializable;

public class InvoiceHasProductPK implements Serializable {
    private Long idInvoice;
    private Long idProduct;

    public Long getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Long idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
}
