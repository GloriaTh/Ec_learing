package com.learing.service;

import com.learing.common.ServerResponse;
import com.learing.pojo.Category;

import java.util.List;

/**
 * 
 * @author Gloria
 *
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
