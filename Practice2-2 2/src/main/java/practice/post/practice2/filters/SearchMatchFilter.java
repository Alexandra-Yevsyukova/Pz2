package practice.post.practice2.filters;


import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchMatchFilter extends BaseFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain filterChain) throws IOException, ServletException {


        String login=req.getParameter("login");
        String password=req.getParameter("password");
        Boolean match = false;


        if(match){
            req.setAttribute("matchUser", true);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/ErrorUser.jsp");
            dispatcher.forward(req, resp);
        }
        else filterChain.doFilter(req, resp);

    }
}
