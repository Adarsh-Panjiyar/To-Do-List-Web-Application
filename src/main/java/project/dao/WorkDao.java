package project.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import project.model.Works;

@Component
public class WorkDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//CREATE
	@Transactional
	public void createWork(Works work) {
		
		this.hibernateTemplate.saveOrUpdate(work);
		
	}
	
	//GET WORKS
	public List<Works> getWorks(){
		
		List<Works> works=this.hibernateTemplate.loadAll(Works.class);
		return works;
	}
	
	//DELETE THE SINGLE WORK
	@Transactional
	public void deleteWork(int workId) {
		Works W=this.hibernateTemplate.load(Works.class, workId);
		this.hibernateTemplate.delete(W);
	}
	
	//GET SINGLE WORK
	public Works getWork(int workId) {
		return this.hibernateTemplate.get(Works.class, workId);
	}
	
	
}
