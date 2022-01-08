package com.ourcompany.product.reminders.dto;

import com.ourcompany.product.reminders.domain.Reminder;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class RemindersServiceRequest {
    private List<Reminder> reminders = new ArrayList();
}
