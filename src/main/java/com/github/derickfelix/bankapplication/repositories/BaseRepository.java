
package com.github.derickfelix.bankapplication.repositories;

import java.util.List;
import java.util.Optional;


public interface BaseRepository<T, ID> {
   
    List<T> findAll();

   
    Optional<T> find(ID id);

    
    void save(T model);

    Optional<T> deleteById(ID id);
}
