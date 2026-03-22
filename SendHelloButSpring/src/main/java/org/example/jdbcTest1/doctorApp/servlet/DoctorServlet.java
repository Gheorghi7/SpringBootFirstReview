package org.example.jdbcTest1.doctorApp.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.jdbcTest1.doctorApp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/doctorById")
public class DoctorServlet extends HttpServlet {

    private static DoctorService doctorService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());

        try (var writer = resp.getWriter()) {
            writer.write("<h1>Doctor`s list</h1>");
            writer.write("<ul>");

            doctorService.getAllDoctorsByID().forEach(d ->
                    writer.write("""
                            <li>
                                <a href="/doctorById?doctorId=%d">%s</a>
                            </li>
                            """.formatted(d.id(), d.description()))
            );

            writer.write("</ul>");
        }
    }
}


//@Controller
//public class DoctorServlet {
//
//    private final DoctorService doctorService;
//
//    public DoctorServlet(DoctorService doctorService) {
//        this.doctorService = doctorService;
//    }
//
//    @GetMapping("/doctorById")
//    @ResponseBody
//    public String getDoctors() {
//        StringBuilder html = new StringBuilder("<h1>Doctor`s list</h1><ul>");
//        doctorService.getAllDoctorsByID().forEach(d ->
//                html.append("""
//                        <li>
//                            <a href="/doctorById?doctorId=%d">%s</a>
//                        </li>
//                        """.formatted(d.id(), d.description()))
//        );
//        html.append("</ul>");
//        return html.toString();
//    }
//}