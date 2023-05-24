package com.human.springboot;

import java.util.ArrayList;

public interface SnsDAO {
	//login & join
	ArrayList<SignDTO> member_list();
	void member_insert(String id,String pw,String name,String nickname,String mobile,String email,String birth,String gender,String interest,String profileimg,String massage);
}
