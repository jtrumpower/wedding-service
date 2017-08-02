package com.jtrumpower.weddingservice.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by jtrumpower on 7/16/17.
 */
@Entity
@Table(name = "guests")
public class Guest implements Serializable {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name="first_name", nullable=false)
  private String firstName;

  @Column(name="last_name", nullable=false)
  private String lastName;

  @Column(name="email")
  private String email;

  @Column(name="number_of_guests", nullable=false)
  private int numberOfGuests;

  @Column(name="event", nullable=false)
  private String eventType;

  @Column(name="dietary_restriction")
  private String dietaryRestriction;

  @Column(name="attending")
  private boolean attending;

  @Column(name="hotel")
  private boolean hotel;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getNumberOfGuests() {
    return numberOfGuests;
  }

  public void setNumberOfGuests(int numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getDietaryRestriction() {
    return dietaryRestriction;
  }

  public void setDietaryRestriction(String dietaryRestriction) {
    this.dietaryRestriction = dietaryRestriction;
  }

  public boolean isAttending() {
    return attending;
  }

  public void setAttending(boolean attending) {
    this.attending = attending;
  }

  public boolean isHotel() {
    return hotel;
  }

  public void setHotel(boolean hotel) {
    this.hotel = hotel;
  }
}
