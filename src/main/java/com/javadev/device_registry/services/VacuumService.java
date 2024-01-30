package com.javadev.device_registry.services;

import com.javadev.device_registry.models.TVModels;
import com.javadev.device_registry.models.VacuumModels;
import com.javadev.device_registry.repositories.TVRepository;
import com.javadev.device_registry.repositories.VacuumRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class VacuumService {
    private final VacuumRepository vacuumRepository;

    public void saveVacuum(VacuumModels vacuum) {
        vacuumRepository.save(vacuum);
    }

    public List<Object []> filterVacuumsByContainerVolume(Float container_volume) {return vacuumRepository.filterVacuumsByContainerVolume(container_volume);}

    public List<Object []> filterVacuumsByModesNum(Integer modes_number) {return vacuumRepository.filterVacuumsByModesNum(modes_number);}

    public List<Object []> filterVacuumsBySerialNum(String serial_number) {return vacuumRepository.filterVacuumsBySerialNum(serial_number);}

    public List<Object []> filterVacuumsBySize(String size) {return vacuumRepository.filterVacuumsBySize(size);}
}