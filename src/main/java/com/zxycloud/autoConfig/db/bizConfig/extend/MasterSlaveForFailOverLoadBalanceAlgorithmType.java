package com.zxycloud.autoConfig.db.bizConfig.extend;

import io.shardingsphere.api.algorithm.masterslave.MasterSlaveLoadBalanceAlgorithm;
import io.shardingsphere.api.algorithm.masterslave.RandomMasterSlaveLoadBalanceAlgorithm;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MasterSlaveForFailOverLoadBalanceAlgorithmType {
	  ROUND_ROBIN(new RoundRobinMasterSlaveForFailOverLoadBalanceAlgorithm()),
	    RANDOM(new RandomMasterSlaveLoadBalanceAlgorithm());
	    
	    private final MasterSlaveLoadBalanceAlgorithm algorithm;
	    
	    /**
	     * Get default master-slave database load-balance algorithm type.
	     * 
	     * @return default master-slave database load-balance algorithm type
	     */
	    public static MasterSlaveForFailOverLoadBalanceAlgorithmType getDefaultAlgorithmType() {
	        return ROUND_ROBIN;
	    }
}
