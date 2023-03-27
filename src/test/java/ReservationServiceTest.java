/****************************************************************************
 * ReservationServiceTest
 ****************************************************************************
 * Testing ReservationService with FakeRankingService and Mocked RankingService
 *_____________________________________________________
 * Masrik Dahir
 * 26 March 2023
 * CMSC 525
 * Copyright 2023, Masrik Dahir, All Right Reserved
 ****************************************************************************/

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ReservationServiceTest {
    @Mock
    RankingService rankingService;
    Customer customer = new Customer();
    ReservationService reservationService;


    /*
     * Testing ReservationService after replacing the FancyRankingService with a FakeRankingService
     * getCustomerRank() in FakeRankingService returns 0
     */
    @Test
    public void testReservationServiceFaked() {
        reservationService = new ReservationService(new FakeRankingService());
        reservationService.setFakeRankingService(true);
        reservationService.reserve(customer);
        assertEquals(0, reservationService.getCustomerRank());
    }

    /*
     * Testing ReservationService after creating a dummy object for the RankingService
     * We are NOT using FakeRankingService instead mocking RankingService
     * getCustomerRank() in RankingService returns 1
     */
    @Test
    public void testReservationServiceMocked() {
        reservationService = new ReservationService(rankingService);
        reservationService.setFakeRankingService(false);
        reservationService.reserve(customer);
        assertEquals(1, reservationService.getCustomerRank());
    }
}

