package model;

import my_exception.InsufficientFundException;

public class Bank {
    private int fees;
    private int provided;

    public Bank() {
        fees = 0;
        provided = 0;
    }

    public Bank(int fees, int provided) {
        this.fees = fees;
        this.provided = provided;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getProvided() {
        return provided;
    }

    public void setProvided(int provided) {
        this.provided = provided;
    }

    public void validate() throws InsufficientFundException {
        if(provided < fees) throw new InsufficientFundException();
    }
}
