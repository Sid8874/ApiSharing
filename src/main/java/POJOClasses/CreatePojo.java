package POJOClasses;

public class CreatePojo {

		public String name;
		public String job;
		public String loc;
		public String email;
		public String password;
		public CreatePojo(String name,String job)
		{
			this.name=name;
			this.job=job;
		}
		
		public CreatePojo(String name,String job,String loc)
		{
			this.name=name;
			this.job=job;
			this.loc=loc;
		}
		
		public CreatePojo(String name,String job,String email,String password)
		{
			this.name=name;
			this.job=job;
			this.email=email;
			this.password=password;
		}
		public String getName() {
			return name;
		}
		public String getJob() {
			return job;
		}
		public String getLoc() {
			return loc;
		}
		public String getEmail() {
			return password;
		}
		public String getPassword() {
			return password;
		}
		
}
