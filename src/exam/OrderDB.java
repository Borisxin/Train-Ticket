package exam;

import exam.order;


public class OrderDB {
	public static order[] OrderArray=new order[100];
	public static int maxIndex=0;
	public static void queryOrderbyID(String ID) throws NullPointerException{
        try{
            order match=new order();
	for(int i=0;i<count;i++)
            {
                if(OrderArray[i].ID.equals(ID))
                {
                    match=OrderArray[i];
                    System.out.println("-------您的訂單明細如下:-------");
                    System.out.println("身分證字號\t訂單編號\t車次\t起程站\t到達站\t張數\t票價");
                    System.out.println(match.ID+"\t\t"+match.OrderNo+"\t"+match.no+"\t"+match.from+"\t"+match.to+"\t"+match.ticketNum+"\t"+match.totalPrice);
                    System.out.println();

                }
                else
                	System.out.println("查無此身分證，請重新查詢!");
            }}
            
            
     
        catch(NullPointerException ex)
        {
            System.out.println("查無此身分證，請重新查詢!");
        }
	
	}
	
	public static int count=0;
	public static void saveOrder(order order){
		order.OrderNo=String.format("%04d",count);
		OrderArray[count]=order;
		System.out.println("訂票成功!");
		System.out.println("-------您的訂單明細如下:-------");
		System.out.println("訂單編號:"+OrderArray[count].OrderNo);
		System.out.println("身分證字號:"+OrderArray[count].ID);
		System.out.println("車次:"+OrderArray[count].no);
		System.out.println("起程站:"+OrderArray[count].from);
		System.out.println("到達站:"+OrderArray[count].to);
		System.out.println("張數:"+OrderArray[count].ticketNum);
		System.out.println("票價:"+OrderArray[count].totalPrice);
		System.out.println("------------------------------");
		count++;
	}
}

