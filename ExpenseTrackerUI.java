import java.util.*;

public class ExpenseTrackerUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Expense\n2. View All\n3. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                System.out.print("Category: ");
                String cat = sc.nextLine();
                System.out.print("Amount: ");
                double amt = sc.nextDouble();
                sc.nextLine();
                System.out.print("Date (YYYY-MM-DD): ");
                String date = sc.nextLine();
                System.out.print("Note: ");
                String note = sc.nextLine();
                Expense e = new Expense(cat, amt, date, note);
                ExpenseDAO.addExpense(e);
            } else if (ch == 2) {
                for (Expense e : ExpenseDAO.getAll()) {
                    System.out.println(e.getCategory() + " - ₹" + e.getAmount() + " (" + e.getDate() + ")");
                }
            } else break;
        }
    }
}
