package com.example.PRG7_P1_016;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PenggunaServlet", value = "/PenggunaServlet")
public class PenggunaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String nimMahasiswa = request.getParameter("nimMahasiswa");
        String namaMahasiswa = request.getParameter("namaMahasiswa");
        String prodiMahasiswa = request.getParameter("prodiMahasiswa");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Mahasiswa Terdaftar</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Selamat Datang Mahasiswa Bernama " + namaMahasiswa + " dengan NIM " +nimMahasiswa + " dari Program Studi " + prodiMahasiswa);
        out.println("</body>");
        out.println("</html>");
    }
}
