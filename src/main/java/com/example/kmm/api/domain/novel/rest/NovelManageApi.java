package com.example.kmm.api.domain.novel.rest;

import com.example.kmm.api.domain.novel.dto.request.NovelCoverRequest;
import com.example.kmm.api.domain.novel.dto.request.NovelEpisodeRequest;
import com.example.kmm.api.global.common.res.JsonObjectResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * NovelManageApi class.
 *
 * <p>
 * date: 2023-04-06
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@RestController
@RequestMapping("/novel-manager")
public class NovelManageApi {

    // 소설 표지 등록
    @PostMapping("/add")
    public String addNovelCover(@RequestBody NovelCoverRequest novelCoverRequest)
        throws JsonProcessingException {

        return JsonObjectResponse.convert("success", true);
    }

    // 소설 작성
    @PostMapping("{coverId}/add")
    public String addNovelEpisode(
        @PathVariable Long coverId,
        @RequestBody NovelEpisodeRequest episodeRequest
    ) throws JsonProcessingException {

        return JsonObjectResponse.convert("success", true);
    }

    // 소설 조회
    @GetMapping("")
    public String getNovelCoverList(
        @PageableDefault(size = 10, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable
    ) throws JsonProcessingException {
        List<Map<String, Object>> novelList = new ArrayList<>();
        return JsonObjectResponse.convert("novel", novelList);
    }

    // 각 소설의 각 챕터 조회
    @GetMapping("")
    public String getNovelEpisodeList(
        @PageableDefault(size = 10, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable
    ) throws JsonProcessingException {
        List<Map<String, Object>> novelList = new ArrayList<>();
        return JsonObjectResponse.convert("novel", novelList);
    }

    // 소설 삭제
    @DeleteMapping("")
    public String deleteNovelCover(String novelId) throws JsonProcessingException {
        return JsonObjectResponse.convert("success", true);
    }

    // 소설 에피소드 삭제
    @DeleteMapping("")
    public String deleteNovelEpisode(String novelId, String episodeId)
        throws JsonProcessingException {
        return JsonObjectResponse.convert("success", true);
    }
}
