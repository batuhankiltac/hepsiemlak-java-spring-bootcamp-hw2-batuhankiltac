public class AdvertFactory {

    public static Advert createAdverts(String advertType) {
        if (advertType.equals("Sale Real Estate")) {
            return new SaleRealEstate();
        } else if (advertType.equals("Rent Real Estate")) {
            return new RentRealEstate();
        }
        return null;
    }
}