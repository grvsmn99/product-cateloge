package com.gaurav.productcatalog.util;

import com.gaurav.productcatalog.filters.BrandFilterStrategy;
import com.gaurav.productcatalog.filters.ColorFilterStrategy;
import com.gaurav.productcatalog.filters.ProductCategoryFilterStrategy;
import com.gaurav.productcatalog.filters.ProductFilterStartegy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FilterFactory {

    public static List<ProductFilterStartegy> createFilterStrategy(Map<String, String> filterMap){
        List<ProductFilterStartegy> startegyList = new ArrayList<>();
        if (filterMap.containsKey("category")){
            startegyList.add(new ProductCategoryFilterStrategy(filterMap.get("category")));
        }
        if (filterMap.containsKey("brand")){
            startegyList.add(new BrandFilterStrategy(filterMap.get("brand")));
        }
        if (filterMap.containsKey("color")){
            startegyList.add(new ColorFilterStrategy(filterMap.get("color")));
        }

        return startegyList;
    }
}
