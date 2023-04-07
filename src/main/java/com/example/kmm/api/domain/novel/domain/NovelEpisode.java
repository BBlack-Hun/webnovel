package com.example.kmm.api.domain.novel.domain;

import com.example.kmm.api.domain.user.dto.AuditingFields;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
@Getter
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    name = "novel_episode",
    indexes = {
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy"),
    })
@Entity
public class NovelEpisode extends AuditingFields {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @ManyToOne(optional = false)
    private NovelCover novelCover; // 소설 커버

    @Setter
    @Column(length = 100, unique = true)
    private String title;

    @Setter
    private int novelDiskSize;
    @Setter
    private int totalPage;

    @ToString.Exclude
    @OrderBy("createdAt DESC")
    @OneToMany(mappedBy = "novelEpisode", cascade = CascadeType.ALL)
    private final Set<NovelEpisodeContents> novelEpisodeContents = new LinkedHashSet<>();


}
