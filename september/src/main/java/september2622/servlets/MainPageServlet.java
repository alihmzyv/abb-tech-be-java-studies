package september2622.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//http://localhost:8080/mainpage
public class MainPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {

        String filePath = "september/src/main/resources/text.html";
        List<String> lines = Files.readAllLines(Path.of(filePath));
        try (PrintWriter pw = resp.getWriter()) {
            lines.forEach(pw::println);
        }
    }
}
