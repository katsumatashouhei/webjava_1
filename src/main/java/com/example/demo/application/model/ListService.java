package com.example.demo.application.model;

import java.util.HashMap;
import java.util.Map;

public class ListService {

  private int itemId;

  private Item item;

  public Map getItemList() {

    //キーint, Item型のオブジェクトを格納するMapを作成
    Map<Integer, Item> shopList = new HashMap<>();
    
    itemId = item.getItemId();
    item = new Item();
    
    
    //値を追加
    shopList.put(itemId, item);

    return null;
  }
}
