package com.example.app.mapper;

import com.example.app.domain.vo.FileVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class FileMapperTest {

    @Autowired
    private FileMapper fileMapper;

    @Test
    public void insertTest(){
        FileVO fileVO = new FileVO();
        fileVO.setFileName("승우");
        fileVO.setFileSize(30L);
        fileVO.setFileUploadPath("test");
        fileVO.setFileUuid("test1234");
        fileVO.setBoardNumber(228L);

        fileMapper.insert(fileVO);
    }

    @Test
    public void selectAllTest(){
        fileMapper.selectAll(224L).stream().map(FileVO::toString).forEach(log::info);
    }

    @Test
    public void deleteTest(){
        fileMapper.delete(228L);
    }
}
