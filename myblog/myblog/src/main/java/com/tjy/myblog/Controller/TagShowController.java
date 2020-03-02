package com.tjy.myblog.Controller;





import com.tjy.myblog.BlogQuery;
import com.tjy.myblog.Service.BlogService;
import com.tjy.myblog.Service.TagService;
import com.tjy.myblog.vo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TagShowController {
    @Autowired
    private TagService tagServiceImpl;


    @Autowired
    private BlogService blogServiceImpl;


    @GetMapping("/tags/{id}")
    public String tags(Model model, @PageableDefault(size = 8, sort = {"updateTime"}, direction = Sort.Direction.DESC)
            @PathVariable Long id, Pageable pageable) {

        List<Tag> tags = tagServiceImpl.ListTagTop(10000);
        if (id == -1){
            id = tags.get(0).getId();
        }
        BlogQuery blogQuery = new BlogQuery();
        model.addAttribute("tags",tags);
        model.addAttribute("page",blogServiceImpl.ListBlog(id,pageable));
        model.addAttribute("avtiveTagId",id);
        return "tags";
    }

}
