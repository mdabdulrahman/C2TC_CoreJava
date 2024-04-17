package com.tnsif.c2tc.assignments.assignmentThree;

public class MontaneBike extends Bicycle
{
         public int seatHeight;

		@Override
		public String toString() 
		{
			return "No of gears are "+noOfGears+"\nSpeed of bicycle is "+speed+"\nSeat height is "+seatHeight;
		}

		/**
		 * @param noOfGears
		 * @param speed
		 * @param seatHeight
		 */
		public MontaneBike(int noOfGears, int speed, int seatHeight) {
			super(noOfGears, speed);
			this.seatHeight = seatHeight;
		}
		
		
         
}
