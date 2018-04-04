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
public class Photo implements Serializable {
    private String id;//图片id
    private String subject_id;//条目id
    private String alt;//图片展示页url
    private String icon;//图片地址，icon尺寸
    private String image;//图片地址，image尺寸
    private String thumb;//图片地址，thumb尺寸
    private String cover;//图片地址，cover尺寸
    private String created_at;//发布日期
    private String desc;//图片描述
    private DoubanUser author;//上传用户，见附录
    private String album_id;//相册id
    private String album_title;//相册标题
    private String album_url;//相册地址
    private String next_photo;//下一张图片
    private String prev_photo;//上一张图片
    private int position;//图片在相册中的位置，按照时间排序
    private int comments_count;//评论数
    private int photos_count;//全部剧照数量
}
