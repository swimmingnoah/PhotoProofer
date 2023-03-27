package com.photoproof.photoproof.Repos;

import com.photoproof.photoproof.Models.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {
    Optional<Image> findByName(String name);
}
