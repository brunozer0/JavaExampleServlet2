package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "ListaAnimaisServlet", urlPatterns = {"/ListaAnimais"})
public class ListaAnimaisServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {


        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("Oddie", "cachorro"));
        animais.add(new Gato("fubá", "gato"));
        animais.add(new Animal("tutu", "cachorro"));
        animais.add(new Gato("mingau", "gato"));
        animais.add(new Gato("juão", "gato"));
        animais.add(new Gato("Ritalina", "gato"));
        animais.add(new Animal("Juliano", "Coelho"));
        animais.add(new Animal("Ludovico", "Tartaruga"));

        request.setAttribute("animais", animais);

        RequestDispatcher dispatcherAnimais = request.getRequestDispatcher("/ListaAnimais.jsp");
        dispatcherAnimais.forward(request, response);

    }
}