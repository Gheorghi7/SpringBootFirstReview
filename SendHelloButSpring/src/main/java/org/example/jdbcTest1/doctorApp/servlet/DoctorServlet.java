package org.example.jdbcTest1.doctorApp.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.jdbcTest1.doctorApp.service.DoctorService;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/doctor_by_id")
public class DoctorServlet extends HttpServlet {
    private final DoctorService doctorService = DoctorService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        super.doGet(req, resp);
    }
}
