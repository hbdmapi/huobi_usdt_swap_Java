package com.huobi.wss.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class MarketTradeDetailSubResponse {


    private String ch;
    private Long ts;
    private TickBean tick;


    @Data
    @AllArgsConstructor
    public static class TickBean {

        private Long id;
        private Long ts;
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
}
