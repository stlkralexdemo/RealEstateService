package ru.itpark.repository;

import ru.itpark.domain.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {

    private List<House> houses = new ArrayList<>();

    public void add(House house) {
        houses.add(house);
    }

    public List<House> getAll() {
        return houses;
    }

    public List<House> getByPriceRange(int min, int max) {
        List<House> result = new ArrayList<>();
        for (House house : houses) {
            if (min < house.getPrice() && house.getPrice() < max) {
                result.add(house);
            }
        }
        return result;
    }

    public List<House> getByDistrict(List<String> districts){
        List<House> result = new ArrayList<>();
        for (House house : houses) {
            if (districts.contains(house.getDistrict())){
                result.add(house);
            }

        }
        return result;
    }
}
