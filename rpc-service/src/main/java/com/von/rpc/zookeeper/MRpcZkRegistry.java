package com.von.rpc.zookeeper;

import com.von.rpc.AbstractMRpcRegistry;
import com.von.rpc.config.MRpcZkRegistryConfig;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 15:40
 */
public class MRpcZkRegistry extends AbstractMRpcRegistry {

    private MRpcZkRegistryConfig registryConfig;
    private MRpcZkClient mRpcZkClient;

    public MRpcZkRegistry(MRpcZkRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        this.mRpcZkClient = new MRpcZkClient(registryConfig.getRegistryAddress(), registryConfig.getRegistryPort());
    }

    @Override
    public String registry() {
        return mRpcZkClient.create(registryConfig.getRegistryProtocol() + "/" + registryConfig.getRegistryData(), false);
    }

    public MRpcZkClient getmRpcZkClient() {
        return mRpcZkClient;
    }

    public void setmRpcZkClient(MRpcZkClient mRpcZkClient) {
        this.mRpcZkClient = mRpcZkClient;
    }

    public MRpcZkRegistryConfig getRegistryConfig() {
        return registryConfig;
    }

    public void setRegistryConfig(MRpcZkRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
    }
}
