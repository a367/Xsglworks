package com.fire.util;


import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author fly
 * 数据源切换工具类
 */

public class DateSourceUtils extends AbstractRoutingDataSource {

    private static final ThreadLocal<String> dataSourceKey =
            new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String type){

        dataSourceKey.set(type);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }

}