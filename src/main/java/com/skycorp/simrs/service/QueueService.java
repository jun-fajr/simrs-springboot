package com.skycorp.simrs.service;

import com.skycorp.simrs.model.Queue;
import com.skycorp.simrs.repository.QueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueueService {
  @Autowired
  private QueueRepository queueRepository;

  public Queue saveQueue(Queue queue) {
    return queueRepository.save(queue);
  }

  public Queue findById(Long id) {
    return queueRepository.findById(id).orElse(null);
  }
}
