package com.xkcoding.upload.util.test;

import cn.hutool.core.util.StrUtil;

/**
 * @author chenanbang
 * @version 1.0.0
 * @ClassName Hutool.java
 * @createTime 2020年06月09日 16:52:00
 */
public class HutoolTest {

    public static void main(String[] args) {
        String str1 = StrUtil.appendIfMissing("https://home", "w","q","a","d","/","E");
        String str2 = StrUtil.appendIfMissingIgnoreCase("https://home", "w","q","a","d","/","E");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }

}
