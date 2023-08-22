package com.wouterlefever.stackoverflow;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void testStaticMethod() {
        MockedStatic<Car> staticCar = Mockito.mockStatic(Car.class);
        staticCar.when(Car::getNumberOfTiresStatic).thenReturn(3);

        Car car = new Car("1");

        assertEquals(3, car.getNumberOfTires());
    }

}