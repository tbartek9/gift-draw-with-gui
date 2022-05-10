package drawApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
 
public class Draw  {
	public int ile_osob;
	public String imie1;
	
	public Draw() {
		ile_osob=10;
		
	}
	public String[] losuj(String[] names) {
		Random generator = new Random();
		int los;
		String losy[]= {" "," "," "," "," "," "," "," "," "," "};		
		if (ile_osob == 3) {
			boolean zajete[]= {false,false,false};
			boolean flaga=false;
			while(!flaga) {
				los=generator.nextInt(3);
				if ((!zajete[los])&  (los!=0)) {
					flaga=true;
					zajete[los]=true;
					losy[0]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(3);
				if ((!zajete[los]) &  (los!=1)) {
					flaga=true;
					zajete[los]=true;
					losy[1]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(3);
				if ((!zajete[los]) &  (los!=2)) {
					flaga=true;
					zajete[los]=true;
					losy[2]=names[los];
				}
			}
			
		} //koniec 3 osoby
		if (ile_osob == 4) {
			boolean zajete[]= {false,false,false,false};
			boolean flaga=false;
			while(!flaga) {
				los=generator.nextInt(4);
				if ((!zajete[los])&  (los!=0)) {
					flaga=true;
					zajete[los]=true;
					losy[0]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(4);
				if ((!zajete[los]) &  (los!=1)) {
					flaga=true;
					zajete[los]=true;
					losy[1]=names[los];
					
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(4);
				if ((!zajete[los]) &  (los!=2)) {
					flaga=true;
					zajete[los]=true;
					losy[2]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(4);
				if ((!zajete[los]) &  (los!=3)) {
					flaga=true;
					zajete[los]=true;
					losy[3]=names[los];
				}
			}
			
		} ///koniec 4 osoby
		if (ile_osob == 5) {
			boolean zajete[]= {false,false,false,false,false};
			boolean flaga=false;
			while(!flaga) {
				los=generator.nextInt(5);
				if ((!zajete[los])&  (los!=0)) {
					flaga=true;
					zajete[los]=true;
					losy[0]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(5);
				if ((!zajete[los]) &  (los!=1)) {
					flaga=true;
					zajete[los]=true;
					losy[1]=names[los];
					
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(5);
				if ((!zajete[los]) &  (los!=2)) {
					flaga=true;
					zajete[los]=true;
					losy[2]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(5);
				if ((!zajete[los]) &  (los!=3)) {
					flaga=true;
					zajete[los]=true;
					losy[3]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(5);
				if ((!zajete[los]) &  (los!=4)) {
					flaga=true;
					zajete[los]=true;
					losy[4]=names[los];
				}
			}
			
		} ///koniec 5 osoby
		if (ile_osob == 6) {
			boolean zajete[]= {false,false,false,false,false,false};
			boolean flaga=false;
			while(!flaga) {
				los=generator.nextInt(6);
				if ((!zajete[los])) {
					flaga=true;
					zajete[los]=true;
					losy[0]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(6);
				if ((!zajete[los]) &  (los!=1)) {
					flaga=true;
					zajete[los]=true;
					losy[1]=names[los];
					
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(5);
				if ((!zajete[los]) &  (los!=2)) {
					flaga=true;
					zajete[los]=true;
					losy[2]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(6);
				if ((!zajete[los]) &  (los!=3)) {
					flaga=true;
					zajete[los]=true;
					losy[3]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(6);
				if ((!zajete[los]) &  (los!=4)) {
					flaga=true;
					zajete[los]=true;
					losy[4]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(6);
				if ((!zajete[los]) &  (los!=5)) {
					flaga=true;
					zajete[los]=true;
					losy[5]=names[los];
				}
			}
			
		} ///koniec 6 osoby
		if (ile_osob == 7) {
			boolean zajete[]= {false,false,false,false,false,false,false};
			boolean flaga=false;
			while(!flaga) {
				los=generator.nextInt(7);
				if ((!zajete[los])&  (los!=0)) {
					flaga=true;
					zajete[los]=true;
					losy[0]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(7);
				if ((!zajete[los]) &  (los!=1)) {
					flaga=true;
					zajete[los]=true;
					losy[1]=names[los];
					
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(7);
				if ((!zajete[los]) &  (los!=2)) {
					flaga=true;
					zajete[los]=true;
					losy[2]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(7);
				if ((!zajete[los]) &  (los!=3)) {
					flaga=true;
					zajete[los]=true;
					losy[3]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(7);
				if ((!zajete[los]) &  (los!=4)) {
					flaga=true;
					zajete[los]=true;
					losy[4]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(7);
				if ((!zajete[los]) &  (los!=5)) {
					flaga=true;
					zajete[los]=true;
					losy[5]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(7);
				if ((!zajete[los]) &  (los!=6)) {
					flaga=true;
					zajete[los]=true;
					losy[6]=names[los];
				}
			}
			
		} ///koniec 7 osoby
		if (ile_osob == 8) {
			boolean zajete[]= {false,false,false,false,false,false,false,false};
			boolean flaga=false;
			while(!flaga) {
				los=generator.nextInt(8);
				if ((!zajete[los])&  (los!=0)) {
					flaga=true;
					zajete[los]=true;
					losy[0]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(8);
				if ((!zajete[los]) &  (los!=1)) {
					flaga=true;
					zajete[los]=true;
					losy[1]=names[los];
					
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(8);
				if ((!zajete[los]) &  (los!=2)) {
					flaga=true;
					zajete[los]=true;
					losy[2]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(8);
				if ((!zajete[los]) &  (los!=3)) {
					flaga=true;
					zajete[los]=true;
					losy[3]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(8);
				if ((!zajete[los]) &  (los!=4)) {
					flaga=true;
					zajete[los]=true;
					losy[4]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(8);
				if ((!zajete[los]) &  (los!=5)) {
					flaga=true;
					zajete[los]=true;
					losy[5]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(8);
				if ((!zajete[los]) &  (los!=6)) {
					flaga=true;
					zajete[los]=true;
					losy[6]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(8);
				if ((!zajete[los]) &  (los!=7)) {
					flaga=true;
					zajete[los]=true;
					losy[7]=names[los];
				}
			}
			
		} ///koniec 8 osoby
		if (ile_osob == 9) {
			boolean zajete[]= {false,false,false,false,false,false,false,false,false};
			boolean flaga=false;
			while(!flaga) {
				los=generator.nextInt(9);
				if ((!zajete[los])&  (los!=0)) {
					flaga=true;
					zajete[los]=true;
					losy[0]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(9);
				if ((!zajete[los]) & (los!=1)) {
					flaga=true;
					zajete[los]=true;
					losy[1]=names[los];
					
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(9);
				if ((!zajete[los]) &  (los!=2)) {
					flaga=true;
					zajete[los]=true;
					losy[2]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(9);
				if ((!zajete[los]) &  (los!=3)) {
					flaga=true;
					zajete[los]=true;
					losy[3]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(9);
				if ((!zajete[los]) &  (los!=4)) {
					flaga=true;
					zajete[los]=true;
					losy[4]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(9);
				if ((!zajete[los]) &  (los!=5)) {
					flaga=true;
					zajete[los]=true;
					losy[5]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(9);
				if ((!zajete[los]) &  (los!=6)) {
					flaga=true;
					zajete[los]=true;
					losy[6]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(9);
				if ((!zajete[los]) &  (los!=7)) {
					flaga=true;
					zajete[los]=true;
					losy[7]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(9);
				if ((!zajete[los]) &  (los!=8)) {
					flaga=true;
					zajete[los]=true;
					losy[8]=names[los];
				}
			}
			
		} ///koniec 9
		if (ile_osob == 10) {
			boolean zajete[]= {false,false,false,false,false,false,false,false,false,false};
			boolean flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=0)) {
					flaga=true;
					zajete[los]=true;
					losy[0]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=1)) {
					flaga=true;
					zajete[los]=true;
					losy[1]=names[los];
					
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=2)) {
					flaga=true;
					zajete[los]=true;
					losy[2]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=3)) {
					flaga=true;
					zajete[los]=true;
					losy[3]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=4)) {
					flaga=true;
					zajete[los]=true;
					losy[4]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=5)) {
					flaga=true;
					zajete[los]=true;
					losy[5]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=6)) {
					flaga=true;
					zajete[los]=true;
					losy[6]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=7)) {
					flaga=true;
					zajete[los]=true;
					losy[7]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=8)) {
					flaga=true;
					zajete[los]=true;
					losy[8]=names[los];
				}
			}
			flaga=false;
			while(!flaga) {
				los=generator.nextInt(10);
				if ((!zajete[los]) &  (los!=9)) {
					flaga=true;
					zajete[los]=true;
					losy[9]=names[los];
				}
			}
		} ///koniec 10
		return losy;
	}
		
	
	public String[] losuj_jawnie(String[] names) {
		String losy[]=losuj(names);
		return losy;
	}
	public void losuj_do_plikow(String[] names) throws IOException {
		String losy[]=losuj(names);
		for(int i=0;i<ile_osob;i++) {
		try {
			Files.createFile(Paths.get(names[i]+".txt"));
			FileWriter myWriter = new FileWriter(names[i]+".txt");
			myWriter.write(losy[i]);
			myWriter.close();
		}
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		}
		////tu obsluga plikow
	}
}
