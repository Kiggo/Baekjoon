package com.it.mapper;

import java.util.List;

import com.it.domain.HospitalVO;

public interface HospitalMapper {

		public List<HospitalVO> getList();
		
		public void insert(HospitalVO hospital);
		
		public HospitalVO read(String name);
		
		public int delete(String name);
		
		public int update(HospitalVO haspital);
}
