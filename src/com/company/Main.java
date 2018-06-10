package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] argv) {

        String[] urls = {"booking.com", "office.booking.com"};
        List<String> encodedUrls = new ArrayList<>();

        Codec codec1 = new Codec();
        Codec codec2 = new Codec();

        for (String url: urls) {
            encodedUrls.add(codec1.encode(url));
            System.out.println(codec1.encode(url));
        }

        for (String url: encodedUrls) {


            System.out.println(codec2.decode(url));
        }
    }
}
