public class Expense {
    private int id;
    private String category;
    private double amount;
    private String date;
    private String note;

    public Expense(String category, double amount, String date, String note) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.note = note;
    }
    // Getters and setters
}
