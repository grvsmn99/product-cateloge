package com.gaurav.productcatalog.exception.pojo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseException {
    private String message;
}
