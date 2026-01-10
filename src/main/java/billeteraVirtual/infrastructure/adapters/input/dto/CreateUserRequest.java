package billeteraVirtual.infrastructure.adapters.input.dto;

public record CreateUserRequest(String firstName, String lastName, String email, String password) {
}