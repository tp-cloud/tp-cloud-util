package com.ithinksky.util.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * key value
 *
 * @author tengpeng.gao
 */
public class KeyValue<T> implements Serializable {

    /**
     * key
     */
    private T key;

    /**
     * value
     */
    private String value;

    public KeyValue() {
    }

    public KeyValue(T key, String value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyValue<?> keyValue = (KeyValue<?>) o;
        return Objects.equals(key, keyValue.key) &&
                Objects.equals(value, keyValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
