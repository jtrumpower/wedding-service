package com.jtrumpower.weddingservice.controllers.beans.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by jtrumpower on 7/16/17.
 */
@Entity
@Table(name = "guests")
public class Guests {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  @Column(name="firstName", nullable=false)
  private String firstName;

  @Column(name="lastName", nullable=false)
  private String lastName;

  @Column(name="email", nullable=true)
  private String email;

  @Column(name="number_of_guests", nullable=false)
  private int numberOfGuests;

  @Column(name="event", nullable=false)
  private String event;

  @Column(name="dietary_restriction", nullable=false)
  private String dietaryRestriction;


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

  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public String getDietaryRestriction() {
    return dietaryRestriction;
  }

  public void setDietaryRestriction(String dietaryRestriction) {
    this.dietaryRestriction = dietaryRestriction;
  }
}
