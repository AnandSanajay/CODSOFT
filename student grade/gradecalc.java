

import java.util.Scanner;

public class gradecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of subjects");
        int subjects = sc.nextInt();
        if (subjects <= 0) {
            System.out.println("enter valid no of subjects");
            return;
        }
        int totalmarks = 100;
        int maxmarks = 100;
        for (int i = 1; i <= subjects; i++) {
            System.out.println("no of marks" + i + "/100");
            int marks = sc.nextInt();
            if (marks < 0 || marks > maxmarks) {
                System.out.println("marks should be range 1 to 100");
                i--;
            } else {
                totalmarks += marks;

            }

        }
        double avgpercentage = (double) totalmarks / (subjects * maxmarks) * 100;
        System.out.println("total marks" + totalmarks);
        System.out.println("avg percentage" + avgpercentage + "%");
        String grade;
        if (avgpercentage >= 90) {
            System.out.println(" grade=A+");
        } else if (avgpercentage >= 80) {
            System.out.println("grade is A");

        } else if (avgpercentage >= 70) {
            System.out.println("grade is B+");

        } else if (avgpercentage >= 60) {
            System.out.println("grade is B");

        } else if (avgpercentage >= 50) {
            System.out.println("grade is C");

        } else if (avgpercentage >= 40) {
            System.out.println("grade is P");

        } else {
            System.out.println("grade is F");
        }
    }

}
