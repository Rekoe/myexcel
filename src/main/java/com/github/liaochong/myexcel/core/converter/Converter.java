package com.github.liaochong.myexcel.core.converter;

/**
 * @author liaochong
 * @version 1.0
 */
public interface Converter<E, T> {

    /**
     * 转换
     *
     * @param obj 被转换对象
     * @return 结果
     */
    T convert(E obj);
}
