package com.hong.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

@Controller("queryController")
@RequestMapping("/Query")
public class QueryController {

	@RequestMapping("/weather")
	public String queryWeather(String place, Model model) {
		System.out.println("place:"+place);
		//创建一个WeatherWS工厂
        WeatherWS factory = new WeatherWS();
        //根据工厂创建一个WeatherWSSoap对象
        WeatherWSSoap weatherWSSoap = factory.getWeatherWSSoap();
        //调用WebService提供的getWeather方法获取place市的天气预报情况
        ArrayOfString weatherInfo = weatherWSSoap.getWeather(place, null);
        System.out.println("weatherInfo"+weatherInfo);
        List<String> lstWeatherInfo = weatherInfo.getString();
        System.out.println("lstWeatherInfo:"+lstWeatherInfo);
        model.addAttribute("lstWeatherInfo", lstWeatherInfo);
		return "weather";
	}
	@RequestMapping("/phone")
	public String queryPhone(String phone, Model model) {
		System.out.println("phone:"+phone);
		//创建一个MobileCodeWS工厂
        MobileCodeWS factory = new MobileCodeWS();
        //根据工厂创建一个MobileCodeWSSoap对象
        MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();
        ////调用WebService提供的getMobileCodeInfo方法查询手机号码的归属地
        String searchResult = mobileCodeWSSoap.getMobileCodeInfo(phone, null);
        System.out.println(searchResult);
		model.addAttribute("phone", phone);
		model.addAttribute("searchResult", searchResult);
		return "phone";
	}
	@RequestMapping("/word")
	public String queryEngChin(String word, Model model) {
		System.out.println("word:"+word);
		//创建一个EnglishChinese工厂
		EnglishChinese factory = new EnglishChinese();
        //根据工厂创建一个EnglishChineseSoap对象
		EnglishChineseSoap englishCodeWSSoap = factory.getEnglishChineseSoap();
		
        ////调用WebService提供的translatorString方法进行翻译
        ArrayOfString searchResult = englishCodeWSSoap.translatorString(word);
        List<String> result = searchResult.getString();
        //遍历天气预报信息
		model.addAttribute("word", word);
		model.addAttribute("result", result);
		return "word";
	}
}
