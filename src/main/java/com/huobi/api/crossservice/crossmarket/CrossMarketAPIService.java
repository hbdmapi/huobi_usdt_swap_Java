package com.huobi.api.crossservice.crossmarket;

import com.huobi.api.crossresponse.market.SwapCrossAdjustfactorResponse;
import com.huobi.api.crossresponse.market.SwapCrossTradeStateResponse;
import com.huobi.api.crossresponse.market.SwapCrossTransferStateResponse;
import com.huobi.api.response.market.SwapLadderMarginResponse;

public interface CrossMarketAPIService {
    SwapCrossAdjustfactorResponse getSwapCrossAdjustfactor(String contractCode);//查询平台阶梯调整系数(全仓模式)

    SwapCrossTransferStateResponse getSwapCrossTransferState(String marginAccount);//查询系统划转权限（全仓模式）

    SwapCrossTradeStateResponse getSwapCrossTradeState(String contractCode);//查询系统交易权限（全仓模式）

    SwapLadderMarginResponse getSwapCrossLadderMargin(String contractCode);
}
