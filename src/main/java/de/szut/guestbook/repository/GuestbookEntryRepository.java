package de.szut.guestbook.repository;

import de.szut.guestbook.model.GuestbookEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestbookEntryRepository extends JpaRepository<GuestbookEntry, Long> {
}
