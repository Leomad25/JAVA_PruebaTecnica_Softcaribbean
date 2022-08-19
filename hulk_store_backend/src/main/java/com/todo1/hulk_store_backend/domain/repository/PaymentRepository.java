package com.todo1.hulk_store_backend.domain.repository;

import com.todo1.hulk_store_backend.domain.entity.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository {
    List<Payment> getAll();
    Optional<Payment> getById(long id);
    Optional<Payment> getByIdUser(long idUser);
    Payment save(Payment payment);
    void delete(long id);
}
