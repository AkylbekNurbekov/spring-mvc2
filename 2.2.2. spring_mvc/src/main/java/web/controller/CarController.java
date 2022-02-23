package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.DaoServiceImpl;

@Controller
@RequestMapping("/")
public class CarController {

        private final DaoServiceImpl carsDao;

        @Autowired
        public CarController(DaoServiceImpl carsDao) {
            this.carsDao = carsDao;
        }

        //  localhost:8080/cars
        @GetMapping("/cars")
        public String getAllCars(Model model){
            model.addAttribute("cars1",carsDao.index());
            return "cars";
        }

        // localhost:8080/car/?count=3
        @GetMapping("/car")
        public String getById(@RequestParam("count") int count, Model model){
            model.addAttribute("cars1",carsDao.show(count));
            return "cars";
        }
}
