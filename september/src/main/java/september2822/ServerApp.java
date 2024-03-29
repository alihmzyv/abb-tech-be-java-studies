package september2822;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(FTLDemo.class, "/FtlDemo");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
