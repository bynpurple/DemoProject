package com.example.demoproject.repository;

import com.example.demoproject.domain.job.QJobs;
import com.example.demoproject.domain.job.Jobs;
import com.example.demoproject.protocol.request.search.SearchJobs;
import com.mysql.cj.util.StringUtils;
import com.querydsl.core.BooleanBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, String>, QuerydslPredicateExecutor<Jobs> {

    Optional<Jobs> findById(String id);

    static BooleanBuilder search(SearchJobs search){
        BooleanBuilder booleanBuilder = new BooleanBuilder();

        QJobs qJobs = QJobs.jobs;

        qJobs.useYn.eq("Y");

        if(!StringUtils.isNullOrEmpty(search.getSearchName())) {
            booleanBuilder.and(qJobs.jobName.contains(search.getSearchName()));
        }

        if(!StringUtils.isNullOrEmpty(search.getSearchRegEmpName())) {
//            booleanBuilder.and(qJobs.)
        }

        return booleanBuilder;
    }

    default Page<Jobs> searchPage(SearchJobs search, Pageable page) {
        BooleanBuilder booleanBuilder = search(search);
        return findAll(booleanBuilder, (Pageable) page);
    }

    default List<Jobs> searchList(SearchJobs search, Sort sort) {
        BooleanBuilder booleanBuilder = search(search);
        return (List<Jobs>) findAll(booleanBuilder, sort).iterator();
    }
}
