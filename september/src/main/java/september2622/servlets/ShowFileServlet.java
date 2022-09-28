package september2622.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

//http://localhost:8080/fileName
public class ShowFileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (OutputStream os = resp.getOutputStream()) {
            os.write(Files.readAllBytes(Path.of("september/src/main/resources/" + req.getPathInfo())));
        }
    }
}
