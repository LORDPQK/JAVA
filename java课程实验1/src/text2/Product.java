package text2;

public class Product {
    protected String name;//商品名
    protected int ID;//商品id
    protected int quantity;//商品数量

    public Product(String name,int ID,int quantity)
    {
        this.name = name;
        this.ID = ID;
        this.quantity = quantity;
    }

    //进货
    public void increaseQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    //卖出了一件商品
    public void  SellOne()
    {
        this.quantity -= 1 ;
    }

    public String toString()
    {
        System.out.print("Proudct's name :"+this.name+"\n");
        System.out.print("Product's ID :"+this.ID+"\n");
        System.out.print("Producy's quantity"+this.quantity+"\n");

       return  "Product's name :"+this.name+"Product's ID"+this.ID+"Product's quantity"+this.quantity;
    }

}
