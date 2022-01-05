class RocketBehaviourTest{
	public static void main(String []args){
		RocketBehaviour.stage();
		int index=1;
		RocketBehaviour.stage(index);
		short stages=10;String Parallelstages="stage";
		RocketBehaviour.stage(stages,Parallelstages);
		String beforestaging="";short afterstaging=1;
		RocketBehaviour.stage(beforestaging,afterstaging);
		System.out.println("---------------");
		
		RocketBehaviour.payload();
		int i=1;
		RocketBehaviour.payload(i);
		short payloads=10;String Satellite="payload";
		RocketBehaviour.payload(payloads,Satellite);
		String single="";short stagers=1;
		RocketBehaviour.payload(single,stagers);
		System.out.println("---------------");
		
	    RocketBehaviour.range();
		int j=1;
		RocketBehaviour.range(j);
		short effectivefirerange=10;String Maximumfirerange="range";
		RocketBehaviour.range(effectivefirerange,Maximumfirerange);
		String succeed="";short attack=1;
		RocketBehaviour.range(succeed,attack);
		System.out.println("---------------");
		
		RocketBehaviour.speed();
		int k=1;
		RocketBehaviour.speed(k);
		short speeds=10;String Highspeed="speed";
		RocketBehaviour.speed(speeds,Highspeed);
		String fast="";short slow=1;
		RocketBehaviour.speed(fast,slow);
		System.out.println("---------------");
		
		RocketBehaviour.type();
		int l=1;
		RocketBehaviour.type(l);
		short types=10;String Chandrayana="type";
		RocketBehaviour.type(types,Chandrayana);
		String nasa="";short isro=1;
		RocketBehaviour.type(nasa,isro);
		System.out.println("---------------");
		
	}
	
}