package com.lgp.persist;

/**
 * DAO抽象
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/12/1 17:58
 */
public interface
AbstractDao<T> {

    public void insert(T t);

    public T select(T t);

    public boolean delete(T t);

    public T update(T t);
}
