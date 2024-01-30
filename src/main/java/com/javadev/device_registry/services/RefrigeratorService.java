package com.javadev.device_registry.services;

import com.javadev.device_registry.controllers.RegistryController;
import com.javadev.device_registry.models.ComputerModels;
import com.javadev.device_registry.models.RefrigeratorModels;
import com.javadev.device_registry.repositories.RefrigeratorRepository;
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
public class RefrigeratorService {
    private final RefrigeratorRepository refrigeratorRepository;


    public void saveRefrigerator(RefrigeratorModels refrigerator) {
        refrigeratorRepository.save(refrigerator);
    }

    public List<Object []> filterRefrigeratorsByDoorNum(Integer doors_number) {return refrigeratorRepository.filterRefrigeratorsByDoorNum(doors_number);}

    public List<Object []> filterRefrigeratorsByCompressorType(String compressor_type) {return refrigeratorRepository.filterRefrigeratorsByCompressorType(compressor_type);}

    public List<Object []> filterRefrigeratorsBySerialNum(String serial_number) {return refrigeratorRepository.filterRefrigeratorsBySerialNum(serial_number);}

    public List<Object []> filterRefrigeratorsBySize(String size) {return refrigeratorRepository.filterRefrigeratorsBySize(size);}


}
