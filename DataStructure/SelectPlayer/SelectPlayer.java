package DataStructure.SelectPlayer;

import java.util.*;

class Body implements Comparable<Body>{
    public int height, weight;
    Body(int h, int w) {
        this.height = h;
        this.weight = w;
    }
    @Override
    public int compareTo(Body o){
        return o.height-this.height;
    }
}

class Main {
	public int solution(ArrayList<Body> arr, int n){
		int cnt=0;
		Collections.sort(arr);
		int max=Integer.MIN_VALUE;
		for(Body body : arr){
			if(body.weight>max){
				max=body.weight;
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int h=sc.nextInt();
			int w=sc.nextInt();
			arr.add(new Body(h, w));
		}
		System.out.println(T.solution(arr, n));
	}
}