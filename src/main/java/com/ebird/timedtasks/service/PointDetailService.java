package com.ebird.timedtasks.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebird.ebird_entity.PointExerciseDetailEntity;
import com.ebird.timedtasks.dao.PointDetailDao;
import com.smartframe.basics.util.DateUtil;

@Service
public class PointDetailService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PointDetailService.class);
	
	@Autowired
	private PointDetailDao pointDetailDao ;
	
	/**
	 * 根据练习周期数 查询是该周期的所有用户的知识点
	 * 
	 * @param exerciseCycle 练习周期
	 * @return
	 */
	public List<PointExerciseDetailEntity> findPointExerciseDetail(Integer exerciseCycle){
		List<PointExerciseDetailEntity> pointDetailList = pointDetailDao.findPointExerciseDetail(exerciseCycle);
		return pointDetailList;
	}
	
	
	public void conputSkilled(){
		List<PointExerciseDetailEntity> pointDetailList = pointDetailDao.findPointExerciseDetailAll();
		if(pointDetailList.size()>0){
			List<PointExerciseDetailEntity> list = new ArrayList<>();
			for(PointExerciseDetailEntity entity:pointDetailList){
				Integer exerciseCycle = entity.getExerciseCycle();
				int flag = DateUtil.getHoursSpace(entity.lastExerciseDate,new Date());
				System.out.println("更新练习明细ID："+entity.getId()+"***周期是："+exerciseCycle+"***最后练习时间是："+DateUtil.format(entity.lastExerciseDate)+"***距离上次练习时间："+flag);
				if(exerciseCycle==1){
					if(flag>=8){
						if(entity.getSkilled()>0){
							entity.setSkilled(entity.getSkilled()-1);
							list.add(entity);
						}
					}
				}else if(exerciseCycle==2){
					if(flag>=16){
						if(entity.getSkilled()>0){
							entity.setSkilled(entity.getSkilled()-1);
							list.add(entity);
						}
					}
				}else if(exerciseCycle==3){
					if(flag>=32){
						if(entity.getSkilled()>0){
							entity.setSkilled(entity.getSkilled()-1);
							list.add(entity);
						}
					}
				}else if(exerciseCycle==4){
					if(flag>=64){
						if(entity.getSkilled()>0){
							entity.setSkilled(entity.getSkilled()-1);
							list.add(entity);
						}
					}
				}else if(exerciseCycle==5){
					if(flag>=128){
						if(entity.getSkilled()>0){
							entity.setSkilled(entity.getSkilled()-1);
							list.add(entity);
						}
					}
				}else if(exerciseCycle==6){
					if(flag>=256){
						if(entity.getSkilled()>0){
							entity.setSkilled(entity.getSkilled()-1);
							list.add(entity);
						}
					}
				}else if(exerciseCycle==7){
					if(flag>=512){
						if(entity.getSkilled()>0){
							entity.setSkilled(entity.getSkilled()-1);
							list.add(entity);
						}
					}
				}else if(exerciseCycle==8){
					if(flag>=1024){
						if(entity.getSkilled()>0){
							entity.setSkilled(entity.getSkilled()-1);
							list.add(entity);
						}
					}
				}else if(exerciseCycle==9){
					if(flag>=2048){
						if(entity.getSkilled()>0){
							entity.setSkilled(entity.getSkilled()-1);
							list.add(entity);
						}
					}
				}
			}
			if(list.size()>0){
				pointDetailDao.updatePointExerciseDetail(list);
				
			}
			LOGGER.info("现在执行总共【"+list.size()+"】数据");
		}
	}

}
