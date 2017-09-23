package exam;
import exam.Train;
import exam.TrainOrder;



public class TrainDB{

	 
	public static Train[] TrainArray=new Train[10];


    public static String f,t;
	public static Train[] queryTrain(String from,String to){
		if(TrainOrder.initial==false)
        {
            TrainOrder.Load();
        }        
	TrainDB TDB=new TrainDB();
		Train[] matchTrainAry = new Train[10];
		int k=0;
		a:for(int i=0;i<10;i++){
			for(int j=0;j<TDB.TrainArray[i].PassStation.length;j++){
				if(from.equals(TDB.TrainArray[i].PassStation[j])){
					for(int l=j+1;l<TDB.TrainArray[i].PassStation.length;l++){
						if(to.equals(TDB.TrainArray[i].PassStation[l])){
							matchTrainAry[k]=TDB.TrainArray[i];
							matchTrainAry[k].UnitPrice=100*(l-j);
							k++;
							continue a;
								}
								
							}
								
						}
						
					}
				}
			Train []temp=new Train[k];
			for(int i=0;i<k;i++)
				temp[i]=matchTrainAry[i];
		return temp;
	}
   
	
	public static boolean b1=false;

	public static Train queryTrain(Train oTrain, int num){
		b1=false;
		Train matchTrain = null;
		
		int start = 0,end=0;
		for(int i=0;i<oTrain.PassStation.length;i++){
			if(oTrain.PassStation[i].equals(f)){
				start=i;
				for(int j=start+1;i<oTrain.PassStation.length;i++){
					if((oTrain.PassStation[i].equals(t))){
						end=i;
						}
				}
				}
		}
		
		for(int i=start;i<=end;i++){
			if(oTrain.SeatNum[i]>num){
				oTrain.SeatNum[i]=oTrain.SeatNum[i]-num;
				b1=true;
			}
		}
		
		matchTrain=oTrain;
		return matchTrain;
	}
}