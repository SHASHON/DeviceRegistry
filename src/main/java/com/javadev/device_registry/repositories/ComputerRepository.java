package com.javadev.device_registry.repositories;

import com.javadev.device_registry.models.ComputerModels;
import com.javadev.device_registry.models.RefrigeratorModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComputerRepository extends JpaRepository<ComputerModels, Long> {

//----------------------------------------КОМПЬЮТЕРЫ--------------------------------------------

    // Фильтрация компьютеров по категории
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.category " +
            "FROM Registry r " +
            "JOIN ComputerModels sm ON r.id = sm.id " +
            "WHERE sm.category = :category " +
            "ORDER BY sm.category ")
    List<Object []> filterComputersByCategory(@Param("category") String category);

    // Фильтрация компьютера по типу процессора
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.processorType " +
            "FROM Registry r " +
            "JOIN ComputerModels sm ON r.id = sm.id " +
            "WHERE sm.processorType = :processor_type " +
            "ORDER BY sm.id ")
    List<Object []> filterComputersByProcessorType(@Param("processor_type") String processor_type);


    // Фильтрация компьютеров по серийному номеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.serialNumber " +
            "FROM Registry r " +
            "JOIN ComputerModels sm ON r.id = sm.id " +
            "WHERE sm.serialNumber = :serial_number " +
            "ORDER BY sm.id ")
    List<Object []> filterComputersBySerialNum(@Param("serial_number") String serial_number);

    // Фильтрация компьютеров по размеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.size " +
            "FROM Registry r " +
            "JOIN ComputerModels sm ON r.id = sm.id " +
            "WHERE sm.size = :size " +
            "ORDER BY sm.id ")
    List<Object []> filterComputersBySize(@Param("size") String size);
}

