package com.example.kmm.api.domain.novel.domain;

import com.example.kmm.api.domain.user.dto.AuditingFields;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * NovelEpisodeContents class.
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
    name = "novel_episode_contents",
    indexes = {
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy"),
    })
@Entity
public class NovelEpisodeContents extends AuditingFields {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @ManyToOne(optional = false)
    private NovelEpisode novelEpisode; // 소설 에피소드

    private String contents;


}
