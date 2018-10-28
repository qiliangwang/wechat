package com.iceberg.pojo.vo;

import lombok.Data;

@Data
public class UserVO {
    private String id;
    private String username;
    private String faceImage;
    private String faceImageBig;
    private String nickname;
    private String qrCode;
}