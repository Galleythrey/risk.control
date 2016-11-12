package riskcontrol.dao.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import riskcontrol.dao.BaseDao;
import riskcontrol.dao.UserDao;
import riskcontrol.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private BaseDao baseDao;

	
	public void save(User user) {
		try {
			baseDao.save(user);
			System.out.println("ok");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public User find(String username) {
		Session session = baseDao.getNewSession();
		String sql = "select * from users where username='" + username + "'";
		User user = (User) session.createSQLQuery(sql).addEntity(User.class).uniqueResult();
		session.close();
		return user;
	}

}
