package com.mallfe.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    CATEGORY_NOT_DOUND(404,"商品分类未查到"),
    BRAND_NOT_DOUND(404,"品牌未查到")
    ;
    private int code;
    private String msg;
}
