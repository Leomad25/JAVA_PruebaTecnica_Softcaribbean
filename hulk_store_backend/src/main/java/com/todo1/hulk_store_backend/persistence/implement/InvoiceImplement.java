package com.todo1.hulk_store_backend.persistence.implement;

import com.todo1.hulk_store_backend.persistence.crud.InvoiceCrud;
import com.todo1.hulk_store_backend.persistence.entity.Invoice;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InvoiceImplement {
    private InvoiceCrud invoiceCrud;

    public List<Invoice> getAll() {
        return (List<Invoice>) invoiceCrud.findAll();
    }
    public Optional<Invoice> getById(long id) {
        return invoiceCrud.findById(id);
    }
    public Invoice getByReference(String reference) {
        return invoiceCrud.findByReference(reference);
    }
    public Invoice save(Invoice invoice) {
        return invoiceCrud.save(invoice);
    }
    public void delete(long id) {
        invoiceCrud.deleteById(id);
    }
}
