package org.example.lab6gtics.controller;

import jakarta.validation.Valid;
import org.example.lab6gtics.entity.Technician;
import org.example.lab6gtics.repository.TechnicianRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/tecnico")
public class TechnicianController {
    final TechnicianRepository technicianRepository;

    public TechnicianController(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }

    @GetMapping(value = {"", "/"})
    public String listaTecnicos(Model model) {
        model.addAttribute("listaTecnicos", technicianRepository.findAll());
        return "tecnicos/lista";
    }

    @GetMapping("/new")
    public String nuevoTecnico(Model model, @ModelAttribute("tecnico") Technician tecnico) {
        return "tecnicos/editFrm";
    }
    @PostMapping("/save")
    public String guardarTecnico(Model model, @ModelAttribute("tecnico") @Valid Technician tecnico, BindingResult bindingResult,
                                 RedirectAttributes attr) {

        if(bindingResult.hasErrors()) {
            return "tecnicos/editFrm";
        }else{
            attr.addFlashAttribute("msg","tecnico" + (tecnico.getTechnicianId()==0 ? "creado":"actualizado")+"exitosamente");
            technicianRepository.save(tecnico);
            return "redirect:/tecnico";
        }

    }
    @GetMapping("/edit")
    public String editarTecnico(Model model, @ModelAttribute("tecnico") Technician tecnico, @RequestParam("id") int id) {
        Optional<Technician> optional = technicianRepository.findById(id);

        if(optional.isPresent()){
            model.addAttribute("tecnico",optional.get());
            return "tecnicos/editFrm";
        }else{
            return "redirect:/tecnico";
        }
    }
}
