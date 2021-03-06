package org.bupt.aiop.platform.service;


import org.bupt.aiop.platform.constant.EnvConsts;
import org.bupt.aiop.platform.constant.RedisConsts;
import org.bupt.aiop.platform.pojo.po.Ability;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 认证服务类（发短信、发邮件、缓存验证码）
 * Created by ken on 2017/11/1.
 */
@Service
public class OauthService extends BaseService<Ability> {

	private static final Logger logger = LoggerFactory.getLogger(OauthService.class);

	@Autowired
	private StringRedisTemplate redisMapper;

	@Autowired
	private EnvConsts envConsts;


	/**
	 * 获取应用对应的权限
	 * @param appId 应用ID号
	 */
	public String getAppPermission(Integer appId) {
		return (String) redisMapper.opsForHash().get(RedisConsts.AIOP_APP_PERMISSION, appId.toString());
	}

}
