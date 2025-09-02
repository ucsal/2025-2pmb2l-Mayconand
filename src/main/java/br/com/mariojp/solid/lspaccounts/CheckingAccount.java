package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable {

    @Override
    public void withdraw(double amount) {
        if(balance < amount) throw new IllegalArgumentException("Saldo insuficiente");
        if(amount < 0) throw new IllegalArgumentException("Não é possivel Sacar 0 Reais");
        this.balance -= amount;
    }
}