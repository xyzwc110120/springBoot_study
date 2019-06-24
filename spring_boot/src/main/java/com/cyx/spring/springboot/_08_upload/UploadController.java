package com.cyx.spring.springboot._08_upload;

import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/springboot")
public class UploadController {

    // 文件保存地址
    @Value("${file.path}")
    private String filePath;

    @RequestMapping("/upload")
    public void upload(MultipartFile file) throws IOException {
        if (file == null || StringUtils.isEmpty(file.getOriginalFilename())) {
            return;
        }
        // 获取文件后缀名
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String filename = UUID.randomUUID() + suffix;
        // Spring 中的文件工具类
        FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(filePath + filename));
    }
}
