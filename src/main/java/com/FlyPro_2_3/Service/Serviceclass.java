package com.FlyPro_2_3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlyPro_2_3.Entity.Entityclass;
import com.FlyPro_2_3.Repository.Repositoryinterface;

@Service
public class Serviceclass implements Serviceinterface {
@Autowired
private Repositoryinterface repositoryinterface;

@Override
public void sStep(Entityclass entityclass) {
	repositoryinterface.save(entityclass);
}

@Override
public List<Entityclass> getall() {
	return repositoryinterface.findAll();
}

@Override
public Entityclass getid(long p_id) {
	return repositoryinterface.findById(p_id).orElse(null);
}

@Override
public boolean userid(long p_id) {
	if(repositoryinterface.existsById(p_id))
	{
		 repositoryinterface.deleteById(p_id);
		return true;
	}
	return false;
}

@Override
public boolean userupd(long p_id, String p_email_id, String p_password, String p_c_password) {		
	Optional<Entityclass> useroptions=repositoryinterface.findById(p_id);
		if(useroptions.isPresent())
		{
			Entityclass entityclass=useroptions.get();
			entityclass.setP_email_id(p_email_id);
			entityclass.setP_password(p_password);
			entityclass.setP_c_password(p_c_password);
			repositoryinterface.save(entityclass);
			return true;
		}	return false;
}
}
