package billeteraVirtual.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

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
    public Transaction() {
    }

    // 2. CONSTRUCTOR PARA "RECONSTRUIR" (Desde DB manualmente)
    public Transaction(UUID id, Account senderId, Account receiverId, BigDecimal amount, TransactionType type, TransactionStatus status, LocalDateTime timestamp) {
        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.amount = amount;
        this.type = type;
        this.status = status;
        this.timestamp = timestamp;
    }

    // 3. CONSTRUCTOR PARA "NUEVAS" transacciones
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
