package com.douban.spider.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Log
public class DoubanUser  implements Serializable {
    private String id;//用户id
    private String name;//用户名
    private String uid;//用户唯一标识
    private String signature;//用户签名
    private String alt;//用户个人主页url
    private String avatar;//用户头像
}
