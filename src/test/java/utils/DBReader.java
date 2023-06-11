package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Person;

public class DBReader {

    private final static String URL = "jdbc:postgresql://localhost:4567/postgres";
    private final static String USER_NAME = "marta@gmail.com";
    private final static String USER_PASSWORD = "q1w2e3r4";
    private final static String QUERY_SELECT_ALL = "select * from public.person";
    private final static String QUERY_INSERT = "INSERT INTO public.person (id, firstname, lastname, age, gender) values (?, ?, ?, ?, ?)";
    private final static String QUERY_UPDATE = "update public.person set age=? where id=?";
    private final static String QUERY_DELETE = "delete from public.person where id=?";

    public static List<Person> getPersonsFromDB(){
        List<Person> persons = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {
            Statement sqlStatement =  connection.createStatement();
            ResultSet resultSet = sqlStatement.executeQuery(QUERY_SELECT_ALL);

            while (resultSet.next()){
                Person person = new Person(resultSet.getInt("id"), resultSet.getString("firstname"),
                        resultSet.getString("lastname"),
                        resultSet.getInt("age"), resultSet.getString("gender"));
                persons.add(person);
            }

        } catch (SQLException exception) {
            throw new RuntimeException(String.format("Please check connection string" +
                    ". URL [%s], name [%s], pass [%s]", URL, USER_NAME, USER_PASSWORD));
        }
        return persons;
    }

    public static void insertPerson(int id, String firstname, String lastname, int age, String gender) {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {

            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, firstname);
            preparedStatement.setString(3, lastname);
            preparedStatement.setInt(4, age);
            preparedStatement.setString(5, gender);
            preparedStatement.executeUpdate();

        } catch (SQLException exception) {
            throw new RuntimeException(String.format("Please check connection string" +
                    ". URL [%s], name [%s], pass [%s]", URL, USER_NAME, USER_PASSWORD));
        }
    }

    public static void updatePerson(int id, int age) {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {

            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE);
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, age);
            preparedStatement.executeUpdate();

        } catch (SQLException exception) {
            throw new RuntimeException(String.format("Please check connection string" +
                    ". URL [%s], name [%s], pass [%s]", URL, USER_NAME, USER_PASSWORD));
        }
    }

    public static void deletePersonById(int id) {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {

            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException exception) {
            throw new RuntimeException(String.format("Please check connection string" +
                    ". URL [%s], name [%s], pass [%s]", URL, USER_NAME, USER_PASSWORD));
        }
    }

}
