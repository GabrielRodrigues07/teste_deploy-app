package com.example.teste;

import com.example.teste.domain.Usuario;
import com.example.teste.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteApplication implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public static void main(String[] args) {
        SpringApplication.run(TesteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        usuarioRepository.save(new Usuario(1L, "Jose silva", "jose@gmail.com"));
        usuarioRepository.save(new Usuario(2L, "Maria Jose", "maria@gmail.com"));
    }
}
