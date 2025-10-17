import java.sql.*;
import java.util.Scanner;

public class UniDB {
    public static void printStudent(String id, String url, String user, String password) {
        String name_query = "SELECT last_name, first_name FROM Students WHERE id = " + id;
        String major_query = "SELECT dname FROM Majors where sid = " + id;
        String minor_query = "SELECT dname FROM Minors where sid = " + id;
        String credits_query = "SELECT SUM(c.credits) AS total_credits FROM HasTaken ht JOIN classes c on ht.name = c.name WHERE sid =" + id;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt_name = conn.prepareStatement(name_query);
            ResultSet rs_name = pstmt_name.executeQuery();
            while (rs_name.next()) {
                String first_name = rs_name.getString("first_name");
                String last_name = rs_name.getString("last_name");
                System.out.println(last_name + ", " + first_name);
            }
            rs_name.close();
            pstmt_name.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("ID: " + id);
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt_majors = conn.prepareStatement(major_query);
            ResultSet rs_majors = pstmt_majors.executeQuery();
            if (UniDB.numberMatches(major_query, url, user, password) == 1) {
                while (rs_majors.next()) {
                    String major = rs_majors.getString("dname");
                    System.out.print("Major: " + major);
                }
            } else if (UniDB.numberMatches(major_query, url, user, password) >= 2) {
                System.out.print("Majors: ");
                while(rs_majors.next()) {
                    String major = rs_majors.getString("dname");
                    System.out.print(major);
                    if (rs_majors.isLast() == false) {
                        System.out.print(", ");
                    }
                }
            }
            rs_majors.close();
            pstmt_majors.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt_minors = conn.prepareStatement(minor_query);
            ResultSet rs_minors = pstmt_minors.executeQuery();
            if (UniDB.numberMatches(minor_query, url, user, password) == 1) {
                while (rs_minors.next()) {
                    String minor = rs_minors.getString("dname");
                    System.out.print("Minor: " + minor);
                }
            } else if (UniDB.numberMatches(minor_query, url, user, password) >= 2) {
                System.out.print("Minors: ");
                while (rs_minors.next()) {
                    String minor = rs_minors.getString("dname");
                    System.out.print(minor);
                    if (rs_minors.isLast() == false) {
                        System.out.print(", ");
                    }
                }
            }
            rs_minors.close();
            pstmt_minors.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("GPA: " + UniDB.getStudentGPA(id, url, user, password));
        int total_credits = 0;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt_credits = conn.prepareStatement(credits_query);
            ResultSet rs_credits = pstmt_credits.executeQuery();
            while (rs_credits.next()) {
                total_credits = rs_credits.getInt("total_credits");
            }
            rs_credits.close();
            pstmt_credits.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Credits: " + total_credits);
    }

