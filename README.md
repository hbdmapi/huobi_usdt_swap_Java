# **Installation**

  1.Install library into your Maven's local repository by running mvn install
  
  2.Add the following Maven dependency to your project's pom.xml:
  
    <dependency>
         <groupId>com.huobi.linear.swap.api</groupId>
         <artifactId>huobi-linear-swap-api</artifactId>
         <version>1.0.0</version>
    </dependency>
    
  3.Install Lombok Plugin  
    
    
    

# **Examples**  

  接口分为三大类：
  
     1.合约市场行情接口   --测试类放在包com.huobi.linear.swap.api.MarketAPITest 下
     2.合约资产接口      --测试类放在包com.huobi.linear.swap.api.AccountAPITest 下
     3.合约交易接口      --测试类放在包com.huobi.linear.swap.api.TradeAPITest 下
     
     
     
  调用举例：
  
  1.获取合约信息  
    
    测试类是com.huobi.linear.swap.api.MarketAPITest类的getSwapContractInfo()方法
    HuobiAPIServiceImpl huobiAPIService = new HuobiAPIServiceImpl("", "");
    @Test
    public void getSwapContractInfo() {
        SwapContractInfoResponse result =
                huobiAPIService.getSwapContractInfo("BTC-USDT");
        logger.debug("1.获取合约信息：{}", JSON.toJSONString(result));
    }
    
    
    
  2.获取用户账户信息   
    
    测试类是com.huobi.linear.swap.api.AccountAPITest类的getSwapAccountInfoResponse()方法 
    //填写申请的API-KEY 和 SECRET
    HuobiAPIServiceImpl huobiAPIService = new HuobiAPIServiceImpl("API-KEY", "SECRET");
    @Test
    public void getSwapAccountInfoResponse() {
        SwapAccountInfoResponse response = huobiAPIService.getSwapAccountInfo("btc-usdt");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
        response = huobiAPIService.getSwapAccountInfo("");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
    }
    
  3.USDT永续下单
    
    测试类是com.huobi.linear.swap.api.TradeAPITest类的swapOrderRequest()方法
    //填写申请的API-KEY 和 SECRET   
    HuobiAPIServiceImpl huobiAPIService = new HuobiAPIServiceImpl("API-KEY", "SECRET");
    @Test
    public void swapOrderRequest() {
        SwapOrderRequest request = SwapOrderRequest.builder()
                .contractCode("BTC-USDT")
                .volume(100l)
                .price(BigDecimal.valueOf(10121))
                .direction(DirectionEnum.SELL)
                .offset(OffsetEnum.OPEN)
                .leverRate(5)
                .orderPriceType("opponent")
                .build();
        SwapOrderResponse response =
                huobiAPIService.swapOrderRequest(request);
        logger.debug("1合约下单：{}", JSON.toJSONString(response));
    }
     
     
     
      

  
  
    