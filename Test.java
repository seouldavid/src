import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B550928/searchLtcInsttService01/getBillGreentInsttSearchList01"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=72gt8S2yq/TXc4UYoNELwAop4QWJgpfg1Wnu3DA/pa5EqC0FcTQEkAXkCU+hBHcK/PMtdu15dNVi6QF9KrcAdw=="); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("siDoCd","UTF-8") + "=" + URLEncoder.encode("44", "UTF-8")); /*공통항목 법정동 코드 설명 참조*/
        urlBuilder.append("&" + URLEncoder.encode("siGunGuCd","UTF-8") + "=" + URLEncoder.encode("230", "UTF-8")); /*공통항목 법정동 코드 설명 참조*/
        urlBuilder.append("&" + URLEncoder.encode("serviceKind","UTF-8") + "=" + URLEncoder.encode("001", "UTF-8")); /*청구그린기관 급여종별 코드 정의*/
        urlBuilder.append("&" + URLEncoder.encode("adminNm","UTF-8") + "=" + URLEncoder.encode("효사랑노인복지센터", "UTF-8")); /*장기요양기관이름*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}