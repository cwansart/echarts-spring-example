package de.cwansart.mvc.echarts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartWithoutServiceController {

    @GetMapping("/without-service")
    public String getChart(Model model) {
        // Hier eine ganz komplizierte Berechnung der JSON-Daten:
        String options = "{\n" +
                         "  \"title\": {\n" +
                         "    \"text\": \"ECharts Getting Started Example\"\n" +
                         "  },\n" +
                         "  \"tooltip\": {},\n" +
                         "  \"legend\": {\n" +
                         "    \"data\": [\n" +
                         "      \"sales\"\n" +
                         "    ]\n" +
                         "  },\n" +
                         "  \"xAxis\": {\n" +
                         "    \"data\": [\n" +
                         "      \"Shirts\",\n" +
                         "      \"Cardigans\",\n" +
                         "      \"Chiffons\",\n" +
                         "      \"Pants\",\n" +
                         "      \"Heels\",\n" +
                         "      \"Socks\"\n" +
                         "    ]\n" +
                         "  },\n" +
                         "  \"yAxis\": {},\n" +
                         "  \"series\": [\n" +
                         "    {\n" +
                         "      \"name\": \"sales\",\n" +
                         "      \"type\": \"bar\",\n" +
                         "      \"data\": [\n" +
                         "        5,\n" +
                         "        20,\n" +
                         "        36,\n" +
                         "        10,\n" +
                         "        10,\n" +
                         "        20\n" +
                         "      ]\n" +
                         "    }\n" +
                         "  ]\n" +
                         "}";

        model.addAttribute("options", options);
        return "chart";
    }
}
