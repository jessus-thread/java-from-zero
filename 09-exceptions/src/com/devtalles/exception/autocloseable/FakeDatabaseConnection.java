package com.devtalles.exception.autocloseable;

/*
    The AutoCloseable interface allows any class that implements
    it to be used with try-with-resources and requires us to implement
    the close method, which closes open resources.

    AutoCloseable is designed for instances: Java interfaces define
    behaviors for objects created using `new`. Internally, the
    try-with-resources block effectively says: "Create this object,
    use it within this block, and when finished, call its `close`
    method"

    When should you use AutoCloseable?

    Reserve the use of try-with-resource and AutoCloseable for
    very short-lived resources within a specific method. For
    example

    - Reading a file from the hard drive (FileReader)
    - Processing a data stream (InputStream)
    - Reading the response from an external HTTP request
        made by your code.
*/
public class FakeDatabaseConnection implements AutoCloseable {
    public FakeDatabaseConnection() {
        System.out.println("Database connection established");
    }

    public void fetchData() {
        System.out.println("Retrieving information from the database");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Connection closed successfully");
    }
}
