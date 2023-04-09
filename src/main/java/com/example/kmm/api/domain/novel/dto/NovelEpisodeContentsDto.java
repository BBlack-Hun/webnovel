package com.example.kmm.api.domain.novel.dto;

import java.util.List;
import lombok.Data;

/**
 * NovelEpisodeContentsDto class.
 *
 * <p>
 * date: 2023-04-07
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@Data
public class NovelEpisodeContentsDto {
    private final Long id;
    private final Long novelEpisodeId;
    private final List<String> contents;
}
