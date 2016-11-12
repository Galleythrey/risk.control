package riskcontrol.dao;

import riskcontrol.model.User;

public interface UserDao {

	public void save(User user);

	public User find(String username);

}
