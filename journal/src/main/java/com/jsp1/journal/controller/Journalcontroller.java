package com.jsp1.journal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp1.jornal.Entity.JournalEntry;
import com.jsp1.journal.service.JournalService;

@RestController
@RequestMapping("/journal")
public class Journalcontroller {

//	private Map<Long,JournalEntry> entries=new HashMap<>();


//	@GetMapping
//	public List<JournalEntry> getAll() {
//		return new ArrayList<>(entries.values());
//	}

	
	@Autowired
	private JournalService journalService;
	
	
	
	
	
	
	@PostMapping
	public boolean createEntry(@RequestBody JournalEntry entry) {
		
		journalService.mtdddd(entry);
		return true;
	}

//	@GetMapping("id/{myid}")
//	public JournalEntry createEntry(@PathVariable ObjectId myid) {
//
//		return null;
//	}
//
//	@PutMapping("id/{id}")
//	public JournalEntry update(@PathVariable ObjectId id, @RequestBody JournalEntry entry) {
//		return null;
//	
//	}
//	
//
//	@DeleteMapping("id/{id}")
//	public JournalEntry delete(@PathVariable Long id) {
//		return null;
//	}

}
