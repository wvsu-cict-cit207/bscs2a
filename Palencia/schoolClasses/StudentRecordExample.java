package schoolClasses;

public class StudentRecordExample{
	
public static void main( String[] args ){
//create three objects for Student record
	StudentRecord mayRecord = new StudentRecord();
	
	mayRecord.setName("May");
	mayRecord.setAddress("Philippines");
	mayRecord.setAge(25);
	mayRecord.setOOPGrade(98);
	mayRecord.setDiscreteGrade(95.5);
	mayRecord.setDataStructGrade(100);
	
	//overloaded methods
	mayRecord.print( mayRecord.getName() );
	mayRecord.print( mayRecord.getOOPGrade(),
	mayRecord.getDiscreteGrade(),
	mayRecord.getDataStructGrade());

	StudentRecord reaRecord = new StudentRecord();
	reaRecord.setName("Rea");
	reaRecord.setAddress("Philippines");
	reaRecord.setAge(25);
	reaRecord.setOOPGrade(90);
	reaRecord.setDiscreteGrade(96);
	reaRecord.setDataStructGrade(98);
	
	//overloaded methods
	reaRecord.print( reaRecord.getName() );
	reaRecord.print( reaRecord.getOOPGrade(),
	reaRecord.getDiscreteGrade(),
	reaRecord.getDataStructGrade());
	
	StudentRecord crisRecord = new StudentRecord();
	
	crisRecord.setName("Cris");
	crisRecord.setAddress("Philippines");
	crisRecord.setAge(25);
	crisRecord.setOOPGrade(98);
	crisRecord.setDiscreteGrade(93);
	crisRecord.setDataStructGrade(99);
	
	//overloaded methods
	crisRecord.print( crisRecord.getName() );
	crisRecord.print( crisRecord.getOOPGrade(),
	crisRecord.getDiscreteGrade(),
	crisRecord.getDataStructGrade());
	
	
	System.out.println( mayRecord.getName());
	System.out.println( reaRecord.getName());
	System.out.println( crisRecord.getName());

	
	System.out.println("Count="+StudentRecord.getStudentCount());
	}
}

