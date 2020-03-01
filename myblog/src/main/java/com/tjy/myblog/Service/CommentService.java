package com.tjy.myblog.Service;

import com.tjy.myblog.vo.Comment;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/3/1 16:53
 */

public interface CommentService {

    /**
     * 通过id查询评论列表
     * @param blogId
     * @return
     */
    List<Comment> listCommentByBlogId(Long blogId);

    /**
     * 保存评论信息
     * @param comment
     * @return
     */
    Comment saveComment(Comment comment);
}
