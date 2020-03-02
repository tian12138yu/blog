package com.tjy.myblog.Service;

import com.tjy.myblog.vo.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/3/1 16:02
 */

public interface TagService {
    /**
     * 新增
     * @return
     */
    Tag saveTag(Tag tag);


    /**
     * 单个查询
     * @param id
     * @return
     */
    Tag getTag(Long id);

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<Tag> ListTag(Pageable pageable);


    List<Tag> ListTagTop(Integer size);

    /**
     * 查询所有标签
     * @return
     */
    List<Tag> ListTag();

    List<Tag> ListTag(String ids);

    /**
     * 修改
     * @param id
     * @param tag
     * @return
     */
    Tag updateTag(Long id, Tag tag);

    /**
     * 删除
     * @param id
     */
    void deleteTag(Long id);

    /**
     * 通过分类名称
     * @return
     */
    Tag getTagByName(String name);
}
