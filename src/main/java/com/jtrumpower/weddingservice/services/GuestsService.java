package com.jtrumpower.weddingservice.services;

import com.jtrumpower.weddingservice.beans.Guest;
import java.util.List;

/**
 * Created by jtrumpower on 7/16/17.
 */


public interface GuestsService {
  List<Guest> findAllGuests();
  List<Guest> findAllGuestByLastName();

  Guest addGuest(Guest guest);
}
