package com.datasonnet.plugins;

import com.datasonnet.document.Document;
import com.datasonnet.document.StringDocument;
import com.datasonnet.spi.DataFormatPlugin;
import com.datasonnet.spi.UjsonUtil;
import ujson.Str;
import ujson.Value;

import java.util.HashMap;
import java.util.Map;

public class JSONFormatPlugin implements DataFormatPlugin {
    public JSONFormatPlugin() { }

    public Value read(Object input, Map<String, Object> params) {
        return UjsonUtil.jsonObjectValueOf(input.toString());
    }

    public Document write(Value input, Map<String, Object> params, String mimeType) {
        return new StringDocument(UjsonUtil.jsonObjectValueTo(input), mimeType);
    }

    public String[] getSupportedIdentifiers() {
        return new String[] { "application/json", "json" };
    }

    @Override
    public Map<String, String> getReadParameters() {
        return new HashMap<>();
    }

    @Override
    public Map<String, String> getWriteParameters() {
        return new HashMap<>();
    }

    public String getPluginId() {
        return "JSON";
    }
}
