package com.doomsDay.doomsDay.services;

import com.doomsDay.doomsDay.entity.survivor;
import com.doomsDay.doomsDay.Repository.SurvivorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Service
public class SurvivorService {

    private final SurvivorRepository survivorRepository;

    @Autowired
    public SurvivorService(SurvivorRepository survivorRepository) {
        this.survivorRepository = survivorRepository;
    }

    //all survivors
    public List<survivor> getAllSurvivors() {
        return survivorRepository.findAll();
    }

    // add survivor to the table
    public survivor saveSurvivor(survivor survivor) {
        return survivorRepository.save(survivor);
    }

    public survivor updateSurvivorLastLocation(Long id, Point newLocation) {
        Optional<survivor> optionalSurvivor = survivorRepository.findById(id);

        if (optionalSurvivor.isPresent()) {
            survivor existingSurvivor = optionalSurvivor.get();
            existingSurvivor.setLastLocation(newLocation);
            return survivorRepository.save(existingSurvivor);
        } else {

            //add to uninfected survivor table

        }
        return null;
    }




    //Retrieves survivors with a specific infected status from the database.

    public List<survivor> getSurvivorsByInfectedStatus(boolean infectedStatus) {
        return survivorRepository.findByInfectedStatus(infectedStatus);
    }


}