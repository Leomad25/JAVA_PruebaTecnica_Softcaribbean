package com.todo1.hulk_store_backend.persistence.implement;

import com.todo1.hulk_store_backend.persistence.crud.PersonCrud;
import com.todo1.hulk_store_backend.persistence.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonImplement {
    private PersonCrud personCrud;

    public List<Person> getAll() {
        return (List<Person>) personCrud.findAll();
    }
    public Optional<Person> getById(long id) {
        return personCrud.findById(id);
    }
    public Person getByReference(String reference) {
        return personCrud.findByIdentification(reference);
    }
    public Person getByIdUser(long idUser) {
        return personCrud.findByIdUser(idUser);
    }
    public Person save(Person person) {
        return personCrud.save(person);
    }
    public void delete(long id) {
        personCrud.deleteById(id);
    }
}
