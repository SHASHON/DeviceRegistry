package com.javadev.device_registry.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.javadev.device_registry.controllers.RegistryController;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.reflect.Field;

@Entity
@Table (name = "vacuum_models")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VacuumModels extends Models{

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // Объем пылесборника
    @Column(name = "container_volume", nullable = false)
    private Float containerVolume;

    // Количество режимов
    @Column(name = "modes_number", nullable = false)
    private Integer modesNumber;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "registry_fk")
    @JsonBackReference
    private Registry registry;
}
