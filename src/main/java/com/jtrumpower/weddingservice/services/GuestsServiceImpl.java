package com.jtrumpower.weddingservice.services;

import com.jtrumpower.weddingservice.controllers.beans.entities.Guest;
import com.jtrumpower.weddingservice.repositories.GuestsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jtrumpower on 7/16/17.
 */
@Service
public class GuestsServiceImpl implements GuestsService {

  @Autowired
  private GuestsRepository guestsRepository;

  @Override
  public List<Guest> findAllGuests() {
    return guestsRepository.findAll();

  }

  @Override
  public List<Guest> findAllGuestByLastName() {
    return findAllGuestByLastName();
  }

  @Override
  public Guest addGuest(Guest guest) {
    guestsRepository.save(guest);

    return guest;
  }
}
