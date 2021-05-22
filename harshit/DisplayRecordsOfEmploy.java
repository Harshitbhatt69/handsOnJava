package harshit;

import java.sql.*;
import java.util.Scanner;
public class DisplayRecordsOfEmploy { public static void main(String[] args) throws SQLException {
Connection conn = null; Statement stmt = null;
conn =
DriverManager.getConnection("jdbc:mysql://localhost:3306/employ", "root", "");
System.out.println("Connection is created successfully............"); stmt = conn.createStatement();
String sqlCmd = "select * from employee_db where Department = ";
Scanner sc = new Scanner(System.in);
System.out.print("Enter department [executive, engineering,support]:");
String sqldepartment = sc.nextLine(); sc.close();
ResultSet rs = stmt.executeQuery(sqlCmd + "'" + sqldepartment + "'");
System.out.println("Record is read successfully.............");
System.out.println("following are the details employee of department "
+ sqldepartment);
System.out.println("id\tname\tgender\tdepartment"); while (rs.next()) { int id = rs.getInt("id");
String name = rs.getString("name");
String gender = rs.getString("gender");
String department = rs.getString("department");
System.out.println(id + "\t" + name + "\t" + gender + "\t" +
department);
}
System.out.println("Task complete.........."); }
}
