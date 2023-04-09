package com.example.kmm.api.domain.novel.dto.response;

import com.example.kmm.api.domain.novel.dto.NovelCoverDto;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Data;

/**
 * NovelCoverResponse class.
 *
 * <p>
 * date: 2023-04-07
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@Data
public class NovelCoverResponse {

    private final Long id;
    private final String title;
    private final String description;
    private final LocalDateTime createdAt;
    private final String nickname;

    public static NovelCoverResponse of(Long id, String title, String description,
        LocalDateTime createdAt, String nickname) {
        return new NovelCoverResponse(id, title, description, createdAt, nickname);
    }

    public static NovelCoverResponse from(NovelCoverDto novelCoverDto) {
        String nickname = novelCoverDto.getUserDto().getName();
        if (nickname == null || nickname.isEmpty() || nickname.equals(" ")) {
            nickname = novelCoverDto.getUserDto().getUserId();
        }

        return new NovelCoverResponse(
            novelCoverDto.getId(),
            novelCoverDto.getTitle(),
            novelCoverDto.getDescription(),
            novelCoverDto.getCreatedAt(),
            nickname
        );
    }
}
