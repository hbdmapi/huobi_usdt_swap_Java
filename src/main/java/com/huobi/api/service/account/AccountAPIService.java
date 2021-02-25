package com.huobi.api.service.account;


import com.huobi.api.request.account.*;
import com.huobi.api.response.account.*;

import java.math.BigDecimal;

public interface AccountAPIService {


    //2获取合约资产接口开始
    SwapAccountInfoResponse getSwapAccountInfo(String contractCode);//获取用户账户信息

    SwapPositionInfoResponse getSwapPositionInfo(String contractCode);//获取用户持仓信息

    SwapAccountPositionInfoResponse getSwapAccountPositionInfo(String contractCode);//查询用户账户和持仓信息

    SwapSubAccountListResponse getSwapSubAccountList(String contractCode);//查询母账户下所有子账户资产信息

    SwapSubAccountInfoResponse getSwapSubAccountInfo(String contractCode, Long subUid);//查询单个子账户资产信息

    SwapSubPositionInfoResponse getSwapSubPositionInfo(String contractCode, Long subUid);//查询单个子账户持仓信息

    SwapFinancialRecordResponse getSwapFinancialRecord(SwapFinancialRecordRequest request);//查询用户财务记录

    SwapOrderLimitResponse getSwapOrderLimitResponse(String contractCode, String orderPriceType);//查询用户当前的下单量限制

    SwapFeeResponse getSwapFeeResponse(String contractCode);//查询用户当前的手续费费率

    SwapTransferLimitResponse getSwapTransferLimitResponse(String contractCode);//查询用户当前的划转限制

    SwapPositionLimitResponse getSwapPositionLimitResponse(String contractCode);//用户持仓量限制的查询

    SwapMasterSubTransferResponse getSwapMasterSubTransferResponse(SwapMasterSubTransferRequest request);//母子账户划转

    SwapMasterSubTransferRecordResponse getSwapMasterSubTransferRecordResponse(SwapMasterSubTransferRecordRequest request);//获取母账户下的所有母子账户划转记录

    SwapTransferInnerResponse getSwapTransferInner(String asset, String fromMarginAccount, String toMarginAccount, BigDecimal amount);

    SwapApiTradingStatusResponse getSwapApiTradingStatusResponse();//获取用户API指标禁用信息

    SwapAvailableLevelRateResponse getSwapAvailableLevelRate(String contractCode);//查询用户可用杠杆倍数

    SwapUserSettlementRecordsResponse getSwapUserSettlementRecords(SwapUserSettlementRecordsRequest request);

    SwapFinancialRecordExactResponse getSwapFinancialRecordExact(SwapFinancialRecordExactRequest request);

    SwapSubAuthResponse getSwapSubAuth(String subUid, Integer subAuth);

    SwapSubAccountInfoListResponse getSwapSubAccountInfoList(String contractCode, Integer pageIndex, Integer pageSize);

    SwapBalanceValuationResponse getSwapBalanceValuation(String ValuationAsset);
}
