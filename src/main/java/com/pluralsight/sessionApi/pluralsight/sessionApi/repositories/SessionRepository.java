package com.pluralsight.sessionApi.pluralsight.sessionApi.repositories;

import com.pluralsight.sessionApi.pluralsight.sessionApi.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository <Session,Long> {
}
