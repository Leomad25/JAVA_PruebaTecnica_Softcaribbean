package com.todo1.hulk_store_backend.persistence.entity;

import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasUser;

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
    @OneToMany(mappedBy = "user")
    private List<InvoiceHasUser> invoicesHasUsers;
    @OneToOne(mappedBy = "user")
    private Person person;
    @OneToOne(mappedBy = "user")
    private Payment payment;

    public User() {
    }

    public User(Long idUser, String nickName, String password) {
        this.idUser = idUser;
        this.nickName = nickName;
        this.password = password;
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

    public List<InvoiceHasUser> getInvoicesHasUsers() {
        return invoicesHasUsers;
    }

    public void setInvoicesHasUsers(List<InvoiceHasUser> invoicesHasUsers) {
        this.invoicesHasUsers = invoicesHasUsers;
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
                ", invoicesHasUsers=" + invoicesHasUsers +
                ", person=" + person +
                ", payment=" + payment +
                '}';
    }
}
