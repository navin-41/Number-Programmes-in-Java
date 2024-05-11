package com.app;

import java.util.Scanner;

public class Nump {
	static Scanner sc = new Scanner(System.in);

	public void spy(int a) {
		System.out.println("Enter the Spy Number to End :");
		int n = sc.nextInt();
		System.out.println("Spy Numbers From " + a + " to " + n);
		for (int i = a; i <= n; i++) {
			a = i;
			int s = 0;
			int p = 1;
			while (a != 0) {
				int l = a % 10;
				s += l;
				p *= l;
				a = a / 10;
			}
			if (s == p) {
				System.out.println(i + " is Spy NUmber");
			} 
//			else {
//				System.out.println(i + " is Not a spy NUmber");
//			}
		}
		System.out.println("__________________________________________________________");
	}

	public void harshad(int h) {
		System.out.println("Enter the Harshad NUmber to End:");
		int n1 = sc.nextInt();
		System.out.println("Harshad Numbers From " + h + " to " + n1);
		for (int i = h; i <= n1; i++) {
			h = i;
			int h1 = h;
			int s = 0;
			while (h != 0) {
				int l1 = h % 10;
				s += l1;
				h /= 10;
			}
			if (h1 % s == 0) {
				System.out.println(h1 + " is Harshad NUmber");
			} 
//			else {
//				System.out.println(h1 + " is Not a Harshad NUmber");
//			}
		}
		System.out.println("__________________________________________________________");
	}

	public void neon(int n) {
		System.out.println("Enter the Neon NUmber to End :");
		int n2 = sc.nextInt();
		System.out.println("Neon Numbers From " + n + " to " + n2);
		for (int i = n; i <= n2; i++) {
			n = i;
			int n1 = n * n;
			int s = 0;
			while (n1 != 0) {
				int l = n1 % 10;
				s += l;
				n1 /= 10;
			}
			if (s == n) {
				System.out.println(n + " is Neon NUmber");
			}
//			else {
//				System.out.println(n + " is Not a Neon NUmber");
//			}
		}
		System.out.println("__________________________________________________________");
	}

	public void strong(int s) {
		System.out.println("Enter the Strong NUmbers to End :");
		int ed = sc.nextInt();
		System.out.println("Strong Numbers From " + s + " to " + ed);
		for (int i = s; i <= ed; i++) {
			s = i;
			int s1 = s;
			int sUm = 0;
			while (s != 0) {
				int l = s % 10;
				int p = 1;
				while (l != 0) {
					p *= l;
					l--;
				}
				sUm += p;
				s /= 10;
			}
			if (sUm == s1) {
				System.out.println(s1 + " is a Strong NUmber");
			} 
//			else {
//				System.out.println(s1 + " is Not a Strong NUmber");
//			}
		}
		System.out.println("__________________________________________________________");
	}

	public void even(int e) {
		System.out.println("Enter The Even & Odd Numbers End :");
		int en = sc.nextInt();
		System.out.println("Even and Odd Numbers From " + e + " to " + en);
		for (int i = e; i <= en; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is a Even Number");
			} else if (i % 2 == 1) {
				System.out.println(i + " is  a Odd Number");
			}
		}
		System.out.println("__________________________________________________________");
	}

	public void arm(int ar) {
		System.out.println("Enter The ArmStrong Number to End");
		int am = sc.nextInt();
		System.out.println("Arm Strong Numbers From " + ar + " to " + am);
		for (int i = ar; i <= am; i++) {
			ar = i;
			int ar1 = ar;
			int ar2 = ar;
			int sum = 0;
			int c = 0;
			while (ar != 0) {
				c++;
				ar = ar / 10;
			}
			while (ar1 != 0) {
				int prod = 1;
				int m = c;
				int l = ar1 % 10;
				while (m != 0) {
					prod *= l;
					m--;
				}
				sum += prod;
				ar1 = ar1 / 10;
			}
			if (sum == ar2) {
				System.out.println(i);
			}
		}
		System.out.println("__________________________________________________________");
	}

	public static void main(String[] args) {
		Nump U = new Nump();
		System.out.println("Enter the Spy NUmbers From yoU Want :");
		U.spy(sc.nextInt());

		Nump U1 = new Nump();
		System.out.println("Enter the Harshad NUmbers From yoU want :");
		U1.harshad(sc.nextInt());

		Nump U2 = new Nump();
		System.out.println("Enter the Neon NUmbers YoU Want :");
		U2.neon(sc.nextInt());

		Nump U3 = new Nump();
		System.out.println("Enter the Strong NUmbers from YoU Want :");
		U3.strong(sc.nextInt());

		Nump U4 = new Nump();
		System.out.println("Enter the Even NUmbers & Odd Numbers from YoU Want :");
		U4.even(sc.nextInt());

		Nump U5 = new Nump();
		System.out.println("Enter the ArmStrong Numbers from YoU Want :");
		U5.arm(sc.nextInt());
	}
}
