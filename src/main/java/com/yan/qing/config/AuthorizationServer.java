package com.yan.qing.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 认证服务资源配置
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServer extends AuthorizationServerConfigurerAdapter {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //测试使用放在内存中   实际应该放在db中
        clients.inMemory()
                //clientid
                .withClient("admin")
                //密码
                .secret(passwordEncoder.encode("12345678"))
                //获取授权码
                .redirectUris("http://www.baidu.com")
                //授权范围
                .scopes("all")
                //授权模式
                .authorizedGrantTypes("authorization_code");
    }
}
