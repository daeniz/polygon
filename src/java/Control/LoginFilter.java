/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * The purpose of this method is to create a loginfilter that will deny users certain 
 * url-patterns based on their role. Not implemented.
 * @author Dennis Schmock
 */
@WebFilter(urlPatterns = {"/frontpagde", })
public class LoginFilter implements Filter {

    /**
     *
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    /**
     *
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        //Get session, but do not create a new if it doesn't exist
        HttpSession session = req.getSession(false);
        if(session ==null || session.getAttribute("loggedin")==null){
            res.sendRedirect(req.getContextPath()+"/index.jsp");
        } else{
            chain.doFilter(req, res);
        }
        
        
        
        
    }

    /**
     *
     */
    @Override
    public void destroy() {
    }
    
}
