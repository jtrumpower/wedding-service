package com.jtrumpower.weddingservice.controllers;

import com.jtrumpower.weddingservice.beans.Guest;
import com.jtrumpower.weddingservice.services.GuestsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/guests")
class WeddingController {

    @Autowired
    GuestsService guestsService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Guest> getAllGuests() {
        return guestsService.findAllGuests();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Guest addGuest(@RequestBody Guest guest) {

        return guestsService.addGuest(guest);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Guest updateGuest(@RequestBody Guest guest) {

        return guestsService.updateGuest(guest);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteGuest(@PathVariable Long id) {

        guestsService.deleteGuest(id);
    }

    @RequestMapping(value = "status", method = RequestMethod.POST)
    public String guestStatus(@RequestBody Guest guest) {

        return guestsService.checkStatus(guest);
    }
}
