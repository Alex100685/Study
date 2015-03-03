

	import	java.util.Scanner;	
	public	class	FriendsAndFamily	{	
	public	static	void	main(String[]	args)	{	
		 	
	Scanner input =	new	Scanner(System.in);	
		 	
	do	{	
		 	System.out.println("\n	Enter	list	price:	"	);	
		 	double	listPrice	=	input.nextDouble();		
		 	
		 	System.out.println("	Enter	discount	%:	"	);	
		 	int	discount	=	input.nextInt();		
		 	
		 	System.out.println("Ånter your currency");
		 	int currency = input.nextInt();
		 	switch (currency) { 
		 	case 1: currency = 16;
		 	break;
		 	case 2: currency = 20;
		 	break;
		 	case 3: currency = 1;
		 	default: currency = 0;
		 		System.out.println ("No such currencies!");
		 		break;
		 	}
		 	
		
		 	
		 	System.out.printf("	You'll	pay	only		%2.2f",	(listPrice - listPrice * discount/100) * currency);	
		 	
						
	} while (true);
	}}
