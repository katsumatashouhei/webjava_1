package com.example.demo.application.model;

import java.util.HashMap;
import java.util.Map;

public class ListService {

  public Map getItemList() {

    //キーint, Item型のオブジェクトを格納するMapを作成
    Map<Integer, Item> shopList = new HashMap<>();

    Item item = new Item(1, "サボテン", 1000);

    //値を追加
    shopList.put(item.getItemId(), item);

    Item item2 = new Item(2, "ヨット", 100000);

    //値を追加
    shopList.put(item2.getItemId(), item2);

    Item item3 = new Item(3, "犬の絵", 1000);

    //値を追加
    shopList.put(item3.getItemId(), item3);

    Item item4 = new Item(4, "ギター", 8000);

    //値を追加
    shopList.put(item4.getItemId(), item4);
    //Mapを返す
    return shopList;
  }

}
