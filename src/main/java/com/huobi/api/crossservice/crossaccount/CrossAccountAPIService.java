package com.huobi.api.crossservice.crossaccount;


import com.huobi.api.crossrequest.account.SwapCrossLeverPositionLimitRequest;
import com.huobi.api.crossrequest.account.SwapCrossUserSettlementRecordsRequest;
import com.huobi.api.crossresponse.account.*;
import com.huobi.api.response.account.SwapLeverPositionLimitResponse;
import com.huobi.api.response.account.SwapSubAccountInfoListResponse;

public interface CrossAccountAPIService {

    SwapCrossAccountInfoResponse getSwapCrossAccountInfo(String marginAccount,String tradePartition);//获取用户账户信息（全仓模式）

    SwapCrossPositionInfoResponse getSwapCrossPositionInfo(String contractCode, String pair, String contractType,String tradePartition);//获取用户持仓信息（全仓模式）

    SwapCrossAccountPositionInfoResponse getSwapCrossAccountPositionInfo(String marginAccount);//查询用户账户和持仓信息（全仓模式）

    SwapCrossSubAccountListResponse getSwapCrossSubAccountList(String marginAccount,String tradePartition);//查询母账户下所有子账户资产信息（全仓模式）

    SwapCrossSubAccountInfoResponse getSwapCrossSubAccountInfo(String marginAccount, Long subUid,String tradePartition);//查询单个子账户资产信息（全仓模式）

    SwapCrossSubPositionInfoResponse getSwapCrossSubPositionInfo(String contractCode, Long subUid, String pair, String contractType,String tradePartition);//查询单个子账户持仓信息（全仓模式）

    SwapCrossTransferLimitResponse getSwapCrossTransferLimitResponse(String marginAccount);//查询用户当前的划转限制（全仓模式）

    SwapCrossPositionLimitResponse getSwapCrossPositionLimitResponse(String contractCode, String pair, String contractType,String businessType,String tradePartition);//用户持仓量限制的查询（全仓模式）

    SwapCrossAvailableLevelRateResponse getSwapCrossAvailableLevelRate(String contractCode,String tradePartition);//查询当前可能杠杆倍数（全仓模式）

    SwapCrossUserSettlementRecordsResponse getSwapCrossUserSettlementRecords(SwapCrossUserSettlementRecordsRequest request);//查询用户结算记录（全仓模式）

    SwapSubAccountInfoListResponse getSwapCrossSubAccountInfoList(String marginAccount, Integer pageIndex, Integer pagesize,String tradePartition);//批量获取子账户资产信息（全仓模式）

    SwapLeverPositionLimitResponse getSwapCrossLeverPositionLimit(SwapCrossLeverPositionLimitRequest request);
}
