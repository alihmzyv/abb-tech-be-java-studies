package september2622.servlets;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GreetUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //template-marker conf
        Configuration conf = new Configuration(Configuration.VERSION_2_3_31);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("september/src/main/resources"));

        Map<String, Object> map = new HashMap<>();
        map.put("name", req.getParameter("name"));
        map.put("age", req.getParameter("age"));
        try {
            conf.getTemplate("greet_user.ftl").process(map, resp.getWriter());
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
    }
}
