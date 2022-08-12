package com.todo1.hulk_store_backend.service;

import com.todo1.hulk_store_backend.repository.crud.UsuarioCrud;
import com.todo1.hulk_store_backend.repository.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioCrud usuarioCrud;

    @Override
    public UserDetails loadUserByUsername(String cedula) throws UsernameNotFoundException {
        Usuario usuario = usuarioCrud.findByCedula(cedula);
        List<GrantedAuthority> roles = new ArrayList<>();
        if ((usuario.getEsAdministrador() != null) && usuario.getEsAdministrador())
            roles.add(new SimpleGrantedAuthority("ADMIN"));
        UserDetails userDetails = new User(usuario.getCedula(), usuario.getContrasena(), roles);
        return userDetails;
    }
}
