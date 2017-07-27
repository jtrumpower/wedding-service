package com.jtrumpower.weddingservice.controllers;

import com.jtrumpower.weddingservice.beans.Guest;
import com.jtrumpower.weddingservice.services.GuestsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
class WeddingController {

    @Autowired
    GuestsService guestsService;

    @RequestMapping(value = "/guests", method = RequestMethod.GET)
    public List<Guest> getAllGuests() {
        return guestsService.findAllGuests();
    }

    @RequestMapping(value = "/guests", method = RequestMethod.POST)
    public Guest addGuest(@RequestBody Guest guest) {

        return guestsService.addGuest(guest);
    }
}
