package com.reckue.maven_example;


import java.util.Map;

public class MavenExampleApplication {
    public static void main(String[] args) {
        Map<String, Integer> items = Map.of("s1", 1, "s2", 2,"s3",3);
        System.out.println(items.get("s1"));
    }
}
