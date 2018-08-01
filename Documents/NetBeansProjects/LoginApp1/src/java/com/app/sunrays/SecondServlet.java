/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sunrays;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sunrays
 */
public class SecondServlet extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.print("<h3>Servlet for Checking Session</h3>");
        HttpSession session = request.getSession();
        
        String uname = (String) session.getAttribute("uname");
        if(uname == null)
        {
            out.print("<h2>Currently no Active Session </h2>");
        }
        else
        {
            out.print("Current Session is :"+uname);
            out.print("<a href='Logout'>LogOut</a>");
        }
        
    }
}
