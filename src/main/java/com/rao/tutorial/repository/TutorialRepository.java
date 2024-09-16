package com.rao.tutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rao.tutorial.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published); // returns all published tuts

    List<Tutorial> findByTitleContaining(String title); // returns all tuts which title contains input keywords
}
