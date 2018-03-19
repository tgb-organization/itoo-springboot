package com.dmsdbj.itoo.facade;

public interface ItemFacade {

    //检查商品是否可售
    boolean checkItemStatus(String id);
}
