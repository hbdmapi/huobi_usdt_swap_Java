package com.huobi.linear.swap.wss;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.huobi.wss.handle.WssNotificationHandle;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URISyntaxException;
import java.util.List;


/**
 * 注意：
 * 当更换域名时，需要去：WssNotificationHandle 类里面将 addAuth() 方法里的域名一起更换掉。
 * as.createSignature(accessKey, secretKey, "GET", "api.hbdm.com", "/linear-swap-notification", map);
 */
public class WssNotificationSubTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private String URL = "wss://api.hbdm.com/linear-swap-notification";//订单推送访问地址
    WssNotificationHandle wssNotificationHandle = new WssNotificationHandle(URL, "", "");

    @Test
    public void test1() throws URISyntaxException, InterruptedException {
        List<String> channels = Lists.newArrayList();
        channels.add("orders.BTC-USDT");
        channels.add("positions.BTC-USDT");
        channels.add("accounts.BTC-USDT");
        channels.add("matchOrders.BTC-USDT");
        wssNotificationHandle.sub(channels, response -> {
            logger.info("用户收到的数据===============:{}", JSON.toJSON(response));
        });
        Thread.sleep(Integer.MAX_VALUE);
    }


}
