package sample.persistence;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import sample.entities.User;

public interface UserMapper {
	@Select("select * from t_user where id = #{userId}")
	public User getUser(long userId);

    @Insert("insert into t_user (id, email, userName) values(s_user.NEXTVAL, #{email}, #{userName})")
    public int addUser(User user);
}