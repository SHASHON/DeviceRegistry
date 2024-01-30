package com.javadev.device_registry.services;

import com.javadev.device_registry.models.ComputerModels;
import com.javadev.device_registry.models.Registry;
import com.javadev.device_registry.repositories.ComputerRepository;
import com.javadev.device_registry.repositories.RegistryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RegistryService {
    private final RegistryRepository registryRepository;
    public List<Registry> getAllRegistry() {
        return registryRepository.findAll();
    }
    public List<Registry> getByTechNameIgnoreCase(String techName) {return registryRepository.findByTechNameIgnoreCase(techName);}
    public List<Registry> getByTechTypeIgnoreCase(String techType) {return registryRepository.findByTechTypeIgnoreCase(techType);}

    public List<Object []> filterByColor(String color) {return registryRepository.filterByColor(color);}

    public List<Object []> filterByPrice(Float bottom_line, Float upper_limit) {return registryRepository.filterByPrice(bottom_line, upper_limit);}

    public List<Object []> sortByAlphabet() {return registryRepository.sortByAlphabet();}

    public List<Object []> sortByPriceAsc() {return registryRepository.sortByPriceAsc();}

    public List<Object []> sortByPriceDesk() {return registryRepository.sortByPriceDesc();}

    public void saveRegistry(Registry reg) {
        registryRepository.save(reg);
    }


}
