package vttp.ssf.day18.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vttp.ssf.day18.models.Carpark;
import vttp.ssf.day18.services.CarparkService;

@RestController
@RequestMapping(path = "/carparks")
public class CarParkRestController {

    @Autowired
    CarparkService carparkSvc;

    @GetMapping("")
    public ResponseEntity<List<Carpark>> getCarpark (){
        
        List<Carpark> carparkList = carparkSvc.getCarparks();

        return ResponseEntity.ok().body(carparkList);
    }
    
}
