package br.com.alura.gerenciador2.acao;

import br.com.alura.gerenciador2.modelo.Banco;
import br.com.alura.gerenciador2.modelo.Usuario;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login implements Acao {

    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        System.out.println("Logando " + login);
        System.out.println("Senha " + senha);

        Banco banco = new Banco();
        Usuario usuario = banco.existeUsuario(login, senha);

        if (usuario != null){
            System.out.println("Usuario existe!");
            return "redirect:entrada?acao=ListaEmpresas";
        }else{
            System.out.println("Usuário não existe!");
            return "redirect:entrada?acao=LoginForm";
        }

    }
}
