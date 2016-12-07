package com.lgp.persist;

/**
 * DAO抽象
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/12/1 17:58
 */
public interface
AbstractDao<T> {

    void insert(T t);

    T select(T t);

    boolean delete(T t);

    T update(T t);
}
