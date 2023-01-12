package de.cwansart.mvc.echarts;

import org.springframework.stereotype.Service;

@Service
public class JsonOptionsService {

    public String getEchartsJsonOptions() {
        //language=JSON Lines
        return "{\n" +
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
    }
}
