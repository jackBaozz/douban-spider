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
public class Review implements Serializable {
    private String id;//影评id
    private String title;//影评名
    private String alt;//影评url
    private String subject_id;//条目id
    private DoubanUser author;//上传用户，见附录
    private Rating rating;//影评评分，见附录
    private String summary;//摘要，100字以内
}
