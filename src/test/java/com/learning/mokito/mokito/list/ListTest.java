package com.learning.mokito.mokito.list;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {
    @Test
    void simpleTest(){
        List listmock = mock(List.class);
        when(listmock.size()).thenReturn(3);
        assertEquals(3, listmock.size());
    }

    @Test
    void specificParameters(){
        List listmock = mock(List.class);
        when(listmock.get(Mockito.anyInt())).thenReturn("some other called");
        assertEquals("some other called", listmock.get(0));
        // assertEquals(2, listmock.size());
    }
}
