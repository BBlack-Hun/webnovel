package com.example.kmm.api.domain.novel.domain;

import com.example.kmm.api.domain.user.dto.AuditingFields;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * NovelCover class.
 *
 * <p>
 * date: 2023-04-07
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@Getter
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    name = "novel_cover",
    indexes = {
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy"),
    })
@Entity
public class NovelCover extends AuditingFields {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(length = 100)
    private String title;

    @Setter
    private String description;
    @Setter
    private String writer;
    @Setter
    private int likeCount;
    @Setter
    private int viewCount;

    @ToString.Exclude
    @OrderBy("createdAt DESC")
    @OneToMany(mappedBy = "novelCover", cascade = CascadeType.ALL)
    private final Set<NovelEpisode> novelEpisodes = new LinkedHashSet<>();
}
