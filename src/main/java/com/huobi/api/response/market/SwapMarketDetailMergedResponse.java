package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapMarketDetailMergedResponse {

    /**
     * "ch":"market.BTC-USDT.detail.merged",
     * "status":"ok",
     * "tick":{"amount":"0.16","ask":[10329.11,26],"bid":[10328.993,814],"close":"10329.11","count":6,"high":"10329.11","id":1601018901,"low":"10329.11","open":"10329.11","trade_turnover":"1652.65526","ts":1601018902224,"vol":"16"},
     * "ts":1601018902224
     */

    private String ch;
    private String status;
    private List<TickBean> tick;
    private Long ts;

    public static class TickBean {
        /**
         * "amount":"0.16",
         * "ask":[
         * 10329.11,
         * 26
         * ],
         * "bid":[
         * 10328.993,
         * 814
         * ],
         * "close":"10329.11",
         * "count":6,
         * "high":"10329.11",
         * "id":1601018901,
         * "low":"10329.11",
         * "open":"10329.11",
         * "trade_turnover":"1652.65526",
         * "ts":1601018902224,
         * "vol":"16"
         */

        private String amount;
        private String close;
        private Integer count;
        private String high;
        private Integer id;
        private String low;
        private String open;
        private Long ts;
        private String vol;
        private List ask;
        private List bid;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;

        public String getAmount() {
            return amount;
        }

        public String getClose() {
            return close;
        }

        public Integer getCount() {
            return count;
        }

        public String getHigh() {
            return high;
        }

        public Integer getId() {
            return id;
        }

        public String getLow() {
            return low;
        }

        public String getOpen() {
            return open;
        }

        public Long getTs() {
            return ts;
        }

        public String getVol() {
            return vol;
        }

        public List getAsk() {
            return ask;
        }

        public List getBid() {
            return bid;
        }

        public BigDecimal getTradeTurnover() {
            return tradeTurnover;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public void setClose(String close) {
            this.close = close;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public void setOpen(String open) {
            this.open = open;
        }

        public void setTs(Long ts) {
            this.ts = ts;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public void setAsk(List ask) {
            if (ask!=null) {
                this.ask = ask;
            }
        }

        public void setBid(List bid) {
            if (bid!=null) {
                this.bid = bid;
            }
        }

        public void setTradeTurnover(BigDecimal tradeTurnover) {
            this.tradeTurnover = tradeTurnover;
        }

    }
}
