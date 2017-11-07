package com.kreasihebatindonesia.remboeg.globals;

/**
 * Created by IT DCM on 06/11/2017.
 */

public class Const {
    public static final String HOST_ADDRESS = "http://192.168.0.126/event";

    public static final String METHOD_CITY = HOST_ADDRESS + "/api/location";
    public static final String METHOD_CITY_GPS = HOST_ADDRESS + "/api/location/gps";

    public static final String METHOD_SEARCH = HOST_ADDRESS + "/api/search";

    //EVENT
    public static final String METHOD_EVENT_ACTIVE = HOST_ADDRESS + "/api/events/active";
    public static final String METHOD_EVENT_INACTIVE = HOST_ADDRESS + "/api/events/inactive";
    public static final String METHOD_EVENT_DETAIL_ACTIVE = HOST_ADDRESS + "/api/events/active/id";
    public static final String METHOD_EVENT_DETAIL_INACTIVE = HOST_ADDRESS + "/api/events/inactive/id";
    public static final String METHOD_EVENT_SET_VIEW = HOST_ADDRESS + "/api/events/view/id";

    //JOB
    public static final String METHOD_JOB_ACTIVE = HOST_ADDRESS + "/api/jobs/active";
    public static final String METHOD_JOB_DETAIL_ACTIVE = HOST_ADDRESS + "/api/jobs/active/id";
    public static final String METHOD_JOB_DETAIL_INACTIVE = HOST_ADDRESS + "/api/jobs/inactive/id";

    public static final String METHOD_PROMO = HOST_ADDRESS + "/api/promo";

    public static final String URL_UPLOADS = HOST_ADDRESS + "/uploads";


    public static final int DUMMY_USER_ID = 1;
}