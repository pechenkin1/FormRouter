package local.myworktech.formrouter.repository;


import local.myworktech.formrouter.entity.House;

import javax.persistence.EntityManagerFactory;

public class HousesRepository extends RepositoryImpl {
    public HousesRepository(EntityManagerFactory factory) {
        super(factory);
        initTestData();
    }

    private void initTestData() {
        House house1 = new House();
        house1.setCity("Moscow");
        house1.setStreet("Tverskaya st.");
        house1.setHouse("10");

        house1.setResidentsCount(3);
        house1.setRoom("20");
        house1.setSquare(80);
        persist(house1);

        House house2 = new House();
        house2.setCity("Moscow");
        house2.setStreet("Leninsky av.");
        house2.setHouse("90");

        house2.setResidentsCount(5);
        house2.setRoom("100");
        house2.setSquare(70);
        persist(house2);


    }


}
