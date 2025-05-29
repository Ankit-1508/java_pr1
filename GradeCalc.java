import java.util.*;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();      // n = number of subjects
        int[] m = new int[n];      // m = array to store marks
        int t = 0;                 // t = total marks

        // Input marks for each subject and calculate total
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            m[i] = sc.nextInt();   // Read marks
            t += m[i];             // Add to total
        }

        // Calculate average percentage
        double avg = (double) t / n;

        char g; // g = grade

        // Grade assignment based on average percentage
        if (avg >= 90) g = 'A';
        else if (avg >= 80) g = 'B';
        else if (avg >= 70) g = 'C';
        else if (avg >= 60) g = 'D';
        else if (avg >= 50) g = 'E';
        else g = 'F';

        // Display the results
        System.out.println("\nTotal Marks: " + t);
        System.out.printf("Average: %.2f%%\n", avg);
        System.out.println("Grade: " + g);
    }
}
