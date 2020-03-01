package com.tjy.myblog;

/**
 * @Author tjy
 * @Date 2020/3/1 16:45
 */

public class BlogQuery {

    private String title;
    /**
     * 分类ID
     */
    private Long typeId;
    /**
     * 是否提交
     */
    private boolean recommend;

    public BlogQuery() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }
}
