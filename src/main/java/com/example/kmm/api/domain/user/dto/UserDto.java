package com.example.kmm.api.domain.user.dto;

import com.example.kmm.api.domain.user.domain.User;
import lombok.Data;

import java.time.LocalDateTime;
/**
 * UserDto class.
 *
 * <p>
 * date: 2023-04-05
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@Data
public class UserDto {

    private final String userId;
    private final String userPassword;
    private final String name;
    private final int point;
    private final LocalDateTime createdAt;
    private final String createdBy;
    private final LocalDateTime modifiedAt;
    private final String modifiedBy;

    public static UserDto of(String userId, String userPassword, String name, int point) {
        return new UserDto(userId, userPassword, name, point, null, null, null, null);
    }

    public static UserDto of(String userId, String userPassword, String name, int point,
        LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy) {
        return new UserDto(userId, userPassword, name, point, createdAt, createdBy, modifiedAt,
            modifiedBy);
    }

    public static UserDto from(User entity) {
        return new UserDto(
            entity.getUserId(),
            entity.getUserPassword(),
            entity.getName(),
            entity.getPoint(),
            entity.getCreatedAt(),
            entity.getCreatedBy(),
            entity.getModifiedAt(),
            entity.getModifiedBy()
        );
    }

    public User toEntity() {
        return User.of(
            userId,
            userPassword,
            name,
            point
        );
    }
}
