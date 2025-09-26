package com.javaNauta.cadastro_usuario.controller;

import com.javaNauta.cadastro_usuario.business.UsuarioService;
import com.javaNauta.cadastro_usuario.infraestructure.entitys.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ususario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioservice;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioservice.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email){
        return ResponseEntity.ok(usuarioservice.buscarUsuarioPorEmail(email));

    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email){
        usuarioservice.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id,
                                                      @RequestBody Usuario usuario){
        usuarioservice.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }
}