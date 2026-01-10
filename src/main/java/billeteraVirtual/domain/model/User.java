package billeteraVirtual.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Representa un usuario dentro del sistema de billetera virtual.
 * Contiene detalles personales, credenciales, rol y marcas de tiempo de
 * auditoría.
 */
public class User {

    // Atributos
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserRole role;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;

    // Constructor

    // 1. CONSTRUCTOR VACÍO (Esencial)
    // Los frameworks (Hibernate, Jackson, etc.) usan este constructor
    // para crear la instancia vacía y luego llenan los datos usando los Setters.
    /**
     * Constructor por defecto para User.
     * Esencial para frameworks como Hibernate y Jackson.
     */
    public User() {
    }

    // 2. CONSTRUCTOR PARA "RECONSTRUIR" (Desde DB manualmente)
    // Si usas un mapper manual (como RowMapper en JDBC), usarás este.
    // Aquí NO generamos nada, solo asignamos lo que viene de la DB.
    /**
     * Constructor para reconstruir un usuario existente desde la persistencia.
     *
     * @param id        El identificador único del usuario.
     * @param firstName El nombre del usuario.
     * @param lastName  El apellido del usuario.
     * @param email     El correo electrónico del usuario.
     * @param password  La contraseña (hasheada) del usuario.
     * @param role      El rol del usuario (ej. USER, ADMIN).
     * @param updatedAt La marca de tiempo de la última actualización.
     * @param createdAt La marca de tiempo de creación del usuario.
     */
    public User(UUID id, String firstName, String lastName, String email, String password, UserRole role,
            LocalDateTime updatedAt, LocalDateTime createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    // 3. CONSTRUCTOR PARA "NUEVOS" USUARIOS (Business Logic)
    // Se usa cuando el usuario se registra en la API.
    // Aquí SÍ generamos el ID y la fecha, porque es algo nuevo.
    /**
     * Constructor para crear un nuevo usuario (registro).
     * Genera un ID único, establece el rol USER por defecto e inicializa las marcas
     * de tiempo de auditoría.
     *
     * @param firstName El nombre del usuario.
     * @param lastName  El apellido del usuario.
     * @param email     El correo electrónico del usuario.
     * @param password  La contraseña del usuario.
     */
    public User(String firstName, String lastName, String email, String password) {
        LocalDateTime localDate = LocalDateTime.now();
        this(UUID.randomUUID(), firstName, lastName, email, password, UserRole.USER, localDate, localDate);
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
