package com.joytrav.service;

import java.util.List;

public interface IGenericService <T, E>{
    List<T> fetchALl();
    T getById(E e);
    void create(T t);
    void save();
    boolean existsById(E e);
}
