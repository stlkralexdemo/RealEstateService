package ru.itpark.service;

import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;

import java.util.List;

public class HouseService {
    private HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public void add(House house){
        repository.add(house);
    }

    public List<House> getAll(){
        return repository.getAll();
    }


}
