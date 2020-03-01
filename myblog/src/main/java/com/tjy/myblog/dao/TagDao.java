package com.tjy.myblog.dao;

import com.tjy.myblog.vo.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/3/1 16:04
 */

public interface TagDao extends JpaRepository<Tag, Long> {
    Tag findByName(String name);


    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);

}
