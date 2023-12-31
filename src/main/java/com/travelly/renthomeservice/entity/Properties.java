package com.travelly.renthomeservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rh_properties", schema = "postgres")
public class Properties implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "property_name")
    private String propertyName;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "country")
    private String country;

    @Column(name = "property_type")
    private String propertyType;

    @Column(name = "bedrooms")
    private String bedrooms;

    @Column(name = "bathrooms")
    private String bathrooms;

    @Column(name = "accommodates")
    private String accommodates;

    @Column(name = "price_per_night")
    private BigDecimal pricePerNight;

    @Column(name = "price_per_month")
    private BigDecimal pricePerMonth;

    @Column(name = "minimum_stay_days")
    private Integer minimumStayDays;

    @Column(name = "maximum_stay_days")
    private Integer maximumStayDays;

    @Column(name = "available_booking")
    private Boolean availableBooking;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
