package com.huobi.linear.swap.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.crossrequest.account.SwapCrossLeverPositionLimitRequest;
import com.huobi.api.crossrequest.account.SwapCrossUserSettlementRecordsRequest;
import com.huobi.api.crossresponse.account.*;
import com.huobi.api.crossservice.crossaccount.CrossAccountAPIServiceImpl;
import com.huobi.api.response.account.SwapLeverPositionLimitResponse;
import com.huobi.api.response.account.SwapSubAccountInfoListResponse;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.JVM)
public class CrossAccountAPITest implements BaseTest {

    CrossAccountAPIServiceImpl huobiCrossAPIService = new CrossAccountAPIServiceImpl("", "");

    @Test
    public void getSwapCrossAccountInfoResponse() {
        SwapCrossAccountInfoResponse response = huobiCrossAPIService.getSwapCrossAccountInfo("usdt","");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossPositionInfo() {
        SwapCrossPositionInfoResponse response = huobiCrossAPIService.getSwapCrossPositionInfo("eth-usdt","","","");
        logger.debug("2.获取用户持仓信息：{}", JSON.toJSONString(response));

        response = huobiCrossAPIService.getSwapCrossPositionInfo("","","","");
        logger.debug("2.获取用户持仓信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossAccountPositionInfo() {
        SwapCrossAccountPositionInfoResponse response = huobiCrossAPIService.getSwapCrossAccountPositionInfo("usdt");
        logger.debug("3.查询用户账户和持仓信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossSubAccountList() {
        SwapCrossSubAccountListResponse response = huobiCrossAPIService.getSwapCrossSubAccountList("usdt","");
        logger.debug("4.查询母账户下所有子账户资产信息：{}", JSON.toJSONString(response));

        response = huobiCrossAPIService.getSwapCrossSubAccountList("","");
        logger.debug("4.查询母账户下所有子账户资产信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossSubAccountInfo() {
        SwapCrossSubAccountInfoResponse response = huobiCrossAPIService.getSwapCrossSubAccountInfo("", 1l,"");
        logger.debug("5.查询单个子账户资产信息：{}", JSON.toJSONString(response));
        logger.debug(response.getStatus());
    }

    @Test
    public void getSwapCrossSubPositionInfo() {
        SwapCrossSubPositionInfoResponse response = huobiCrossAPIService.getSwapCrossSubPositionInfo("", 1l,"","","");
        logger.debug("6.查询单个子账户持仓信息：{}", JSON.toJSONString(response));
        logger.debug(response.getStatus());
    }


    @Test
    public void getSwapCrossTransferLimitResponse() {
        SwapCrossTransferLimitResponse response = huobiCrossAPIService.getSwapCrossTransferLimitResponse("usdt");
        logger.debug("7.查询用户当前的划转限制：{}", JSON.toJSONString(response));
        response = huobiCrossAPIService.getSwapCrossTransferLimitResponse("");
        logger.debug("7.查询用户当前的划转限制：{}", JSON.toJSONString(response));
    }


    @Test
    public void getSwapCrossPositionLimitResponse() {
        SwapCrossPositionLimitResponse response = huobiCrossAPIService.getSwapCrossPositionLimitResponse("btc-usdt","","","","");
        logger.debug("8.用户持仓量限制的查询：{}", JSON.toJSONString(response));

        response = huobiCrossAPIService.getSwapCrossPositionLimitResponse("","","","","");
        logger.debug("8.用户持仓量限制的查询：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossAvailableLevelRateResponse() {
        SwapCrossAvailableLevelRateResponse response = huobiCrossAPIService.getSwapCrossAvailableLevelRate("","");
        logger.debug("9.查询用户可用杠杆倍数：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossUserSettlementRecords() {
        SwapCrossUserSettlementRecordsRequest request = SwapCrossUserSettlementRecordsRequest.builder()
                .marginAccount("usdt")
                //.startTime(1l)
                //.endTime(1l)
                //.pageSize(0)
                //.pageSize(0)
                .build();
        SwapCrossUserSettlementRecordsResponse response = huobiCrossAPIService.getSwapCrossUserSettlementRecords(request);
        logger.debug("10.查询用户结算记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossSubCrossAccountInfoList() {
        SwapSubAccountInfoListResponse response = huobiCrossAPIService.getSwapCrossSubAccountInfoList("usdt", 1, 20,"");
        logger.debug("11.批量获取子账户资产信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossLeverPositionLimit() {
        SwapCrossLeverPositionLimitRequest request = SwapCrossLeverPositionLimitRequest.builder()
                .businessType("all")
                .contractCode("")
                .contractType("")
                .pair("")
                .leverRate(1)
                .tradePartition("")
                .build();
        SwapLeverPositionLimitResponse response = huobiCrossAPIService.getSwapCrossLeverPositionLimit(request);
        logger.debug("12.查询用户所有杠杆持仓量限制：{}", JSON.toJSONString(response));
    }
}
