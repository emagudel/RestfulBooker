package com.certificacion.qa.api.request;

import com.certificacion.qa.api.data.Data;
import com.certificacion.qa.api.util.DTOBooking;

import java.util.Random;

import static com.certificacion.qa.api.data.Data.STANDARD_DATA_API;

public class Template {

    public static String getRequestMemberPost(){
        return "{\n" +
                "    \"name\": \"Eric X\",\n" +
                "    \"gender\": \"Male\"\n" +
                "}";
    }

    private static char randomChar() {
        Random r = new Random();
        return (char)(r.nextInt(26) + 'A');
    }

    public static String getRequestAuthCreateTokenPost(){
        Data data = STANDARD_DATA_API;
        return "{\n" +
                "    \"username\" : \""+data.getUsername()+"\",\n" +
                "    \"password\" : \""+data.getPassword()+"\"\n" +
                "}";
    }

    public static String getRequestAuthTokenFailedPost(){
        Data data = STANDARD_DATA_API;
        return "{\n" +
                "    \"username\" : \""+data.getUsername()+"\",\n" +
                "    \"password\" : \""+data.getPasswordFailed()+"\"\n" +
                "}";
    }

    public static String getRequestCreateBookingPost(DTOBooking dto){
        return "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
    }

    public static String getRequestUpdateBookingPost(DTOBooking dto){
        return "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2019-01-01\",\n" +
                "        \"checkout\" : \"2020-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
    }

    public static String getRequestPatchBooking(){
        return "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";
    }
}
