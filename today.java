package about_me;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class today extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public today() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		//현재 시간을 yyyy/MM/dd HH:mm:ss 형식으로 변경함
		String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>현재 시간 보기</title></head>");
		out.println("<body>");
		out.println("<a href = 'index.html'>메인화면</a>");
		out.println("<h2>" + formatDate + "</h2>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
