package com.example.kmm.api.domain.novel.dto;

import com.example.kmm.api.domain.novel.domain.NovelEpisodeContents;
import com.example.kmm.api.domain.user.dto.UserDto;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * NovelEpisode class.
 *
 * <p>
 * date: 2023-04-07
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@Data
public class NovelEpisodeDto {

    private final Long id;
    private final Long NovelId;
    private final UserDto userDto;
    private final NovelEpisodeContentsDto novelEpisodeContentsDto;
    private final LocalDateTime createdAt;
    private final String createdBy;
    private final LocalDateTime modifiedAt;
    private final String modifiedBy;


}
