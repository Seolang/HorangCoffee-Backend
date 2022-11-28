package com.horang.HorangCoffeeBackend.repository;

import com.horang.HorangCoffeeBackend.model.Coffee;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CoffeeRepository {

    private final EntityManager em;

    public void save(Coffee coffee) {
        em.persist(coffee);
    }

    public Coffee findOne(Long id) {
        return em.find(Coffee.class, id);
    }

    public List<Coffee> findAll() {
        return em.createQuery("select c from Coffee c", Coffee.class)
                .getResultList();
    }

}
