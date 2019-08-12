package main;

import com.aliyun.oss.*;

import java.io.InputStream;

public class AliyunOSSConfiguration {
    public static final String ENDPOINT = "http://oss-cn-shenzhen-internal.aliyuncs.com";
    public static final String ACCESS_KEY_ID = "LTAIjPWLA8D034d3";
    public static final String ACCESS_KEY_SECRET = "tn88KtmICB6ZXh8l6I12p0tCiLL1dZ";

    public ClientBuilderConfiguration getConfig() {
        ClientBuilderConfiguration builderConfig = new ClientBuilderConfiguration();
        builderConfig.setMaxErrorRetry(5);
        builderConfig.setMaxConnections(200);
        builderConfig.setSocketTimeout(10000);
        builderConfig.setConnectionTimeout(10000);
        builderConfig.setIdleConnectionTime(10000);
        builderConfig.setConnectionRequestTimeout(1000);
        return builderConfig;
    }

    public OSS getClient() {
        return new OSSClientBuilder().build(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET, getConfig());
    }

    public void putObject(String bucket, String key, InputStream in) {
        OSS oss = null;

        try {
            oss = getClient();
            oss.putObject(bucket, key, in);
        } catch (ClientException | OSSException ex) {
            ex.printStackTrace();
            return;
        } finally {
            if (oss != null) {
                oss.shutdown();
            }

        }

    }
}
