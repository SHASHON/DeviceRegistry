package com.javadev.device_registry.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Models {

    // Название
    @Column(name = "name", nullable = false)
    protected String name;

    // Серийный номер
    @Column(name = "serial_number", nullable = false)
    protected String serialNumber;

    // Цвет
    @Column(name = "color", nullable = false)
    protected String color;

    // Размер
    @Column(name = "size", nullable = false)
    protected String size;

    // Цена
    @Column(name = "price", nullable = false)
    protected Float price;

    // Наличие товара
    @Column(name = "availability", nullable = false)
    protected Boolean availability;
}
