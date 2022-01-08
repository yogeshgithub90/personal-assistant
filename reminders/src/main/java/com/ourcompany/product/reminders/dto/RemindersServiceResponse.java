package com.ourcompany.product.reminders.dto;

import com.ourcompany.product.reminders.domain.Reminder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RemindersServiceResponse {
    private HttpStatus staus;
    private List<Reminder> reminders = new ArrayList();
}
