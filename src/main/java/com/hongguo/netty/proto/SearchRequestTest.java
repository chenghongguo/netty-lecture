package com.hongguo.netty.proto;

/**
 * @author: chenghongguo
 * @date: 2019-03-07
 * @description:
 */
public class SearchRequestTest {
    public static void main(String[] args) {
        SearchRequest.AdvertisementSearchRequest request = SearchRequest.AdvertisementSearchRequest.newBuilder()
                .setQuery("ceshi").build();
        System.out.println(request.getQuery());
        System.out.println(request.getPageNum());
        System.out.println(request.getPageSize());
    }
}
