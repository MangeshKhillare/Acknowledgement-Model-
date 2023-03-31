package com.acknowledgement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acknowledgement.entity.RejectedDocuments;

@Repository
public interface RejectedDocumentsRepository extends JpaRepository<RejectedDocuments, Long> {

}
