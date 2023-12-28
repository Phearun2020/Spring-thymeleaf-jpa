package itc.i4gic.demo_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Book")

public class Author {
   @Id
   @GeneratedValue
   private Long id;
   private String name;
   @ManyToOne
   @JoinColumn(name = "author_id")
   private Author author;

   // @GeneratedValue(strategy = GenerationType.AUTO)
   // public Book(String name, Author author ){
   //    this.name = name;
   //    this.author = author;
   // }
}
