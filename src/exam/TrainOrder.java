package exam;
import java.util.Scanner;
import exam.Train;
import exam.TrainDB;
public class TrainOrder {
	public static boolean initial=false;

	public static void main(String[] args) {
		Load();
		Scanner scn=new Scanner(System.in);
		int ans=0;
		do{
		System.out.print("台鐵訂票系統:1.查詢車次與訂票 2.查詢訂票紀錄 0.離開");
		ans=scn.nextInt();
		if(ans==1)
		    QueryTrainNOrder();
		else if(ans==2)
			QueryOrder();
		else if(ans==0)
			return;
		}while(ans!=0);
	}	
	public static void Load(){
		for(int i=0; i<TrainDB.TrainArray.length; i++)
			TrainDB.TrainArray[i] = new Train();
		TrainDB.TrainArray[0].trainNo="203";
		TrainDB.TrainArray[0].PassStation=new String[]{"花蓮","宜蘭","台北"};
		TrainDB.TrainArray[0].from="花蓮";
		TrainDB.TrainArray[0].to="台北";
		TrainDB.TrainArray[0].SeatNum=new int[]{10,10,10};
		TrainDB.TrainArray[1].trainNo="401";
		TrainDB.TrainArray[1].PassStation=new String[]{"台東","花蓮","宜蘭","台北"};
		TrainDB.TrainArray[1].from="台東";
		TrainDB.TrainArray[1].to="台北";
		TrainDB.TrainArray[1].SeatNum=new int[]{10,10,10,10};
		TrainDB.TrainArray[2].trainNo="207";
		TrainDB.TrainArray[2].PassStation=new String[]{"花蓮","宜蘭","台北"};
		TrainDB.TrainArray[2].from="花蓮";
		TrainDB.TrainArray[2].to="台北";
		TrainDB.TrainArray[2].SeatNum=new int[]{10,10,10};
		TrainDB.TrainArray[3].trainNo="211";
		TrainDB.TrainArray[3].PassStation=new String[]{"花蓮","宜蘭","台北","板橋"};
		TrainDB.TrainArray[3].from="花蓮";
		TrainDB.TrainArray[3].to="板橋";
		TrainDB.TrainArray[3].SeatNum=new int[]{10,10,10,10};
		TrainDB.TrainArray[4].trainNo="411";
		TrainDB.TrainArray[4].PassStation=new String[]{"花蓮","宜蘭","台北","板橋","桃園"};
		TrainDB.TrainArray[4].from="花蓮";
		TrainDB.TrainArray[4].to="桃園";
		TrainDB.TrainArray[4].SeatNum=new int[]{10,10,10,10,10};
		TrainDB.TrainArray[5].trainNo="402";
		TrainDB.TrainArray[5].PassStation=new String[]{"板橋","台北","宜蘭","花蓮","台東"};
		TrainDB.TrainArray[5].from="板橋";
		TrainDB.TrainArray[5].to="台東";
		TrainDB.TrainArray[5].SeatNum=new int[]{10,10,10,10,10};
		TrainDB.TrainArray[6].trainNo="206";
		TrainDB.TrainArray[6].PassStation=new String[]{"台北","宜蘭","花蓮"};
		TrainDB.TrainArray[6].from="台北";
		TrainDB.TrainArray[6].to="花蓮";
		TrainDB.TrainArray[6].SeatNum=new int[]{10,10,10};
		TrainDB.TrainArray[7].trainNo="408";
		TrainDB.TrainArray[7].PassStation=new String[]{"台北","宜蘭","花蓮","台東"};
		TrainDB.TrainArray[7].from="台北";
		TrainDB.TrainArray[7].to="台東";
		TrainDB.TrainArray[7].SeatNum=new int[]{10,10,10,10};
		TrainDB.TrainArray[8].trainNo="410";
		TrainDB.TrainArray[8].PassStation=new String[]{"台北","宜蘭","花蓮"};
		TrainDB.TrainArray[8].from="台北";
		TrainDB.TrainArray[8].to="花蓮";
		TrainDB.TrainArray[8].SeatNum=new int[]{10,10,10};
		TrainDB.TrainArray[9].trainNo="412";
		TrainDB.TrainArray[9].PassStation=new String[]{"台北","宜蘭","花蓮","台東"};
		TrainDB.TrainArray[9].from="台北";
		TrainDB.TrainArray[9].to="台東";
		TrainDB.TrainArray[9].SeatNum=new int[]{10,10,10,10};
	    initial=true;
	}
	
