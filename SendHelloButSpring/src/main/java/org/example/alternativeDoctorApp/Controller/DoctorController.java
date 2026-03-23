package org.example.alternativeDoctorApp.Controller;

import org.example.alternativeDoctorApp.Service.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    // 📌 список врачей
    @GetMapping("/doctors")
    public String getDoctors(Model model) {
        model.addAttribute("doctors", doctorService.getAllDoctors());
        return "index";
    }

    // 📌 один врач по ID
    @GetMapping("/doctor")
    public String getDoctorById(@RequestParam int id, Model model) throws Throwable {
        model.addAttribute("doctor", doctorService.getDoctorById(id));
        return "doctor";
    }
}
