package billeteraVirtual.presentation.dto;

import billeteraVirtual.domain.enums.UserRole;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateUserResponse(UUID id, String firstName, String lastName, UserRole role, LocalDateTime updatedAt,
        LocalDateTime createdAt) {
}
