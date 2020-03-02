package com.tjy.myblog.dao;

import com.tjy.myblog.vo.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/3/1 16:52
 */

public interface CommentDao  extends JpaRepository<Comment,Long> {
    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
