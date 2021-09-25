package net.consumerfed.enmal.models;

/**
 * 
 */

/**
 * @author Bithesh
 *
 */
public class Mozhi {

	String []aa = {"Þ","¦"};
	String []e = {"æ","®"};
	String []ee = {"ç","¯"};
	String []u = {"á","©"};
	String []uu = {"â","ª"};
	String []i = {"ß","§"};
	String []ii = {"à","¨"};
	String []ai = {"è","æ®"};
	String []o = {"à","²"};
	String []oo = {"à","³"}; 
	String []ou = {"ì","³"};
	String tilt = "í";

	public String getMalayalam(String engWord) {
		String englishWord = engWord;
		String malWord = englishWord.replaceAll("who is the author", "Èßç¼×í µáÎÞV");
		/*
		malWord = malWord.replaceAll("ni", "Èß");
		malWord = malWord.replaceAll("jE", "ç¼");
		malWord = malWord.replaceAll("ja", "¼Þ");
		malWord = malWord.replaceAll("va", "Õ");
		malWord = malWord.replaceAll("bi", "Ìß");
		malWord = malWord.replaceAll("the", "çÄ");
		malWord = malWord.replaceAll("sh", "×í");
		*/
		
		//kootaksharangal 3 combination
		malWord = malWord.replaceAll("ksh", "f");
		
		//venganaksharangal
		malWord = malWord.replaceAll("kh", "¶");
		malWord = malWord.replaceAll("gh", "¸");
		malWord = malWord.replaceAll("ng", "¹");
		malWord = malWord.replaceAll("jh", "½");
		malWord = malWord.replaceAll("nj", "¾");
		malWord = malWord.replaceAll("Th", "À");
		malWord = malWord.replaceAll("Dh", "Â");
		malWord = malWord.replaceAll("nn", "K");
		malWord = malWord.replaceAll("ph", "Ë");
		malWord = malWord.replaceAll("bh", "Í");
		malWord = malWord.replaceAll("sh", "×");
		malWord = malWord.replaceAll("zh", "Ý");
		malWord = malWord.replaceAll("th", "Å");
		
		//double 
		malWord = malWord.replaceAll("tt", "J");
		
		//chillaksharangal 2 combination
		//malWord = malWord.replaceAll("n^", "X");
		malWord = malWord.replaceAll("[A-Za-z]n\\b", "X");  // ends with n preceed by a charZ
		malWord = malWord.replaceAll("[A-Za-z]l\\b", "Z");
		malWord = malWord.replaceAll("[A-Za-z]L\\b", "Z");
		malWord = malWord.replaceAll("[A-Za-z]r\\b", "V");
		
		// ko kO
		//if(malWord)
		
		
		//vowels 2 combination
		malWord = malWord.replaceAll(" ou", " "+ou[1]);
		malWord = malWord.replaceAll("ou", ou[0]);
		malWord = malWord.replaceAll(" ai", " "+ai[1]);
		malWord = malWord.replaceAll("ai", ai[0]);
	
		//malWord = malWord.replaceAll("R^", "«");
		/*
		//endswith
		if(malWord.endsWith("n")){
			malWord = malWord.replaceAll("n", "X");
		}
		*/
		malWord = malWord.replaceAll("k", "µ");
		malWord = malWord.replaceAll("g", "·");
		malWord = malWord.replaceAll("c", "º");
		malWord = malWord.replaceAll("C", "ºî");
		malWord = malWord.replaceAll("j", "¼");
		malWord = malWord.replaceAll("T", "¿");
		malWord = malWord.replaceAll("D", "Á");
		malWord = malWord.replaceAll("p", "É");
		malWord = malWord.replaceAll("b", "Ì");
		malWord = malWord.replaceAll("m", "Î");
		malWord = malWord.replaceAll("y", "Ï");
		malWord = malWord.replaceAll("r", "ø");
		malWord = malWord.replaceAll("l", "Ü");
		malWord = malWord.replaceAll("v", "Õ");
		malWord = malWord.replaceAll("S", "Ö");
		malWord = malWord.replaceAll("h", "Ù");
		malWord = malWord.replaceAll("L", "{");
		malWord = malWord.replaceAll("R", "ù");
		malWord = malWord.replaceAll("s", "Ø");
		malWord = malWord.replaceAll("t", "Ä");
		malWord = malWord.replaceAll("n", "È");
		malWord = malWord.replaceAll("f", "Ë");
		
		//kootaksharangal
		
		malWord = malWord.replaceAll("M", "N");
		malWord = malWord.replaceAll("P", "M");
		
		//chinnangal (sign)
		malWord = malWord.replaceAll("~", tilt);
		//malWord = malWord.replaceAll("d", "ÆàÉ");
		
		//chillaksharangal
		//malWord = malWord.replaceAll("n", "X");
		
		//vowels 
		malWord = malWord.replaceAll(" a", " ¥");
		malWord = malWord.replaceAll("a", " ");
		malWord = malWord.replaceAll(" A", " "+aa[1]);
		malWord = malWord.replaceAll("A", aa[0]);
		malWord = malWord.replaceAll(" e", " "+e[1]);
		malWord = malWord.replaceAll("e", e[0]);
		malWord = malWord.replaceAll(" E", " "+ee[1]);
		malWord = malWord.replaceAll("E", ee[0]);
		malWord = malWord.replaceAll(" u", " "+u[1]);
		malWord = malWord.replaceAll("u", u[0]);
		malWord = malWord.replaceAll(" U", " "+uu[1]);
		malWord = malWord.replaceAll("U", uu[0]);
		malWord = malWord.replaceAll(" i", " "+i[1]);
		malWord = malWord.replaceAll("i", i[0]);
		malWord = malWord.replaceAll(" I", " "+ii[1]);
		malWord = malWord.replaceAll("I", ii[0]);
		malWord = malWord.replaceAll(" o", " "+o[1]);
		malWord = malWord.replaceAll("o", o[0]);
		malWord = malWord.replaceAll(" O", " "+oo[1]);
		malWord = malWord.replaceAll("O", oo[0]);


		//malWord.
		
		
		return malWord;
	}

}
