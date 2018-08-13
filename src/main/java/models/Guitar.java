package models;

import javax.persistence.*;

public class Guitar {


    @Entity
    @Table(name = "gitar")

    private int id;
    private String type;
    private int price;

    public Guitar(String type, int price) {
        this.type = type;
        this.price = price;
        }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



        @Column(name = "wow")
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
    @Column(name = "price")
        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.type = type;
        }

}
