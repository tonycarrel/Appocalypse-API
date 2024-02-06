package com.doomsDay.doomsDay.services;
import com.doomsDay.doomsDay.entity.Robot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class RobotService {

    private List<Robot> robotList;

    public RobotService() {

        this.robotList = new ArrayList<>();
    }

    //getting al robots
    public List<Robot> getRobotList() {
        return robotList;
    }

    //robots by column

    public List<Robot> getRobotsByCategory(String category) {
        return robotList.stream()
                .filter(robot -> robot.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
}
