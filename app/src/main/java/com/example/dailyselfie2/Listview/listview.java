package com.example.dailyselfie2.Listview;

public class listview {
    private String path;
    private String name;
    public listview(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "listview{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
