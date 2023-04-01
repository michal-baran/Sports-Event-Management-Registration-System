package com.michal.baran.eventmanagement.participant;

import com.michal.baran.eventmanagement.model.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;

/**
 * Simple JavaBean domain object representing an participant.
 *
 * @author MBaran
 */

@Entity
@Table(name = "participants")
public class Participant extends Person {

    @Column(name = "address")
    @NotEmpty
    private String address;

    @Column(name = "city")
    @NotEmpty
    private String city;

    @Column(name = "telephone")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telephone;

}
