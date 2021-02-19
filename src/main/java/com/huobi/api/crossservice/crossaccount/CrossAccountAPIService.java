package com.huobi.api.crossservice.crossaccount;


import com.huobi.api.crossrequest.trade.SwapCrossUserSettlementRecordsRequest;
import com.huobi.api.crossresponse.account.*;
import com.huobi.api.response.account.SwapSubAccountInfoListResponse;

public interface CrossAccountAPIService {

    SwapCrossAccountInfoResponse getSwapCrossAccountInfo(String marginAccount);//获取用户账户信息（全仓模式）

    SwapCrossPositionInfoResponse getSwapCrossPositionInfo(String contractCode);//获取用户持仓信息（全仓模式）

    SwapCrossAccountPositionInfoResponse getSwapCrossAccountPositionInfo(String marginAccount);//查询用户账户和持仓信息（全仓模式）

    SwapCrossSubAccountListResponse getSwapCrossSubAccountList(String marginAccount);//查询母账户下所有子账户资产信息（全仓模式）

    SwapCrossSubAccountInfoResponse getSwapCrossSubAccountInfo(String marginAccount, Long subUid);//查询单个子账户资产信息（全仓模式）

    SwapCrossSubPositionInfoResponse getSwapCrossSubPositionInfo(String contractCode, Long subUid);//查询单个子账户持仓信息（全仓模式）

    SwapCrossTransferLimitResponse getSwapCrossTransferLimitResponse(String marginAccount);//查询用户当前的划转限制（全仓模式）

    SwapCrossPositionLimitResponse getSwapCrossPositionLimitResponse(String contractCode);//用户持仓量限制的查询（全仓模式）

    SwapCrossAvailableLevelRateResponse getSwapCrossAvailableLevelRate(String contractCode);//查询当前可能杠杆倍数（全仓模式）

    SwapCrossUserSettlementRecordsResponse getSwapCrossUserSettlementRecords(SwapCrossUserSettlementRecordsRequest request);//查询用户结算记录（全仓模式）

    SwapSubAccountInfoListResponse getSwapCrossSubAccountInfoList(String marginAccount, Integer pageIndex, Integer pagesize);//批量获取子账户资产信息（全仓模式）

}
