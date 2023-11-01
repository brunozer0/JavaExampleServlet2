package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "ExemploServlet", urlPatterns = {"/ListaGatos"})
public class ListaGatosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {


        List<Animal> animais = new ArrayList<>();

        animais.add(new Animal("Oddie", "Cachorro"));
        animais.add(new Gato("Fubá", "Gato"));
        animais.add(new Animal("Tutu", "Cachorro"));
        animais.add(new Gato("Mingau", "Gato"));
        animais.add(new Gato("Juão", "Gato"));
        animais.add(new Gato("Ritalina", "Gato"));
        animais.add(new Animal("Juliano", "Coelho"));
        animais.add(new Animal("Ludovico", "Tartaruga"));

        request.setAttribute("animais", animais);

        List<Gato> gatos = animais.stream()
                .filter(gato -> gato instanceof Gato)
                .map(gato -> (Gato) gato)
                .collect(Collectors.toList());

        request.setAttribute("gatos", gatos);

        RequestDispatcher dispatcherGatos = request.getRequestDispatcher("/ListaGatos.jsp");
        dispatcherGatos.forward(request, response);

    }
}