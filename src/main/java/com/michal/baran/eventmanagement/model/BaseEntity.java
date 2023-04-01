package com.michal.baran.eventmanagement.model;

import jakarta.persistence.*;

/**
 * Simple JavaBean domain object with an id property.
 *
 * @author MBaran
 */

@Entity
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
