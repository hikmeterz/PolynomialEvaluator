import java.util.*;


	public class Function{


		private int x9KatSayisi=0;
		private int x8KatSayisi=0;
		private int x7KatSayisi=0;
		private int x6KatSayisi=0;
		private int x5KatSayisi=0;
		private int x4KatSayisi=0;
		private int x3KatSayisi=0;
		private int x2KatSayisi=0;
		private int x1KatSayisi=0;
		private int sabit=0;
		//private String pol="";


		public void readFunction(){


			Scanner k=new Scanner(System.in);
			System.out.print("polinomu giriniz: ");
			String polinom=k.nextLine();
			//pol=polinom;
			int terimIndex=-1;
			String terim="";
			int indexSapka=-1;
			while(polinom.length()!=0){
					for(int i=0;i<polinom.length();i++){
						
						if(polinom.charAt(i)=='+' || polinom.charAt(i)=='-'){
							if(i==0){ 
								continue;
							}
							terimIndex=i;
							break;// for dongusunden cıkıcak.
						}
						else if(i==polinom.length()-1){
							terimIndex=polinom.length()-1;// eger en sonunda + veya - yoksa 
							break;
						}
					 
					}
					if(terimIndex==polinom.length()-1){// tek terimli veya son terime bakıyoruz
						terim=polinom.substring(0);
						polinom="";
					}else{
						terim = polinom.substring(0,terimIndex);//terim her defasında tekrar yenileniyor.
						polinom= polinom.substring(terimIndex);
					}
											
					indexSapka=terim.indexOf('^');
					int indexX = terim.indexOf('x');
					if(indexSapka<0){

						if(indexX<0){// yani sabit sayı ise
							if(terim.length()==1)// sadece 6 ise ornegin.
								sabit= terim.charAt(0)-'0';
							else{
								char isaret=terim.charAt(0);
								if(isaret =='+')
									sabit= terim.charAt(1)-'0';
								else if(isaret =='-')
									sabit=(terim.charAt(1)-'0')*(-1);
							}		
								

						}else{// x varsa ve sapka yoksa


							if(terim.length()==1){
								x1KatSayisi=1;
							}else{

								int katSayiX= terim.charAt(indexX-1);//xten bir onceki + mı - yoksa sayı mı.// asciideki sayısını tutuyorx
								switch(katSayiX){
			
									case 48://yani x1 katSayı 0 ise
										x1KatSayisi=0;
										break;
									case 49:
										x1KatSayisi=1;
										break;
									case 50:
										x1KatSayisi=2;
										break;
									case 51:
										x1KatSayisi=3;
										break;
									case 52:
										x1KatSayisi=4;
										break;
									case 53:
										x1KatSayisi=5;
										break;
									case 54:
										x1KatSayisi=6;
										break;
									case 55:
										x1KatSayisi=7;
										break;
									case 56:
										x1KatSayisi=8;
										break;
									case 57:
										x1KatSayisi=9;
										break;
									case 43:
										x1KatSayisi=1;
										break;
									case 45:
										x1KatSayisi=-1;
										break;
									
								}
							

								if(terim.length()==3){//+6x örnek
						
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x1KatSayisi =x1KatSayisi *1;
									}else if(artıEksi==45){
										x1KatSayisi = x1KatSayisi * (-1);
									}	
								}
							}
						}
											
					//else yani terimde sapka varsa ki x haric hepsinde sapka olucak.
					}else{
						
						int us= indexSapka+1;// sapkadan sonraki yer index.
						if(terim.charAt(us)==57){// us 9 ise.
								
							if(terim.length()==3){
								x9KatSayisi=1;
							}else{

								int katSayiX9= terim.charAt(indexX-1);//katsayı 							
						
								switch(katSayiX9){
			
									case 48:
										x9KatSayisi=0;
										break;
									case 49:
										x9KatSayisi=1;
										break;
									case 50:
										x9KatSayisi=2;
										break;
									case 51:
										x9KatSayisi=3;
										break;
									case 52:
										x9KatSayisi=4;
										break;
									case 53:
										x9KatSayisi=5;
										break;
									case 54:
										x9KatSayisi=6;
										break;
									case 55:
										x9KatSayisi=7;
										break;
									case 56:
										x9KatSayisi=8;
										break;
									case 57:
										x9KatSayisi=9;
										break;
									case 43:
										x9KatSayisi=1;
										break;
									case 45:
										x9KatSayisi=-1;
			
								
								}
								

							

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x9KatSayisi =x9KatSayisi *1;
									}else if(artıEksi==45){
										x9KatSayisi = x9KatSayisi * (-1);
									}	
								}
											

							}

						// us 9 iseyi kapattık+
						}else if(terim.charAt(us)==56){
							if(terim.length()==3){
								x8KatSayisi=1;
							}else{

								int katSayiX8= terim.charAt(indexX-1);//katsayı 							
						
								switch(katSayiX8){
			
									case 48:
										x8KatSayisi=0;
										break;
									case 49:
										x8KatSayisi=1;
										break;
									case 50:
										x8KatSayisi=2;
										break;
									case 51:
										x8KatSayisi=3;
										break;
									case 52:
										x8KatSayisi=4;
										break;
									case 53:
										x8KatSayisi=5;
										break;
									case 54:
										x8KatSayisi=6;
										break;
									case 55:
										x8KatSayisi=7;
										break;
									case 56:
										x8KatSayisi=8;
										break;
									case 57:
										x8KatSayisi=9;
										break;
									case 43:
										x8KatSayisi=1;
										break;
									case 45:
										x8KatSayisi=-1;
			
								
								}
								

							

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x8KatSayisi =x8KatSayisi *1;
									}else if(artıEksi==45){
										x8KatSayisi = x8KatSayisi * (-1);
									}	
								}
											

							}

						}else if(terim.charAt(us)==55){
							if(terim.length()==3){
								x7KatSayisi=1;
							}else{

								int katSayiX7= terim.charAt(indexX-1);//katsayı 							
						
								switch(katSayiX7){
			
									case 48:
										x7KatSayisi=0;
										break;
									case 49:
										x7KatSayisi=1;
										break;
									case 50:
										x7KatSayisi=2;
										break;
									case 51:
										x7KatSayisi=3;
										break;
									case 52:
										x7KatSayisi=4;
										break;
									case 53:
										x7KatSayisi=5;
										break;
									case 54:
										x7KatSayisi=6;
										break;
									case 55:
										x7KatSayisi=7;
										break;
									case 56:
										x7KatSayisi=8;
										break;
									case 57:
										x7KatSayisi=9;
										break;
									case 43:
										x7KatSayisi=1;
										break;
									case 45:
										x7KatSayisi=-1;
			
								
								}
								

								

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x7KatSayisi =x7KatSayisi *1;
									}else if(artıEksi==45){
										x7KatSayisi = x7KatSayisi * (-1);
									}	
								}
											

							}

						}else if(terim.charAt(us)==54){
							if(terim.length()==3){
								x6KatSayisi=1;
							}else{

								int katSayiX6= terim.charAt(indexX-1);//katsayı 							
						
								switch(katSayiX6){
			
									case 48:
										x6KatSayisi=0;
										break;
									case 49:
										x6KatSayisi=1;
										break;
									case 50:
										x6KatSayisi=2;
										break;
									case 51:
										x6KatSayisi=3;
										break;
									case 52:
										x6KatSayisi=4;
										break;
									case 53:
										x6KatSayisi=5;
										break;
									case 54:
										x6KatSayisi=6;
										break;
									case 55:
										x6KatSayisi=7;
										break;
									case 56:
										x6KatSayisi=8;
										break;
									case 57:
										x6KatSayisi=9;
										break;
									case 43:
										x6KatSayisi=1;
										break;
									case 45:
										x6KatSayisi=-1;
			
								
								}
								

							

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x6KatSayisi =x6KatSayisi *1;
									}else if(artıEksi==45){
										x6KatSayisi = x6KatSayisi * (-1);
									}	
								}
											

							}

						}else if(terim.charAt(us)==53){
							if(terim.length()==3){
								x5KatSayisi=1;
							}else{

								int katSayiX5= terim.charAt(indexX-1);//katsayı 							
						
								switch(katSayiX5){
			
									case 48:
										x5KatSayisi=0;
										break;
									case 49:
										x5KatSayisi=1;
										break;
									case 50:
										x5KatSayisi=2;
										break;
									case 51:
										x5KatSayisi=3;
										break;
									case 52:
										x5KatSayisi=4;
										break;
									case 53:
										x5KatSayisi=5;
										break;
									case 54:
										x5KatSayisi=6;
										break;
									case 55:
										x5KatSayisi=7;
										break;
									case 56:
										x5KatSayisi=8;
										break;
									case 57:
										x5KatSayisi=9;
										break;
									case 43:
										x5KatSayisi=1;
										break;
									case 45:
										x5KatSayisi=-1;
			
								
								}
								

							

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x5KatSayisi =x5KatSayisi *1;
									}else if(artıEksi==45){
										x5KatSayisi = x5KatSayisi * (-1);
									}	
								}
											

							}

						}else if(terim.charAt(us)==52){
							if(terim.length()==3){
								x4KatSayisi=1;
							}else{

								int katSayiX4= terim.charAt(indexX-1);//katsayı 							
						
								switch(katSayiX4){
			
									case 48:
										x4KatSayisi=0;
										break;
									case 49:
										x4KatSayisi=1;
										break;
									case 50:
										x4KatSayisi=2;
										break;
									case 51:
										x4KatSayisi=3;
										break;
									case 52:
										x4KatSayisi=4;
										break;
									case 53:
										x4KatSayisi=5;
										break;
									case 54:
										x4KatSayisi=6;
										break;
									case 55:
										x4KatSayisi=7;
										break;
									case 56:
										x4KatSayisi=8;
										break;
									case 57:
										x4KatSayisi=9;
										break;
									case 43:
										x4KatSayisi=1;
										break;
									case 45:
										x4KatSayisi=-1;
			
								
								}
								

							

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x4KatSayisi =x4KatSayisi *1;
									}else if(artıEksi==45){
										x4KatSayisi = x4KatSayisi * (-1);
									}	
								}
											

							}
						}else if(terim.charAt(us)==51){
							if(terim.length()==3){
								x3KatSayisi=1;
							}else{

								int katSayiX3= terim.charAt(indexX-1);//katsayı 							
						
								switch(katSayiX3){
			
									case 48:
										x3KatSayisi=0;
										break;
									case 49:
										x3KatSayisi=1;
										break;
									case 50:
										x3KatSayisi=2;
										break;
									case 51:
										x3KatSayisi=3;
										break;
									case 52:
										x3KatSayisi=4;
										break;
									case 53:
										x3KatSayisi=5;
										break;
									case 54:
										x3KatSayisi=6;
										break;
									case 55:
										x3KatSayisi=7;
										break;
									case 56:
										x3KatSayisi=8;
										break;
									case 57:
										x3KatSayisi=9;
										break;
									case 43:
										x3KatSayisi=1;
										break;
									case 45:
										x3KatSayisi=-1;
			
								
								}
								

							

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x3KatSayisi =x3KatSayisi *1;
									}else if(artıEksi==45){
										x3KatSayisi = x3KatSayisi * (-1);
									}	
								}
											

							}
						}else if(terim.charAt(us)==50){
							if(terim.length()==3){
								x2KatSayisi=1;
							}else{

								int katSayiX2= terim.charAt(indexX-1);//katsayı 							
						
								switch(katSayiX2){
			
									case 48:
										x2KatSayisi=0;
										break;
									case 49:
										x2KatSayisi=1;
										break;
									case 50:
										x2KatSayisi=2;
										break;
									case 51:
										x2KatSayisi=3;
										break;
									case 52:
										x2KatSayisi=4;
										break;
									case 53:
										x2KatSayisi=5;
										break;
									case 54:
										x2KatSayisi=6;
										break;
									case 55:
										x2KatSayisi=7;
										break;
									case 56:
										x2KatSayisi=8;
										break;
									case 57:
										x2KatSayisi=9;
										break;
									case 43:
										x2KatSayisi=1;
										break;
									case 45:
										x2KatSayisi=-1;
			
								
								}
								

							

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x2KatSayisi =x2KatSayisi *1;
									}else if(artıEksi==45){
										x2KatSayisi = x2KatSayisi * (-1);
									}	
								}
											

							}


						}else if(terim.charAt(us)==49){
							if(terim.length()==3){
								sabit=1;
							}else{

								int katSayiX1= terim.charAt(indexX-1);//katsayı 							
						
								switch(katSayiX1){
			
									case 48:
										x1KatSayisi=0;
										break;
									case 49:
										x1KatSayisi=1;
										break;
									case 50:
										x1KatSayisi=2;
										break;
									case 51:
										x1KatSayisi=3;
										break;
									case 52:
										x1KatSayisi=4;
										break;
									case 53:
										x1KatSayisi=5;
										break;
									case 54:
										x1KatSayisi=6;
										break;
									case 55:
										x1KatSayisi=7;
										break;
									case 56:
										x1KatSayisi=8;
										break;
									case 57:
										x1KatSayisi=9;
										break;
									case 43:
										x1KatSayisi=1;
										break;
									case 45:
										x1KatSayisi=-1;
			
								
								}
								

							

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										x1KatSayisi =x1KatSayisi*1;
									}else if(artıEksi==45){
										x1KatSayisi = x1KatSayisi* (-1);
									}	
								}
							}
					
						}else if(terim.charAt(us)==48){
							if(terim.length()==3){
								sabit=1;
							}else{

								int sabiti= terim.charAt(indexX-1);//katsayı 							
						
								switch(sabiti){
			
									case 48:
										sabit=0;
										break;
									case 49:
										sabit=1;
										break;
									case 50:
										sabit=2;
										break;
									case 51:
										sabit=3;
										break;
									case 52:
										sabit=4;
										break;
									case 53:
										sabit=5;
										break;
									case 54:
										sabit=6;
										break;
									case 55:
										sabit=7;
										break;
									case 56:
										sabit=8;
										break;
									case 57:
										sabit=9;
										break;
									case 43:
										sabit=1;
										break;
									case 45:
										sabit=-1;
			
								
								}
								

							

								if(terim.length()==5){
									
									int artıEksi= terim.charAt(indexX-2);
									if(artıEksi==43){
										sabit =sabit *1;
									}else if(artıEksi==45){
										sabit = sabit * (-1);
									}	
								}
											

							}

						}

					}

			}// while kapandı.	
								

		}// class kapandı.



		public double evaluate(double x){

			double deger1= (x1KatSayisi)*Math.pow(x,1);
			double deger2= (x2KatSayisi)*Math.pow(x,2);
			double deger3= (x3KatSayisi)*Math.pow(x,3);
			double deger4= (x4KatSayisi)*Math.pow(x,4);
			double deger5= (x5KatSayisi)*Math.pow(x,5);
			double deger6= (x6KatSayisi)*Math.pow(x,6);
			double deger7= (x7KatSayisi)*Math.pow(x,7);
			double deger8= (x8KatSayisi)*Math.pow(x,8);
			double deger9= (x9KatSayisi)*Math.pow(x,9);
			double deger10= sabit;
			

			double evaluate= deger1+deger2+deger3+deger4+deger5+deger6+deger7+deger8+deger9+deger10;



			return evaluate;

		}



		
		
		


	}








						

