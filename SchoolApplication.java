 import java.util.*;                 

class Person{

    private String name;
    private int age;
	private Address address;

	void setName(String name){
		this.name=name;
	}

	String getName(){
       return name;
	}

	void setAge(int age){
		this.age=age;
	}

	int getAge(){
       return age;
	}

	void setAddress(Address address){
		this.address=address;
	}

	Address getAddress(){
       return address;
	}
}

class Student extends Person{

	private int standard,rollNumber;
	//private School school;

	void setStandard(int standard){
		this.standard=standard;
	}

	int getStandard(){
       return standard;
	}

	void setRollNumber(int rollNumber){
		this.rollNumber=rollNumber;
	}

	int getRollNumber(){
       return rollNumber;
	}

	void printStudentDetail(){
		System.out.println("Name : "+getName()+"\nAge : "+getAge()+"\nStandard :"+getStandard()+"\nRollno :"
			+getRollNumber()+"\nAddress :"+getAddress().printAddress());
	}

	//void setName(School school){
	//	this.school=school;
	//}

	//School getSchool(){
      // return school;
	//}

}


class Staff extends Person{

	String designation;
	ArrayList<String> subjectList;
	ArrayList<Integer> classList;

    Staff(String designation,ArrayList<String> subjectList,ArrayList<Integer> classList){
    	this.designation=designation;
    	this.subjectList=subjectList;
    	this.classList=classList;
    }
    String printStaffDetail(){

    	if(subjectList!=null && classList!=null){
    		return "Name :"+getName()+"\nAge :"+getAge()+"\nDesignation :"+designation+
    		"\nAddress :"+getAddress().printAddress()+"\nSubjectList :"+subjectList+"\nClassList :"+classList;	
        }else{
			return "Name :"+getName()+"\nAge :"+getAge()+"\nDesignation :"+designation+
    		"\nAddress :"+getAddress().printAddress()+"\nSubjectList :N/A classList: N/A";
    	}
    	
    	
    	


    }

}

class Address{

	private String cityName,streetAddress,stateName;
    
    int pin;

    void setCityName(String cityName){
		this.cityName=cityName;
	}

	String getCityName(){
       return cityName;
	}

	void setStreetAddress(String streetAddress){
		this.streetAddress=streetAddress;
	}

	String getStreetAddress(){
       return streetAddress;
	}

	void setStateName(String stateName){
		this.stateName=stateName;
	}

	String getStateName(){
       return stateName;
	}


	String printAddress(){
		String address = "Pin :"+pin+"\nCityName :"+getCityName()+"\nStreetAddress :"+getStreetAddress()+
			"\nStateName :"+getStateName();

			return address;
	}

}


class SchoolSystem{

	String schoolName,ownerName;
	Address schoolAddress;

	List<Student> studentList;
	List<Staff> staffList;

	Staff principal;

	String printSchoolDetail(){

		String details = "schoolName :"+schoolName+"\nOwnerName :"+ownerName+
			"\nAddress :"+schoolAddress.printAddress()+"\nStudent Strength :"+studentList.size()+
			"\nStaff Strength :"+staffList.size()+"\nPrinciple :"+principal.printStaffDetail();

			return details;
	}
}

	


