//DEMO1 FOR EXAMPLE ON PROMITIVE CASTING
public class DEMO1
{
	public static void main(String[]arg)
	{
		long x=120000;				//IMPLICITLY CONVERTS INTO LONG FROM INT(WIDENING)
		long y=3500000000L;			//EXPLICITLY CONVERTS INTO LONG FROM INT(WIDENING)
		byte n=123;					//IMPLICITLY CONVERTS INTO BYTE FROM INT(NARROWING)
		float z=(float)100.89;		//IMPLICITLY CONVERTS INTO FLOAT FROM DOUBLE(WIDENING)
		/*boolean b=(boolean)1;*/	//CTE NO RELATION BETWEEN INT AND BOOLEAN DATA TYPES
		System.out.println("X	:"+x);
		System.out.println("Y	:"+y);
		System.out.println("N	:"+n);
		System.out.println("Z	:"+z);
	}
}