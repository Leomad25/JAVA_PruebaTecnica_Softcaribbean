package com.todo1.hulk_store_backend.domain.repository.compound;


import com.todo1.hulk_store_backend.domain.entity.compound.InvoiceHasProduct;

import java.util.List;
import java.util.Optional;

public interface InvoiceHasProductRepository {
    List<InvoiceHasProduct> getAll();
    Optional<InvoiceHasProduct> getById(long idInvoice, long idProduct);
    Optional<List<InvoiceHasProduct>> getByIdInvoice(long idInvoice);
    Optional<List<InvoiceHasProduct>> getByIdProduct(long idProduct);
    InvoiceHasProduct sava(InvoiceHasProduct user);
    void delete(long id);
}
