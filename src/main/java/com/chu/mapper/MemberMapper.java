package com.chu.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.chu.model.MemberVO;

@Mapper
public interface MemberMapper {

	//회원가입
	public void memberJoin(MemberVO member);
	
}
