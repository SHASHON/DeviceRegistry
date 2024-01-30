package com.javadev.device_registry.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.javadev.device_registry.controllers.RegistryController;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Entity
@Table (name = "refrigerator_models")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefrigeratorModels extends Models{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // Кол-во дверей
    @Column(name = "doors_number", nullable = false)
    private Integer doorsNumber;

    // Тип компрессора
    @Column(name = "compressor_type", nullable = false)
    private String compressorType;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "registry_fk")
    @JsonBackReference
    private Registry registry;
}
