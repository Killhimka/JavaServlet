package org.example.MySQL;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    private static String url = "jdbc:mysql://localhost:3306/productdb";
    private static String username = "root";
    private static String password = "Himk@175554175";

    public static List<Product> select() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        ArrayList<Product> products = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try {
                Connection connection = DriverManager.getConnection(url, username, password);

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from products");
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    int price = resultSet.getInt(3);
                    Product product = new Product(id, name, price);
                    products.add(product);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
    public static Product selectOne(int id){
        Product product = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try {
                Connection connection = DriverManager.getConnection(url, username, password);
                String sql = "SELECT * FROM products WHERE id=?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                    preparedStatement.setInt(1,id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()){
                        int prodId = resultSet.getInt(1);
                        String name = resultSet.getString(2);
                        int price = resultSet.getInt(3);
                        product = new Product(prodId,name,price);
                    }
                    }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return product;
    }
    public static int insert (Product product) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url,username,password)){
            String sql = "INSERT INTO products (name,price) Values (?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setString(1, product.getName());
                preparedStatement.setInt(2, product.getPrice());
                return preparedStatement.executeUpdate();
            }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
    public static int update (Product product) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url,username,password)){
                String sql = "UPDATE products SET name = ?, price = ? where id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                    preparedStatement.setString(1, product.getName());
                    preparedStatement.setInt(2, product.getPrice());
                    preparedStatement.setInt(3, product.getId());
                    return preparedStatement.executeUpdate();
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
    public static int delete (int id) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url,username,password)){
                String sql = "DELETE from products where id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                    preparedStatement.setInt(1,id);
                    return preparedStatement.executeUpdate();
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
}
