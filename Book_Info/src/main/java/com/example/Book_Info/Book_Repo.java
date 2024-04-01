package com.example.Book_Info;

import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

public interface Book_Repo extends CrudRepository<Book_Entity, Integer> {

}
