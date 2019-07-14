package com.mallfe.item;


import com.mallfe.item.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@AutoConfigureMockMvc
public class ItemServiceAppliactionTests {
	@Autowired
	private BrandService brandService;
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception{




		MvcResult mvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/brand/page"))
				.andReturn();

		String content =mvcResult.getResponse().getContentAsString();

//		dd log.info("content::Gson====="+ new Gson().toJson(data));
//		log.info("content::JsonUtils====="+ JsonUtils.serialize(data));
		log.info("content::====="+ content);



	}


	@Test
	public void mockIo(){
		//创建mock对象，参数可以是类，也可以是接口
		List<String> list = Mockito.mock(ArrayList.class);
		Mockito.when(list.get(0)).thenReturn("helloworld");
		//list.get(0)的调用就会返回 helloworld
		String result = list.get(0);
		System.out.println(result);

		//验证方法调用(是否调用了get(0))
		Mockito.verify(list).get(0);

		Assert.assertEquals("helloworld", result);

	}
}
