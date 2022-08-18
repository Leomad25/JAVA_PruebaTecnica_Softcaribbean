package com.todo1.hulk_store_backend.persistence.crud;

import com.todo1.hulk_store_backend.persistence.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceCrud extends CrudRepository<Invoice, Long> {
    Invoice findByReference(String reference);
}
