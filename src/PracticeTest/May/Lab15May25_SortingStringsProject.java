package PracticeTest.May;
public class Lab15May25_SortingStringsProject {
    public static void main(String[] args) {
        String[] masterlist= new String[] {"Ravi","Karuna","Amit","Akshey","Ankit","Sandeep","Shiv","Aashu"};
        int i,j, result;
        String temp;
        for (i=0;i<=masterlist.length-1;i++){
            for(j=i+1;j<= masterlist.length-1;j++){
                result= masterlist[i].compareTo(masterlist[j]);
                //System.out.println(result);
                if(result>0){
                    temp=masterlist[i];
                    masterlist[i]=masterlist[j];
                    masterlist[j]=temp;
                }
            }
        }
        for(String s: masterlist)
            System.out.println(s);
    }
}
