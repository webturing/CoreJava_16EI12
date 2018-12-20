package lec15finalContest;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

//1259: 分！分！分! 学生的命根 类排序
public class J {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        double ENGLISH = cin.nextDouble();
        double POLITICAL = cin.nextDouble();
        double MATH = cin.nextDouble();
        double MAJOR = cin.nextDouble();
        double FIRST_SCORE
                = cin.nextDouble();
        Vector<Student> vector = new Vector<Student>();
        while (cin.hasNext()) {
            Student student = new Student(cin.next(), cin.nextDouble(), cin.nextDouble(), cin.nextDouble(), cin.nextDouble(), cin.nextDouble());
            if (student.english >= ENGLISH && student.political >= POLITICAL && student.math >= MATH && student.major >= MAJOR
                    && student.getFirstScore() >= FIRST_SCORE) {
                vector.add(student);
            }
        }
        Collections.sort(vector, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Double d2 = o2.getTotalScore();
                Double d1 = o1.getTotalScore();
                return d2.compareTo(d1);
            }
        });
        int rank = 1;
        for (Student s : vector) {
            cout.println(String.format("%s %.0f %.0f %.1f %d", s.name, s.getFirstScore(), s.review, s.getTotalScore(), rank++));
        }
        cin.close();
        cout.close();
    }

    static class Student {
        String name;
        double english;
        double political;
        double math;
        double major;
        double review;

        public Student(String name, double english, double political, double math, double major, double review) {
            this.name = name;
            this.english = english;
            this.political = political;
            this.math = math;
            this.major = major;
            this.review = review;
        }

        double getFirstScore() {
            return english + political + math + major;
        }

        double getTotalScore() {
            return getFirstScore() * 0.6 + review * 0.4;
        }

    }
}