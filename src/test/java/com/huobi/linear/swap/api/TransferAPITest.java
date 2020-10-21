package com.huobi.linear.swap.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.request.transfer.UsdtSwapTransferRequest;
import com.huobi.api.response.transfer.UsdtSwapTransferResponse;
import com.huobi.api.service.transfer.TransferApiServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;

/**
 * 现货-USDT永续划转接口
 */
@FixMethodOrder(MethodSorters.JVM)
public class TransferAPITest implements BaseTest {


    TransferApiServiceImpl transferApiService = new TransferApiServiceImpl("", "");

    @Test
    public void transfer() {
        /**
         * 参数名称	            是否必须	类型	    描述	                                                    取值范围
         * from	                true	string	来源业务线账户，取值：spot(币币)、linear-swap(正向永续合约)	e.g. spot
         * to	                true	string	目标业务线账户，取值：spot(币币)、linear-swap(正向永续合约)	e.g. linear-swap
         * currency	            true	string	币种,支持大小写	                                        e.g. usdt
         * amount	            true	decimal	划转金额
         * margin_account	    true	string	保证金账户	                                            e.g. btc-usdt、eth-usdt
         */

        UsdtSwapTransferRequest request = UsdtSwapTransferRequest.builder()
                .from("spot")
                .to("linear-swap")
                .margin_account("btc-usdt")
                .currency("usdt")
                .amount(BigDecimal.valueOf(1))
                .build();
        UsdtSwapTransferResponse response = transferApiService.transfer(request);
        logger.debug("1.现货-USDT本位永续账户间进行资金的划转：{}", JSON.toJSONString(response));


    }


}
