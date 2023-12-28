package itc.i4gic.demo_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import itc.i4gic.demo_jpa.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
   
}
