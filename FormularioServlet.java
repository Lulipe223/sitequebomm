import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormularioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String gmail = request.getParameter("gmail");
        String idade = request.getParameter("idade");
        String numero = request.getParameter("numero");

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<!DOCTYPE html><html><head><title>Confirmação</title></head><body>");
        response.getWriter().println("<h2>Obrigado pelo contato, " + nome + "!</h2>");
        response.getWriter().println("<p><strong>Gmail:</strong> " + gmail + "</p>");
        response.getWriter().println("<p><strong>Idade:</strong> " + idade + "</p>");
        response.getWriter().println("<p><strong>Telefone:</strong> " + numero + "</p>");
        response.getWriter().println("<a href='contato.html'>Voltar</a>");
        response.getWriter().println("</body></html>");
    }
}
