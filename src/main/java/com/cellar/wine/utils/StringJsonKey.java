/*
 * My-Wine-Cellar, copyright 2019
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 */

package com.cellar.wine.utils;

import com.github.cliftonlabs.json_simple.JsonKey;

public class StringJsonKey implements JsonKey {

    private final String str;

    public StringJsonKey(String str) {
        this.str = str;
    }

    @Override
    public String getKey() {
        return str;
    }

    @Override
    public Object getValue() {
        return null;
    }
}
