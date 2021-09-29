//26-10-20
class BaxMain
{
	public static void main(String ar[])
	{
		Bax p,q;
		p=new Bax();
		q=new Bax(4,3,2);
		double Area,Volume;
		Area=p.area();				//0.0
		Volume=p.volume();			//0.0
		System.out.println("\nArea = "+Area+" Volume = "+Volume);
		Area=q.area();				//60.0
		Volume=q.volume();			//24.0
		System.out.println("\nArea = "+Area+" Volume = "+Volume);
	}
}
