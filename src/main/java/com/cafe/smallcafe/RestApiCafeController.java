package com.cafe.smallcafe;

import com.cafe.smallcafe.domain.CafeMenu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cafe")
public class RestApiCafeController {
    private final CafeRepository cafeRepository;

    public RestApiCafeController(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
        CafeMenu c=new CafeMenu("Chicken Biryani", 5, "non-veg");
        this.cafeRepository.save(c); //Just One Item for startup
    }

    @GetMapping
    public @ResponseBody
    Iterable<CafeMenu> getAllUsers() {
        return cafeRepository.findAll();
    }
}
