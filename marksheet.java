 import java.util.Scanner;
public class marksheet {
          public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Name ");
    String name=sc.nextLine();
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.println("|\t\t\t\t\tVIKRAM UNIVERSITY, UJJAIN\t\t\t\t\t|\n|\t\t\t\tStatment of Marks for the Examination of \t\t\t\t|\n|\t\t\t\t\tB.SC.3rd Year 10+2+3(3YDC)REGULAR\t\t\t\t\t|\n|\t\t\t\t\t\tAPRIL-2022\t\t\t\t\t\t|\n|ROLL NO.\t:19331688\t\tNAME\t\t:"+name+"\t\t\t\t\t|\n|\t\t\t\t\tFATHER'S NAME\t:Badriprasad tota\t\t\t\t\t\t|");
    System.out.println("|\t\t\t\t\tMOTHER'S NAME\t:chinta tota\t\t\t\t\t\t|\n|\t\t\t\t\tENROLLMENT NO.\t:V19R161240049\t\t\t\t\t|\n|\t\t\t\t\tMEDIUM\t\t:HINDI\t\t\t\tREGULAR\t\t|");
    System.out.println("| SANT SINGAJI INSTITUTE OF SCIENCE & MANAGEMENT,SANDALPUR\t\t\t\t\t\t|");
    System.out.println("|--------------------------------------------------------------------------------------------------------");
    System.out.println("|\t\tSUBJECT/PAPERS\t\t\t\t\t\tMARKS\t\t\t\t|");
    int s6,s1,s2,s3,s4,s5,a=0,sum=0;    
       int Sum1=0,Sum2=0,Sum3=0,Sum4=0,Sum5=0;  
    String sub = new String();      
        Scanner obj=new Scanner(System.in);
        System.out.print("\t\tHindi\t\t\t\t\t\t\t");
        s1=obj.nextInt();
     if(s1>=40&&s1<100)
    {
        sum=sum+1;
    }else if(s1<40&&s1>0) {
            System.out.print("\t\t\t\t\t\t\t\t\tATKT\n"); 
            a++; 
            sub="Hindi";
        }else{
            System.out.print("\t\tEnter Valide number 0-100\n");
            System.out.print("\t\tHindi\t\t\t\t\t\t\t");
            s1=obj.nextInt();
            if(s1>=40&&s1<100)
    {
        sum=sum+1;
    }       else if(s1<40&&s1>0) {
        System.out.print("\t\t\t\t\t\t\t\t\tATKT\n"); 
            a++; 
            sub="Hindi";
        }}
        System.out.print("\t\tEnglish\t\t\t\t\t\t\t");
        s2=obj.nextInt();
    if(s2>=40&&s2<100){
        sum=sum+1;
    }else if(s2<40&&s2>0){
        System.out.print("\t\t\t\t\t\t\t\t\tATKT\n");
        a++;
        sub="English";
    }else{
            System.out.print("\t\tEnter Valide number 0-100\n");
            System.out.print("\t\tEnglish\t\t\t\t\t\t\t");
            s2=obj.nextInt();
            if(s2>=40&&s2<100)
    {
        sum=sum+1; 
    }       else if(s2<40&&s2>0) {
        System.out.print("\t\t\t\t\t\t\t\t\tATKT\n");
            a++; 
            sub="English";
        }}
    System.out.print("\t\tbotany\t\t\t\t\t\t\t");
    s3=obj.nextInt();
    if(s3>=40&&s3<100){
        sum=sum+1;
    }else if(s3<40&&s3>0){
        System.out.print("\t\t\t\t\t\t\t\t\tATKT\n");
        a++;
        sub="botany";
    }else{
        System.out.print("\t\tEnter Valide number 0-100\n");
        System.out.print("\t\tbotany\t\t\t\t\t\t\t");
        s3=obj.nextInt();
        if(s3>=40&&s3<100)
{
    sum=sum+1;
}       else if(s3<40&&s3>0) {
    System.out.print("\t\t\t\t\t\t\t\t\tATKT\n"); 
        a++; 
        sub="botany";
    }
 } System.out.print("\t\tseed\t\t\t\t\t\t\t");
    s4=obj.nextInt();
    if(s4>=40&&s4<100){
        sum=sum+1;
    }else if(s4<40&&s4>0){
        System.out.print("\t\t\t\t\t\t\t\t\tATKT\n");
        a++;
        sub="seed";
    }else{
        System.out.print("\t\tEnter Valide number 0-100\n");
        System.out.print("\t\tseed\t\t\t\t\t\t\t");
        s3=obj.nextInt();
        if(s4>=40&&s4<100)
{
    sum=sum+1;
}       else if(s4<40&&s4>0) {
    System.out.print("\t\t\t\t\t\t\t\t\tATKT\n");
        a++; 
        sub="seed";
}  
} System.out.print("\t\tchemistry\t\t\t\t\t\t");
    s5=obj.nextInt();
    if(s5>=40&&s5<100){
        sum=sum+1;
    }else if(s5<40&&s5>0){
        System.out.print("\t\t\t\t\t\t\t\t\tATKT\n");
        a++;
        sub="Chemistry";
    }else{
        System.out.print("\t\tEnter Valide number 0-100\n");
        System.out.print("\t\tChemistry\t\t\t\t\t\t");
        s1=obj.nextInt();
        if(s5>=40&&s5<100)
{
    sum=sum+1; 
}       else if(s5<40&&s5>0) {
    System.out.print("\t\t\t\t\t\t\t\t\tATKT\n");
        a++; 
        sub="Chemistry";
    }
 } System.out.println("---------------------------------------------------------------------------------------------------------");
 System.out.print("|MAXIMUM MARKS 500");
int add=s1+s2+s3+s4+s5; 
 System.out.print("\t\t\t\t\t\tTOTAL  "+add+"\t\t\t\t|\n");
 System.out.println("---------------------------------------------------------------------------------------------------------");
 add=s1+s2+s3+s4+s5;         
 System.out.print("Total Percentage:");
 if(sum==5){
    System.out.println(" You are Pass \n");
    }if(a==1){
        System.out.println("You Got ATKT in "+sub);
    }if(a>=2){
        System.out.print("You have Faild in Two / More Subject You have to again Studie in Same Class");
    }        
    if(a==1){
        System.out.print("Again "+sub+" Paper");
    } 
    if(a==1){
        System.out.println("\nYou will have to give Examination of "+sub+" Again");
        System.out.println(sub);
        s6=obj.nextInt(); 
        if(s6>=40){
            System.out.println(" You are Pass \n");
        }         
    if(s1>=40&&s2>=40&&s3>=40&&s4>=40&&s6>=40||s1>=40&&s2>=40&&s3>=40&&s5>=40&&s6>=40||s1>=40&&s2>=40&&s4>=40&&s5>=40&&s6>=40||s1>=40&&s3>=40&&s4>=40&&s5>=40&&s6>=40||s2>=40&&s3>=40&&s4>=40&&s5>=40&&s6>=40){
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.println("|\t\t\t\t\tVIKRAM UNIVERSITY, UJJAIN\t\t\t\t\t|\n|\t\t\t\tStatment of Marks for the Examination of \t\t\t\t|\n|\t\t\t\t\tB.SC.3rd Year 10+2+3(3YDC)REGULAR\t\t\t\t\t|\n|\t\t\t\t\t\tAPRIL-2022\t\t\t\t\t\t|\n|ROLL NO.\t:19331688\t\tNAME\t\t:"+name+"\t\t\t\t\t|\n|\t\t\t\t\tFATHER'S NAME\t:Badriprasad tota\t\t\t\t\t\t|");
    System.out.println("|\t\t\t\t\tMOTHER'S NAME\t:chinta tota\t\t\t\t\t\t|\n|\t\t\t\t\tENROLLMENT NO.\t:V19R161240049\t\t\t\t\t|\n|\t\t\t\t\tMEDIUM\t\t:HINDI\t\t\t\tREGULAR\t\t|");
    System.out.println("| SANT SINGAJI INSTITUTE OF SCIENCE & MANAGEMENT,SANDALPUR\t\t\t\t\t\t|");
    System.out.println("|--------------------------------------------------------------------------------------------------------");
    System.out.println("|\t\tSUBJECT/PAPERS\t\t\t\t\t\tMARKS\t\t\t\t|");
    if(s1>=40&&s1<=100){
        Sum1=Sum1+s1;
    System.out.print("\t\tHindi\t\t\t\t\t\t\t"+(s1)+"\n");
    }else{Sum1=Sum1+s6;
        System.out.print("\t\tHindi\t\t\t\t\t\t\t"+(s6)+"\n");
    }if(s2>=40&&s2<=100){Sum2=Sum2+s2;
        System.out.print("\t\tEnglish\t\t\t\t\t\t\t"+(s2)+"\n");
    }else{Sum2=Sum2+s6;
        System.out.print("\t\tEnglish\t\t\t\t\t\t\t"+(s6)+"\n");
    }if(s3>=40&&s3<=100){Sum3=Sum3+s3;
        System.out.print("\t\tBotany\t\t\t\t\t\t\t"+(s3)+"\n");
    }else{Sum3=Sum3+s6;
        System.out.print("\t\tBotany\t\t\t\t\t\t\t"+(s6)+"\n");
    }if(s4>=40&&s4<=100){Sum4=Sum4+s4;
        System.out.print("\t\tseed\t\t\t\t\t\t\t"+(s4)+"\n");
    }else{Sum4=Sum4+s6;
        System.out.print("\t\tseed\t\t\t\t\t\t\t"+(s6)+"\n");
    }if(s5>=40&&s5<=100){Sum5=Sum5+s5;
        System.out.print("\t\tchemistry\t\t\t\t\t\t"+(s5)+"\n");
    }else{Sum5=Sum5+s6;
        System.out.print("\t\tchemistry\t\t\t\t\t\t"+(s6)+"\n");
    }
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.print("|MAXIMUM MARKS 500");
   int plus=Sum1+Sum2+Sum3+Sum4+Sum5;
    System.out.print("\t\t\t\t\t\tTOTAL  "+plus+"\t\t\t\t|\n");
    System.out.println("---------------------------------------------------------------------------------------------------------");          // Saare marks ka sum hota h  
    int Prs=plus/5;                           
    System.out.print("Total Percentage:"+Prs+"\n");
    if(sum==5){
       System.out.println(" You are Pass \n");
    }else{
        System.out.println(" ");
     }
     if(s6>=40){
        System.out.println(" You are Pass \n");
    }
}
}
}}