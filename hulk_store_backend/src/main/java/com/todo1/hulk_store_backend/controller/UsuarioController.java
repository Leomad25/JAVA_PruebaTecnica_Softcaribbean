package com.todo1.hulk_store_backend.controller;

import com.todo1.hulk_store_backend.repository.entity.Usuario;
import com.todo1.hulk_store_backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id) {
        Optional<Usuario> optional = usuarioService.finedById(id);
        if (!optional.isPresent()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(optional);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Usuario usuario) {
        System.out.println("call methot post");
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuario));
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Usuario usuario) {
        Optional<Usuario> optional = usuarioService.finedById(id);
        if (!optional.isPresent()) return ResponseEntity.notFound().build();
        optional.get().setNombre(usuario.getNombre());
        optional.get().setApellido(usuario.getApellido());
        optional.get().setCedula(usuario.getCedula());
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(optional.get()));
    }
    /*
    @PostMapping("/password/{id}")
    public void changePassword() {

    }
     */
}
