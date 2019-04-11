package com.yzd.machinelearninginaction.demo.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileUtil2 {

    public static InputStreamReader getReader(String filename) {
        Resource resource = new Resource();
        InputStreamReader reader = resource.getInputStreamReader(filename);
        return reader;
    }

    static class Resource {
        public InputStreamReader getInputStreamReader(String file) {
            InputStream in = this.getClass().getClassLoader().getResourceAsStream(file);
            try {
                return new InputStreamReader(in, "utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
