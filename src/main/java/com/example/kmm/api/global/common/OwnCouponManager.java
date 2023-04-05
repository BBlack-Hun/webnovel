package com.example.kmm.api.global.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Point class.
 *
 * <p>
 * date: 2023-04-05
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
public class OwnCouponManager {

    public static Map<String,Object> charge(Long novelId, int count, int addCount) {
        int price = 0;
        switch (count) {
            case 1:
                price = 100;
                break;
            case 30:
                price = 2000;
                break;
            case 60:
                price = 5800;
                break;
            case 90:
                price = 8700;
                break;
            default:
                price = 8600;
                break;
        }

        if (count == 1 && addCount != 0) {
            price = addCount -1;
            count = addCount;
        }

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("novelId", novelId);
        returnMap.put("price", price);
        returnMap.put("ownCoupon", count);

        return returnMap;
    }

    public static boolean buy(Long novelId, int ownCoupon) {

        // 소설 전편 조회

        // 내가 소유한 소설 분량

        // 전편 == 소유한 소설이랑 동일할 경우, 구매할 필요가 없음.

        // 내가 가지고 있는 소장권 확인



        // 소장권이 존재할 경우 내가 가지고 있는 소장권 - (소설 전편 - 내가 소장한 소설) -> 가능 ? 불가능 ?

        // 존재 하지 않을 경우 false

        // 존재할 경우, 구매가 가능 할 경우

        // 존재는 하지만, 구매가 불가능한 경우 (거의 없음.. ㅋㅋ)
        return true;
    }

}
