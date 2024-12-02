package vttp.ssf.day18.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vttp.ssf.day18.models.Carpark;
import vttp.ssf.day18.services.CarparkService;

@Controller
@RequestMapping
public class CarparkController {

    @Autowired
    CarparkService carparkService;

    @GetMapping
    public ModelAndView getCarparks(){
        
        ModelAndView mav = new ModelAndView();

        List<Carpark> carParkList = carparkService.getCarparks();

        mav.setViewName("carparks");
        mav.addObject("carparklist", carParkList);
        return mav;
    }
    
    
    
}
