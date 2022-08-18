package com.todo1.hulk_store_backend.persistence.implement.compound;

import com.todo1.hulk_store_backend.persistence.crud.compound.InvoiceHasProductCrud;
import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProduct;
import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProductPK;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InvoiceHasProductImplement {
    private InvoiceHasProductCrud invoiceHasProductCrud;

    public List<InvoiceHasProduct> getAll() {
        return (List<InvoiceHasProduct>) invoiceHasProductCrud.findAll();
    }
    public Optional<InvoiceHasProduct> getById(long idInvoice, long idProduct) {
        InvoiceHasProductPK id = new InvoiceHasProductPK();
        id.setIdInvoice(idInvoice);
        id.setIdProduct(idProduct);
        return invoiceHasProductCrud.findById(id);
    }
    public List<InvoiceHasProduct> getByInvoice(long idInvoice) {
        return invoiceHasProductCrud.findByIdInvoice(idInvoice);
    }
    public List<InvoiceHasProduct> getByProduct(long idProduct) {
        return invoiceHasProductCrud.findByIdProduct(idProduct);
    }
    public InvoiceHasProduct save(InvoiceHasProduct invoiceHasProduct) {
        return invoiceHasProductCrud.save(invoiceHasProduct);
    }
    public void delete(long idInvoice, long idProduct) {
        InvoiceHasProductPK id = new InvoiceHasProductPK();
        id.setIdInvoice(idInvoice);
        id.setIdProduct(idProduct);
        invoiceHasProductCrud.deleteById(id);
    }
}
