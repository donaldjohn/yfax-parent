package com.yfax.task.qmtt.dao;

import java.util.List;
import java.util.Map;

import com.yfax.task.qmtt.vo.AppUserVo;

public interface AppUserDao {
	public AppUserVo selectByPhoneNumAndPwd(Map<String, Object> params);
	public AppUserVo selectByPhoneNum(String phoneNum);
	public boolean deleteTokenByPhoneNum(String phoneNum);
	public boolean insertUser(AppUserVo appUserVo);
	public boolean updateUser(AppUserVo appUserVo);
	public List<AppUserVo> selectByRank();
	public Long selectByRankSum();
	public List<AppUserVo> selectByPhoneNumGoldLimit();
	public List<AppUserVo> selectAllUser();
}
