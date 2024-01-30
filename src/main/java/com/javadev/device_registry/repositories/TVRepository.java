package com.javadev.device_registry.repositories;

import com.javadev.device_registry.models.RefrigeratorModels;
import com.javadev.device_registry.models.TVModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TVRepository extends JpaRepository<TVModels, Long> {

    //----------------------------------------ТЕЛЕВИЗОРЫ--------------------------------------------

    // Фильтрация телевизоров по технологии
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.technology " +
            "FROM Registry r " +
            "JOIN TVModels sm ON r.id = sm.id " +
            "WHERE sm.technology = :technology " +
            "ORDER BY sm.id ")
    List<Object []> filterTVsByTechnology(@Param("technology") String technology);

    // Фильтрация телевизоров по категории
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.category " +
            "FROM Registry r " +
            "JOIN TVModels sm ON r.id = sm.id " +
            "WHERE sm.category = :category " +
            "ORDER BY sm.id ")
    List<Object []> filterTVsByCategory(@Param("category") String category);


    // Фильтрация телевизоров по серийному номеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.serialNumber " +
            "FROM Registry r " +
            "JOIN TVModels sm ON r.id = sm.id " +
            "WHERE sm.serialNumber = :serial_number " +
            "ORDER BY sm.id ")
    List<Object []> filterTVsBySerialNum(@Param("serial_number") String serial_number);

    // Фильтрация телевизоров по размеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.size " +
            "FROM Registry r " +
            "JOIN TVModels sm ON r.id = sm.id " +
            "WHERE sm.size = :size " +
            "ORDER BY sm.id ")
    List<Object []> filterTVsBySize(@Param("size") String size);
}
