package com.cafe.smallcafe;

import com.cafe.smallcafe.domain.CafeMenu;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Controller
public class CafeController {
    @NonNull
    private CafeWebRepository repository;
    private WebClient client =
            WebClient.create("http://localhost:8080/cafe");

    @GetMapping("/cafemenu")
    public String getCurrentMenu(Model model) {
        //repository.deleteAll();
        client.get().retrieve()
                .bodyToFlux(CafeMenu.class)
                //.filter(plane -> !plane.getReg().isEmpty())
                .toStream().forEach(repository::save);
        model.addAttribute("currentPositions", repository.findAll());
        return "output";
    }


}
