package practiceOOPS;

import static OOPS.WrapperClass.message;
public class one {

    public static void main(String[] args) {

        Cart product = new Cart();
        System.out.println(product.Price);
        System.out.println(product.ProductName);
        System.out.println(product.ProductID);

        Cart product2 = new Cart("Watch", 999, 101.0f);

        System.out.println(product2.Price + product2.ProductName+ product2.ProductID);
        
        Cart product3 = new Cart("Phone", 50000, 105.0f);
        
        System.out.println(product3.Price + product3.ProductName+ product3.ProductID);
        
        product2.changeProductName("IPhone");
        
        System.out.println(product2.Price + product2.ProductName+ product2.ProductID);
        

        Cart two=product2;//copying object any change in one will lead to change in other too!
        System.out.println(two.Price + two.ProductName+ two.ProductID);
        two.ProductName="SmartWatch";
        System.out.println(two.Price + two.ProductName+ two.ProductID);
        System.out.println(product2.Price + product2.ProductName+ product2.ProductID);
        

        Cart random = new Cart(product3);//copying all the variables but created a different obj,chnage in one will not reflect in other object 
        System.out.println(random.Price + random.ProductName+ random.ProductID);
        random.Price=1999;
        System.out.println(random.Price + random.ProductName+ random.ProductID);
        System.out.println(product3.Price + product3.ProductName+ product3.ProductID);

       
    }

    static class Cart {
        String ProductName;
        int Price;
        float ProductID;
        Cart(){    
        }

        Cart(String ProductName, int Price, float ProductID) {
            this.ProductName = ProductName;
            this.ProductID = ProductID;
            this.Price = Price;
        }

        void changeProductName(String ProductName){
            this.ProductName=ProductName;
        }

        Cart(Cart obj){
            this.ProductID=obj.ProductID;
            this.ProductName=obj.ProductName;
        }
    }
}
