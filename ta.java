class tatti{
	int a;
	tatti (int x){
		this.a = x;
	}
	public static void main(String d[]){
		tatti x = new tatti(1);
		tatti y = new tatti(1);
		if(x==y){
			System.out.println("equal");
		}else
			System.out.println("NO");

		System.out.println("x   =  "+x+"    y  =  "+y);
	}
	public int hashCode(){
		return this.a;
	}
}