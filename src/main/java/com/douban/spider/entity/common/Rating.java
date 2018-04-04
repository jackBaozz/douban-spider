package com.douban.spider.entity.common;


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
public class Rating implements Serializable {
    private int min;//最低评分
    private int max;//最高评分
    private float average;//评分
    private int stars;//评星数
    private int value;//评分
}
