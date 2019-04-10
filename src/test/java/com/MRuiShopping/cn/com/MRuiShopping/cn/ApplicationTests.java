package com.MRuiShopping.cn.com.MRuiShopping.cn;

import Utils.CreatQRCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {


	@Test
	public void contextLoads() {
		CreatQRCode.creatQrcode("你好，我是羅明","D:/qrcode.png");
	}

}
