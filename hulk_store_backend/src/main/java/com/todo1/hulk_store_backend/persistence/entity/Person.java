package com.todo1.hulk_store_backend.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Long idPerson;
    @Column(name = "first_name", length = 45, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 45, nullable = false)
    private String lastName;
    @Column(name = "identification", length = 45, nullable = false)
    private String identification;

    // References
    @OneToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;

    public Person() {
    }

    public Person(Long idPerson, String firstName, String lastName, String identification, User user) {
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identification = identification;
        this.user = user;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identification='" + identification + '\'' +
                ", user=" + user +
                '}';
    }
}
