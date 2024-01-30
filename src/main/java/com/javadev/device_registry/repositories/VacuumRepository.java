package com.javadev.device_registry.repositories;

import com.javadev.device_registry.models.RefrigeratorModels;
import com.javadev.device_registry.models.VacuumModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VacuumRepository extends JpaRepository<VacuumModels, Long> {

    //----------------------------------------ПЫЛЕСОСЫ--------------------------------------------

    // Фильтрация пылесосов по размеру контейнера
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.containerVolume " +
            "FROM Registry r " +
            "JOIN VacuumModels sm ON r.id = sm.id " +
            "WHERE sm.containerVolume = :container_volume " +
            "ORDER BY sm.containerVolume ")
    List<Object []> filterVacuumsByContainerVolume(@Param("container_volume") Float container_volume);

    // Фильтрация пылесосов по количеству режимов
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.modesNumber " +
            "FROM Registry r " +
            "JOIN VacuumModels sm ON r.id = sm.id " +
            "WHERE sm.modesNumber = :modes_number " +
            "ORDER BY sm.modesNumber ")
    List<Object []> filterVacuumsByModesNum(@Param("modes_number") Integer modes_number);


    // Фильтрация пылесосов по серийному номеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.serialNumber " +
            "FROM Registry r " +
            "JOIN VacuumModels sm ON r.id = sm.id " +
            "WHERE sm.serialNumber = :serial_number " +
            "ORDER BY sm.id ")
    List<Object []> filterVacuumsBySerialNum(@Param("serial_number") String serial_number);

    // Фильтрация пылесоов по размеру
    @Query("SELECT r.id,r.techType, r.techName, sm.name, sm.size " +
            "FROM Registry r " +
            "JOIN VacuumModels sm ON r.id = sm.id " +
            "WHERE sm.size = :size " +
            "ORDER BY sm.id ")
    List<Object []> filterVacuumsBySize(@Param("size") String size);
}
