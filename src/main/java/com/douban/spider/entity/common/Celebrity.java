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
public class Celebrity  implements Serializable {
    private String id;//影人条目id
    private String name;//中文名
    private String alt;//影人条目URL
    private Photo avatars;//影人头像，分别提供420px x 600px(大)，140px x 200px(中) 70px x 100px(小)尺寸
}
