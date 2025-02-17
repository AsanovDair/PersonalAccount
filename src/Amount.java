public class Amount {
    private double amount;
    private TransactionType transactionType;

    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public String toString() {
        return transactionType + ": " + amount;
    }
}