public class SchoolApplication{
	public static void main(String[] args){

			//create object of school system
			SchoolSystem schoolSystem = new SchoolSystem();
			schoolSystem.schoolName = "J.N.S.";
			schoolSystem.ownerName = "Jagat Narayan";

			Address address = createAddress("Pubjab","Mohali","Chandigarh",160020);

			schoolSystem.schoolAddress = address;

			// studendList 

			List<Student> studentList = new ArrayList<>();

			//------------------------ class 1 start------------------------------------------------
			Address s1_1Add = createAddress("Pubjab","Phoolbagh Colony","Chandigarh",160020);
			Student s1_1 = createStudnet("Bandar Srivastava",1,3,1,s1_1Add);
			studentList.add(s1_1);

			Address s1_2Add = createAddress("Pubjab","GRP","Chandigarh",160020);
			Student s1_2 = createStudnet("Subhi Yadav",1,4,2,s1_2Add);
			studentList.add(s1_2);

			Address s1_3Add = createAddress("Pubjab","Sagar Choupal","Chandigarh",160020);
			Student s1_3 = createStudnet("Babita Srivastava",1,3,3,s1_3Add);
			studentList.add(s1_3);

			//------------------------ class 1 end------------------------------------------------
		
			


			//------------------------ class 2 start------------------------------------------------

			Address s2_1Add = createAddress("Pubjab","Phoolbagh Colony","Chandigarh",160020);
			Student s2_1 = createStudnet("Mukta Srivastava",2,4,1,s2_1Add);
			studentList.add(s2_1);

            Address s2_2Add = createAddress("Pubjab","Akash Nagar","Chandigarh",160020);
			Student s2_2 = createStudnet("Annu Srivastava",2,6,2,s2_2Add);	
			studentList.add(s2_2);

			Address s2_3Add = createAddress("Pubjab","Gudmaba","Chandigarh",160020);
			Student s2_3 = createStudnet("Dipali Shrama",2,4,3,s2_3Add);			
			studentList.add(s2_3);

			//------------------------ class 2 end------------------------------------------------



			//------------------------ class 3 start------------------------------------------------
			Address s3_1Add = createAddress("Pubjab","Phoolbagh Colony","Chandigarh",160020);
			Student s3_1 = createStudnet("Bunty Srivastava",3,7,1,s3_1Add);
			studentList.add(s3_1);

			Address s3_2Add = createAddress("Pubjab","Gulacheen","Chandigarh",160020);
			Student s3_2 = createStudnet("Prachi Pandy",3,8,2,s3_2Add);
			studentList.add(s3_2);

			Address s3_3Add = createAddress("Pubjab","Para","Chandigarh",160020);
			Student s3_3 = createStudnet("Prachi Pandy",3,7,3,s3_3Add);
			studentList.add(s3_3);

			Address s3_4Add = createAddress("Pubjab","Aliganj","Chandigarh",160020);
			Student s3_4 = createStudnet("Priya Pandy",3,6,4,s3_4Add);
			studentList.add(s3_4);

			Address s3_5Add = createAddress("Pubjab","Gulacheen","Chandigarh",160020);
			Student s3_5 = createStudnet("Punam kanaujiya",3,7,5,s3_5Add);
			studentList.add(s3_5);
           //------------------------ class 3 end--------------------------------------------------



		   //------------------------ class 4 start-------------------------------------------------
			Address s4_1Add = createAddress("Pubjab","Pakri","Chandigarh",160020);
			Student s4_1 = createStudnet("Bunty Srivastava",4,9,1,s4_1Add);
			studentList.add(s4_1);

			Address s4_2Add = createAddress("Pubjab","Dudaiya","Chandigarh",160020);
			Student s4_2 = createStudnet("Kumkum Singh",4,10,2,s4_2Add);
			studentList.add(s3_2);


			Address s4_3Add = createAddress("Pubjab","Phoolbagh Colony","Chandigarh",160020);
			Student s4_3 = createStudnet("Prity Srivastava",4,9,3,s4_3Add);
			studentList.add(s4_3);
		   //------------------------ class 4 end---------------------------------------------------




		   //------------------------ class 5 start--------------------------------------------------

			Address s5_1Add = createAddress("Pubjab","Pakri","Chandigarh",160020);
			Student s5_1 = createStudnet("Eishi Srivastava",5,11,1,s5_1Add);
			studentList.add(s5_1);

			Address s5_2Add = createAddress("Pubjab","Pakri","Chandigarh",160020);
			Student s5_2 = createStudnet("Kritika Mishra",5,11,2,s5_2Add);
			studentList.add(s5_2);

		   //------------------------class 5 end------------------------------------------------------

            schoolSystem.studentList = studentList;




  			

            // staffList
             List<Staff> staffList = new ArrayList<>();


          	//------------------staff 1 start-----------------------------------------------------------

             //subjectList
  			 ArrayList<String> subjectList1 = new ArrayList<>();

  			 //classlist
             ArrayList<Integer> classList1 = new ArrayList<>();

           subjectList1.add("Math");
           subjectList1.add("Hindi");
           subjectList1.add("Table");
           

           classList1.add(1);
           classList1.add(2);
           classList1.add(3);
           

           Address staff1Add = createAddress("Pubjab","Pakri","Chandigarh",160020);
           Staff staff1 = createStaff("Junior Teacher",subjectList1,classList1,"Mohan Roy",34,staff1Add);
           staffList.add(staff1);
           //------------------------staff 1 end--------------------------------------------------------



           //------------------------staff 2 start-------------------------------------------------------

           //subjectList
  			 ArrayList<String> subjectList2 = new ArrayList<>();

  			//classlist
             ArrayList<Integer> classList2 = new ArrayList<>();
				 
           subjectList2.add("Math");
           subjectList2.add("Hindi");
           subjectList2.add("Table");
           

           classList2.add(4);
           classList2.add(5);
           classList2.add(2);
           

           Address staff2Add = createAddress("Pubjab","Amdahi","Chandigarh",160020);
           Staff staff2 = createStaff("Primary Teacher",subjectList2,classList2,"Mohini Roy",30,staff2Add);
           staffList.add(staff2);
           //----------------------staff 2 end-----------------------------------------------------------



           //------------------------staff 3 start-------------------------------------------------------

            //subjectList
  			 ArrayList<String> subjectList3 = new ArrayList<>();

  			//classlist
             ArrayList<Integer> classList3 = new ArrayList<>();
				 
           subjectList3.add("Math");
           subjectList3.add("Hindi");
           subjectList3.add("English");
           

           classList3.add(1);
           classList3.add(3);
           classList3.add(4);
           

           Address staff3Add = createAddress("Pubjab","Ahalaaadpur","Chandigarh",160020);
           Staff staff3 = createStaff("Primary Teacher",subjectList3,classList3,"Archana Sharma",28,staff3Add);
           staffList.add(staff3);
           //----------------------staff 3 end------------------------------------------------------------

       	   

           //------------------------staff 4 start-------------------------------------------------------

           //subjectList
  			 ArrayList<String> subjectList4 = new ArrayList<>();

  			//classlist
             ArrayList<Integer> classList4 = new ArrayList<>();
				 
           subjectList4.add("Math");
           subjectList4.add("Hindi");
           subjectList4.add("English");
           

           classList4.add(2);
           classList4.add(4);
           classList4.add(5);
           

           Address staff4Add = createAddress("Pubjab","GolMarket","Chandigarh",160020);
           Staff staff4 = createStaff("Primary Teacher",subjectList4,classList4,"Shneha Sharma",29,staff4Add);
           staffList.add(staff4);
           //----------------------staff 4 end------------------------------------------------------------




           //------------------------staff 5 start-------------------------------------------------------

          
           Address staff5Add = createAddress("Pubjab","GomtiNager","Chandigarh",160020);
           Staff staff5 = createStaff("Peon",null,null,"Munna bhai",35,staff5Add);
           staffList.add(staff5);

           //----------------------staff 5 end------------------------------------------------------------

           schoolSystem.staffList = staffList;


           //create principal object

           Staff principal = new Staff("Principal",null,null);

           principal.setName("Dilip Shukla");
           principal.setAge(45);

           Address principalAdd = createAddress("Pubjab","ManakNager","Chandigarh",160022);
           principal.setAddress(principalAdd);

           schoolSystem.principal = principal;


            for(int i =0;i<schoolSystem.studentList.size();i++){

           		Student st = schoolSystem.studentList.get(i);
           		if(st.getStandard()==1){	
           			// print st details here
           			st.printStudentDetail();
           			System.out.println("--------------------------------------------------------");
           	   }
            }


           //print here school detail

            System.out.println(schoolSystem.printSchoolDetail());

          
            
            // print the teacher detail who teaches in class 2 and 3

            for(int i =0;i<schoolSystem.staffList.size();i++){

            	
            	Staff sf = schoolSystem.staffList.get(i);

            	if(sf.classList!=null)
            	if(sf.classList.contains(3) && sf.classList.contains(2)){
            		System.out.println(sf.printStaffDetail());
            		System.out.println("--------------------------------------------------------");	
            	}
            	
         
            }


            // print all the teacher detail

            for(int i =0;i<schoolSystem.staffList.size();i++){


            	Staff sf = schoolSystem.staffList.get(i);
            	System.out.println(sf.printStaffDetail());
            	System.out.println("--------------------------------------------------------");
         
            }



	}

	

	static Student createStudnet(String name,int standard, int age, int rollNumber,Address address){
		Student student = new Student();

		student.setName(name);
		student.setStandard(standard);
		student.setAge(age);
		student.setRollNumber(rollNumber);
		student.setAddress(address);

		return student;
	}

	static Address createAddress(String stateName,String street, String city,int pin){
		Address address = new Address();

		address.setStateName(stateName);
		address.setStreetAddress(street);
		address.setCityName(city);
		address.pin = pin;

		return address;
	}


    static Staff createStaff(String designation,ArrayList<String> subjectList,ArrayList<Integer> classList,String name,int age,Address address){

    	Staff staff = new Staff(designation,subjectList,classList);

    	staff.setName(name);
    	staff.setAge(age);
    	staff.setAddress(address);

    	return staff;

     }   

    }

