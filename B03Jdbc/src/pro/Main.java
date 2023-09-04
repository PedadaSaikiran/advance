   package pro;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String choice="YES";
		String name,code;int price;double quantity;int rows;
		Dao dao = Factory.getDao();
		Dto dto = new Dto();
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("1.INSERT PRODUCT\n"
					+ "2.DELETE PRODUCT\n"
					+ "3.UPDATE PRODUCT\n"
					+ "4.DISPLAY PRODUCT");
			System.out.println("SELECT YOUR CHOICE");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("ENTER THE NAME");
				name=sc.next();
				System.out.println("ENTER THE CODE");
				code=sc.next();
				System.out.println("ENTER THE PRICE");
				price=sc.nextInt();
				System.out.println("ENTER THE QUANTITY");
				quantity=sc.nextDouble();
				dto.setName(name);
				dto.setCode(code);
				dto.setPrice(price);
				dto.setQuantity(quantity);
				rows=dao.insertProduct(dto);
				if(rows>0) {
					System.out.println("PRODUCT INSERTE SUCCESSFULLY");
				}
				else {
					System.out.println("PLS TRY AGAIN");
				}
				break;
			case 2:
				System.out.println("ENTER THE CODE");
				code=sc.next();
				rows=dao.deleteProduct(code);
				if(rows>0) {
					System.out.println("PRODUCT DELETE SUCCESSFULLY");
				}
				else {
					System.out.println("PLS TRY AGAIN");
				}
				
				break;
			case 3:
				System.out.println("ENTER THE NAME");
				name=sc.next();
				System.out.println("ENTER THE CODE");
				code=sc.next();
				System.out.println("ENTER THE PRICE");
				price=sc.nextInt();
				System.out.println("ENTER THE QUANTITY");
				quantity=sc.nextDouble();
			
				dto.setName(name);
				dto.setCode(code);
				dto.setPrice(price);
				dto.setQuantity(quantity);
				rows =dao.updateProduct(dto);
				if(rows>0) {
					System.out.println("PRODUCT UPDATED SUCCESSFULLY");
				}
				else {
					System.out.println("PLS TRY AGAIN");
				}
				break;
			case 4:
				ResultSet rs=dao.displayProduct();
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getInt(3) + "\t");
					System.out.print(rs.getDouble(4) + "\t");
					System.out.println();

				}
				break;
			default:System.out.println("PLS ENTER VALID OPTION");
				
			}
			System.out.println("PRESS YES TO CONTINUE");
			choice=sc.next();
		}
		while(choice.equalsIgnoreCase("yes")); 
		System.out.println("THANK YOU FOR VISTING WEBSITE");
		

	}

}
