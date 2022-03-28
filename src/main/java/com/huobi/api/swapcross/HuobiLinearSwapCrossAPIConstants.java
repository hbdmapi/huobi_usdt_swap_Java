package com.huobi.api.swapcross;

public class HuobiLinearSwapCrossAPIConstants {

    //合约市场行情接口
    public static final String SWAP_CROSS_ADJUSTFACTOR = "/linear-swap-api/v1/swap_cross_adjustfactor";  // 1.(全仓模式)
    public static final String SWAP_CROSS_TRANSFER_STATE = "/linear-swap-api/v1/swap_cross_transfer_state";  // 2.(全仓模式)
    public static final String SWAP_CROSS_TRADE_STATE = "/linear-swap-api/v1/swap_cross_trade_state";  // 3.(全仓模式)
    public static final String SWAP_CROSS_LADDER_MARGIN = "/linear-swap-api/v1/swap_cross_ladder_margin";  // 4.(全仓模式)

    //合约资产接口
    public static final String SWAP_CROSS_ACCOUNT_INFO = "/linear-swap-api/v1/swap_cross_account_info"; // 1.获取用户账户信息(全仓模式)
    public static final String SWAP_CROSS_POSITION_INFO = "/linear-swap-api/v1/swap_cross_position_info"; // 2.获取用户持仓信息(全仓模式)
    public static final String SWAP_CROSS_SUB_ACCOUNT_LIST = "/linear-swap-api/v1/swap_cross_sub_account_list"; // 3.查询母账户下所有子账户资产信息(全仓模式)
    public static final String SWAP_CROSS_SUB_ACCOUNT_INFO = "/linear-swap-api/v1/swap_cross_sub_account_info"; // 4.查询单个子账户资产信息(全仓模式)
    public static final String SWAP_CROSS_SUB_POSITION_INFO = "/linear-swap-api/v1/swap_cross_sub_position_info"; // 5.查询单个子账户持仓信息(全仓模式)

    public static final String SWAP_CROSS_ACCOUNT_POSITION_INFO = "/linear-swap-api/v1/swap_cross_account_position_info";//6.获取用户资产和持仓信息(全仓模式)
    public static final String SWAP_CROSS_AVAILABLE_LEVEL_RATE = "/linear-swap-api/v1/swap_cross_available_level_rate";//7.查询用户可用杠杆倍数(全仓模式)
    public static final String SWAP_CROSS_TRANSFER_LIMIT = "/linear-swap-api/v1/swap_cross_transfer_limit"; // 8.查询用户当前的划转限制(全仓模式)
    public static final String SWAP_CROSS_POSITION_LIMIT = "/linear-swap-api/v1/swap_cross_position_limit"; // 9.用户持仓量限制的查询(全仓模式)
    public static final String SWAP_CROSS_USER_SETTLEMENT_RECORDS = "/linear-swap-api/v1/swap_cross_user_settlement_records";  // 10.查询用户结算记录(全仓模式)

    public static final String SWAP_CROSS_SUB_ACCOUNT_INFO_LIST = "/linear-swap-api/v1/swap_cross_sub_account_info_list";  // 11.批量获取子账户资产信息(全仓模式)
    public static final String SWAP_CROSS_LEVER_POSITION_LIMIT="/linear-swap-api/v1/swap_cross_lever_position_limit";//12.查询用户所有杠杆持仓量限制

    //合约交易接口
    public static final String SWAP_CROSS_ORDER = "/linear-swap-api/v1/swap_cross_order"; // 1.合约下单(全仓模式)
    public static final String SWAP_CROSS_BATCHORDER = "/linear-swap-api/v1/swap_cross_batchorder"; // 2.合约批量下单(全仓模式)
    public static final String SWAP_CROSS_CANCEL = "/linear-swap-api/v1/swap_cross_cancel"; // 3.撤销订单(全仓模式)
    public static final String SWAP_CROSS_CANCELALL = "/linear-swap-api/v1/swap_cross_cancelall"; // 4.全部撤单(全仓模式)
    public static final String SWAP_CROSS_ORDER_INFO = "/linear-swap-api/v1/swap_cross_order_info"; // 5.获取合约订单信息(全仓模式)

