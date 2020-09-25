package com.huobi.wss.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class MarketTradeDetailReqResponse {

    private Long id;
    private String rep;
    private String status;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {

        private BigDecimal amount;
        private Long ts;
        private Long id;
        private BigDecimal price;
        private String direction;

    }
}
