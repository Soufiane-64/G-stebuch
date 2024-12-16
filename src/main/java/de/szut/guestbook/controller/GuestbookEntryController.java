package de.szut.guestbook.controller;

import de.szut.guestbook.model.GuestbookEntry;
import de.szut.guestbook.repository.GuestbookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/guestbook")
public class GuestbookEntryController {
    private final GuestbookEntryRepository  repository;
    @Autowired
    public GuestbookEntryController(GuestbookEntryRepository repository) {
        this.repository = repository;
    }
    @PostMapping
    public ResponseEntity<GuestbookEntry> createGuestbookEntry(@RequestBody GuestbookEntry entry) {
        entry = repository.save(entry);
        return new ResponseEntity(entry, HttpStatus.CREATED);
    }
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Guestbook Management Service!";
    }
}
