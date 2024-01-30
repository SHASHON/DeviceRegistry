package com.javadev.device_registry.controllers;


import com.javadev.device_registry.models.*;
import com.javadev.device_registry.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RegistryController {
    private final RegistryService registryService;
    private final ComputerService computerService;
    private final RefrigeratorService refrigeratorService;
    private final SmartphoneService smartphoneService;
    private final TVService tvService;
    private final VacuumService vacuumService;

    // ---------------------------------------------ПОЛУЧЕНИЕ---------------------------------------------
        //--------------------ВСЯ ТЕХНИКА

    // Поиск по виду техники (игнорируя регистр)
    @GetMapping("/get/byTechType/{techType}")
    public List<Registry> getByTechType(@PathVariable String techType) {return registryService.getByTechTypeIgnoreCase(techType);}

    // Поиск по названию линейки (игнорируя регистр)
    @GetMapping("/get/byTechName/{techName}")
    public List<Registry> filterByTechName(@PathVariable String techName) {return registryService.getByTechNameIgnoreCase(techName);}

    // Фильтрация по цвету
    @GetMapping("/get/byColor/{color}")
    public List<Object []> filterByColor(@PathVariable String color) {return registryService.filterByColor(color);}

    // Фильтрация по цене
    @GetMapping("/get/byPrice/{bottom_border}-{upper_limit}")
    public List<Object []> filterByPrice(@PathVariable Float bottom_border, @PathVariable Float upper_limit) {return registryService.filterByPrice(bottom_border, upper_limit);}

    //Сортировка реестра по алфавиту
    @GetMapping("/get/sortByAlphabet")
    public List<Object []> sortByAlphabet() {return registryService.sortByAlphabet();}

    // Сортировка реестра по возрастанию цены
    @GetMapping("/get/sortByPriceAsc")
    public List<Object []> sortByPriceAsc() {return registryService.sortByPriceAsc();}

    // Сортировка реестра по убыванию цены
    @GetMapping("/get/sortByPriceDesk")
    public List<Object []> sortByPriceDesk() {return registryService.sortByPriceDesk();}


    //--------------------ПО КАТЕГОРИЯМ

            //-------КОМПЬЮТЕРЫ

    // Фильтрация компьютеров по категории
    @GetMapping("/get/computer/byCategory/{category}")
    public List<Object []> filterCompByCategory(@PathVariable String category) {return computerService.filterComputersByCategory(category);}

    // Фильтрация компьютеров по типу процессора
    @GetMapping("/get/computer/byProcessorType/{processor_type}")
    public List<Object []> filterCompByProcessorType(@PathVariable String processor_type) {return computerService.filterComputersByProcessorType(processor_type);}

    // Фильтрация компьютеров по серийному номеру
    @GetMapping("/get/computer/bySerialNumber/{serial_number}")
    public List<Object []> filterCompBySerialNum(@PathVariable String serial_number) {return computerService.filterComputersBySerialNum(serial_number);}

    // Фильтрация компьютеров по размеру
    @GetMapping("/get/computer/bySize/{size}")
    public List<Object []> filterCompBySize(@PathVariable String size) {return computerService.filterComputersBySize(size);}

    //-------ХОЛОДИЛЬНИКИ

    // Фильтрация холодильников по количеству дверей
    @GetMapping("/get/refrigerator/byDoorsNum/{doors_number}")
    public List<Object []> filterRefrByDoorNum(@PathVariable Integer doors_number) {return refrigeratorService.filterRefrigeratorsByDoorNum(doors_number);}

    // Фильтрация холодильников по типу компрессора
    @GetMapping("/get/refrigerator/byCompressorType/{compressor_type}")
    public List<Object []> filterRefrByCompressorType(@PathVariable String compressor_type) {return refrigeratorService.filterRefrigeratorsByCompressorType(compressor_type);}

    // Фильтрация холодильников по серийному номеру
    @GetMapping("/get/refrigerator/bySerialNumber/{serial_number}")
    public List<Object []> filterRefrBySerialNum(@PathVariable String serial_number) {return refrigeratorService.filterRefrigeratorsBySerialNum(serial_number);}

    // Фильтрация холодильников по размеру
    @GetMapping("/get/refrigerator/bySize/{size}")
    public List<Object []> filterRefrBySize(@PathVariable String size) {return refrigeratorService.filterRefrigeratorsBySize(size);}

    //-------СМАРТФОНЫ

    // Фильтрация смартфонов по кол-ву камер
    @GetMapping("/get/smartphone/byCamerasNumber/{cameras_number}")
    public List<Object []> filterSmartByCamerasNum(@PathVariable Integer cameras_number) {return smartphoneService.filterSmartphonesByCamerasNum(cameras_number);}

    // Фильтрация смартфонов по размеру памяти
    @GetMapping("/get/smartphone/byStorageSize/{storage_size}")
    public List<Object []> filterSmartByStorageSize(@PathVariable Integer storage_size) {return smartphoneService.filterSmartphonesByStorageSize(storage_size);}

    // Фильтрация смартфонов по серийному номеру
    @GetMapping("/get/smartphone/bySerialNumber/{serial_number}")
    public List<Object []> filterSmartBySerialNum(@PathVariable String serial_number) {return smartphoneService.filterSmartphonesBySerialNum(serial_number);}

    // Фильтрация смартфонов по размеру
    @GetMapping("/get/smartphone/bySize/{size}")
    public List<Object []> filterSmartBySize(@PathVariable String size) {return smartphoneService.filterSmartphonesBySize(size);}

    //-------ТЕЛЕВИЗОРЫ

    // Фильтрация телевизоров по категории
    @GetMapping("/get/tv/byCategory/{category}")
    public List<Object []> filterTVByCategory(@PathVariable String category) {return tvService.filterTVsByCategory(category);}

    // Фильтрация телевизоров по технологии
    @GetMapping("/get/tv/byTechnology/{technology}")
    public List<Object []> filterTVByTechnology(@PathVariable String technology) {return tvService.filterTVsByTechnology(technology);}

    // Фильтрация телевизоров по серийному номеру
    @GetMapping("/get/tv/bySerialNumber/{serial_number}")
    public List<Object []> filterTVBySerialNum(@PathVariable String serial_number) {return tvService.filterTVsBySerialNum(serial_number);}

    // Фильтрация телевизоров по размеру
    @GetMapping("/get/tv/bySize/{size}")
    public List<Object []> filterTVBySize(@PathVariable String size) {return tvService.filterTVsBySize(size);}

    //-------ПЫЛЕСОСЫ

    // Фильтрация пылесосов по размеру контейнера
    @GetMapping("/get/vacuums/byContainerVolume/{container_volume}")
    public List<Object []> filterVacByContainerVolume(@PathVariable Float container_volume) {return vacuumService.filterVacuumsByContainerVolume(container_volume);}

    // Фильтрация пылесосов по количеству режимов
    @GetMapping("/get/vacuums/byTechnology/{modes_number}")
    public List<Object []> filterVacByModesNumber(@PathVariable Integer modes_number) {return vacuumService.filterVacuumsByModesNum(modes_number);}

    // Фильтрация пылесосов по серийному номеру
    @GetMapping("/get/vacuums/bySerialNumber/{serial_number}")
    public List<Object []> filterVacBySerialNum(@PathVariable String serial_number) {return vacuumService.filterVacuumsBySerialNum(serial_number);}

    // Фильтрация пылесосов по размеру
    @GetMapping("/get/vacuums/bySize/{size}")
    public List<Object []> filterVacBySize(@PathVariable String size) {return vacuumService.filterVacuumsBySize(size);}


    // ---------------------------------------------ДОБАВЛЕНИЕ---------------------------------------------

    // Добавление различных видов техники
    @PostMapping("/create/technicType")
    public void createRegistry(Registry technicType) {
        registryService.saveRegistry(technicType);
    }

    // Добавление моделей в зависимости от выбранного вида техники
    @PostMapping("/create/computerModel")
    public void createComputer(ComputerModels computer) {
        computerService.saveComputer(computer);
    }

    @PostMapping("/create/refrigeratorModel")
    public void createRefrigerator(RefrigeratorModels refrigerator) {
        refrigeratorService.saveRefrigerator(refrigerator);
    }

    @PostMapping("/create/vacuumModel")
    public void createVacuum(VacuumModels vacuum) {
        vacuumService.saveVacuum(vacuum);
    }

    @PostMapping("/create/tvModel")
    public void createTV(TVModels tv) {
        tvService.saveTV(tv);
    }

    @PostMapping("/create/smartphoneModel")
    public void createSmartphone(SmartphoneModels smartphone) {
        smartphoneService.saveSmartphone(smartphone);
    }




}
