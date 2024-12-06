package de.szut.guestbook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/guestbook")
public class GuestbookEntryController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Guestbook Management Service!";
    }
}
