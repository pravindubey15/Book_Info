package com.example.Book_Info;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book_info")
public class BookController {
    @Autowired
    private Book_Repo bookRepo;
    @GetMapping("/get")
    public @ResponseBody Iterable<Book_Entity> getAll(){
                return bookRepo.findAll();
    }
    @PostMapping("/add")
    public ResponseEntity<String> addAll(@RequestBody List<Book_Entity> b){
        bookRepo.saveAll(b);
        return ResponseEntity.ok("Saved in Database");
    }
    @DeleteMapping("/remove")
    public ResponseEntity<String> removeIt(@PathParam("id") Integer id){
        bookRepo.deleteById(id);
        return ResponseEntity.ok("deleted");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> getUpdate(@PathVariable Integer id,@RequestBody Book_Entity bk) {
                    if (!bookRepo.existsById(id)) {
                return ResponseEntity.ok("Not found");
            }
            bk.setId(id);
            bookRepo.save(bk);
            return ResponseEntity.ok("Successfully update in Database");
        }
    }

