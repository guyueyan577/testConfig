package com.zxycloud.autoConfig.db.bizConfig.extend;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.scheduling.annotation.EnableScheduling;

import com.alibaba.fastjson.JSONObject;

import io.shardingsphere.api.algorithm.masterslave.MasterSlaveLoadBalanceAlgorithm;
import lombok.extern.slf4j.Slf4j;


@EnableScheduling
@Slf4j
public final class RoundRobinMasterSlaveForFailOverLoadBalanceAlgorithm implements MasterSlaveLoadBalanceAlgorithm {
    
    private static final ConcurrentHashMap<String, AtomicInteger> COUNT_MAP = new ConcurrentHashMap<>();
    
    private List<String> slaveDataSourceNames = null;
    
    @Override
    public String getDataSource(final String name, final String masterDataSourceName, final List<String> slaveDataSourceNames) {
        AtomicInteger count = COUNT_MAP.containsKey(name) ? COUNT_MAP.get(name) : new AtomicInteger(0);
        COUNT_MAP.putIfAbsent(name, count);
        if(this.slaveDataSourceNames==null)
        	this.slaveDataSourceNames = slaveDataSourceNames;
        count.compareAndSet(this.slaveDataSourceNames.size(), 0);
        System.out.println(JSONObject.toJSONString(this.slaveDataSourceNames));
        int  _count = Math.abs(count.getAndIncrement());
        String selectSlaveDataSourceName = this.slaveDataSourceNames.get(_count % this.slaveDataSourceNames.size());
        log.info("slaves:"+JSONObject.toJSONString(this.slaveDataSourceNames) + "------select SlaveDataSource is : " + selectSlaveDataSourceName);
        return selectSlaveDataSourceName;
    }
    
	/**
	 * @param slaveDataSourceNames the slaveDataSourceNames to set
	 */
	public void setSlaveDataSourceNames(List<String> slaveDataSourceNames) {
		this.slaveDataSourceNames = slaveDataSourceNames;
	}
    
    
    
}
