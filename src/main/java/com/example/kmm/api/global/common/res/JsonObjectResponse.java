package com.example.kmm.api.global.common.res;

import com.example.kmm.api.global.config.ObjectMapperConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.experimental.UtilityClass;

/**
 * MapToJsonResponse class.
 *
 * <p>
 * date: 2023-02-11
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
public class JsonObjectResponse {

    /**
     * data 를 Map으로 만든 뒤 json 으로 파싱.
     *
     * @param returnName Map 이름
     * @param data 데이터
     * @return json 형식의 데이터
     * @throws JsonProcessingException json 파싱 예외
     */
    public static String convert(String returnName, Object data)
        throws JsonProcessingException {
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put(returnName, data);

        String json = ObjectMapperConfig.objectMapper().writeValueAsString(returnMap);
        returnMap.clear();
        return json;
    }
}
