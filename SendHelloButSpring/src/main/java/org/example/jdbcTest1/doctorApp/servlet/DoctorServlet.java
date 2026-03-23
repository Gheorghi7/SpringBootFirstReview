package org.example.jdbcTest1.doctorApp.servlet;

import org.example.jdbcTest1.doctorApp.DAO.JdbcConnectionWithDao;
import org.example.jdbcTest1.doctorApp.Doctor;
import org.example.jdbcTest1.doctorApp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.TreeMap;


@Controller
class DoctorController {
    @Autowired
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/doctorById")
    public String getDoctors(
            Model model
    ) {
        Map<Integer, String> map = new TreeMap<>();
        doctorService.getAllDoctorsByID().stream().forEach(d -> map.put(d.id(), d.description()));
        model.addAttribute("map", map);
        return "index";
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