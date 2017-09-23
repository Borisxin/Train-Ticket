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
		System.out.print("�x�K�q���t��:1.�d�ߨ����P�q�� 2.�d�߭q������ 0.���}");
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
		TrainDB.TrainArray[0].PassStation=new String[]{"�Ὤ","�y��","�x�_"};
		TrainDB.TrainArray[0].from="�Ὤ";
		TrainDB.TrainArray[0].to="�x�_";
		TrainDB.TrainArray[0].SeatNum=new int[]{10,10,10};
		TrainDB.TrainArray[1].trainNo="401";
		TrainDB.TrainArray[1].PassStation=new String[]{"�x�F","�Ὤ","�y��","�x�_"};
		TrainDB.TrainArray[1].from="�x�F";
		TrainDB.TrainArray[1].to="�x�_";
		TrainDB.TrainArray[1].SeatNum=new int[]{10,10,10,10};
		TrainDB.TrainArray[2].trainNo="207";
		TrainDB.TrainArray[2].PassStation=new String[]{"�Ὤ","�y��","�x�_"};
		TrainDB.TrainArray[2].from="�Ὤ";
		TrainDB.TrainArray[2].to="�x�_";
		TrainDB.TrainArray[2].SeatNum=new int[]{10,10,10};
		TrainDB.TrainArray[3].trainNo="211";
		TrainDB.TrainArray[3].PassStation=new String[]{"�Ὤ","�y��","�x�_","�O��"};
		TrainDB.TrainArray[3].from="�Ὤ";
		TrainDB.TrainArray[3].to="�O��";
		TrainDB.TrainArray[3].SeatNum=new int[]{10,10,10,10};
		TrainDB.TrainArray[4].trainNo="411";
		TrainDB.TrainArray[4].PassStation=new String[]{"�Ὤ","�y��","�x�_","�O��","���"};
		TrainDB.TrainArray[4].from="�Ὤ";
		TrainDB.TrainArray[4].to="���";
		TrainDB.TrainArray[4].SeatNum=new int[]{10,10,10,10,10};
		TrainDB.TrainArray[5].trainNo="402";
		TrainDB.TrainArray[5].PassStation=new String[]{"�O��","�x�_","�y��","�Ὤ","�x�F"};
		TrainDB.TrainArray[5].from="�O��";
		TrainDB.TrainArray[5].to="�x�F";
		TrainDB.TrainArray[5].SeatNum=new int[]{10,10,10,10,10};
		TrainDB.TrainArray[6].trainNo="206";
		TrainDB.TrainArray[6].PassStation=new String[]{"�x�_","�y��","�Ὤ"};
		TrainDB.TrainArray[6].from="�x�_";
		TrainDB.TrainArray[6].to="�Ὤ";
		TrainDB.TrainArray[6].SeatNum=new int[]{10,10,10};
		TrainDB.TrainArray[7].trainNo="408";
		TrainDB.TrainArray[7].PassStation=new String[]{"�x�_","�y��","�Ὤ","�x�F"};
		TrainDB.TrainArray[7].from="�x�_";
		TrainDB.TrainArray[7].to="�x�F";
		TrainDB.TrainArray[7].SeatNum=new int[]{10,10,10,10};
		TrainDB.TrainArray[8].trainNo="410";
		TrainDB.TrainArray[8].PassStation=new String[]{"�x�_","�y��","�Ὤ"};
		TrainDB.TrainArray[8].from="�x�_";
		TrainDB.TrainArray[8].to="�Ὤ";
		TrainDB.TrainArray[8].SeatNum=new int[]{10,10,10};
		TrainDB.TrainArray[9].trainNo="412";
		TrainDB.TrainArray[9].PassStation=new String[]{"�x�_","�y��","�Ὤ","�x�F"};
		TrainDB.TrainArray[9].from="�x�_";
		TrainDB.TrainArray[9].to="�x�F";
		TrainDB.TrainArray[9].SeatNum=new int[]{10,10,10,10};
	    initial=true;
	}
	
	private static void QueryTrainNOrder() {
		//�d�߯Z���P����
		int num1,num2;
		Train[] matchTrainAry=new Train[10];
		for(int i=0;i<10;i++){
			matchTrainAry[i]=new Train();
		}
		String from,to;
		String temp[]=new String[]{"�x�_","�O��","���","���c","�s��","�x��","����","�椻","�Ÿq","�x�n","����","�̪F","�x�F","�Ὤ","�y��"};
		Scanner scn=new Scanner(System.in);
		System.out.print("1. �п�ܰ_�I(0.�x�_ 1.�O�� 2.��� 3.���c 4.�s�� 5.�x�� 6.���� 7.�椻 8.�Ÿq 9.�x�n 10.���� 11.�̪F 12. �x�F 13.�Ὤ 14.�y��): ");
		num1=scn.nextInt();
		from=temp[num1];
		System.out.print("2. �п�ܲ��I(0.�x�_ 1.�O�� 2.��� 3.���c 4.�s�� 5.�x�� 6.���� 7.�椻 8.�Ÿq 9.�x�n 10.���� 11.�̪F 12. �x�F 13.�Ὤ 14.�y��): ");
		num2=scn.nextInt();
		to=temp[num2];
		matchTrainAry=TrainDB.queryTrain(from, to);
		if(matchTrainAry.length==0){
			System.out.println("��p�A�d�ߤ���۲Ū��Z��!");
		}
		else{
			System.out.println(from+">>>"+to);
			System.out.println("����"+"\t"+"�o����"+"\t"+"���I��"+"\t"+"����");
			for(int j=0;j<matchTrainAry.length;j++){
				System.out.println(matchTrainAry[j].trainNo+"\t"+matchTrainAry[j].from+"\t"+matchTrainAry[j].to+"\t"+matchTrainAry[j].UnitPrice);
			}
		}
			
	//�q��
	    String no,id;
	    OrderDB ODB=new OrderDB();
	    order order=new order();
	    Train t=new Train();
	    System.out.print("�п�J�q������:");
		no=scn.next();
		for(int i=0;i<matchTrainAry.length;i++){
			if(matchTrainAry[i].trainNo.equals(no)){
				t=matchTrainAry[i];
			}
		}
		System.out.print("�п�J�����Ҧr��:");
		id=scn.next();

		int ticket=0;
        do{
            System.out.println("�п�J�ʲ��i��:");
            ticket=scn.nextInt();
            for(int i=0;i<matchTrainAry.length;i++){
     if(matchTrainAry[i].trainNo.equals(no))
	matchTrainAry[i]=TrainDB.queryTrain(matchTrainAry[i], ticket);                              
      }
            if(TrainDB.b1==false)
                System.out.println("���Ƥ����@!!");
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
           System.out.println("���ҽX:"+s);   
           System.out.println("�п�J���ҽX:");
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
		System.out.print("�п�J�����Ҧr��");
		id=scn.next();
		ODB.queryOrderbyID(id);
	}
		
}
