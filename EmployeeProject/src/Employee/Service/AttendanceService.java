package Employee.Service;

import java.sql.SQLException;

import Employee.Repositary.AttendanceRepositary;
import Employee.model.AttendanceModel;

   public class AttendanceService 
   {
	   
	   AttendanceRepositary ar=new AttendanceRepositary();
//
//	    public boolean takeAttendance(int id)
//	    {
//	    	
//	    }

		public boolean takeAttendance(int id1)
		{
			return ar.takeAttendance( id1)?true:false;
			
		}

	}

