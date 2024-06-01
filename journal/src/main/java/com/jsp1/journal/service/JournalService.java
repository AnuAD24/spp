package com.jsp1.journal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp1.jornal.Entity.JournalEntry;
import com.jsp1.journal.repository.JournalRepo;

@Service

public class JournalService {
	
	@Autowired
	private JournalRepo journalRepo;
	
     public JournalEntry mtdddd(JournalEntry entry) {
    	return journalRepo.save(entry);
     }

}
