package billeteraVirtual.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Representa una cuenta financiera dentro del sistema de billetera virtual.
 * Contiene información sobre el propietario, saldo, moneda y versión para
 * control de concurrencia.
 */
public class Account {

    // Atributos
    private UUID id;
    private User user;
    private BigDecimal balance;
    private AccountCurrency accountCurrency;
    private Integer version;

    // Constructor

    // 1. CONSTRUCTOR VACÍO
    /**
     * Constructor por defecto para Account.
     * Utilizado por frameworks para la instanciación.
     */
    public Account() {
    }

    // 3. CONSTRUCTOR PARA "RECONSTRUIR" (Desde DB manualmente)
    /**
     * Constructor para reconstruir una cuenta existente, típicamente desde datos de
     * la base de datos.
     *
     * @param id              El identificador único de la cuenta.
     * @param user            El usuario propietario de la cuenta.
     * @param balance         El saldo actual de la cuenta.
     * @param accountCurrency La moneda de la cuenta.
     * @param version         El número de versión para bloqueo optimista.
     */
    public Account(UUID id, User user, BigDecimal balance, AccountCurrency accountCurrency, Integer version) {
        this.id = id;
        this.user = user;
        this.balance = balance;
        this.accountCurrency = accountCurrency;
        this.version = version;
    }

    // 3. CONSTRUCTOR PARA "NUEVAS" CUENTAS
    /**
     * Constructor para crear una nueva cuenta.
     * Genera automáticamente un ID único y establece la versión inicial en 0.
     *
     * @param user            El usuario que será propietario de la cuenta.
     * @param balance         El saldo inicial de la cuenta.
     * @param accountCurrency La moneda de la cuenta.
     */
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
