package com.example.demoproject.repository;

import com.example.demoproject.domain.Jobs;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, String>, QuerydslPredicateExecutor<Jobs> {
    Optional<Jobs> findById(String id);
}
