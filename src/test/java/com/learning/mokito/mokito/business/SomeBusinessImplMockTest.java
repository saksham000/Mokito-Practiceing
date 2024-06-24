package com.learning.mokito.mokito.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBuisnessImp buisnessImpl;


    @Test
    void findGratestFromAllData_basicScenatio() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 25, 5, 15 });
        assertEquals(25, buisnessImpl.findTheGratestFromAllData());
    }

    @Test
    void findGratestFromAllData_oneValue() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 35 });
        SomeBuisnessImp businessImpl = new SomeBuisnessImp(dataServiceMock);
        assertEquals(35, businessImpl.findTheGratestFromAllData());
    }

}
