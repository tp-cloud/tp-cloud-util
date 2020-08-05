package com.ithinksky.util.dto;

import com.ithinksky.util.helper.AppTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * KeyValue 单元测试
 *
 * @author tengpeng.gao
 */
class KeyValueTest extends AppTest {

    @Test
    void equalsInteger() {

        KeyValue<Integer> keyValue1 = new KeyValue<>();
        keyValue1.setKey(1);
        keyValue1.setValue("元素A");

        KeyValue<Integer> keyValue2 = new KeyValue<>();
        keyValue2.setKey(1);
        keyValue2.setValue("元素A");

        Assertions.assertTrue(keyValue1.equals(keyValue2));
    }

    @Test
    void equalsString() {

        KeyValue<String> keyValue1 = new KeyValue<>();
        keyValue1.setKey("A");
        keyValue1.setValue("元素A");

        KeyValue<String> keyValue2 = new KeyValue<>();
        keyValue2.setKey("A");
        keyValue2.setValue("元素A");

        Assertions.assertTrue(keyValue1.equals(keyValue2));
    }

}