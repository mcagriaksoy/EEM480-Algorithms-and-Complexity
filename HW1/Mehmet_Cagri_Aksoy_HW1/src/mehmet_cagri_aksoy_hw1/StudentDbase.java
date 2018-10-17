/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mehmet_cagri_aksoy_hw1;

/**
 *
 * @author Mehmet Çağrı Aksoy
 */

public class StudentDbase {
    
    //I put sorting algorithms here:
    
    Student stu = new Student();
    //It shorts student according to IDs via bubble shorting method:
    public void sort_ID(){
        System.out.println("\nThe students are sorted according to their ID’s :\n");
        for (int i = stu.arrsize; i > 1; i--){
            for(int j = 0; j <i-1; j++){
                if(stu.idarr[j]>stu.idarr[j+1]){
                    long dummy = stu.idarr[j];
                    stu.idarr[j]=stu.idarr[j+1];
                    stu.idarr[j+1]=dummy;
                    
                    String dummy2 = stu.namearr[j];
                    stu.namearr[j]=stu.namearr[j+1];
                    stu.namearr[j+1]=dummy2;
                    
                    String dummy3 = stu.surarr[j];
                    stu.surarr[j]=stu.surarr[j+1];
                    stu.surarr[j+1]=dummy3;
                    
                    int dummy4 = stu.admarr[j];
                    stu.admarr[j]=stu.admarr[j+1];
                    stu.admarr[j+1]=dummy4;
                    
                    int dummy5 = stu.agearr[j];
                     stu.agearr[j]=stu.agearr[j+1];
                    stu.agearr[j+1]=dummy5;
                }    
            }
        }
        for(int i = 0; i <stu.arrsize; i++){
            
            System.out.println(stu.idarr[i]+" "+stu.namearr[i]+" "+stu.surarr[i]+" "+stu.agearr[i]+" "+stu.admarr[i]);
        }
            
        
        
      
    }
    //It shorts student according to Year s via bubble shorting method:
    public void sort_Year(){
        System.out.println("\nThe students are sorted according to their Year’s :\n");
        for (int i = stu.arrsize; i > 1; i--){
            for(int j = 0; j <i-1; j++){
                if(stu.admarr[j]>stu.admarr[j+1]){
                    int dummy = stu.admarr[j];
                    stu.admarr[j]=stu.admarr[j+1];
                    stu.admarr[j+1]=dummy;
                    String dummy2 = stu.namearr[j];
                    stu.namearr[j]=stu.namearr[j+1];
                    stu.namearr[j+1]=dummy2; 
                    String dummy3 = stu.surarr[j];
                    stu.surarr[j]=stu.surarr[j+1];
                    stu.surarr[j+1]=dummy3;
                    long dummy4 = stu.idarr[j];
                    stu.idarr[j]=stu.idarr[j+1];
                    stu.idarr[j+1]=dummy4;
                    int dummy5 = stu.agearr[j];
                    stu.agearr[j]=stu.agearr[j+1];
                    stu.agearr[j+1]=dummy5;               
                }    
            }
        }
        for(int i = 0; i <stu.arrsize; i++){
            
            System.out.println(stu.idarr[i]+" "+stu.namearr[i]+" "+stu.surarr[i]+" "+stu.agearr[i]+" "+stu.admarr[i]);
        }      

    }
    //It shorts student according to Age s via bubble shorting method:
    public void sort_Age(){
        System.out.println("\nThe students are sorted according to their Age’s :\n");
        for (int i = stu.arrsize; i > 1; i--){
            for(int j = 0; j <i-1; j++){
                
                if(stu.agearr[j]>stu.agearr[j+1]){
                    
                    int dummy = stu.agearr[j];
                     stu.agearr[j]=stu.agearr[j+1];
                    stu.agearr[j+1]=dummy;
                    
                    String dummy2 = stu.namearr[j];
                    stu.namearr[j]=stu.namearr[j+1];
                    stu.namearr[j+1]=dummy2;
                    

                    String dummy3 = stu.surarr[j];
                    stu.surarr[j]=stu.surarr[j+1];
                    stu.surarr[j+1]=dummy3;
                    long dummy4 = stu.idarr[j];
                    stu.idarr[j]=stu.idarr[j+1];
                    stu.idarr[j+1]=dummy4;
                    int dummy5 = stu.admarr[j];
                    stu.admarr[j]=stu.admarr[j+1];
                    stu.admarr[j+1]=dummy5;
                }    
            }
        }
        for(int i = 0; i <stu.arrsize; i++){
            
            System.out.println(stu.idarr[i]+" "+stu.namearr[i]+" "+stu.surarr[i]+" "+stu.agearr[i]+" "+stu.admarr[i]);
            
        }
    
    }
}
