package com.example.kmm.api.domain.novel.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * NovelSearchRequest class.
 *
 * <p>
 * date: 2023-04-07
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
public class NovelSearchRequest {
    private String title;
    private String writer;
}
