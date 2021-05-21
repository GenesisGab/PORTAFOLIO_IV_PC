package scl.edu.gt;

public class Help {

		public static void CommandList() {
		System.out.println("---------------------------------");
		System.out.println("TODOS LOS COMANDOS DISPONIBLES:");
		System.out.println("---------------------------------");
		
		//INSTANCIA
		CommandList menu = new CommandList();
		
		for(int i=0;i <menu.command.length;i++) {
			 System.out.println(menu.command[i]);
		}	
		
	}
}
