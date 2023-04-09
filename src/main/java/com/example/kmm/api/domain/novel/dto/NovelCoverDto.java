package com.example.kmm.api.domain.novel.dto;

import com.example.kmm.api.domain.novel.domain.NovelCover;
import com.example.kmm.api.domain.user.domain.User;
import com.example.kmm.api.domain.user.dto.UserDto;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Data;

/**
 * NovelCoverDto class.
 *
 * <p>
 * date: 2023-04-07
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@Data
public class NovelCoverDto {
    private final Long id;
    private final UserDto userDto;
    private final String title;
    private final String description;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;
    private final String modifiedBy;

    public static NovelCoverDto from(NovelCover entity) {
        return new NovelCoverDto(
            entity.getId(),
            UserDto.from(entity.getUser()),
            entity.getTitle(),
            entity.getDescription(),
            entity.getCreatedAt(),
            entity.getModifiedAt(),
            entity.getModifiedBy()
        );
    }

    public NovelCover toEntity(User user) {
        return NovelCover.of(
            user,
            title,
            description
        );
    }
}
