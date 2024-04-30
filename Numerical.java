public class Numerical{






	

	public double integrate(Function f,double a, double b){

		double sum = 0.0;
		double i=0.0;
		double j=0.0;
		if(a>b){// i kucuk olan j buyuk olan aralık
			i=b;
			j=a;
			
		}else{ 
			i=a;
			j=b;
		}
		for(double x=i;x<j; x+= 0.01){// kucuk aralıktan buyuk aralıga dogru gidiyor.
			sum += (((f.evaluate(x)+f.evaluate(x+0.01))/2)*0.01);

		}
	
		return sum;

	}






	public double findRoot(Function f,double a, double b){
		double i=0.0;
		double j=0.0;
		double kok= 0.0;			
		if(a>b){// i kucuk olan j buyuk olan aralık
			i=b;
			j=a;
			
		}else{ 
			i=a;
			j=b;
		}

		if(f.evaluate(i)*f.evaluate(j)>0){
			System.out.println("Girilen a ve b aralıgında  tek kok yoktur.");
			System.exit(0);
		}else{
			
			double fark = j-i;
			double ortaDeger=(i+j/2);
			while(fark>0.001){
				if(f.evaluate(i)*f.evaluate(ortaDeger)<0){// i kucuk olan j ise buyuk olan aralıklar arasında.
					j=ortaDeger;
					kok=ortaDeger;
				}else if(f.evaluate(ortaDeger)*f.evaluate(j)<0){
					i=ortaDeger;
					kok=ortaDeger;

				}
				fark = j-i;
				ortaDeger=(i+j)/2;		

			} 


		}

		return kok;


	}

}

		
	
	
						
		
