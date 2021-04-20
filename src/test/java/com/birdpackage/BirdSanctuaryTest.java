package com.birdpackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class BirdSanctuaryTest {


    @Test
    public void testAddBird() {
        BirdSanctuary birdSanctuary = BirdSanctuary.getInstance();
        Penguin penguin = new Penguin();
        birdSanctuary.addBird(penguin);
        int count = penguin.getCount();
        Assertions.assertEquals(1, count);
    }


    @Test
    public void givenNull_WhenGiven_ShouldReturnFalse() throws BirdSanctuaryAddException{

        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(BirdSanctuaryAddException.class);
        BirdSanctuary birdSanctuary = BirdSanctuary.getInstance();
        birdSanctuary.addBird(null);
    }
}