package com.github.valdr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Maps field name to constraints (Bean Validation annotations).
 */
public class ClassConstraints implements MinimalMap<FieldConstraints> {

    private final Map<String, FieldConstraints> map = new HashMap<>();

    @Override
    public Set<Map.Entry<String, FieldConstraints>> entrySet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FieldConstraints put(String key, FieldConstraints value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
