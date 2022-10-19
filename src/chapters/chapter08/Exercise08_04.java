package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_04 {
    public static void main(String[] args) {

        int[][] employee = getMatrixOfWorkHours();

        int[][] list = new int[employee.length][2];   //i will hold employee and work hours in 2 columns

        computeTotalWorkHoursForEachEmployee(employee, list);

        sort(list);

        displayResults(list);

    }

    public static int[][] getMatrixOfWorkHours() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        int numOfEmployee = input.nextInt();

        int[][] employee = new int[numOfEmployee][7];
        System.out.println("Enter the work hours of employees:");

        for (int i = 0; i < employee.length; i++) {
            for (int j = 0; j < employee[i].length; j++) {
                employee[i][j] = input.nextInt();
            }
        }
        return employee;
    }

    public static void computeTotalWorkHoursForEachEmployee(int[][] employee, int[][] list) {
        for (int i = 0; i < employee.length; i++) {
            int sumOfWorkHours = 0;

            for (int j = 0; j < employee[i].length; j++) {
                sumOfWorkHours += employee[i][j];
            }
            list[i][0] = i;
            list[i][1] = sumOfWorkHours;
        }
    }

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {

            int maxCol1 = m[i][1];
            int maxCol0 = m[i][0];
            int maxIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (m[j][1] > maxCol1) {
                    maxCol1 = m[j][1];
                    maxCol0 = m[j][0];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                m[maxIndex][1] = m[i][1];
                m[maxIndex][0] = m[i][0];
                m[i][1] = maxCol1;
                m[i][0] = maxCol0;
            }
        }
    }

    public static void displayResults(int[][] list) {
        System.out.println("Employees and their total hours in decreasing order of the total hours:\n");

        for (int row = 0; row < list.length; row++) {
            System.out.println("Employee " + list[row][0] + "'s total work hour is " + list[row][1]);
        }
    }
}
