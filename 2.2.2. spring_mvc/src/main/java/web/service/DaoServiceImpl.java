package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoServiceImpl {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Audi", "black"));
        carList.add(new Car(2, "BMW", "blue"));
        carList.add(new Car(3, "Mercedes", "white"));
        carList.add(new Car(4, "Toyota", "red"));
        carList.add(new Car(5, "Volga", "black"));
    }

    public List<Car> index() {
        return carList;
    }

    public List<Car> show(int id) {
        List<Car> carList1 = new ArrayList<>();
        for (int i = 0; i < id; i++) {
            if (id <= 5) {
                carList1.add(carList.get(i));
            } else {
                return carList;
            }
        }
        return carList1;
    }
}

