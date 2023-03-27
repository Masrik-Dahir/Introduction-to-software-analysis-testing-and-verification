/****************************************************************************
 * ReservationService
 ****************************************************************************
 * ReservationService reserve Customers with FancyRankingService
 *_____________________________________________________
 * Masrik Dahir
 * 26 March 2023
 * CMSC 525
 * Copyright 2023, Masrik Dahir, All Right Reserved
 ****************************************************************************/
public class ReservationService {
    private RankingService rankingService;
    private int customerRank;
    private boolean faked = true;

    public ReservationService(RankingService rankingService) {
        this.rankingService = rankingService;
    }

    public int getCustomerRank(){
        return customerRank;
    }

    public boolean isFaked(){
        return faked;
    }

    public void setFakeRankingService(boolean faked){
        this.faked = faked;
    }

    public void reserve(Customer customer) {
        FancyRankingService fancyRankingService = new FancyRankingService();
        if(!isFaked()){
            rankingService = new FancyRankingService();
        }
        customerRank = rankingService.getRank(customer);
    }

}

