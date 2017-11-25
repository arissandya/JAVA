class Admin{
	public String NamaAdmin;
	public String IdAdmin;

	public InputBarang (){
		scanner input = new scanner(System.in);
		System.out.print("NamaAdmin");
		NamaAdmin = input.nextline();
		System.out.print("IdAdmin");
		IdAdmin = input.nextline();
	}


	