package com.example.sportradartask.Repository;

import com.example.sportradartask.Models.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends JpaRepository<Sport,Long> {
}
