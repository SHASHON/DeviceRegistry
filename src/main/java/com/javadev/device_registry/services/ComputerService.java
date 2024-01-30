package com.javadev.device_registry.services;

import com.javadev.device_registry.controllers.RegistryController;
import com.javadev.device_registry.models.ComputerModels;
import com.javadev.device_registry.repositories.ComputerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class ComputerService {
    private final ComputerRepository computerRepository;

    public void saveComputer(ComputerModels computer) {
        computerRepository.save(computer);
    }

    public List<Object []> filterComputersByCategory(String category) {return computerRepository.filterComputersByCategory(category);}

    public List<Object []> filterComputersByProcessorType(String processor_type) {return computerRepository.filterComputersByProcessorType(processor_type);}

    public List<Object []> filterComputersBySerialNum(String serial_number) {return computerRepository.filterComputersBySerialNum(serial_number);}

    public List<Object []> filterComputersBySize(String size) {return computerRepository.filterComputersBySize(size);}

}
