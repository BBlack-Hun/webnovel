package com.example.kmm.api.domain.novel.dto.request;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * NovelEpisodeRequest class.
 *
 * <p>
 * date: 2023-04-06
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NovelEpisodeRequest {

    private Long NovelId;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;

}
