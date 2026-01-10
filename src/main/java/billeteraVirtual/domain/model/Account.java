package billeteraVirtual.domain.model;

import java.math.BigDecimal;
import java.util.UUID;


public class Account {

    // Atributos
    private UUID id;
    private User user;
    private BigDecimal balance;
    private AccountCurrency accountCurrency;
    private Integer version;

    // Constructor

    // 1. CONSTRUCTOR VACÍO
    public Account() {}

    // 3. CONSTRUCTOR PARA "RECONSTRUIR" (Desde DB manualmente)
    public Account(UUID id, User user, BigDecimal balance, AccountCurrency accountCurrency, Integer version) {
        this.id = id;
        this.user = user;
        this.balance = balance;
        this.accountCurrency = accountCurrency;
        this.version = version;
    }

    // 3. CONSTRUCTOR PARA "NUEVAS" CUENTAS
    public Account(User user, BigDecimal balance, AccountCurrency accountCurrency) {
        this(UUID.randomUUID(), user, balance, accountCurrency, 0);
    }

    // Getters and setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public AccountCurrency getCurrency() {
        return accountCurrency;
    }

    public void setCurrency(AccountCurrency accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
