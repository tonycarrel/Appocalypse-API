package com.doomsDay.doomsDay.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.doomsDay.doomsDay.entity.survivor;

import java.util.List;

public interface SurvivorRepository extends JpaRepository<survivor, Long> {

    List<survivor> findByInfectedStatus(boolean infectedStatus);
}
