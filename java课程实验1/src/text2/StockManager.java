package text2;
import text2.Product;

import java.util.ArrayList;




public class StockManager {
    ArrayList<Product> list=new ArrayList<Product>();


    //将对象加入容器
    public void addProduct(Product q)
    {
        for(int i = 0;i < list.size(); i ++)
        {
            Product a = (Product)list.get(i);
            if(a.ID == q.ID)
            {
               System.out.print("已经存在相同id，添加失败！");
            }
        }
        list.add(q);
    }

    //打印产品详细信息
    public void printProductDetails()
    {
        for(int i = 0; i < list.size();i++ )
        {
            Product a = (Product)list.get(i);//将容器中的元素的值赋给a
            a.toString();
        }

    }

    public Product findProduct(int ID)
    {
        for(int i = 0;i < list.size(); i ++)
        {
            Product a = (Product)list.get(i);
            //得到对象的ID？设为protected
            if(ID == a.ID )
            {
                return a;
            }
            //else{ return null;}//返回值问题
        }
        return null;
    }

    public int numberInStock(int ID)
    {
        for(int i = 0;i < list.size(); i ++)
        {
            Product a = (Product)list.get(i);
            //得到对象的ID？设为protected
            if(ID == a.ID )
            {
                return a.quantity;
            }
            //else{ return null;}//返回值问题
        }
        return 0;
    }

    public void delivery(int ID,int number)
    {
        for(int i = 0;i < list.size(); i ++)
        {
            Product a = (Product)list.get(i);
            if(ID == a.ID )
            {
                a.increaseQuantity(number);
            }
        }

    }

    public void printLowStockProducts(int s)//平均值s
    {
        for(int i = 0;i < list.size(); i ++)
        {
            Product a = (Product)list.get(i);
            if(a.quantity < s )
            {
                a.toString();
            }
        }
    }

    public Product findProductByName(String name)
    {
        for(int i = 0;i < list.size(); i ++)
        {
            Product a = (Product)list.get(i);
            if( a.name == name)
            {
                return a;

            }
        }
        return null;
    }
}
