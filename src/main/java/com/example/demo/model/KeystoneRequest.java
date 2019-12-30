package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import keystone.KeystoneArchitecture;
import keystone.KeystoneMode;

public class KeystoneRequest {

    @JsonProperty("architecture")
    private KeystoneArchitecture architecture;
    @JsonProperty("mode")
    private KeystoneMode mode;
    

    @Override
    public String toString() {
        return "Keystone Request[ Architecture: " + architecture.toString() + " Mode: " + mode.toString() + " ]\n";
    }
}
