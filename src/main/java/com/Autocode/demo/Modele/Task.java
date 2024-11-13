package com.Autocode.demo.Modele;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Task")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String evolution;
    @Column(name ="task_date")
    @CreationTimestamp
    private LocalDate date;
    @Column(name="start_date")
    private LocalDate startDate;
    @Column(name="end_date")
    private LocalDate endDate;
    @Enumerated(EnumType.STRING)
    private Status status;
    public enum Status {
        NOT_STARTED,
        IN_PROGRESS,
        FINISHED
    }
}
