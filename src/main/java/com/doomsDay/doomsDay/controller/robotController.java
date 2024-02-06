package com.doomsDay.doomsDay.controller;
import com.doomsDay.doomsDay.entity.Robot;
import com.doomsDay.doomsDay.services.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/robots")
public class robotController {

    private  RobotService robotService;

    @Autowired

    public void RobotController(RobotService robotService){
        this.robotService = robotService;
    }

    public robotController(RobotService robotService) {
        this.robotService = robotService;
    }

    //all robots Endpoint
    @GetMapping("/category/{category}")
    public List<Robot>  getRobotsByCategory(@PathVariable String category){
        return robotService.getRobotsByCategory(category);
    }

}
