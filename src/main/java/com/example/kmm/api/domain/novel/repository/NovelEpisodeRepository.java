package com.example.kmm.api.domain.novel.repository;

import com.example.kmm.api.domain.novel.domain.NovelEpisode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * NovelEpisodeRepository class.
 *
 * <p>
 * date: 2023-04-07
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@RepositoryRestResource
public interface NovelEpisodeRepository extends
    JpaRepository<NovelEpisode, Long> {

}
