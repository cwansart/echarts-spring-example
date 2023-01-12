package de.cwansart.mvc.echarts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChartRestController {

    private final JsonOptionsService service;

    ChartRestController(
            JsonOptionsService service
    ) {
        this.service = service;
    }

    @GetMapping(value = "/api/chart", produces = "application/json")
    public String getChart() {
        return this.service.getEchartsJsonOptions();
    }
}
