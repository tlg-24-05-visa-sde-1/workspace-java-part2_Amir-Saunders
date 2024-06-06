package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television tv;


    @Before
    public void setUp() throws Exception {
        tv = new Television();
    }

    @Test
    public void shouldStoreValue_validInput_lowerBound() throws InvalidChannelException {
        tv.changeChannel(1);
        assertEquals(1,tv.getCurrentChannel());
    }

    @Test
    public void changeChannel_shouldThrowInvalidChannelException_invalidInput_lowerBound()  {
        try {
            tv.changeChannel(1000);

            fail("Should throw InvalidChannelException");
        }catch (InvalidChannelException e){
            assertEquals("Invalid channel: 1000. Allowed range: [1,999].",e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArguementException_invalidInput_upperBound() {
        tv.setVolume(101);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArguementException_invalidInput_lowerBound() {
        tv.setVolume(-1);
    }

    @Test
    public void setVolume_shouldStoreValue_validInput_lowerBound() {
        tv.setVolume(0);
        assertEquals(0,tv.getVolume());
    }

    @Test
    public void setVolume_shouldStoreVolume_validInput_upperBound() {
        tv.setVolume(100);
        assertEquals(100,tv.getVolume());

    }


}