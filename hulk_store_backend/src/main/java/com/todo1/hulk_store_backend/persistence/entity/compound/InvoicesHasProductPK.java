package com.todo1.hulk_store_backend.persistence.entity.compound;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class InvoicesHasProductPK implements Serializable {
    @Column(name = "id_invoice")
    private Long idInvoice;
    @Column(name = "id_product")
    private Long idProduct;
}
