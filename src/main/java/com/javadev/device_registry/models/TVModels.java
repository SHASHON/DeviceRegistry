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
@Table (name = "tv_models")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TVModels extends Models{

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // Категория
    @Column(name = "category", nullable = false)
    private String category;

    // Технология
    @Column(name = "technology", nullable = false)
    private String technology;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "registry_fk")
    @JsonBackReference
    private Registry registry;
}
