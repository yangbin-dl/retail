package com.mallfe.item;


import com.mallfe.common.vo.PageResult;
import com.mallfe.item.pojo.Brand;
import com.mallfe.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemServiceAppliactionTests {
	@Autowired
	private BrandService brandService;

	@Test
	public void contextLoads() {
		PageResult<Brand> data =brandService.queryBrandByPage(1,5,null,null,null);
		System.out.println("CostSql = " + data.toString());
	}

}
