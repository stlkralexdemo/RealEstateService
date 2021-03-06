package ru.itpark;

import ru.itpark.comparator.HousePriceAscComparator;
import ru.itpark.comparator.HousePriceDescComparator;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;
import ru.itpark.service.HouseService;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService(new HouseRepository());

        service.add(new House(1, "Privoljskiy", 3, 68, 4_200_000, true));
        service.add(new House(2, "Novosavinovskiy", 1, 33, 2_800_000, false));
        service.add(new House(3, "Vahitovskiy", 2, 55, 3_600_000, true));
        service.add(new House(4, "Vahitovskiy", 1, 49, 3_200_000, true));
        service.add(new House(5, "Novosavinovskiy", 4, 85, 5_600_000, false));

        System.out.println(service.getSorted(new HousePriceAscComparator()));

        System.out.println(service.getSorted(new HousePriceDescComparator()));

        System.out.println(service.getByPriceRangeAsc(2_900_000, 5_400_000));

        System.out.println(service.getByPriceRangeDesc(2_300_000, 3_700_000));

        ArrayList<String> districts = new ArrayList<>();
        districts.add("Vahitovskiy");
        districts.add("Privoljskiy");

        System.out.println(service.getByDistrict(districts));

    }
}
