package com.codegym.repository;

import com.codegym.model.Miss;
import com.codegym.model.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoomRepository extends PagingAndSortingRepository<Room,Long> {
    Iterable<Miss> findAllByNameContains(String name);

    @Query(value = "select * from Miss",nativeQuery = true)
    Iterable<Miss> findALlByQuery();
}
