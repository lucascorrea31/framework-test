package br.com.lucascorrea;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NodeTree {
    int value;
    NodeTree left;
    NodeTree right;

    NodeTree(int value) {
        this.value = value;
    }

    @JsonProperty
    public int getValue() {
        return value;
    }

    @JsonProperty
    public NodeTree getLeft() {
        return left;
    }

    @JsonProperty
    public NodeTree getRight() {
        return right;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "{\"error\": \"Unable to serialize tree to JSON\"}";
        }
    }
}
