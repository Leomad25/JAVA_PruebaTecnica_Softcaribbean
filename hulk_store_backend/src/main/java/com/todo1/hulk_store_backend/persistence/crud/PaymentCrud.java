package com.todo1.hulk_store_backend.persistence.crud;

import com.todo1.hulk_store_backend.persistence.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentCrud extends CrudRepository<Payment, Long> {
    Payment findByIdUser(long idUser);
}
