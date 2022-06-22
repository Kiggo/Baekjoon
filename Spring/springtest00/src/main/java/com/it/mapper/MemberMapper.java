package com.it.mapper;

import java.util.List;

import com.it.domain.MemberVO;

public interface MemberMapper {
	
		public List<MemberVO> getList();

		public void insert(MemberVO member);
		
		public MemberVO read(String id);
		
		public int delete(String id);
		
		public int update(MemberVO member);
}
