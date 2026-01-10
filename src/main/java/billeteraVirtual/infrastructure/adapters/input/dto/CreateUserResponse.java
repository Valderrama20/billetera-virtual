package billeteraVirtual.infrastructure.adapters.input.dto;

import billeteraVirtual.domain.model.UserRole;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateUserResponse(UUID id, String firstName, String lastName, UserRole role, LocalDateTime updatedAt,
                                 LocalDateTime createdAt) {
}
