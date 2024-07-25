package com.example.estspringjpamysql;

import aj.org.objectweb.asm.commons.Remapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByIsbn(String isbn);

    List<Book> findByPriceBetween(Double minPrice, Double maxPrice);

    List<Book> findByStockGreaterThanEqual(Integer minStock);

    List<Book> findByTitleContaining(String keyword);
}