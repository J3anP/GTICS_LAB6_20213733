package org.example.lab6gtics.controller;

import org.example.lab6gtics.repository.SiteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estadisticasSitios")
public class SiteController {
   final SiteRepository siteRepository;


    public SiteController(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }
}
