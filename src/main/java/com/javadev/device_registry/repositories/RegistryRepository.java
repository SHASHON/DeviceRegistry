package com.javadev.device_registry.repositories;

import com.javadev.device_registry.models.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Long> {

    List<Registry> findByTechNameIgnoreCase(String techName);

    List<Registry> findByTechTypeIgnoreCase(String techType);

    // Фильтрация по цвету

    @Query("SELECT n.id, n.tech_type, n.tech_name, n.model_name, n.color " +
            "FROM (SELECT r.id AS id,r.techType as tech_type, r.techName AS tech_name, " +
            "COALESCE(cm.name, tm.name, sm.name, vm.name,rm.name) AS model_name, " +
            "COALESCE(cm.color, tm.color, sm.color, vm.color, rm.color) AS color " +
            "FROM Registry r " +
            "LEFT JOIN ComputerModels cm ON r.id = cm.registry.id " +
            "LEFT JOIN RefrigeratorModels rm ON r.id = rm.registry.id " +
            "LEFT JOIN SmartphoneModels sm ON r.id = sm.registry.id " +
            "LEFT JOIN VacuumModels vm ON r.id = vm.registry.id " +
            "LEFT JOIN TVModels tm ON r.id = tm.registry.id) AS n " +
            "WHERE n.color = :color " +
            "ORDER BY n.id")
    List<Object []> filterByColor(@Param("color") String color);

    // Фильрация по цене
    @Query("SELECT n.id, n.tech_type, n.tech_name, n.model_name, n.price " +
            "FROM (SELECT r.id AS id,r.techType as tech_type, r.techName AS tech_name, " +
            "COALESCE(cm.name, tm.name, sm.name, vm.name,rm.name) AS model_name, " +
            "COALESCE(cm.price, tm.price, sm.price, vm.price, rm.price) AS price " +
            "FROM Registry r " +
            "LEFT JOIN ComputerModels cm ON r.id = cm.registry.id " +
            "LEFT JOIN RefrigeratorModels rm ON r.id = rm.registry.id " +
            "LEFT JOIN SmartphoneModels sm ON r.id = sm.registry.id " +
            "LEFT JOIN VacuumModels vm ON r.id = vm.registry.id " +
            "LEFT JOIN TVModels tm ON r.id = tm.registry.id) AS n " +
            "WHERE n.price > :bottom_line AND n.price < :upper_limit " +
            "ORDER BY n.id")
    List<Object []> filterByPrice(@Param("bottom_line") Float bottom_line, @Param("upper_limit") Float upper_limit);


    // Сортировка реестра по возрастанию цены
    @Query("SELECT r.id AS id,r.techType as tech_type, r.techName AS tech_name, " +
            "            COALESCE(cm.name, tm.name, sm.name, vm.name,rm.name) AS model_name, " +
            "            COALESCE(cm.price, tm.price, sm.price, vm.price, rm.price) AS price " +
            "            FROM Registry r " +
            "            LEFT JOIN ComputerModels cm ON r.id = cm.registry.id " +
            "            LEFT JOIN RefrigeratorModels rm ON r.id = rm.registry.id " +
            "            LEFT JOIN SmartphoneModels sm ON r.id = sm.registry.id " +
            "            LEFT JOIN VacuumModels vm ON r.id = vm.registry.id " +
            "            LEFT JOIN TVModels tm ON r.id = tm.registry.id " +
            "            ORDER BY price ASC")
    List<Object []> sortByPriceAsc();

    // Сортировка реестра по убыванию цены
    @Query("SELECT r.id AS id,r.techType as tech_type, r.techName AS tech_name, " +
            "            COALESCE(cm.name, tm.name, sm.name, vm.name,rm.name) AS model_name, " +
            "            COALESCE(cm.price, tm.price, sm.price, vm.price, rm.price) AS price " +
            "            FROM Registry r " +
            "            LEFT JOIN ComputerModels cm ON r.id = cm.registry.id " +
            "            LEFT JOIN RefrigeratorModels rm ON r.id = rm.registry.id " +
            "            LEFT JOIN SmartphoneModels sm ON r.id = sm.registry.id " +
            "            LEFT JOIN VacuumModels vm ON r.id = vm.registry.id " +
            "            LEFT JOIN TVModels tm ON r.id = tm.registry.id " +
            "            ORDER BY price DESC")
    List<Object []> sortByPriceDesc();


    // Сортировка реестра по алфавиту
    @Query("SELECT r.id AS id,r.techType as tech_type, r.techName AS tech_name, " +
            "            COALESCE(cm.name, tm.name, sm.name, vm.name,rm.name) AS model_name, " +
            "            COALESCE(cm.price, tm.price, sm.price, vm.price, rm.price) AS price " +
            "            FROM Registry r " +
            "            LEFT JOIN ComputerModels cm ON r.id = cm.registry.id " +
            "            LEFT JOIN RefrigeratorModels rm ON r.id = rm.registry.id " +
            "            LEFT JOIN SmartphoneModels sm ON r.id = sm.registry.id " +
            "            LEFT JOIN VacuumModels vm ON r.id = vm.registry.id " +
            "            LEFT JOIN TVModels tm ON r.id = tm.registry.id " +
            "            ORDER BY model_name ASC ")
    List<Object []> sortByAlphabet();


}
