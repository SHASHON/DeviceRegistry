package com.javadev.device_registry.services;

import com.javadev.device_registry.controllers.RegistryController;
import com.javadev.device_registry.models.TVModels;
import com.javadev.device_registry.repositories.TVRepository;
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
public class TVService {
    private final TVRepository tvRepository;

    public void saveTV(TVModels tv) {
        tvRepository.save(tv);
    }

    public List<Object []> filterTVsByCategory(String category) {return tvRepository.filterTVsByCategory(category);}

    public List<Object []> filterTVsByTechnology(String technology) {return tvRepository.filterTVsByTechnology(technology);}

    public List<Object []> filterTVsBySerialNum(String serial_number) {return tvRepository.filterTVsBySerialNum(serial_number);}

    public List<Object []> filterTVsBySize(String size) {return tvRepository.filterTVsBySize(size);}
}