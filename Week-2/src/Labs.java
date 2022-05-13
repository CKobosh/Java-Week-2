
public class Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Driving Problem
int age = 17; 
System.out.println(age >= 16);
boolean hasLicense = false; 
if (age >= 16 && hasLicense) {
	System.out.println("You can drive.");
} else {
	System.out.println("You cannot drive.");
}
// Milk Problem
double costOfMilk = 1.25; 
int thirstLevel = 2; 

if (costOfMilk < 2.50 || thirstLevel > 6) {
System.out.println("Milk, please.");	
} 
else {
	System.out.println("No thanks.");
}
// Cookie Problem
int numberOfCookies = 41;
int numberOfChildren = 10;

int remainingCookies = numberOfCookies % numberOfChildren; 

if (remainingCookies == 0) {
	System.out.println("Sad Face"); 
	} else if (remainingCookies <= 2) {
	System.out.println("Yes!"); 
	} else if (remainingCookies < 5) {
	System.out.println("Wahooo"); 
	} else {
	System.out.println("Jackpot!"); }

// Lab Part 2 Loyalty Member Problem
 double loyaltyMemberDiscount = 0.0; 
 String loyaltyMemberStatus = "Silver"; 
 
 switch (loyaltyMemberStatus) {
 	case "Silver": 
 		loyaltyMemberDiscount = .1; 
 		break; 
 	case "Gold":
 		loyaltyMemberDiscount = .15; 
 		break; 
 	case "Platinum":
 		loyaltyMemberDiscount = .25; 
 		break;  		
 }
 System.out.println(loyaltyMemberStatus);
 
 double billTotal = 640.00; 
 double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
 System.out.println(adjustedTotal);
 
 if (adjustedTotal > 500.00) {
	 if (loyaltyMemberStatus == "Silver")
		 loyaltyMemberStatus = "Gold"; 
 } else if (loyaltyMemberStatus == "Gold") {
		loyaltyMemberStatus = "Platinum"; 
 }
System.out.println(loyaltyMemberStatus);
// Login Problem

String username = "Tommy123"; 
String password = "12345";

if (username .equals("Tommy123") && password .equals("12345")) {
	System.out.println("Login Successful");
} else {
	System.out.println("Access Denied");
}
// For Loop Problem
for (int i = 0; i < 10; i ++) {
	System.out.println(i);
}
for (int i = 10; i >= 0; i--) {
System.out.println(i);
}
//for (int i = 0; i < 101; i += 2) {
//	System.out.println(i);
//} for (int i = 0; i <= 100; i ++)
// if (i % 2 = 0) {
// } sysout (i)

for (int i = 0; i <= 100; i++ ) {
 if (i % 2 == 0) {
 System.out.println(i + "EVEN");
} else {
	System.out.println(i + "ODD");
}
}
//Next Loop Problem
int i = 100; 
while (i > 0) {
	System.out.println(i + " " + i % 3);
	i--; 
}






}
}