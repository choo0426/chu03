package com.chu.service;

import com.chu.model.MemberVO;

public interface MemberService {
	
	//회원가입 
	public void memberJoin(MemberVO member) throws Exception;
	
}
