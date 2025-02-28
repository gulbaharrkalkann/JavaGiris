package DesignPattern.Builder.Pratik4;

public class House {
    //gerekli olanlar
    private String city;
    private String district;
    //opsiyonel olanlar
    private boolean hasPark;
    private boolean hasTerrace;
    private boolean hasPool;

    private House(HouseBuilder builder) {
        this.city = builder.city;
        this.district = builder.district;
        this.hasPark = builder.hasPark;
        this.hasTerrace = builder.hasTerrace;
        this.hasPool = builder.hasPool;
    }
    public static class HouseBuilder {
        private String city;
        private String district;

        private boolean hasPark;
        private boolean hasTerrace;
        private boolean hasPool;

        public HouseBuilder(String city, String district) {
            this.city = city;
            this.district = district;
        }

        public HouseBuilder setHasPark(boolean hasPark) {
            this.hasPark = hasPark;
            return this;
        }

        public HouseBuilder setHasTerrace(boolean hasTerrace) {
            this.hasTerrace = hasTerrace;
            return this;
        }

        public HouseBuilder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
    public String toString(){
        return "House DesignPattern.Builder\n"+
                "City : "+city+"\n"+
                "District : "+district+"\n"+
                "Park var mı ? "+hasPark+"\n"+
                "Havuz var mı ? "+hasPool+"\n"+
                "Teras var mı ? "+hasTerrace;

    }
}
