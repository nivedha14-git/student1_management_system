package student;

public class Student {
		private String name;
		private int age;
		private double score;
		public Student(String name,int age,double score)
		{
			this.name=name;
			this.age=age;
			this.score=score;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public int getAge()
		{
			return age;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public double getScore()
		{
			return score;
		}
		public void setScore(double score)
		{
			this.score=score;
		}
		public String calculateGrade()
		{
			if(score>=90)
			{
				return "A";
			}
			else if(score>=80)
			{
				return "B";
			}
			else if(score>=70)
			{
				return"C";
			}
			else if(score>=60)
			{
				return"D";
			}
			else
			{
				return"F";
			}
				
		}
		public String toString()
		{
	        return "Name:"+ name +",Age:"+ age +",Score:"+ score +",Grade:"+ calculateGrade();
			//return "Name: " + name + ", Age: " + age + ", Score: " + score + ", Grade: " + calculateGrade();
		}
		
	}


