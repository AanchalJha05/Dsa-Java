package Cookie;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    public static final int oneYear = 60 * 60 * 24 * 365;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        int count = 0;

        // Get cookies from request
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("COUNT")) {
                    count = Integer.parseInt(cookies[i].getValue());
                    break;
                }
            }
        }

        count++; // increment visit count

        // Create/update cookie
        Cookie cookie = new Cookie("COUNT", String.valueOf(count));
        cookie.setMaxAge(oneYear);
        response.addCookie(cookie);

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<head><title>Cookie Program</title></head>");
        pw.println("<body>");
        pw.println("<h2>New Cookies Program</h2>");
        pw.println("<p>You have visited this page " + count + " time(s)</p>");
        pw.println("<p>(Stored using cookies for one year)</p>");
        pw.println("</body>");
        pw.println("</html>");
    }
}