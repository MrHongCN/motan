package com.weibo.motan.demo.service;

import com.weibo.api.motan.protocol.yar.annotation.YarConfig;

import java.util.List;
import java.util.Map;

/**
 * @author Geiger Hong 2016/12/13 0013.
 */
@YarConfig(path = "/openapi/yarserver/test")
public interface YarService {

    public String hello(String name);

    public void testVoid();

    public String testArgVoid();

    public String testString(String arg);

    public int testInt(int i);

    public Integer testInteger(Integer integer);

    public boolean testBoolean(boolean b);

    public long testLong(long l);

    public float testFloat(Float f);

    public double testDouble(Double d);

    public List<Object> testList(List<Object> list);

    public Map<String, Object> testMap(Map<String, Object> map);


}
