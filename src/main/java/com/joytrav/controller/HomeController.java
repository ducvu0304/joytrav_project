package com.joytrav.controller;

import com.joytrav.model.Tour;
import com.joytrav.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private TourService tourService;
    @GetMapping("/")
    public String home(Model model) {
        List<Tour> carouselList = tourService.fetchCarouselList();

        model.addAttribute("carouselList", carouselList);
        return "index";
    }

    @GetMapping("/tour")
    public String tourPage() {
        return "Tour";
    }

    @GetMapping("/hotel")
    public String hotelPage() {
        return "Hotel";
    }

    @GetMapping("/service")
    public String ServicePage() {
        return "Service";
    }
}
