package com.javadev.device_registry.repositories;

import com.javadev.device_registry.models.SmartphoneModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SmartphoneRepository extends JpaRepository<SmartphoneModels, Long> {
    //----------------------------------------СМАРТФОНЫ--------------------------------------------

    // Фильтрация смартфонов по размеру памяти
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.storageSize " +
            "FROM Registry r " +
            "JOIN SmartphoneModels sm ON r.id = sm.id " +
            "WHERE sm.storageSize = :storage_size " +
            "ORDER BY sm.storageSize ")
    List<Object []> filterSmartphonesByStorageSize(@Param("storage_size") Integer storage_size);

    // Фильтрация смартфонов по количеству камер
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.camerasNumber " +
            "FROM Registry r " +
            "JOIN SmartphoneModels sm ON r.id = sm.id " +
            "WHERE sm.camerasNumber = :cameras_number " +
            "ORDER BY sm.camerasNumber ")
    List<Object []> filterSmartphonesByCamerasNum(@Param("cameras_number") Integer cameras_number);


    // Фильтрация смартфонов по серийному номеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.serialNumber " +
            "FROM Registry r " +
            "JOIN SmartphoneModels sm ON r.id = sm.id " +
            "WHERE sm.serialNumber = :serial_number " +
            "ORDER BY sm.id ")
    List<Object []> filterSmartphonesBySerialNum(@Param("serial_number") String serial_number);

    // Фильтрация смартфонов по размеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.size " +
            "FROM Registry r " +
            "JOIN SmartphoneModels sm ON r.id = sm.id " +
            "WHERE sm.size = :size " +
            "ORDER BY sm.id ")
    List<Object []> filterSmartphonesBySize(@Param("size") String size);
}
