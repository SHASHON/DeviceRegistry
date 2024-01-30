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
@Table (name = "smartphone_models")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmartphoneModels extends Models{

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // Кол-во памяти
    @Column(name = "storage_size", nullable = false)
    private Integer storageSize;

    // Кол-во камер
    @Column(name = "cameras_number", nullable = false)
    private Integer camerasNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "registry_fk")
    @JsonBackReference
    private Registry registry;
}
