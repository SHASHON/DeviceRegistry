package com.javadev.device_registry.repositories;

import com.javadev.device_registry.models.RefrigeratorModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RefrigeratorRepository extends JpaRepository<RefrigeratorModels, Long> {
    //----------------------------------------ХОЛОДИЛЬНИКИ--------------------------------------------

    // Фильтрация холодильников по количеству дверей
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.doorsNumber " +
            "FROM Registry r " +
            "JOIN RefrigeratorModels sm ON r.id = sm.id " +
            "WHERE sm.doorsNumber = :doors_number " +
            "ORDER BY sm.doorsNumber ")
    List<Object []> filterRefrigeratorsByDoorNum(@Param("doors_number") Integer doors_number);

    // Фильтрация холодильников по типу компрессора
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.compressorType " +
            "FROM Registry r " +
            "JOIN RefrigeratorModels sm ON r.id = sm.id " +
            "WHERE sm.compressorType = :compressor_type " +
            "ORDER BY sm.id ")
    List<Object []> filterRefrigeratorsByCompressorType(@Param("compressor_type") String compressor_type);


    // Фильтрация холодильников по серийному номеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.serialNumber " +
            "FROM Registry r " +
            "JOIN RefrigeratorModels sm ON r.id = sm.id " +
            "WHERE sm.serialNumber = :serial_number " +
            "ORDER BY sm.id ")
    List<Object []> filterRefrigeratorsBySerialNum(@Param("serial_number") String serial_number);

    // Фильтрация холодильников по размеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.size " +
            "FROM Registry r " +
            "JOIN RefrigeratorModels sm ON r.id = sm.id " +
            "WHERE sm.size = :size " +
            "ORDER BY sm.id ")
    List<Object []> filterRefrigeratorsBySize(@Param("size") String size);
}
