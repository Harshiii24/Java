class NumberPattern {
    public static void main(String[] args) {
        int rows = 5;
		int a = 0;
        for (int i = 1; i <= rows; i++) {
			a+=i;
            for (int j = 0; j < i; j++) {
                System.out.print(a-j+" ");
            }
			System.out.println(); 
        }
    }
}

//output :-
//1
//3 2
//6 5 4 
//10 9 8 7
//15 14 13 12 11