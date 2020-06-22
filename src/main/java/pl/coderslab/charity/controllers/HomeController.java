package pl.coderslab.charity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.entities.Donation;
import pl.coderslab.charity.entities.Institution;
import pl.coderslab.charity.interfaces.DonationService;
import pl.coderslab.charity.repositories.DonationRepository;
import pl.coderslab.charity.repositories.InstitutionRepository;

import javax.validation.Valid;
import java.util.List;


@Controller
public class HomeController {
    private DonationService donationService;
    private InstitutionRepository institutionRepository;

    public HomeController(DonationService donationService, InstitutionRepository institutionRepository) {
        this.donationService = donationService;
        this.institutionRepository = institutionRepository;
    }

    @RequestMapping("/")
    public String homeAction(Model model) {
        return "index";
    }


    @ModelAttribute("countOfTotalQuantity")
    public String countTotalQuantity(){
        return donationService.countTotalQuantity().toString();
    }
}
