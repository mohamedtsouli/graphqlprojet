package org.sid.devoir.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.TimeZoneStorage;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Computer {
    @Id
    @GeneratedValue
    private Long id_Pc;
    private String proce;
    private int ram;
    private int hardDrive;
    private double price;
    private String macAddress;
}
