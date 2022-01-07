package com.ourcompany.product.reminders.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Validated
public class Reminder {
    @Id
    @SequenceGenerator(name="reminder_seq",sequenceName = "reminder_seq", initialValue = 100)
    @GeneratedValue(generator = "reminder_seq", strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private Long userId;
    private String reminderAbout;
    private String when;
    private String keyword;
}
