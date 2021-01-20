package com.codegym.repository;

import com.codegym.model.Room;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoomRepository extends PagingAndSortingRepository<Room,Long> {
}
