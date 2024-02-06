package com.doomsDay.doomsDay.controller;
import com.doomsDay.doomsDay.entity.survivor;
import com.doomsDay.doomsDay.services.SurvivorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("api/survivors")

public class survivorController {

    private final SurvivorService survivorService;

    @Autowired
    public survivorController(SurvivorService survivorService){
        this.survivorService = survivorService;
    }

    //Get all survivors
    @GetMapping
    public ResponseEntity<List<survivor>> getAllSurvivors(){
        List<survivor> survivors= survivorService.getAllSurvivors();
        return new ResponseEntity<>(survivors,HttpStatus.OK);
    }

    //Add a new survivor to the DB
    @PostMapping
    public ResponseEntity<survivor> saveSurvivor(@RequestBody survivor survivor){
        survivor savedSurvivor = survivorService.saveSurvivor(survivor);
        return new ResponseEntity<>(savedSurvivor, HttpStatus.CREATED);

    }

    //update survivor's last location
@PutMapping("/{id}/UpdateLocation")
    public ResponseEntity<survivor> updateSurvivorLocation(
            @PathVariable Long id,@RequestBody Point newLocation
){
     survivor updatedSurvivor = survivorService.updateSurvivorLastLocation(id, newLocation);

     if (updatedSurvivor != null){

         return new ResponseEntity<>(updatedSurvivor, HttpStatus.OK);
     } else {
         return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
}

//infected survivors

    @GetMapping("/infected")

    public ResponseEntity<List<survivor>> getInfectedSurvivors(){
        List<survivor> infectedSurvivors = survivorService.getSurvivorsByInfectedStatus(true);
        return new ResponseEntity<>(infectedSurvivors, HttpStatus.OK);
    }
    // Get uninfected survivors
    @GetMapping("/uninfected")
    public ResponseEntity<List<survivor>> getUninfectedSurvivors(){
        List<survivor> uninfectedSurvivors = survivorService.getSurvivorsByInfectedStatus(false);
        return new ResponseEntity<>(uninfectedSurvivors, HttpStatus.OK);
    }
}
