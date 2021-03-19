package com.example.PRG7_P1_016;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MatakuliahServlet", value = "/MatakuliahServlet")
public class MatakuliahServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String mataKuliahValues[] = request.getParameterValues("daftarMatakuliah");
        StringBuffer myResponse = new StringBuffer();
        myResponse.append("<!DOCTYPE html>");
        myResponse.append("<html><head><title>Matakuliah</title></head><body>");
        myResponse.append("<h1>Berikut Matakuliah yang kamu suka : </h1>");
        for (int i = 0; i < mataKuliahValues.length; i++) {
            myResponse.append("<br/><li>");
            myResponse.append((mataKuliahValues[i]));
        }
        myResponse.append("</body>");
        myResponse.append("</html>");
        out.println(myResponse.toString());
    }
}
