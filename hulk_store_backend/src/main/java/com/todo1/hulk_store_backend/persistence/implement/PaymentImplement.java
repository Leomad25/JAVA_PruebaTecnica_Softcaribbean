package com.todo1.hulk_store_backend.persistence.implement;

import com.todo1.hulk_store_backend.persistence.crud.PaymentCrud;
import com.todo1.hulk_store_backend.persistence.entity.Payment;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PaymentImplement {
    private PaymentCrud paymentCrud;

    public List<Payment> getAll() {
        return (List<Payment>) paymentCrud.findAll();
    }
    public Optional<Payment> getById(long id) {
        return paymentCrud.findById(id);
    }
    public Payment getByIdUser(Long idUser) {
        return paymentCrud.findByIdUser(idUser);
    }
    public Payment save(Payment payment) {
        return paymentCrud.save(payment);
    }
    public void delete(Long id) {
        paymentCrud.deleteById(id);
    }
}
