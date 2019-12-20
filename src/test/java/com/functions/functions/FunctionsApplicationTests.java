package com.functions.functions;

import com.alibaba.fastjson.JSONObject;
import com.functions.pojo.FinanceAssetsDebt;
import com.functions.pojo.FinanceFlow;
import com.functions.pojo.FinanceProfits;
import com.functions.pojo.FinanceSimple;
import com.functions.utils.PojoToJson;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FunctionsApplicationTests {

    @Test
    void contextLoads() {
        FinanceAssetsDebt financeAssetsDebt =new FinanceAssetsDebt();
        FinanceFlow financeFlow = new FinanceFlow();
        FinanceProfits financeProfits = new FinanceProfits();
        FinanceSimple financeSimple = new FinanceSimple();
        JSONObject jsonObject=PojoToJson.linkDateConver(financeAssetsDebt,financeFlow,financeProfits,financeSimple);
        System.out.println(jsonObject);
    }

}
