//J56AttendanceReg - Steven Long

public class J56AttendanceReg
{
	public static void main(String []args)
	{
		final int STUDENTS = 6;
		final int DAYS = 8;

		int day, student, absent  = 0;
		int present = 0;
		int [] absentReg = new int [8];
		int [][] attendReg = {
								{1,1,1,0,1,1},
								{1,0,1,1,1,0},
								{1,0,1,1,1,1},
								{0,1,1,1,1,1},
								{1,1,1,0,0,0},
								{1,1,1,0,0,1},
								{1,1,1,1,1,1},
								{1,1,1,0,0,1}
							};

		for(day = 0; day <= DAYS - 1; ++day)
		{

			present = 0;

			for(student = 0; student <= STUDENTS - 1; ++student)
			{
				System.out.printf("%5d",attendReg[day][student]);
				if(attendReg[day][student] == 1)
				{
					++present;
				}
				else
				{
					++absentReg[student];
				}


			}//inner

			System.out.println("Number present on day " + (day + 1) + " was: " + (present));

			System.out.println();
		}//outer


		for(student = 0; student <= STUDENTS - 1; ++student)
		{
			System.out.println("Student " + (student + 1) + " was absent on: " + (absentReg[student]));
		}
	}
}