    public static final String SWAP_CROSS_ORDER_DETAIL = "/linear-swap-api/v1/swap_cross_order_detail"; // 6.获取订单明细信息(全仓模式)
    public static final String SWAP_CROSS_OPENORDERS = "/linear-swap-api/v1/swap_cross_openorders"; // 7.获取合约当前未成交委托(全仓模式)
    public static final String SWAP_CROSS_HISORDERS = "/linear-swap-api/v1/swap_cross_hisorders"; // 8.获取合约历史委托(全仓模式)
    public static final String SWAP_CROSS_MATCHRESULTS = "/linear-swap-api/v1/swap_cross_matchresults"; // 9.获取历史成交记录(全仓模式)
    public static final String SWAP_CROSS_LIGHTNING_CLOSE_POSITION = "/linear-swap-api/v1/swap_cross_lightning_close_position"; // 10.闪电平仓下单(全仓模式)

    public static final String SWAP_CROSS_TRIGGER_ORDER = "/linear-swap-api/v1/swap_cross_trigger_order"; //11、计划委托下单(全仓模式)
    public static final String SWAP_CROSS_TRIGGER_CANCEL = "/linear-swap-api/v1/swap_cross_trigger_cancel";//12、计划委托撤单(全仓模式)
    public static final String SWAP_CROSS_TRIGGER_CANCELALL = "/linear-swap-api/v1/swap_cross_trigger_cancelall";//13、计划委托全部撤单(全仓模式)
    public static final String SWAP_CROSS_TRIGGER_OPENORDERS = "/linear-swap-api/v1/swap_cross_trigger_openorders";//14、获取计划委托当前委托(全仓模式)
    public static final String SWAP_CROSS_TRIGGER_HISORDERS = "/linear-swap-api/v1/swap_cross_trigger_hisorders";//15、获取计划委托历史委托(全仓模式)

    public static final String SWAP_CROSS_SWITCH_LEVER_RATE = "/linear-swap-api/v1/swap_cross_switch_lever_rate";//16、切换杠杆(全仓模式)
    public static final String SWAP_CROSS_TPSL_ORDER = "/linear-swap-api/v1/swap_cross_tpsl_order";//对仓位设置止盈止损订单
    public static final String SWAP_CROSS_TPSL_CANCEL = "/linear-swap-api/v1/swap_cross_tpsl_cancel";//止盈止损订单撤单
    public static final String SWAP_CROSS_TPSL_CANCELALL = "/linear-swap-api/v1/swap_cross_tpsl_cancelall";//止盈止损订单全部撤单
    public static final String SWAP_CROSS_TPSL_OPENORDERS = "/linear-swap-api/v1/swap_cross_tpsl_openorders";//查询止盈止损订单当前委托

    public static final String SWAP_CROSS_TPSL_HISORDERS = "/linear-swap-api/v1/swap_cross_tpsl_hisorders";//查询止盈止损订单历史委托
    public static final String SWAP_CROSS_RELATION_TPSL_ORDER = "/linear-swap-api/v1/swap_cross_relation_tpsl_order";//查询开仓单关联的止盈止损订单详情
    public static final String SWAP_CROSS_HISORDERS_EXACT = "/linear-swap-api/v1/swap_cross_hisorders_exact";  // 组合查询合约历史委托(全仓模式)
    public static final String SWAP_CROSS_MATCHRESULTS_EXACT = "/linear-swap-api/v1/swap_cross_matchresults_exact";  // 组合查询用户历史成交记录(全仓模式)
    public static final String SWAP_CROSS_TRACK_ORDER = "/linear-swap-api/v1/swap_cross_track_order"; // 跟踪委托订单下单

    public static final String SWAP_CROSS_TRACK_CANCEL= "/linear-swap-api/v1/swap_cross_track_cancel"; // 跟踪委托订单撤单
    public static final String SWAP_CROSS_TRACK_CANCELALL = "/linear-swap-api/v1/swap_cross_track_cancelall"; // 跟踪委托订单全部撤单
    public static final String SWAP_CROSS_TRACK_OPENORDERS = "/linear-swap-api/v1/swap_cross_track_openorders"; // 跟踪委托订单当前委托
    public static final String SWAP_CROSS_TRACK_HISORDERS = "/linear-swap-api/v1/swap_cross_track_hisorders"; // 跟踪委托订单历史委托
    public static final String SWAP_CROSS_SWITCH_POSITION_MODE="/linear-swap-api/v1/swap_cross_switch_position_mode";//切换持仓模式
}
