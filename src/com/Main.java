package com;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    static class MyClass implements AutoCloseable {
        @Override
        public void close() {

        }
    }

    public static void main(String[] args) {
        try (MyClass myClass = new MyClass();
        Reader reader=new FileReader(new File("name.txt"))) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader reader = new FileReader(new File("someFileName.txt"))) {
        } catch (IOException e) {
            e.printStackTrace();
        }

        //streams
        Reader reader1;
        Writer writer;
        InputStream inputStream;
        OutputStream outputStream;
        //gdbc
        Connection connection;
        Statement statement;
        ResultSet resultSet;
    }
}





































