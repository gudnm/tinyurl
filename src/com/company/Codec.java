package com.company;

public class Codec {
    private static final String DOMAIN = "https://tinyurl.com";
    private static final String DELIMITER = "/";

    private UrlStoreInterface store = new IncrementalUrlStore();

    // Encodes a URL to a shortened URL
    public String encode(String longUrl) {
        String identifier = store.addUrl(longUrl);
        return DOMAIN + DELIMITER + identifier;
    }

    // Decodes a shortened URL to its original URL
    public String decode(String shortUrl) {
        String identifier = shortUrl.split(DELIMITER)[3];
        return store.getUrl(identifier);
    }
}
