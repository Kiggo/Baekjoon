package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELECT sysdate FROM dual")//dual 하나의행 하나의열
	public String getTime();
	
	public String getTime2();
}
