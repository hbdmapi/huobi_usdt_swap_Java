package com.huobi.linear.swap.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.crossresponse.market.SwapCrossAdjustfactorResponse;
import com.huobi.api.crossresponse.market.SwapCrossTradeStateResponse;
import com.huobi.api.crossresponse.market.SwapCrossTransferStateResponse;
import com.huobi.api.crossservice.crossmarket.CrossMarketAPIServiceImpl;
import com.huobi.api.response.market.SwapLadderMarginResponse;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class CrossMarketAPITest implements BaseTest {

    CrossMarketAPIServiceImpl huobiCrossAPIService = new CrossMarketAPIServiceImpl();

    @Test
    public void getSwapCrossAdjustfactor() {
        SwapCrossAdjustfactorResponse response = huobiCrossAPIService.getSwapCrossAdjustfactor("btc-usdt","","","","");
        logger.debug("1.查询平台阶梯调整系数:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossTransferState() {
        SwapCrossTransferStateResponse response = huobiCrossAPIService.getSwapCrossTransferState("");
        logger.debug("2.查询系统划转权限:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossTradeState() {
        SwapCrossTradeStateResponse response = huobiCrossAPIService.getSwapCrossTradeState("btc-usdt-220325","","","all","");
        logger.debug("3.查询系统交易权限:{}", JSON.toJSONString(response));
    }

    @Test
    public void getSwapCrossLadderMargin() {
        SwapLadderMarginResponse response = huobiCrossAPIService.getSwapCrossLadderMargin("","","","","");
        logger.debug("4.获取平台阶梯保证金:{}", JSON.toJSONString(response));
    }
}
