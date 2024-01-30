package com.javadev.device_registry.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLRestriction;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Entity
@Table (name = "registry")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // Наименование вида техники
    @Column(name = "tech_type")
    private String techType;

    // Наименование линейки
    @Column(name = "tech_name", nullable = false)
    protected String techName;

    // Страна изготовитель
    @Column(name = "manufacturer_country", nullable = false)
    protected String manufacturerCountry;

    // Фирма производитель
    @Column(name = "manufacturer_company", nullable = false)
    protected String manufacturerCompany;

    // Возможность онлайн заказа
    @Column(name = "online_order", nullable = false)
    protected Boolean onlineOrder;

    // Возможность оформления рассрочки
    @Column(name = "installment_plan", nullable = false)
    protected Boolean installmentPlan;

    @OneToMany(mappedBy = "registry", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(nullable = true)
    @SQLRestriction("availability = true")
    @JsonManagedReference
    private List<ComputerModels> available_computer_models;

    @OneToMany(mappedBy = "registry", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(nullable = true)
    @SQLRestriction("availability = true")
    @JsonManagedReference
    private List<RefrigeratorModels> available_refrigerator_models;

    @OneToMany(mappedBy = "registry", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(nullable = true)
    @SQLRestriction("availability = true")
    @JsonManagedReference
    private List<SmartphoneModels> available_smartphone_models;

    @OneToMany(mappedBy = "registry", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(nullable = true)
    @SQLRestriction("availability = true")
    @JsonManagedReference
    private List<TVModels> available_tv_models;


    @OneToMany(mappedBy = "registry", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(nullable = false)
    @SQLRestriction("availability = true")
    @JsonManagedReference
    private List<VacuumModels> available_vacuum_models;
}
