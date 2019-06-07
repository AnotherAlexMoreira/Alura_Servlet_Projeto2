package br.com.alura.gerenciador2.acao;

import br.com.alura.gerenciador2.modelo.Banco;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveEmpresa implements Acao{
    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Banco banco = new Banco();
        banco.removeEmpresa(id);

        return "redirect:entrada?acao=ListaEmpresas";


    }
}
