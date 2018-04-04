package com.douban.spider.entity.movie;

import com.douban.spider.entity.common.Celebrity;
import com.douban.spider.entity.common.Photo;
import com.douban.spider.entity.common.Rating;
import com.douban.spider.entity.common.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import java.io.Serializable;

@Data
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Log
public class Subject implements Serializable{

    private String id;	//条目id
    private String title;//中文名
    private String original_title;//原名
    private String[] aka;//又名
    private String alt;//条目页URL
    private String mobile_url;//移动版条目页URL
    private Rating rating;//评分，见附录dict
    private int ratings_count;//评分人数
    private int wish_count;//想看人数
    private int collect_count;//看过人数
    private int do_count;//在看人数，如果是电视剧，默认值为0，如果是电影值为null
    private Photo images;//电影海报图，分别提供288px x 465px(大)，96px x 155px(中) 64px x 103px(小)尺寸	dict

    private String subtype;//条目分类, movie或者tv
    private Celebrity[] directors;//导演，数据结构为影人的简化描述，见附录	a
    private Celebrity[] casts;//主演，最多可获得4个，数据结构为影人的简化描述，见附录
    private Celebrity[] writers;//编剧，数据结构为影人的简化描述，见附录
    private String website;//官方网站
    private String douban_site;//豆瓣小站
    private String[] pubdates;//如果条目类型是电影则为上映日期，如果是电视剧则为首Ï日期
    private String mainland_pubdate;//大陆上映日期，如果条目类型是电影则为上映日期，如果是电视剧则为首播日期
    private String pubdate;//兼容性数据，未来会去掉，大陆上映日期，如果条目类型是电影则为上映日期，如果是电视剧则为首播日期
    private String year;//年代
    private String[] languages;//语言
    private String[] durations;//片长
    private String[] genres;//影片类型，最多提供3个
    private String[] countries;//制片国家/地区
    private String summary;//简介
    private int comments_count;//短评数量
    private int reviews_count;//影评数量
    private int seasons_count;//总季数(tv only)
    private int current_season;//当前季数(tv only)
    private int episodes_count;//当前季的集数(tv only)
    private String[] schedule_url;//影讯页URL(movie only)
    private String[] trailer_urls;//预告片URL，对高级用户以上开放，最多开放4个地址
    private String[] blooper_urls;//花絮URL，对高级用户以上开放，最多开放4个地址
    private Photo[] photos;//电影剧照，前10张，见附录
    private Review[] popular_reviews;//影评，前10条，影评结构，见附录

}
