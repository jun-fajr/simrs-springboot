package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.Queue;
import com.skycorp.simrs.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queues")
public class QueueController {
  @Autowired
  private QueueService queueService;

  @PostMapping
  public Queue createQueue(@RequestBody Queue queue) {
    return queueService.saveQueue(queue);
  }

  @GetMapping("/{id}")
  public Queue getQueue(@PathVariable Long id) {
    return queueService.findById(id);
  }
}
