package com.sobornov.roomservice.repository;

import com.sobornov.roomservice.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
