package com.todo1.hulk_store_backend.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {
    // Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment")
    private Long idPayment;
    @Column(name = "number", nullable = false)
    private String number;
    @Column(name = "cvc", nullable = false)
    private String cvc;

    // References
    @OneToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;

    public Payment() {
    }

    public Payment(Long idPayment, String number, String cvc, User user) {
        this.idPayment = idPayment;
        this.number = number;
        this.cvc = cvc;
        this.user = user;
    }

    public Long getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Long idPayment) {
        this.idPayment = idPayment;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "idPayment=" + idPayment +
                ", number='" + number + '\'' +
                ", cvc='" + cvc + '\'' +
                ", user=" + user +
                '}';
    }
}
