package com.javadev.device_registry.services;

import com.javadev.device_registry.controllers.RegistryController;
import com.javadev.device_registry.models.SmartphoneModels;
import com.javadev.device_registry.repositories.SmartphoneRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class SmartphoneService {
    private final SmartphoneRepository smartphoneRepository;


    public void saveSmartphone(SmartphoneModels smartphone) {
        smartphoneRepository.save(smartphone);
    }

    public List<Object []> filterSmartphonesByCamerasNum(Integer cameras_number) {return smartphoneRepository.filterSmartphonesByCamerasNum(cameras_number);}

    public List<Object []> filterSmartphonesByStorageSize(Integer storage_size) {return smartphoneRepository.filterSmartphonesByStorageSize(storage_size);}

    public List<Object []> filterSmartphonesBySerialNum(String serial_number) {return smartphoneRepository.filterSmartphonesBySerialNum(serial_number);}

    public List<Object []> filterSmartphonesBySize(String size) {return smartphoneRepository.filterSmartphonesBySize(size);}
}
