package com.functions.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.functions.pojo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ：zbzbzzz
 * @Date ：Created in 19:50 2019/12/20
 * @Description：_____上链工具方法
 * @Modified By：
 * @Version: X.X
 */
public class PojoToJson {
    // 初始化api，目前的参数为示例参数
    private BaseApi baseApi = new BaseApi(
            "testchannel",
            "zmmcode",
            "1.0",
            "User1",
            "7258adda1803f4137eff4813e7aba323018200c5",
            "[{\"orgId\":\"7258adda1803f4137eff4813e7aba323018200c5\", \"peerDomainName\":\"peer-7258adda1803f4137eff4813e7aba323018200c5-0.peer-7258adda1803f4137eff4813e7aba323018200c5.default.svc.cluster.local\"}]",
            "invoke",
            "2018-10-31T17:28:16+08:00",
            "-----BEGIN CERTIFICATE-----\\nMIIDBzCCAq2gAwIBAgIQEXPZlMsReamxVtVNnKwCCzAKBggqhkjOPQQDAjCCAQQx\\nDjAMBgNVBAYTBUNISU5BMRAwDgYDVQQIEwdCRUlKSU5HMRAwDgYDVQQHEwdCRUlK\\nSU5HMXkwdwYDVQQKE3A3MjU4YWRkYTE4MDNmNDEzN2VmZjQ4MTNlN2FiYTMyMzAx\\nODIwMGM1LnBlZXItNzI1OGFkZGExODAzZjQxMzdlZmY0ODEzZTdhYmEzMjMwMTgy\\nMDBjNS5kZWZhdWx0LnN2Yy5jbHVzdGVyLmxvY2FsMVMwUQYDVQQDE0pjYS5wZWVy\\nLTcyNThhZGRhMTgwM2Y0MTM3ZWZmNDgxM2U3YWJhMzIzMDE4MjAwYzUuZGVmYXVs\\ndC5zdmMuY2x1c3Rlci5sb2NhbDAeFw0xODEwMzAwMjQ5MjZaFw0yODEwMjcwMjQ5\\nMjZaMIG1MQ4wDAYDVQQGEwVDSElOQTEQMA4GA1UECBMHQkVJSklORzEQMA4GA1UE\\nBxMHQkVJSklORzF/MH0GA1UEAwx2VXNlcjFANzI1OGFkZGExODAzZjQxMzdlZmY0\\nODEzZTdhYmEzMjMwMTgyMDBjNS5wZWVyLTcyNThhZGRhMTgwM2Y0MTM3ZWZmNDgx\\nM2U3YWJhMzIzMDE4MjAwYzUuZGVmYXVsdC5zdmMuY2x1c3Rlci5sb2NhbDBZMBMG\\nByqGSM49AgEGCCqGSM49AwEHA0IABPMrzoJL/MHeSFPFOJWLqnJ0sqB0it7wDIOq\\n+eTSvvPpGk1BIDmb2n13K5V04RO8xNezDQ7I6rW4LF2elq14eH+jTTBLMA4GA1Ud\\nDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMCsGA1UdIwQkMCKAIFBXQ5TC4acFeTlT\\nJuDZg62XkXCdnOfvbejSeKI2TXoIMAoGCCqGSM49BAMCA0gAMEUCIQCadHIKl0Mk\\nYn0WZizyDZYR4rT2q0nzjFaiW+YfV5FBjAIgNalKUe3rIwXJvXORV4ZXurEua2Ag\\nQmhcjRnVwPTjpTE=\\n-----END CERTIFICATE-----\\n");

    public static JSONObject linkDateConver(FinanceAssetsDebt financeAssetsDebt, FinanceFlow financeFlow,
                                            FinanceProfits financeProfits, FinanceSimple financeSimple) {
        Map<String, Object> data = new HashMap<>(4);
        data.put("FinanceAssetsDebt", financeAssetsDebt);
        data.put("FinanceFlow", financeFlow);
        data.put("FinanceProfits", financeProfits);
        data.put("FinanceSimple", financeSimple);
        JSONObject jsonData = new JSONObject(data);
        return jsonData;
    }
    // 通用转换方法
    public String linkDateConver(Object o) {
        // 根据表生成hash
        String hash = SHA256Util.getSHA256String(JSON.toJSONString(o));
        List<Object> arg = new ArrayList<>();
        // 添加表和hash到list
        arg.add(o);
        arg.add(hash);

        //添加args字段的参数
        this.baseApi.setArgs(arg);
        return JSON.toJSONString(this.baseApi);
    }

    public String FinanceAssetsDebtConver(FinanceAssetsDebt financeAssetsDebt) {
        List<Object> arg = new ArrayList<>();
        arg.add(financeAssetsDebt);
        this.baseApi.setArgs(arg);
        return JSON.toJSONString(this.baseApi);
    }

    public static String FinanceFlowConver(FinanceFlow financeFlow) {
        return JSON.toJSONString(financeFlow);
    }

    public static String FinanceProfitsConver(FinanceProfits financeProfits) {
        return JSON.toJSONString(financeProfits);
    }

    public static String FinanceSimpleDebtConver(FinanceSimple financeSimple) {
        return JSON.toJSONString(financeSimple);
    }

}
