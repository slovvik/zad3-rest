package pl.slovvik.algorithm.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.slovvik.algorithm.Data;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class AlgorithmService {

    @Autowired
    private Data data;

    public void setAlgorithmsData(String virtualMemory, String physicalMemory, String stringReference) {
        data.setVirtualMemory(Integer.valueOf(virtualMemory));
        data.setPhysicalMemory(Integer.valueOf(physicalMemory));
        data.setStringReference(Integer.valueOf(stringReference));
    }
}