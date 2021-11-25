package com.karzkowiak.aismonitoring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class MapController {

    @GetMapping
    public String getMap() {
        return "map";
    }
}
