package com.company;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * в данной работе будут рассмотрены примеры использования метода GET
 * двумя разными способами
 * 1. реализация GET запроса стандартными средствами java;
 * 2. реализация GET запроса с использованием библиотеки apache http.
 * Все необходимые зависимости уже добавлены. (pom.xml, раздел dependencies)
 * */
public class HttpGetExample {

    //TODO: необходимо разработать класс, имеющий два статичных метода.
    // Первый из которых осуществляет get запрос стандартными стредствами языка,
    // а второй с использование сторонней библиотеки apache.
    // Ссылка для запросов:  http://httpbin.org/get

    //TODO: проиициализируйте константу URL, которая будет использоваться для отправки запросов
    private final static String URL = "";
    private final static String DEFAULT_METHOD_CALL = "ВЫЗОВ МЕТОДА, НАПИСАННОГО С ИСПОЛЬЗОВАНИЕМ СТАНДАРТНЫХ КЛАССОВ";
    private final static String APACHE_METHOD_CALL = "ВЫЗОВ МЕТОДА, НАПИСАННОГО С ИСПОЛЬЗОВАНИЕМ APACHE";
    private final static String REQUEST_METHOD = "GET";

    public static void main(String[] args) {
        // write your code here
        getRequestUsingJava_net();
        getRequestWithApacheLibrary();

    }

    //TODO: разработайте метод, который осуществляет get запрос встроенными средствами языка
    private static void getRequestUsingJava_net() {
        System.out.println(DEFAULT_METHOD_CALL + "\n");
        try {
            //TODO: создайте экземпляр класса URL используя ранее определенную константу URL
            //URL url = ;

            //TODO: создайте экземпляр класса HttpURLConnection, используя метод openConnection() класса URL
            // на ранее созданом объекте url
            // (!!! возвращаемое значение необходимо привести к типу HttpURLConnection !!!)
            //HttpURLConnection connection = ;

            //TODO: используя метод setRequestMethod(), установите метод запроса у объекта connection
            //connection./*МЕТОД УСТАНОВКИ МЕТОДА ЗАПРОСА*/;

            //TODO: используя метод getInputStream() из HttpURLConnection
            // создайте объект InputStream,
            // после чего на его основе создайте объект InputStreamReader
            // и конвертируйте его в BufferedReader
            //InputStream inputStream = ;
            //InputStreamReader inputStreamReader = ;
            //BufferedReader bufferedReader = ;

            //TODO: подготовьте строку и StringBuilder с помощью которых будете считывать ответ
            // (для этого раскоментируйте строки ниже)
            //String line;
            //StringBuilder response = new StringBuilder();

            //TODO: используя методы BufferedReadep.readLine() и StringBuilder.append()
            // считайте содержимое ответа
            //while (/*УСЛОВИЕ ВЫХОДА ИЗ ЦИКЛА -> bufferedReader.readLine = null*/) {
            //    //TODO: иплементируйте алгоритм считывания здесь
            //}

            /*
            * так как ответ приходит в виде json, целесообразно будет
            * использовать библиотеку для работы с ним, данная библиотека
            * уже добавлена в зависимостях в pom.xml
            * */

            //TODO: создайте экземпляр JSONObject, в качестве параметра
            // используйте полученную ранее строку
            //JSONObject jsonObject = new JSONObject(response.toString());

            //TODO: используя метод get(String property_name) из класса JSONObject
            // попробуйте получить значения таких полей как: origin и uri
            //System.out.println(jsonObject.get(""));
            //System.out.println(jsonObject.get(""));


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO:
    private static void getRequestWithApacheLibrary() {
        System.out.println(APACHE_METHOD_CALL + "\n");
        try {

            //TODO: используя метод createDefault() класса HttpClients
            // создайте экземпляр CloseableHttpClient
            //CloseableHttpClient client = ;

            //TODO: создайте get-запрос, который будет представлен
            // экземпляром класса HttpGet, в качестве параметра используйте константу URL
            //HttpGet request = ;

            //TODO: используя метод execute() (англ. выполнить) на объекте client,
            // созданном ранее, передав в него объект request,
            // создайте экземпляр CloseableHttpResponse,
            // который будет хранить в себе ответ от сервера
            //CloseableHttpResponse response = client./*МЕТОД "ВЫПОЛНИТЬ"*/(/*ЗАПРОС*/);

            //TODO: получите объект класса HttpEntity,
            // использовав соответствующий getter на объекте response
            // этот объект будет хранить в себе содержимое ответа
            //HttpEntity entity = ;

            /*
            * библиотека apache имеет класс EntityUtils,
            * который содержит большое колличество готовых
            * методов, которые призваны облегчить жизнь,
            * и без того, несчастному разработчику.
            * Вызов этих методов осуществляется следующим образом:
            * EntityUtils.ИМЯ_МЕТОДА()
            * */
            //TODO: воспользуйтесь методом toString(),
            // передав в качестве параметра объект entity.
            // осознайте на сколько это прощще чем в прошлом примере.
            //String entityAsString = /*=ВЫЗОВ МЕТОДА toString()*/;

            /*
            * дополнительное задание, реализуйте аналогичный
            * функционал с помощью цепочки вызовов
            * P.S. цепочка вызовов подразумевает, что когда метод возвращает значение,
            * оно не присваивается к переменной,
            * при этом по отношению к этому значению вызывается следующий метод
            * например 1_method().2_method().3_method)
            * */

            //TODO: возьмите код выше за основу и постарайтесь записать его
            // как можно лаконичнее, используя цепочку вызовов
            // P.S. начните с EntityUtils.toString(ЦЕПОЧКА ВЫЗОВОВ)
            System.out.println("МИНИМИЗИРОВАННЫЙ ВАРИАНТ" + "\n");
            System.out.println(/*ВАША ЦЕПОЧКА ВЫЗОВОВ*/);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
