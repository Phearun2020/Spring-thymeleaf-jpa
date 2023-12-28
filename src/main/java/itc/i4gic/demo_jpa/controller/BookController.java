package itc.i4gic.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import itc.i4gic.demo_jpa.entity.Book;
import itc.i4gic.demo_jpa.service.BookService;




@Controller
public class BookController {

   @Autowired
   private BookService service;
   
   @GetMapping("/")
   public String home() {
      return "home";
   }

   @GetMapping("/book_register")
   public String book_register() {
       return "bookRegister";
   }

   @GetMapping("/available_books")
   public ModelAndView getAllBook() {
      List<Book>list = service.getAllBook();
      return new ModelAndView("bookList", "book", list);
   }
   

   @PostMapping("/save")
   public String addBook(@ModelAttribute Book b) {
      service.save(b);
      return "redirect:/available_books";
   }

   @RequestMapping("/editBook/{id}")
   public String editBook(@PathVariable("id") int id, Model model) {
      Book b= service.getBookById(id);
      model.addAttribute("book", b);
      return "bookEdit";
   }
   
}
