package com.ebird.timedtasks.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ebird.timedtasks.entity.LorePointExerciseDetailEntity;

@Repository
public interface PointDetailDao {
	
	/**
	 * 根据练习周期数 查询是该周期的所有用户的知识点
	 * 
	 * @param exerciseCycle 练习周期
	 * @return
	 */
	public List<LorePointExerciseDetailEntity> findPointExerciseDetail(@Param("exerciseCycle")Integer exerciseCycle);
	
	
	public List<LorePointExerciseDetailEntity> findPointExerciseDetailAll();
	
	
	/**
	 * 批量更新知识点练习熟练度
	 * @param list
	 */
	public void updatePointExerciseDetail(@Param("entityList")List<LorePointExerciseDetailEntity> entityList);

}