	private static void QueryTrainNOrder() {
		//查詢班次與票價
		int num1,num2;
		Train[] matchTrainAry=new Train[10];
		for(int i=0;i<10;i++){
			matchTrainAry[i]=new Train();
		}
		String from,to;
		String temp[]=new String[]{"台北","板橋","桃園","中壢","新竹","台中","彰化","斗六","嘉義","台南","高雄","屏東","台東","花蓮","宜蘭"};
		Scanner scn=new Scanner(System.in);
		System.out.print("1. 請選擇起點(0.台北 1.板橋 2.桃園 3.中壢 4.新竹 5.台中 6.彰化 7.斗六 8.嘉義 9.台南 10.高雄 11.屏東 12. 台東 13.花蓮 14.宜蘭): ");
		num1=scn.nextInt();
		from=temp[num1];
		System.out.print("2. 請選擇終點(0.台北 1.板橋 2.桃園 3.中壢 4.新竹 5.台中 6.彰化 7.斗六 8.嘉義 9.台南 10.高雄 11.屏東 12. 台東 13.花蓮 14.宜蘭): ");
		num2=scn.nextInt();
		to=temp[num2];
		matchTrainAry=TrainDB.queryTrain(from, to);
		if(matchTrainAry.length==0){
			System.out.println("抱歉，查詢不到相符的班次!");
		}
		else{
			System.out.println(from+">>>"+to);
			System.out.println("車次"+"\t"+"發車站"+"\t"+"終點站"+"\t"+"票價");
			for(int j=0;j<matchTrainAry.length;j++){
				System.out.println(matchTrainAry[j].trainNo+"\t"+matchTrainAry[j].from+"\t"+matchTrainAry[j].to+"\t"+matchTrainAry[j].UnitPrice);
			}
		}
			
	//訂票
	    String no,id;
	    OrderDB ODB=new OrderDB();
	    order order=new order();
	    Train t=new Train();
	    System.out.print("請輸入訂票車次:");
		no=scn.next();
		for(int i=0;i<matchTrainAry.length;i++){
			if(matchTrainAry[i].trainNo.equals(no)){
				t=matchTrainAry[i];
			}
		}
		System.out.print("請輸入身分證字號:");
		id=scn.next();

		int ticket=0;
        do{
            System.out.println("請輸入購票張數:");
            ticket=scn.nextInt();
            for(int i=0;i<matchTrainAry.length;i++){
     if(matchTrainAry[i].trainNo.equals(no))
	matchTrainAry[i]=TrainDB.queryTrain(matchTrainAry[i], ticket);                              
      }
            if(TrainDB.b1==false)
                System.out.println("票數不足哦!!");
          }while(TrainDB.b1==false);          
		String s="";
        String c="";
        do
        {  
            s="";
            for(int i=1;i<=4;i++)
            {
                int secret=(int)(Math.random()*10);                   
               s=s+secret;
            }                   
           System.out.println("驗證碼:"+s);   
           System.out.println("請輸入驗證碼:");
           c=scn.next();
        }while(!c.equals(s));
			order.ID=id;
			order.ticketNum=ticket;
			order.no=no;
			int a=0;
			for(int i=0;i<matchTrainAry.length;i++){
				if(matchTrainAry[i].trainNo.equals(no)){
					order.train=matchTrainAry[i];
					a=i;
					
				}
			}
			order.from=matchTrainAry[a].from;
			order.to=matchTrainAry[a].to;
			order.totalPrice=matchTrainAry[a].UnitPrice*ticket;
			ODB.saveOrder(order);
			
	
	}
	private static void QueryOrder() {
	OrderDB ODB=new OrderDB();
		Scanner scn=new Scanner(System.in);
		String id;
		System.out.print("請輸入身份證字號");
		id=scn.next();
		ODB.queryOrderbyID(id);
	}
		
}
