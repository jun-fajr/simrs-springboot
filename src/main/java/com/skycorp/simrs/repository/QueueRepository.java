package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.Queue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueueRepository extends JpaRepository<Queue, Long> {
}
