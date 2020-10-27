package text2;


public class Product {
    protected String name;//商品名
    protected int ID;//商品id
    protected int quantity;//商品数量

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
        return  "Product's name :"+this.name+"Product's ID"+this.ID+"Product's quantity"+this.quantity;
    }

}
