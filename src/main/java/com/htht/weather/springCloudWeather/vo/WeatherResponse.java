package com.htht.weather.springCloudWeather.vo;

import lombok.Data;

import java.io.Serializable;

/** weather Response
 * Created by wuqiw on 2018/6/19.
 */
@Data
public class WeatherResponse implements Serializable{
    private static final long serialVersionUID = 7947910107446932237L;
    private Weather data;
    private Integer status;
    private String desc;
}
