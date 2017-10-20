package com.ebird.timedtasks.enums;

public enum ForgetTime {
	
	/**
	 * 第一周8小时
	 */
	FIRST_TIME(8) ,
	
	/**
	 * 第二周16小时
	 */
	SECOND_TIME(16),
	
	
	/**
	 * 第三周32小时
	 */
	Third_TIME(32),
	
	
	/**
	 * 第四周64小时
	 */
	FOURTH_TIME(64),
	
	
	/**
	 * 第五周128小时
	 */
	FIFTH_TIME(128),

	
	/**
	 * 第六周256小时
	 */
	SIXTH_TIME(256),
	
	
	/**
	 * 第七周512小时
	 */
    SEVENTH_TIME(512),	

    
	/**
	 * 第八周1024小时
	 */
    EIGHTH_TIME(1024),
    
    
	/**
	 * 第九周2048小时
	 */
    NINTH_TIME(2048);
	
    
	public final int timesanmp;
	 
	ForgetTime(int timesanmp){
		this.timesanmp=timesanmp;
	}

}
