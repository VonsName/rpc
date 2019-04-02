package com.von.rpc.zookeeper;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;
import org.junit.Assert;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 16:42
 */
public class MRpcZkClient {
    /**
     * zk地址
     */
    private String registryAddress;
    /**
     * zk端口
     */
    private Integer port;
    /**
     * zk创建的节点
     */
    private String createNode;


    private ZkClient zkClient;

    public MRpcZkClient(String registryAddress, Integer port) {
        this(registryAddress, port, 3000);
        this.registryAddress = registryAddress;
        this.port = port;
    }

    public MRpcZkClient(ZkConnection zkConnection) {
        String[] ipPort = zkConnection.getServers().split(":");
        this.registryAddress = ipPort[0];
        this.port = Integer.valueOf(ipPort[1]);
        this.zkClient = new ZkClient(zkConnection);
    }

    public MRpcZkClient(String registryAddress, Integer port, Integer timeout) {
        this.registryAddress = registryAddress;
        this.port = port;
        ZkConnection connection = new ZkConnection(registryAddress + ":" + port, timeout);
        this.zkClient = new ZkClient(connection);
    }

    public String getRegistryAddress() {
        return registryAddress;
    }

    public void setRegistryAddress(String registryAddress) {
        this.registryAddress = registryAddress;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getCreateNode() {
        return createNode;
    }

    public void setCreateNode(String createNode) {
        this.createNode = createNode;
    }

    /**
     * 创建zk节点
     *
     * @param path
     * @param path
     */
    public String create(final String path) {
        Assert.assertNotNull("path 不能为空", path);
        return create(path, false);
    }

    /**
     * 创建zk节点
     *
     * @param path
     * @param
     */
    public String create(final String path, boolean ephemeral) {

        Assert.assertNotNull("path 不能为空", path);
        MRpcAssert.assertNotStartWith("path必须以'/'开头", path);
        if (!ephemeral) {
            zkClient.createPersistent(path, true);
        } else {
            zkClient.createEphemeral(path);
        }
        return createNode;
    }

    static class MRpcAssert {
        private static final String SEPARATOR = "/";

        public static void assertNotStartWith(String message, String data) {
            if (!data.startsWith(SEPARATOR)) {
                throw new IllegalArgumentException(message);
            }
        }
    }

    private static class ZkRegistryDefaultConfig {
        public static final String DEFAULT_ZK_REGISTRY_ADDRESS = "localhost";
        public static final Integer DEFAULT_ZK_REGISTRY_PORT = 2181;
    }

}


