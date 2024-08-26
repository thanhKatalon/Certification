import java.nio.file.Path
import java.nio.file.Paths

//Path userHome = Paths.get(System.getProperty("user.home"));
//Path downloadsDirectory = userHome.resolve("Downloads");
////Path filePath = downloadsDirectory.resolve(fileName);
//
//File[] listofFiles = downloadsDirectory.listFiles()
//
//boolean found = false;
//
//File f= null;
//
//for(File listOfFile : listofFiles) {
//
//if(listOfFile.isFile()) {
//	
//	String FileName = listOfFile.getName();
//	
//	if(FileName.matches("MaxValue.txt")) {
//	
//	File fileD = new File(userHome + "/Downloads/MaxValue.txt");
//	
//	fileD.delete();
//	
//	found=true;
//	
//	break;
//	
//	}
//	
//	}
//	
//	}
//	
//	assert found==true;
	


String home = System.getProperty("user.home");

File userDownloads = new File(home+"/Downloads/");

File[] listofFiles = userDownloads.listFiles();

boolean found = false;

File f= null;

for(File listOfFile : listofFiles) {

if(listOfFile.isFile()) {

String FileName = listOfFile.getName();

if(FileName.matches("MaxValue.txt")) {

File fileD = new File(home + "/Downloads/MaxValue.txt");

fileD.delete();

found=true;

break;

}

}

}

assert found==true;

