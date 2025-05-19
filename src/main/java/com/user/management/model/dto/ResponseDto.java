package com.user.management.model.dto;

import javax.validation.constraints.NotBlank;

public class ResponseDto {
    @NotBlank
    private String returnCd;

    @NotBlank
    private String resultCd;

    @NotBlank
    private String resultMsg;
}
