package com.sobornov.guestservice.repository;

import com.sobornov.guestservice.model.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Sobornov Vladimir
 * @since : 20.11.2022
 **/
@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
