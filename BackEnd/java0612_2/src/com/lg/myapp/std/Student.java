package com.lg.myapp.std;

public class Student {
	
		private String name;
		private int age;
		private char gender;
		private String addr;
		
		public Student(String name, int age, 
				char gender, String addr) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.addr = addr;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		@Override
		public String toString() {
			return String.format("<Student:%s, %d, %c, %s>",
					name, age, gender, addr);
		}
		
		public void showStudent() {
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
			System.out.println("성별: " + gender);
			System.out.println("주소: " + addr);
			System.out.println("-------------------");
		}
}
