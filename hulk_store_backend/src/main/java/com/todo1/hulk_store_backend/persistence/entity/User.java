package com.todo1.hulk_store_backend.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    // Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "nick_name", length = 255, nullable = false)
    private String nickName;
    @Column(name = "password", length = 255, nullable = false)
    private String password;

    // References
    @OneToOne(mappedBy = "user")
    private Person person;
    @OneToOne(mappedBy = "user")
    private Payment payment;
    @OneToMany(mappedBy = "userBuyer")
    private List<Invoice> invoicesBuyer;
    @OneToMany(mappedBy = "userSeller")
    private List<Invoice> invoicesSeller;

    public User() {
    }

    public User(Long idUser, String nickName, String password, Person person, Payment payment) {
        this.idUser = idUser;
        this.nickName = nickName;
        this.password = password;
        this.person = person;
        this.payment = payment;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", person=" + person +
                ", payment=" + payment +
                '}';
    }
}
