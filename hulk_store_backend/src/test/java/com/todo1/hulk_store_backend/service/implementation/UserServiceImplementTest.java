package com.todo1.hulk_store_backend.service.implementation;

import com.todo1.hulk_store_backend.repository.entity.Usuario;
import com.todo1.hulk_store_backend.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplementTest {



    @Test
    void save() {
        Usuario input = new Usuario();
        input.setCedula("987654321");
        input.setNombre("nombre test");
        input.setApellido("apellido test");
        input.setContrasena("test");

    }

    @Test
    void findAll() {
    }

    @Test
    void testFindAll() {
    }

    @Test
    void finedById() {
    }

    @Test
    void deleteById() {
    }
}