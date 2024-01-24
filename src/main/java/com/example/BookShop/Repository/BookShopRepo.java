package com.example.BookShop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookShop.Entity.BookShop;

public interface BookShopRepo extends JpaRepository<BookShop, Integer>{

}
