package com.pluralsight.sessionApi.pluralsight.sessionApi.repositories;

import com.pluralsight.sessionApi.pluralsight.sessionApi.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository <Speaker,Long> {
}
