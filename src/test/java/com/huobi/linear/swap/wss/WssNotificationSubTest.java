package com.huobi.linear.swap.wss;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.huobi.wss.handle.WssNotificationHandle;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URISyntaxException;
import java.util.List;


public class WssNotificationSubTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private String host = "api.hbdm.vn";
    private String url = "/linear-swap-notification";
    WssNotificationHandle wssNotificationHandle = new WssNotificationHandle(host, url, "", "");

    @Test
    public void test1() throws URISyntaxException, InterruptedException {
        List<String> channels = Lists.newArrayList();
        //channels.add("orders.BTC-USDT");
        channels.add("positions.BTC-USDT");
        channels.add("accounts.BTC-USDT");
        //channels.add("matchOrders.BTC-USDT");
        //channels.add("orders_cross.BTC-USDT");
        channels.add("positions_cross.BTC-USDT");
        channels.add("accounts_cross.USDT");
        //channels.add("matchOrders_cross.BTC-USDT");
        wssNotificationHandle.sub(channels, response -> {
            logger.info("用户收到的数据===============:{}", JSON.toJSON(response));
        });
        Thread.sleep(Integer.MAX_VALUE);
    }


}
