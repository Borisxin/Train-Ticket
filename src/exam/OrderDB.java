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
                    System.out.println("-------�z���q����Ӧp�U:-------");
                    System.out.println("�����Ҧr��\t�q��s��\t����\t�_�{��\t��F��\t�i��\t����");
                    System.out.println(match.ID+"\t\t"+match.OrderNo+"\t"+match.no+"\t"+match.from+"\t"+match.to+"\t"+match.ticketNum+"\t"+match.totalPrice);
                    System.out.println();

                }
                else
                	System.out.println("�d�L�������ҡA�Э��s�d��!");
            }}
            
            
     
        catch(NullPointerException ex)
        {
            System.out.println("�d�L�������ҡA�Э��s�d��!");
        }
	
	}
	
	public static int count=0;
	public static void saveOrder(order order){
		order.OrderNo=String.format("%04d",count);
		OrderArray[count]=order;
		System.out.println("�q�����\!");
		System.out.println("-------�z���q����Ӧp�U:-------");
		System.out.println("�q��s��:"+OrderArray[count].OrderNo);
		System.out.println("�����Ҧr��:"+OrderArray[count].ID);
		System.out.println("����:"+OrderArray[count].no);
		System.out.println("�_�{��:"+OrderArray[count].from);
		System.out.println("��F��:"+OrderArray[count].to);
		System.out.println("�i��:"+OrderArray[count].ticketNum);
		System.out.println("����:"+OrderArray[count].totalPrice);
		System.out.println("------------------------------");
		count++;
	}
}

