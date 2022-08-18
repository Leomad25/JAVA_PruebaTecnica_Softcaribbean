package com.todo1.hulk_store_backend.persistence.crud.compound;

import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProduct;
import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProductPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceHasProductCrud extends CrudRepository<InvoiceHasProduct, InvoiceHasProductPK> {
    @Query(value = "SELECT * FROM invoices_has_products WHERE id_invoice = ?;", nativeQuery = true)
    List<InvoiceHasProduct> findByIdInvoice(long idInvoice);
    @Query(value = "SELECT * FROM invoices_has_products WHERE id_product = ?;", nativeQuery = true)
    List<InvoiceHasProduct> findByIdProduct(long idProduct);
}
