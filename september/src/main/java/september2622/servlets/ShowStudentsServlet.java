package september2622.servlets;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import september2622.entities.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //template-marker conf
        Configuration conf = new Configuration(Configuration.VERSION_2_3_31);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("september/src/main/resources"));

        Student student = new Student("ali", "hamza", 123);
        Student student1 = new Student("Anar", "Mammadov", 123);
        Map<String, List<Student>> map = new HashMap<>();
        map.put("data", List.of(student, student1));
        try {
            conf.getTemplate("show_users.ftl").process(map, resp.getWriter());
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
    }
}
