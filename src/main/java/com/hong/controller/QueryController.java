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
		//����һ��WeatherWS����
        WeatherWS factory = new WeatherWS();
        //���ݹ�������һ��WeatherWSSoap����
        WeatherWSSoap weatherWSSoap = factory.getWeatherWSSoap();
        //����WebService�ṩ��getWeather������ȡplace�е�����Ԥ�����
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
		//����һ��MobileCodeWS����
        MobileCodeWS factory = new MobileCodeWS();
        //���ݹ�������һ��MobileCodeWSSoap����
        MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();
        ////����WebService�ṩ��getMobileCodeInfo������ѯ�ֻ�����Ĺ�����
        String searchResult = mobileCodeWSSoap.getMobileCodeInfo(phone, null);
        System.out.println(searchResult);
		model.addAttribute("phone", phone);
		model.addAttribute("searchResult", searchResult);
		return "phone";
	}
	@RequestMapping("/word")
	public String queryEngChin(String word, Model model) {
		System.out.println("word:"+word);
		//����һ��EnglishChinese����
		EnglishChinese factory = new EnglishChinese();
        //���ݹ�������һ��EnglishChineseSoap����
		EnglishChineseSoap englishCodeWSSoap = factory.getEnglishChineseSoap();
		
        ////����WebService�ṩ��translatorString�������з���
        ArrayOfString searchResult = englishCodeWSSoap.translatorString(word);
        List<String> result = searchResult.getString();
        //��������Ԥ����Ϣ
		model.addAttribute("word", word);
		model.addAttribute("result", result);
		return "word";
	}
}
