package com.springrest.live.Load;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface LoadRepository extends JpaRepository<Load,Long>{
    List<Load> findByShipperId(String shipperId);
    Optional<Load> findById(long id);
}
