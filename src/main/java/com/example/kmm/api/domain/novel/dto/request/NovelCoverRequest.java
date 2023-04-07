package com.example.kmm.api.domain.novel.dto.request;

import com.example.kmm.api.domain.user.dto.AuditingFields;
import com.example.kmm.api.domain.user.dto.UserDto;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * NovelCoverRequest class.
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
public class NovelCoverRequest {
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

    public static NovelCoverRequest of(String title, String description) {
        return new NovelCoverRequest(title, description, null, null, null, null);
    }
}
