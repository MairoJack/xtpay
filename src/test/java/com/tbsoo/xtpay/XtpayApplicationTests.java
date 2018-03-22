package com.tbsoo.xtpay;

import com.tbsoo.xtpay.dao.ProductMapper;
import com.tbsoo.xtpay.model.ProductWithBLOBs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@MapperScan("com.tbsoo.xtpay.dao")
@SpringBootTest
public class XtpayApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void contextLoads() {
		BigDecimal bd100 = new BigDecimal("1000000");
		BigDecimal bd0 = new BigDecimal("0");

        List<ProductWithBLOBs> list = productMapper.selectProducts();
        for (ProductWithBLOBs p : list) {
        	if (p.getAmount().compareTo(bd100) > 0 && p.getDeadline() > 1516723200 && !p.getFinishPreviewRepayment()){
				int i = 1;
				BigDecimal totalAmount = p.getAmount();
				String productName = p.getName();
				String productNo = p.getProductNo();
				String contractNo = p.getContractNo();
				while (totalAmount.divide(bd100, 0, BigDecimal.ROUND_DOWN).compareTo(bd0) > 0) {
					p.setAmount(bd100);
					p.setContractNo(contractNo + "-" + i);
					String random = getRandomNo(i);
					p.setName(productName.substring(0, 7) + random
							+ productName.substring(7, productName.length()));
					p.setProductNo(productNo.substring(0, 4) + random
							+ productNo.substring(4, productNo.length()));
					p.setRemark(String.valueOf(p.getId()));
					productMapper.insertSelective(p);
					i++;
					totalAmount = totalAmount.subtract(bd100);
				}

				if (totalAmount.compareTo(bd0) > 0 && totalAmount.compareTo(bd100) < 0) {
					p.setAmount(totalAmount);
					p.setContractNo(contractNo + "-" + i);
					String random = getRandomNo(i);
					p.setName(productName.substring(0, 7) + random
							+ productName.substring(7, productName.length()));
					p.setProductNo(productNo.substring(0, 4) + random
							+ productNo.substring(4, productNo.length()));
					p.setRemark(String.valueOf(p.getId()));
					productMapper.insertSelective(p);
				}
			} else {
				p.setRemark(String.valueOf(p.getId()));
				productMapper.insertSelective(p);
			}


        }

    }

    private String getRandomNo(int i) {
        String[] r1 = new String[] { "A", "B", "C" };
        String[] r2 = new String[] { "D", "E", "F" };
        String[] r3 = new String[] { "G", "H", "I" };
        String[] r4 = new String[] { "J", "K", "L" };
        String[] r5 = new String[] { "M", "N", "O" };
        String[] r6 = new String[] { "P", "Q", "R" };
        String[] r7 = new String[] { "S", "T", "U" };
        String[] r8 = new String[] { "V", "W", "X" };
        String[] r9 = new String[] { "Y", "Z", "Z" };
        Random random = new Random();
        int index = random.nextInt(3);
        switch (i) {
            case 1:
                return r1[index];
            case 2:
                return r2[index];
            case 3:
                return r3[index];
            case 4:
                return r4[index];
            case 5:
                return r5[index];
            case 6:
                return r6[index];
            case 7:
                return r7[index];
            case 8:
                return r8[index];
            case 9:
                return r9[index];
            default:
                return null;
        }
    }

}
