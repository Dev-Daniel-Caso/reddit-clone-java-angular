package com.example.redditclone.repository;

import com.example.redditclone.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerficationTokenRepository extends JpaRepository<VerificationToken, Long> {

}
