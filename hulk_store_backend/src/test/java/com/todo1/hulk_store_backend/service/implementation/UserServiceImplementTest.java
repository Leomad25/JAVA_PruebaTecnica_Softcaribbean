package com.todo1.hulk_store_backend.service.implementation;

import com.todo1.hulk_store_backend.repository.entity.Usuario;
import com.todo1.hulk_store_backend.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplementTest {

    @Autowired
    private UsuarioService usuarioService;

    @Test
    void save() {
        Usuario input = new Usuario();
        Usuario output = new Usuario();

        // in data
        input.setCedula("987654321");
        input.setNombre("nombre test");
        input.setApellido("apellido test");
        input.setContrasena("test");

        // in output
        output.setCedula("987654321");
        output.setNombre("nombre test");
        output.setApellido("apellido test");
        output.setContrasena("test");

        Usuario result = usuarioService.save(input);

        if (result.getIdUsuario() == null) fail();
        if (result.getCedula() != output.getCedula()) fail();
        if (result.getNombre() != output.getNombre()) fail();
        if (result.getApellido() != output.getApellido()) fail();
        if (result.getContrasena() == output.getContrasena()) fail();
        if (result.getEsAdministrador() != null) fail();
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