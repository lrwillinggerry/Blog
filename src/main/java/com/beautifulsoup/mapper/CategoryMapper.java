package com.beautifulsoup.mapper;

import com.beautifulsoup.bean.db.Category;
import com.beautifulsoup.bean.db.CategoryExample;
import java.util.List;

import com.beautifulsoup.bean.vo.UserCustom;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
    int countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> findAllCategories();

    UserCustom findCategoryCustomById(Integer id);
    void deleteArticleByCategoryId(int id);

}