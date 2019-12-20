package com.functions.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author ：zbzbzzz
 * @Date ：Created in 21:43 2019/12/20
 * @Description：_____
 * @Modified By：
 * @Version: X.X
 */
@Data
public class BaseApi {

    private String channelId;
    private String chaincodeId;
    private String chaincodeVersion;
    private String userId;
    private String orgId;
    private String orgPeers;
    private String opmethod;
    private List<Object> args;
    private String timestamp;
    private String cert;

    public BaseApi() {
    }

    public BaseApi(String channelId, String chaincodeId, String chaincodeVersion, String userId, String orgId, String orgPeers, String opmethod, String timestamp, String cert) {
        this.channelId = channelId;
        this.chaincodeId = chaincodeId;
        this.chaincodeVersion = chaincodeVersion;
        this.userId = userId;
        this.orgId = orgId;
        this.orgPeers = orgPeers;
        this.opmethod = opmethod;
        this.timestamp = timestamp;
        this.cert = cert;
    }
}
