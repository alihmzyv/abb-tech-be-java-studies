package september2622;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import september2622.servlets.GreetUserServlet;
import september2622.servlets.MainPageServlet;
import september2622.servlets.ShowFileServlet;
import september2622.servlets.ShowStudentsServlet;

public class ServletDemo {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(ShowFileServlet.class, "/*");
        handler.addServlet(MainPageServlet.class, "/mainpage");
        handler.addServlet(GreetUserServlet.class, "/user");
        handler.addServlet(ShowStudentsServlet.class, "/show-students");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
