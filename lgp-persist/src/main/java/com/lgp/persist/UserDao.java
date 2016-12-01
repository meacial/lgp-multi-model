package com.lgp.persist;

import java.util.Map;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/12/1 17:59
 */
public interface UserDao<User> extends AbstractDao<User> {

    public void insert(Map<String, Object> userMap);

}
