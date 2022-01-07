package com.ourcompany.product.reminders.controller;

import com.ourcompany.product.reminders.dto.RemindersServiceRequest;
import com.ourcompany.product.reminders.dto.RemindersServiceResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reminders")
public class RemindersController {
    Logger logger = LoggerFactory.getLogger(RemindersController.class);
    @PostMapping("/save")
    public RemindersServiceResponse saveReminders(@RequestBody RemindersServiceRequest request){
        logger.info(request.toString());
        return RemindersServiceResponse.builder().staus(HttpStatus.ACCEPTED).build();
    }

    @GetMapping("/get/user/{userId}")
    public RemindersServiceResponse getForUserId(@PathVariable Long userId){
        logger.info("userId is {0}",userId);
        return RemindersServiceResponse.builder().staus(HttpStatus.ACCEPTED).build();
    }
}
