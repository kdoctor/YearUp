
public class Persons {

			
		private String name;
		private int age;
		private String phoneNumber;
		private String address;
		

		
		public  Persons(String _name, int _age, String _phoneNumber,String _address) {		

			
			name = _name;
			age =_age;
			phoneNumber =_phoneNumber;
			address =_address;
		}

		
		public String getName() {
			return name;
		}

		
		public int getAge() {
			return age;
		}

		
		public String getPhoneNumber() {
			return phoneNumber;
		}

		
		public String getAddress() {
			return address;
		}

		
		public void setName(String name) {
			this.name = name;
		}	

		
		public void setAge(int age) {
			
			this.age = age;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		
		public void setAddress(String address) {
			this.address = address;
		}

	
		public void growsOlder() {
			age = age + 1;
		}



			public static  void main(String[] args) {
				Persons tracy = new Persons("Tracy", 43, "6783575049","3537 sable glen lane Atlanta GA");
				
				
				
				System.out.println("Name: " + tracy.getName());
				System.out.println("Age: " + tracy.getAge());
				System.out.println("phoneNumber: " + tracy.getPhoneNumber());
				System.out.println("address: "+ tracy.getAddress());
				
				
				tracy.growsOlder(); 
			
			System.out.println("new age: " + tracy.getAge());
			
}	

	}



	


