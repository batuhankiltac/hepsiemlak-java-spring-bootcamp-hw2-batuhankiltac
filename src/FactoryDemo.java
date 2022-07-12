import java.util.Objects;

public class FactoryDemo {

    public static void main(String[] args) {
        Advert saleAdvert = AdvertFactory.createAdverts("Sale Real Estate");
        Objects.requireNonNull(saleAdvert).create();

        Advert rentAdvert = AdvertFactory.createAdverts("Rent Real Estate");
        Objects.requireNonNull(rentAdvert).create();
    }
}