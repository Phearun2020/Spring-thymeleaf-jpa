package itc.i4gic.demo_jpa.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itc.i4gic.demo_jpa.entity.Book;
import itc.i4gic.demo_jpa.repository.BookRepository;

@Service
public class BookService {
   @Autowired
   private BookRepository bRepo;

   public void save(Book b) {
      bRepo.save(b);
   }

   public List<Book> getAllBook(){
      return bRepo.findAll();
   }
}
