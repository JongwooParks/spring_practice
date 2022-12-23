package com.example.app.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class FileVO {
    private String fileName;
    private Long fileNumber;
    private String fileUploadPath;
    private String fileUuid;
    private Long fileSize;
    private boolean fileImageCheck;
    private Long boardNumber;
}
