package oop1;

public class Main {
    public static void main(String[] args) {

        //Prodcut turunde porduct1 adinda yeni bir nesne olusturuldu.
        // set value
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("delonghi.jpg");


        // get value
        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(3);
        product2.setUnitsInStock(4);
        product2.setImageUrl("smeg.jpg");


        Product product3 = new Product();
        product3.setName("Kitcen Aid Kahve Makinesi");
        product3.setUnitPrice(5500);
        product3.setDiscount(12);
        product3.setUnitsInStock(5);
        product3.setImageUrl("kitchenaid.jpg");


        // Array icerisine veri tipi product olan veri gonderebiliriz.
        Product[] products = {product1, product2, product3};

        for(Product product:products){
            System.out.println(product.getName());
           // System.out.println(product.getUnitPrice());
        }

        // Bireysel Hesap Acma Islemi
        // IndividualCustomer turunde bir islem actik.
        IndividualCustomer individualCustomer = new IndividualCustomer();
        // Bu operasyonlari Customer() uzerinden inherit etti...

        individualCustomer.setId(1);
        individualCustomer.setPhone("0530612331");
        individualCustomer.setCustomerNumber("12345");

        //Sadece bu operasyonlari IndividualCustomer da tanimladik.
        individualCustomer.setFirstName("Ozan");
        individualCustomer.setLastName("Ike");

        //CorporateCustomer
        CorporateCustomer corporateCustomer = new CorporateCustomer();

        //CorporateCustomer A ait operasyonlar

        corporateCustomer.setCompanyName("Ike Software AS");
        corporateCustomer.setTaxNumber("321654");

        //Customera ait operasyonlar

        corporateCustomer.setId(2);
        corporateCustomer.setPhone("+4796813312");
        corporateCustomer.setCustomerNumber("456789");

        Customer[] customers = {individualCustomer,corporateCustomer};

        for(Customer customer:customers){
            System.out.println(customer.getCustomerNumber());
        }

    }
}