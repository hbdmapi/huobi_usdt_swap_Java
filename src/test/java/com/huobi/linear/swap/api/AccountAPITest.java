package com.huobi.linear.swap.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.request.account.SwapFinancialRecordRequest;
import com.huobi.api.request.account.SwapMasterSubTransferRecordRequest;
import com.huobi.api.request.account.SwapMasterSubTransferRequest;
import com.huobi.api.response.account.*;
import com.huobi.api.service.account.AccountAPIServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;


@FixMethodOrder(MethodSorters.JVM)
public class AccountAPITest implements BaseTest {


    AccountAPIServiceImpl huobiAPIService = new AccountAPIServiceImpl("", "");

    @Test
    public void getSwapAccountInfoResponse() {
        SwapAccountInfoResponse response = huobiAPIService.getSwapAccountInfo("btc-usdt");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
        response = huobiAPIService.getSwapAccountInfo("");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapPositionInfo() {
        SwapPositionInfoResponse response = huobiAPIService.getSwapPositionInfo("ETH-usdt");
        logger.debug("2.获取用户持仓信息：{}", JSON.toJSONString(response));

        response = huobiAPIService.getSwapPositionInfo("");
        logger.debug("2.获取用户持仓信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapAccountPositionInfo() {
        SwapAccountPositionInfoResponse response = huobiAPIService.getSwapAccountPositionInfo("btc-usdt");
        logger.debug("3.查询用户账户和持仓信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapSubAccountList() {
        SwapSubAccountListResponse response = huobiAPIService.getSwapSubAccountList("btc-usdt");
        logger.debug("4.查询母账户下所有子账户资产信息：{}", JSON.toJSONString(response));

        response = huobiAPIService.getSwapSubAccountList("");
        logger.debug("4.查询母账户下所有子账户资产信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapSubAccountInfo() {
        SwapSubAccountInfoResponse response = huobiAPIService.getSwapSubAccountInfo("", 1l);
        logger.debug("5.查询单个子账户资产信息：{}", JSON.toJSONString(response));
        logger.debug(response.getStatus());
    }

    @Test
    public void getSwapSubPositionInfo() {
        SwapSubPositionInfoResponse response = huobiAPIService.getSwapSubPositionInfo("BTC-USDT", 1l);
        logger.debug("6.查询单个子账户持仓信息：{}", JSON.toJSONString(response));
        logger.debug(response.getStatus());
    }


    @Test
    public void getSwapFinancialRecord() {
        SwapFinancialRecordRequest request = SwapFinancialRecordRequest.builder()
                .marginAccount("btc-usdt")
                //.type("")
                //.createDate()
                //.pageIndex()
                //.pageSize()
                .build();
        SwapFinancialRecordResponse response = huobiAPIService.getSwapFinancialRecord(request);
        logger.debug("7.查询用户财务记录：{}", JSON.toJSONString(response));
    }


    @Test
    public void getSwapOrderLimitResponse() {
        SwapOrderLimitResponse response = huobiAPIService.getSwapOrderLimitResponse("btc-usdt", "limit");
        logger.debug("8.查询用户当前的下单量限制：{}", JSON.toJSONString(response));
        response = huobiAPIService.getSwapOrderLimitResponse("", "limit");
        logger.debug("8.查询用户当前的下单量限制：{}", JSON.toJSONString(response));
    }


    @Test
    public void getSwapFeeResponse() {
        SwapFeeResponse response = huobiAPIService.getSwapFeeResponse("BTC-USDT");
        logger.debug("9.查询用户当前的手续费费率：{}", JSON.toJSONString(response));
        response = huobiAPIService.getSwapFeeResponse("");
        logger.debug("9.查询用户当前的手续费费率：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapTransferLimitResponse() {
        SwapTransferLimitResponse response = huobiAPIService.getSwapTransferLimitResponse("btc-usdt");
        logger.debug("10.查询用户当前的划转限制：{}", JSON.toJSONString(response));
        response = huobiAPIService.getSwapTransferLimitResponse("");
        logger.debug("10.查询用户当前的划转限制：{}", JSON.toJSONString(response));
    }


    @Test
    public void getSwapPositionLimitResponse() {
        SwapPositionLimitResponse response = huobiAPIService.getSwapPositionLimitResponse("btc-usdt");
        logger.debug("11.用户持仓量限制的查询：{}", JSON.toJSONString(response));

        response = huobiAPIService.getSwapPositionLimitResponse("");
        logger.debug("11.用户持仓量限制的查询：{}", JSON.toJSONString(response));
    }


    @Test
    public void getOptionMasterSubTransferResponse() {
        SwapMasterSubTransferRequest request = SwapMasterSubTransferRequest.builder()
                .subUid(1l)
                .asset("usdt")
                .fromMarginAccount("btc-usdt")
                .toMarginAccount("btc-usdt")
                .amount(BigDecimal.valueOf(50))
                .type("master_to_sub")
                .build();
        SwapMasterSubTransferResponse response =
                huobiAPIService.getSwapMasterSubTransferResponse(request);
        logger.debug("12.母子账户划转：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapMasterSubTransferRecordResponse() {
        SwapMasterSubTransferRecordRequest request = SwapMasterSubTransferRecordRequest.builder()
                .marginAccount("BTC-USDT")
                //.transferType("")
                .createDate(10)
                .pageIndex(1)
                .pageSize(20)
                .build();
        SwapMasterSubTransferRecordResponse response = huobiAPIService.getSwapMasterSubTransferRecordResponse(request);
        logger.debug("13.获取母账户下的所有母子账户划转记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapTransferInnerResponse() {
        SwapTransferInnerResponse response = huobiAPIService.getSwapTransferInner("usdt", "btc-usdt", "eth-usdt", BigDecimal.valueOf(10));
        logger.debug("14.同账号不同保证金账户的划转：{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapApiTradingStatusResponse() {
        SwapApiTradingStatusResponse response = huobiAPIService.getSwapApiTradingStatusResponse();
        logger.debug("15.获取用户API指标禁用信息：{}", JSON.toJSONString(response));
    }

}
