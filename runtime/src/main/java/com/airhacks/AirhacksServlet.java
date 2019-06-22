
package com.airhacks;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author airhacks.com
 */
@WebServlet
public class AirhacksServlet extends HttpServlet {

    public AirhacksServlet() {
        System.out.println("AirhacksServlet()");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print("hello from airhacks extension");
    }
}
