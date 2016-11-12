package riskcontrol.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import riskcontrol.dao.BaseDao;
import riskcontrol.dao.IssueDao;
import riskcontrol.model.Issue;

@Repository
public class IssueDaoImpl implements IssueDao{
	
	@Autowired
	private BaseDao baseDao;

	public void save(Issue issue) {
		baseDao.save(issue);
	}

	public Issue find(int id) {
		return (Issue) baseDao.load(Issue.class, id);
	}

	public int newID() {
		int result = baseDao.getMax(Issue.class, "id");
		return result;
	}

	public List<Issue> findAll() {
		List<Issue> result = baseDao.getAllList(Issue.class);
		return result;
	}

	public List<Issue> findTrack(String traker) {
		Session session = baseDao.getNewSession();
		SQLQuery query = session.createSQLQuery("select * from issues where tracker=?").addEntity(Issue.class);
		query.setParameter(0, traker);
		List<Issue> list = query.list();
		session.close();
		return list;
	}

}
