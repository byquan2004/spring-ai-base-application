package com.quan.pojo.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@Builder
public class ChatDTO {

    /**
     * 提示词
     */
    private String prompt;

    /**
     * 会话id
     */
    private String sessionId;

    /**
     * 类型 1-chat 2-service 3-pdf
     */
    private Long type;

    /**
     * 附件
     */
    private List<MultipartFile> files;
}
