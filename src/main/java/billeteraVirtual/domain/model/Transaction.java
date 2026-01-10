package billeteraVirtual.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Representa una transacción financiera entre dos cuentas.
 * Realiza el seguimiento del emisor, receptor, monto, tipo, estado y marca de
 * tiempo.
 */
public class Transaction {

    // Atributos
    private UUID id;
    private Account senderId;
    private Account receiverId;
    private BigDecimal amount;
    private TransactionType type;
    private TransactionStatus status;
    private LocalDateTime timestamp;

    // Constructor
    // 1. CONSTRUCTOR VACÍO (Esencial)
    /**
     * Constructor por defecto para Transaction.
     * Requerido por varios frameworks.
     */
    public Transaction() {
    }

    // 2. CONSTRUCTOR PARA "RECONSTRUIR" (Desde DB manualmente)
    /**
     * Constructor para reconstruir una transacción existente desde la persistencia.
     *
     * @param id         El identificador único de la transacción.
     * @param senderId   La cuenta que envía los fondos.
     * @param receiverId La cuenta que recibe los fondos.
     * @param amount     El monto de la transacción.
     * @param type       El tipo de transacción (ej. DEPOSIT, WITHDRAWAL, TRANSFER).
     * @param status     El estado actual de la transacción.
     * @param timestamp  El momento en que ocurrió la transacción.
     */
    public Transaction(UUID id, Account senderId, Account receiverId, BigDecimal amount, TransactionType type,
            TransactionStatus status, LocalDateTime timestamp) {
        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.amount = amount;
        this.type = type;
        this.status = status;
        this.timestamp = timestamp;
    }

    // 3. CONSTRUCTOR PARA "NUEVAS" transacciones
    /**
     * Constructor para crear una nueva transacción.
     * Inicializa la transacción con un ID único, estado PENDING y la marca de
     * tiempo actual.
     *
     * @param senderId   La cuenta que envía los fondos.
     * @param receiverId La cuenta que recibe los fondos.
     * @param amount     El monto de la transacción.
     * @param type       El tipo de transacción.
     */
    public Transaction(Account senderId, Account receiverId, BigDecimal amount, TransactionType type) {
        this(UUID.randomUUID(), senderId, receiverId, amount, type, TransactionStatus.PENDING, LocalDateTime.now());
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Account getSenderId() {
        return senderId;
    }

    public void setSenderId(Account senderId) {
        this.senderId = senderId;
    }

    public Account getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Account receiverId) {
        this.receiverId = receiverId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
