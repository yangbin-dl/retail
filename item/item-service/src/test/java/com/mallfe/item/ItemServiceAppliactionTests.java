package com.mallfe.item;


import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CostCenterApplicationTests {
	@Autowired
	private CostSaleMapper costSaleMapper;

	@Test
	public void contextLoads() {
		CostSaleData costSale =costSaleMapper.selectByPrimaryKey(1);
		System.out.println("CostSql = " + costSale);
	}

}
