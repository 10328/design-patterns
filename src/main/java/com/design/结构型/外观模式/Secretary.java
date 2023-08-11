package com.design.结构型.外观模式;

/**
 * @Classname Secretay
 * @Description 助理
 * @Date 2021/4/28 0:58
 */
public class Secretary {
    private Airport airport = new Airport();
    private Hotel hotel = new Hotel();

    private Chauffeur chauffeur = new Chauffeur();
    private Restaurant restaurant = new Restaurant();

    //安排出差
    void trip(String to, int num) {
        airport.bookTicket("北京", to);
        chauffeur.drive("机场");
        hotel.reserve(num);
    }

    // 安排饭局
    void repast(int num) {
        restaurant.reserve(num);
        hotel.reserve(num);
    }


}