    public static int numberMatches(String query, String url, String user, String password) {
        int count = 0;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count++;
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static double getStudentGPA(String id, String url, String user, String password) {
        double gpa = 0;
        String gpa_query = "SELECT SUM(c.credits * CASE ht.grade WHEN 'A' THEN 4 WHEN 'B' THEN 3 WHEN 'C' THEN 2 WHEN 'D' THEN 1 ELSE 0 END) / SUM(c.credits) AS gpa FROM HasTaken ht JOIN Classes c on ht.name = c.name WHERE sid = " + id;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(gpa_query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                gpa = rs.getDouble("gpa");
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gpa;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = "jdbc:mysql://" + args[0];
        String user = args[1];
        String password = args[2];
        System.out.println("Welcome to the university database. Queries available:");
        System.out.println("1. Search students by name.");
        System.out.println("2. Search students by year.");
        System.out.println("3. Search for students with a GPA >= threshold.");
        System.out.println("4. Search for students with a GPA <= threshold.password");
        System.out.println("5. Get department statistics.");
        System.out.println("6. Get class statistics.");
        System.out.println("7. Execute an abitrary SQL query.");
        System.out.println("8. Exit the application.");
        while (true) {
            System.out.println("Which query would you like to run (1-8)?");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Please enter the name.");
                String substring = scanner.next();
                String substring_query = "SELECT DISTINCT id FROM Students WHERE first_name LIKE '%"+substring+"%' OR last_name LIKE '%"+substring+"%'";
                int substring_count = UniDB.numberMatches(substring_query, url, user, password);
                System.out.println(substring_count + " students found.");
                try {
                    Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt_substring = conn.prepareStatement(substring_query);
                    ResultSet rs_substring = pstmt_substring.executeQuery();
                    while (rs_substring.next()) {
                        String id = rs_substring.getString("id");
                        UniDB.printStudent(id, url, user, password);
                        System.out.println();
                    }
                    rs_substring.close();
                    pstmt_substring.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace(); 
                }
            }
            if (input == 2) {
                System.out.println("Please enter the year.");
                String year = scanner.next();
                String year_query = "";
                if (year.equals("Fr")) {
                    year_query = "SELECT id from Students s WHERE s.id IN (SELECT ht.sid FROM HasTaken ht JOIN (SELECT ht.sid, SUM(c.credits) AS total_credits FROM HasTaken ht JOIN classes c on ht.name = c.name GROUP BY sid HAVING total_credits < 29) AS tc ON ht.sid = tc.sid) OR s.id IN (SELECT id FROM Students s LEFT OUTER JOIN HasTaken ht on s.id = ht.sid WHERE ht.sid IS NULL)";
                    int year_count = UniDB.numberMatches(year_query, url, user, password);
                    System.out.println(year_count + " students found.");
                    try {
                        Connection conn = DriverManager.getConnection(url, user, password);
                        PreparedStatement pstmt_year = conn.prepareStatement(year_query);
                        ResultSet rs_year = pstmt_year.executeQuery();
                        while (rs_year.next()) {
                            String id = rs_year.getString("id");
                            UniDB.printStudent(id, url, user, password);
                            System.out.println();
                        }
                        rs_year.close();
                        pstmt_year.close();
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (year.equals("So")) {
                    year_query = "SELECT ht.sid, SUM(c.credits) AS total_credits FROM HasTaken ht JOIN classes c on ht.name = c.name GROUP BY ht.sid HAVING total_credits > 29 AND total_Credits <= 59;";
                    int year_count = UniDB.numberMatches(year_query, url, user, password);
                    System.out.println(year_count + " students found.");
                    try {
                        Connection conn = DriverManager.getConnection(url, user, password);
                        PreparedStatement pstmt_year = conn.prepareStatement(year_query);
                        ResultSet rs_year = pstmt_year.executeQuery();
                        while (rs_year.next()) {
                            String id = rs_year.getString("sid");
                            UniDB.printStudent(id, url, user, password);
                            System.out.println();
                        }
                        rs_year.close();
                        pstmt_year.close();
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (year.equals("Ju")) {
                    year_query = "SELECT ht.sid, SUM(c.credits) AS total_credits FROM HasTaken ht JOIN classes c on ht.name = c.name GROUP BY ht.sid HAVING total_credits > 59 AND total_Credits <= 89";
                    int year_count = UniDB.numberMatches(year_query, url, user, password);
                    System.out.println(year_count + " students found.");
                    try {
                        Connection conn = DriverManager.getConnection(url, user, password);
                        PreparedStatement pstmt_year = conn.prepareStatement(year_query);
                        ResultSet rs_year = pstmt_year.executeQuery();
                        while (rs_year.next()) {
                            String id = rs_year.getString("sid");
                            UniDB.printStudent(id, url, user, password);
                            System.out.println();
                        }
                        rs_year.close();
                        pstmt_year.close();
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (year.equals("Sr")) {
                    year_query = "SELECT ht.sid, SUM(c.credits) AS total_credits FROM HasTaken ht JOIN classes c on ht.name = c.name GROUP BY ht.sid HAVING total_credits >= 90";
                    int year_count = UniDB.numberMatches(year_query, url, user, password);
                    System.out.println(year_count + " students found.");
                    try {
                        Connection conn = DriverManager.getConnection(url, user, password);
                        PreparedStatement pstmt_year = conn.prepareStatement(year_query);
                        ResultSet rs_year = pstmt_year.executeQuery();
                        while (rs_year.next()) {
                            String id = rs_year.getString("sid");
                            UniDB.printStudent(id, url, user, password);
                            System.out.println();
                        }
                        rs_year.close();
                        pstmt_year.close();
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (input == 4) {
                System.out.println("Please enter the threshold.");
                double threshold = scanner.nextDouble();
                String lthreshold_query = "SELECT id from Students s WHERE s.id IN (SELECT ht.sid FROM HasTaken ht JOIN (SELECT ht.sid, SUM(c.credits * CASE ht.grade WHEN 'A' THEN 4 WHEN 'B' THEN 3 WHEN 'C' THEN 2 WHEN 'D' THEN 1 ELSE 0 END) / SUM(c.credits) AS gpa FROM HasTaken ht JOIN Classes c ON ht.name = c.name GROUP BY ht.sid HAVING gpa <= "+threshold+") AS tc ON ht.sid = tc.sid) OR s.id IN (SELECT id FROM Students s LEFT OUTER JOIN HasTaken ht on s.id = ht.sid WHERE ht.sid IS NULL)";
                int threshold_count = UniDB.numberMatches(lthreshold_query, url, user, password);
                System.out.println(threshold_count + " students found.");
                try {
                    Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt_lthreshold = conn.prepareStatement(lthreshold_query);
                    ResultSet rs_lthreshold = pstmt_lthreshold.executeQuery();
                    while (rs_lthreshold.next()) {
                        String id = rs_lthreshold.getString("id");
                        UniDB.printStudent(id, url, user, password);
                        System.out.println();
                    }
                    rs_lthreshold.close();
                    pstmt_lthreshold.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace(); 
                }
            }

            if (input == 3) {
                System.out.println("Please enter the threshold.");
                double threshold = scanner.nextDouble();
                String uthreshold_query = "SELECT ht.sid, SUM(c.credits * CASE ht.grade WHEN 'A' THEN 4 WHEN 'B' THEN 3 WHEN 'C' THEN 2 WHEN 'D' THEN 1 ELSE 0 END) / SUM(c.credits) AS gpa FROM HasTaken ht JOIN Classes c ON ht.name = c.name GROUP BY ht.sid HAVING gpa >= "+ threshold;
                int threshold_count = UniDB.numberMatches(uthreshold_query, url, user, password);
                System.out.println(threshold_count + " students found.");
                try {
                    Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt_uthreshold = conn.prepareStatement(uthreshold_query);
                    ResultSet rs_uthreshold = pstmt_uthreshold.executeQuery();
                    while (rs_uthreshold.next()) {
                        String id = rs_uthreshold.getString("sid");
                        UniDB.printStudent(id, url, user, password);
                        System.out.println();
                    }
                    rs_uthreshold.close();
                    pstmt_uthreshold.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (input == 5) {
                System.out.println("Please enter the department.");
                String department = scanner.next();
                String department_total_query = "SELECT SUM(total) AS combined_total FROM (SELECT COUNT(sid) AS total FROM Majors WHERE dname = '"+department+"' UNION SELECT COUNT(sid) FROM Minors WHERE dname = '"+department+"') AS D_Total";
                String department_gpa_query = "SELECT SUM(gpas.gpa) AS total_gpa FROM (SELECT SUM(c.credits * CASE ht.grade WHEN 'A' THEN 4 WHEN 'B' THEN 3 WHEN 'C' THEN 2 WHEN 'D' THEN 1 ELSE 0 END) / SUM(c.credits) AS gpa FROM HasTaken ht JOIN Classes c ON ht.name = c.name JOIN Majors ma ON ma.sid = ht.sid JOIN Minors mi ON mi.sid = ht.sid WHERE ma.dname = '"+department+"' OR mi.dname = '"+department+"' GROUP BY ht.sid) AS gpas";
                int department_total = 0;
                double gpa_sum = 0;
                try {
                    Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt_total = conn.prepareStatement(department_total_query);
                    ResultSet rs_total = pstmt_total.executeQuery();
                    while (rs_total.next()) {
                        department_total = rs_total.getInt("combined_total");
                        System.out.println("Num students: " + department_total);
                    }
                    PreparedStatement pstmt_gpa_sum = conn.prepareStatement(department_gpa_query);
                    ResultSet rs_gpa_sum = pstmt_gpa_sum.executeQuery();
                    while (rs_gpa_sum.next()) {
                        gpa_sum = rs_gpa_sum.getDouble("total_gpa");
                        double avg_gpa = gpa_sum / department_total;
                        System.out.println("Average GPA: " + avg_gpa);
                    }
                    rs_total.close();
                    rs_gpa_sum.close();
                    pstmt_total.close();
                    pstmt_gpa_sum.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (input == 6) {
                System.out.println("Please enter the class name.");
                scanner.nextLine();
                String class_name = scanner.nextLine();
                String current_class_query = "SELECT COUNT(*) AS num_students FROM IsTaking it JOIN Classes c ON it.name = c.name WHERE c.name = '" + class_name + "'";
                String class_grades_query = "SELECT grade, COUNT(*) AS num_students FROM HasTaken ht JOIN Classes c ON ht.name = c.name WHERE c.name = '" + class_name + "' GROUP BY grade  ORDER BY grade";
                int current_class = 0;
                try {
                    Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt_current = conn.prepareStatement(current_class_query);
                    ResultSet rs_current = pstmt_current.executeQuery();
                    while (rs_current.next()) {
                        current_class = rs_current.getInt("num_students");
                    }
                    System.out.println(current_class + " students currently enrolled");
                    PreparedStatement pstmt_grades = conn.prepareStatement(class_grades_query);
                    ResultSet rs_grades = pstmt_grades.executeQuery();
                    System.out.println("Grades of previous enrollees:");
                    while (rs_grades.next()) {
                        String grade = rs_grades.getString("grade");
                        int num_students = rs_grades.getInt("num_students");
                        System.out.println(grade + " " + num_students);
                    }
                    rs_current.close();
                    rs_grades.close();
                    pstmt_current.close();
                    pstmt_grades.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (input == 7) {
                System.out.println("Please enter the query.");
                scanner.nextLine();
                String query = scanner.nextLine();
                try {
                    Connection conn = DriverManager.getConnection(url, user, password);
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    ResultSetMetaData meta_data = rs.getMetaData();
                    int numColumns = meta_data.getColumnCount();
                    System.out.println();
                    for (int i = 1; i <= numColumns; i++) {
                        System.out.print(meta_data.getColumnName(i) + "\t");
                    }
                    while (rs.next()) {
                        System.out.println();
                        for (int i = 1; i <= numColumns; i++) {
                            System.out.print(rs.getObject(i) + "\t");
                        }
                    }
                    System.out.println();
                    rs.close();
                    stmt.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (input == 8) {
                break;
            }
        }
        System.out.println("Goodbye.");
        scanner.close();
    }
}
