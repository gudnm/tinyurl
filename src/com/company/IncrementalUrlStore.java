package com.company;

import java.util.ArrayList;
import java.util.List;

public class IncrementalUrlStore implements UrlStoreInterface {
    private static List<String> longUrls = new ArrayList<>();

    public String getUrl(String identifier) {
        int index = Integer.parseInt(identifier);
        return longUrls.get(index);
    }

    public String addUrl(String url) {
        longUrls.add(url);
        return String.valueOf(longUrls.size() - 1);
    }
}
