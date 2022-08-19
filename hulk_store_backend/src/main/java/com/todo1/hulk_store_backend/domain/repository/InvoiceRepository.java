package com.todo1.hulk_store_backend.domain.repository;

import com.todo1.hulk_store_backend.domain.entity.Invoice;

import java.util.List;
import java.util.Optional;

public interface InvoiceRepository {
    List<Invoice> getAll();
    Optional<Invoice> getById(long id);
    Optional<Invoice> getByReference(long id);
    Invoice save(Invoice invoice);
    void delete(long id);
}
