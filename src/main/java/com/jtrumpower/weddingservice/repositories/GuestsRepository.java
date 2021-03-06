package com.jtrumpower.weddingservice.repositories;

import com.jtrumpower.weddingservice.beans.Guest;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jtrumpower on 7/16/17.
 */
public interface GuestsRepository extends CrudRepository<Guest, Long> {

  List<Guest> findByLastName(String lastName);
  List<Guest> findAll();

  Guest findGuestByFirstNameLikeAndLastNameLike(String firstName, String lastName);
}