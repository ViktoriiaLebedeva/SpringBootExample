package org.example.one;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.two.Two;
import org.example.two.four.TwoImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreeController {
    private Two two = new TwoImpl();

    @GetMapping("/")
    public String getAll() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
       return gson.toJson(two.getAll());
    }
}
