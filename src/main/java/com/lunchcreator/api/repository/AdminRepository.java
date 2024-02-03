package com.lunchcreator.api.repository;





import org.springframework.stereotype.Repository;

import com.lunchcreator.api.model.Menu;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;




@Repository
public interface AdminRepository extends JpaRepository<Menu, UUID>{
    
}
