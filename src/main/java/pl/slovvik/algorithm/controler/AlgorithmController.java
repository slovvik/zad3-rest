package pl.slovvik.algorithm.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.slovvik.algorithm.Data;
import pl.slovvik.algorithm.service.AlgorithmService;

@RestController
public class AlgorithmController {

    @Autowired
    private AlgorithmService algorithmService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/")
    public Test test() {
        return new Test("Test");
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(
            value = "/algorithm/fifo",
            params = {"virtualMemory", "physicalMemory", "stringReference"})
    public Data fifo(
            @RequestParam(value = "virtualMemory", defaultValue = "10000", required = false) int virtualMemory,
            @RequestParam(value = "physicalMemory", defaultValue = "10", required = false) int physicalMemory,
            @RequestParam(value = "stringReference", defaultValue = "1000", required = false) int stringReference) {
        algorithmService.setAlgorithmsData(virtualMemory, physicalMemory, stringReference);
        return algorithmService.getData();
    }
}
