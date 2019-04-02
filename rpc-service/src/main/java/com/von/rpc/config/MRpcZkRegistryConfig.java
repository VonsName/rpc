package com.von.rpc.config;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 16:35
 */
public class MRpcZkRegistryConfig {

    /**
     * 注册服务器：localhost
     */
    private String registryAddress;
    /**
     * 注册端口
     */
    private Integer registryPort;

    /**
     * 向zk保存的数据 即使注册服务的地址
     */
    private String registryData;

    /**
     * 注册协议: /mdubbo
     */
    private String registryProtocol;


    public String getRegistryAddress() {
        return registryAddress;
    }

    public void setRegistryAddress(String registryAddress) {
        this.registryAddress = registryAddress;
    }

    public Integer getRegistryPort() {
        return registryPort;
    }

    public void setRegistryPort(Integer registryPort) {
        this.registryPort = registryPort;
    }

    public String getRegistryData() {
        return registryData;
    }

    public void setRegistryData(String registryData) {
        this.registryData = registryData;
    }

    public String getRegistryProtocol() {
        return registryProtocol;
    }

    public void setRegistryProtocol(String registryProtocol) {
        this.registryProtocol = registryProtocol;
    }

}
