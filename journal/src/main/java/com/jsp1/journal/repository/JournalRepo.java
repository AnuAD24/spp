package com.jsp1.journal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.jsp1.jornal.Entity.JournalEntry;

@Repository
@EnableMongoRepositories
public interface JournalRepo extends MongoRepository<JournalEntry,String> {

}
