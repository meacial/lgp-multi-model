package com.lgp.persist;

import com.lgp.persist.impl.UserDaoImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * DAO工厂类
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/12/1 18:10
 */
public final class DaoFactory {

    private DaoFactory() {
        throw new IllegalAccessError("No Support!");
    }

    private static final Map<String, AbstractDao> daoMap = new ConcurrentHashMap<String, AbstractDao>();

    private static final String USERDAOKEY = "userDao";

    public static final UserDao getUserDao() {
        if (daoMap.containsKey(USERDAOKEY)) {
            return (UserDao) daoMap.get(USERDAOKEY);
        } else {
            UserDao userDao = new UserDaoImpl();
            daoMap.put(USERDAOKEY, userDao);
            return userDao;
        }
    }
}

