package com.FlyPro_2_3.Service;

import java.util.List;

import com.FlyPro_2_3.Entity.Entityclass;

public interface Serviceinterface {

	void sStep(Entityclass entityclass);

	List<Entityclass> getall();

	Entityclass getid(long p_id);

	boolean userid(long p_id);

	boolean userupd(long p_id, String p_email_id, String p_password, String p_c_password);

}
