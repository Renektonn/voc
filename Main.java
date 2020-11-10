package vocTest;
//write in
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		String [] eng = {"employ","employer","employee","employment","corporation",
				"corporate","suffer","terminal","terminal","illness","ill",
				"tremendously","tremendous","laughter","frighten","fright","contact",
				"contact","contact","germ","warmth","warmth","frail","prompt","prompt"
				,"pale","confine","confine","sparkle","sparkle","hug","hug","drowsy",
				"stretch","stretch","refuse","refusal","hesitate","hesitation","promise",
				"promise","material","mention","structure","capable","capability",
				"collaborate","collaboration","architect","architecture","graduate","graduate"
				,"graduation","construct","construction","construction","constructive",
				"slightly","slight","rank","ranking","unique","innovative","innovate",
				"innovation","adjust","adjustment","rely","reliable","feedback","element",
				"elementary","stability","stable","route","explore","exploration",
				"humankind","universe","universal","fur","fur","enable","upright",
				"upright","generous","generosity","conflict","conflict",
				"distribution","distribute","benefit","benefit","benefit",
				"beneficial","slaughter","slaughter","slaughter","underneath",
				"freeze","freeze","victim","miserable","misery","hollow",
				"furious","fury","theft","punish","punishment","banish",
				"banishment","torture","torture","civilization","artificial",
				"coralreef","ridiculous","layer","electronic","electronic",
				"electricity","equip","equipment","flex","flexible","relatively",
				"relative","relative","temperature","precious","balance",
				"balance","balance","balance","habitat","texture","erect",
				"reduce","reduction","assemble","individual","individual"
		};
		
		for(int i=0 ; i<eng.length ; i++) {
			try{
				
				String data = eng[i];
				File file =new File("voc.txt");
				//if file doesn't exists, then create it
				//if(!file.exists()){
					//file.createNewFile();
				//}
				//true = append file
				FileWriter fileWritter = new FileWriter(file.getName(),true);
				BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
				bufferWritter.write(data);
				bufferWritter.write("\n");
				bufferWritter.close();
				//System.out.println("Done");
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
		

}

