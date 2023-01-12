package de.cwansart.mvc.echarts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartWithServiceController {

    private final JsonOptionsService service;

    ChartWithServiceController(
            JsonOptionsService service
    ) {
        this.service = service;
    }

    @GetMapping("/with-service")
    public String getChart(Model model) {
        String options = this.service.getEchartsJsonOptions();
        model.addAttribute("options", options);
        return "chart";
    }
}
