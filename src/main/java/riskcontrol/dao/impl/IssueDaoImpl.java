package riskcontrol.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import riskcontrol.dao.BaseDao;
import riskcontrol.dao.IssueDao;
import riskcontrol.model.Issue;
import vo.SummaryVO;

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

	@Override
	public List<Issue> findCommit(String commiter) {
		Session session = baseDao.getNewSession();
		SQLQuery query = session.createSQLQuery("select * from issues where committer=?").addEntity(Issue.class);
		query.setParameter(0, commiter);
		List<Issue> list = query.list();
		session.close();
		return list;
	}

	@Override
	public SummaryVO summary() {
		SummaryVO vo = new SummaryVO();
		Session session = baseDao.getNewSession();
		SQLQuery query1 = session.createSQLQuery("SELECT sum(if(`possibility`='低',1,0))as pl,sum(if(`possibility`='中',1,0))as pm,sum(if(`possibility`='高',1,0))as ph FROM `issues`")
				.addScalar("pl", StandardBasicTypes.INTEGER).addScalar("pm", StandardBasicTypes.INTEGER).addScalar("ph", StandardBasicTypes.INTEGER);
		Object[] pv = (Object[]) query1.uniqueResult();
		vo.p_l = (int)pv[0];
		vo.p_m = (int)pv[1];
		vo.p_h = (int)pv[2];
		
		SQLQuery query2 = session.createSQLQuery("SELECT sum(if(`seriousness`='低',1,0))as sl,sum(if(`seriousness`='中',1,0))as sm,sum(if(`seriousness`='高',1,0))as sh FROM `issues`")
				.addScalar("sl", StandardBasicTypes.INTEGER).addScalar("sm", StandardBasicTypes.INTEGER).addScalar("sh", StandardBasicTypes.INTEGER);
		Object[] sv = (Object[]) query2.uniqueResult();
		vo.s_l = (int)sv[0];
		vo.s_m = (int)sv[1];
		vo.s_h = (int)sv[2];
		
		return vo;
	}

}
