package de.szut.guestbook.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Entry")
public class GuestbookEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "entry_generator", sequenceName = "entry_seq")
    private Long id;

    private String title;
    private String comment;
    private String commenter;

    @Column(name = "date_of_entry", nullable = false, updatable = false)
    private LocalDate date = LocalDate.now();
}
