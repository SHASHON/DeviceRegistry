package com.javadev.device_registry.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table (name = "computer_models")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComputerModels extends Models {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // Категория
    @Column(name = "category", nullable = false)
    private String category;

    // Тип процессора
    @Column(name = "processor_type", nullable = false)
    private String processorType;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "registry_fk")
    @JsonBackReference
    private Registry registry;

}
