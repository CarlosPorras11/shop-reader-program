package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class InstitutoReader {

    private ObjectMapper objectMapper;

    public InstitutoReader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Instituto readInstituto() throws IOException {
        try {
            return objectMapper.readValue(new File(getClass().getResource("/instituto.json").toURI()),
                    Instituto.class);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}
