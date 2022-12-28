 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chillaxhauzarray;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ChillaxHauzArray {
public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    JOptionPane.showMessageDialog(null, " Welcome to Chillax Hauz ");
   
    }
   public static void order(){
    String name=JOptionPane.showInputDialog("""
                                            ===================================
                                                        Chillax MENU 
                                            1. Donuts               Php. 45.00 
                                            2. Ice Cream            Php. 40.00
                                            3. Pizza                Php. 95.00
                                            4. French Fries         Php  30.00
                                            5. Chocolate Cookies    Php. 25.00
                                            ====================================
                                                      LIMITED Chillax PROMO 
                                            6. P1-Pizza with coke and burger    Php. 120.00
                                            7. P2-Donuts with Milktea and fries Php. 90.00
                                            8. Cancel 
                                            ====================================
                                                          DISCOUNTS  
                                            1. If total cost is Php 2000+ - 8% 
                                            2. If total cost is Php 1000+ - 3% 
                                            
                                            Enter your order: """);
    
    int choose=Integer.parseInt(name);
   
    switch (choose) {
            case 1:
               String choose1=JOptionPane.showInputDialog(" How many Donuts you want to Buy? " );
                int quantity=Integer.parseInt(choose1);
                  total = total +(quantity*45);
                int confirm = JOptionPane.showConfirmDialog(null,"Total cost: Php " + total +  """  
                                                                                                 
                                            Do you want to buy another order?  """, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
               if (confirm == JOptionPane.YES_OPTION){
                    order();
               }
                   else if (confirm == JOptionPane.NO_OPTION){
                if (total>=2000){
                       double discount=total*.92;
                    
                      pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 8% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                     
                         total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total    
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total    
                                                                                                  );              
                        break;     } break; }
                   
                   
                else if (total>=1000 && total<=1999){
                   double discount=total*.97;
                    pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 3% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
   
                else if (total<=999){
                   pay = Integer.parseInt(JOptionPane.showInputDialog(" Enter Payment: "));
                       
                    if(pay < total){
                       do{
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                           
                       if (pay>=total){
                    
                            double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total1    
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=total){
                        
                          double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total1     
                                                                                                  );              
                        break;     } break; }
                   }
               case 2:
                 String choose2=JOptionPane.showInputDialog(" How many Ice Cream you want to Buy? " );
                int quantity2=Integer.parseInt(choose2);
                  total = total +(quantity2*40);
                int confirm2 = JOptionPane.showConfirmDialog(null,"Total cost: Php " + total +  """  
                                                                                                 
                                            Do you want to buy another order?  """, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
               if (confirm2 == JOptionPane.YES_OPTION){
                    order();
               }
                   else if (confirm2 == JOptionPane.NO_OPTION){
                if (total>=2000){
                       double discount=total*.92;
                    
                      pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 8% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
                   
                   
                else if (total>=1000 && total<=1999){
                   double discount=total*.97;
                    pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 3% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
   
                else if (total<=999){
                   pay = Integer.parseInt(JOptionPane.showInputDialog(" Enter Payment: "));
                       
                    if(pay < total){
                       do{
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                           
                       if (pay>=total){
                    
                           double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total     
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=total){
                        
                          double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total1     
                                                                                                  );              
                        break;     } break; }
                   }
            case 3:
                String choose3=JOptionPane.showInputDialog(" How many Pizza  you want to Buy? " );
                int quantity3=Integer.parseInt(choose3);
                  total = total +(quantity3*95);
                int confirm3 = JOptionPane.showConfirmDialog(null,"Total cost: Php " + total +  """  
                                                                                                 
                                            Do you want to buy another order?  """, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
               if (confirm3 == JOptionPane.YES_OPTION){
                    order();
               }
                   else if (confirm3 == JOptionPane.NO_OPTION){
                if (total>=2000){
                       double discount=total*.92;
                    
                      pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 8% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
                   
                   
                else if (total>=1000 && total<=1999){
                   double discount=total*.97;
                    pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 3% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                      total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
   
                else if (total<=999){
                   pay = Integer.parseInt(JOptionPane.showInputDialog(" Enter Payment: "));
                       
                    if(pay < total){
                       do{
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                           
                       if (pay>=total){
                    
                           double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total     
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=total){
                        
                          double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total1     
                                                                                                  );              
                        break;     } break; }
                   }
            case 4:
               String choose4=JOptionPane.showInputDialog(" How many French Fries   you want to Buy? " );
                int quantity4=Integer.parseInt(choose4);
                  total = total +(quantity4*30);
                int confirm4 = JOptionPane.showConfirmDialog(null,"Total cost: Php " + total +  """  
                                                                                                 
                                            Do you want to buy another order?  """, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
               if (confirm4 == JOptionPane.YES_OPTION){
                    order();
               }
                   else if (confirm4 == JOptionPane.NO_OPTION){
                if (total>=2000){
                       double discount=total*.92;
                    
                      pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 8% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
                   
                   
                else if (total>=1000 && total<=1999){
                   double discount=total*.97;
                    pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 3% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
   
                else if (total<=999){
                   pay = Integer.parseInt(JOptionPane.showInputDialog(" Enter Payment: "));
                       
                    if(pay < total){
                       do{
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                           
                       if (pay>=total){
                    
                           double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total     
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=total){
                        
                          double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total1     
                                                                                                  );              
                        break;     } break; }
                   }
            case 5:
               String choose5=JOptionPane.showInputDialog(" How many Chocolate Cookies you want to Buy? " );
                int quantity5=Integer.parseInt(choose5);
                  total = total +(quantity5*25);
                int confirm5 = JOptionPane.showConfirmDialog(null,"Total cost: Php " + total +  """  
                                                                                                 
                                            Do you want to buy another order?  """, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
               if (confirm5 == JOptionPane.YES_OPTION){
                    order();
               }
                   else if (confirm5 == JOptionPane.NO_OPTION){
                if (total>=2000){
                       double discount=total*.92;
                    
                      pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 8% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
                   
                   
                else if (total>=1000 && total<=1999){
                   double discount=total*.97;
                    pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 3% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
   
                else if (total<=999){
                   pay = Integer.parseInt(JOptionPane.showInputDialog(" Enter Payment: "));
                       
                    if(pay < total){
                       do{
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                           
                       if (pay>=total){
                    
                           double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total     
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=total){
                        
                          double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total1     
                                                                                                  );              
                        break;     } break; }
                   }
                case 6:
                 String choose6=JOptionPane.showInputDialog(" How many P1-Pizza with coke and burger you want to Buy? " );
                int quantity6=Integer.parseInt(choose6);
                  total = total +(quantity6*120);
                int confirm6 = JOptionPane.showConfirmDialog(null,"Total cost: Php " + total +  """  
                                                                                                 
                                            Do you want to buy another order?  """, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
               if (confirm6 == JOptionPane.YES_OPTION){
                    order();
               }
                   else if (confirm6 == JOptionPane.NO_OPTION){
                if (total>=2000){
                       double discount=total*.92;
                    
                      pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 8% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
                   
                   
                else if (total>=1000 && total<=1999){
                   double discount=total*.97;
                    pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 3% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                      total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
   
                else if (total<=999){
                   pay = Integer.parseInt(JOptionPane.showInputDialog(" Enter Payment: "));
                       
                    if(pay < total){
                       do{
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                           
                       if (pay>=total){
                    
                           double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total     
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=total){
                        
                          double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total1     
                                                                                                  );              
                        break;     } break; }
                   }
                case 7:
                 String choose7=JOptionPane.showInputDialog(" How many P2-Donuts with Milktea and fries you want to Buy? " );
                int quantity7=Integer.parseInt(choose7);
                  total = total +(quantity7*90);
                int confirm7 = JOptionPane.showConfirmDialog(null,"Total cost: Php " + total +  """  
                                                                                                 
                                            Do you want to buy another order?  """, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
               if (confirm7 == JOptionPane.YES_OPTION){
                    order();
               }
                   else if (confirm7 == JOptionPane.NO_OPTION){
                if (total>=2000){
                       double discount=total*.92;
                    
                      pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 8% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                      total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
                   
                   
                else if (total>=1000 && total<=1999){
                   double discount=total*.97;
                    pay = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             You have 3% discount
                                                            Your new total cost is Php """ + discount +" *discounted" + """
                                                                                                                    
                                                               Enter Payment:
                                                               """));
                      
                    if(pay < discount){
                     do{
                       total = pay-discount;
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                        if (pay>=discount){
                         total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total      
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                       total = pay-discount;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + discount + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total      
                                                                                                  );              
                        break;     } break; }
   
                else if (total<=999){
                   pay = Integer.parseInt(JOptionPane.showInputDialog(" Enter Payment: "));
                       
                    if(pay < total){
                       do{
                         JOptionPane.showMessageDialog(null,"!!!Not Enought Payment!!!"," ",JOptionPane.ERROR_MESSAGE);   
                       pay = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Payment: ")  );  
                           
                       if (pay>=total){
                    
                           double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+ total     
                                                                                                  );              
                        break;  }
                        }while(true);}
                       else if (pay >=total){
                        
                          double total1 = pay-total;
                           JOptionPane.showMessageDialog(null, "  Total price is Php " + total + 
                                    "\nI received Php "  + pay + 
                                     "\nYour change is Php "+  total1     
                                                                                                  );              
                        break;     } break; }
                   }
                 case 8:
                    JOptionPane.showMessageDialog(null, """
                                              Cancelling Order...  
                                            Thankyou for wasting my time!
                                            """);
                   int again = JOptionPane.showConfirmDialog(null," Next Customer? ", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if(again==JOptionPane.YES_OPTION){
                    total=total-total;
                    menu();
                    order();    }
                else{
                    System.exit(0);}
               
                 
                 default:      
            break;         
    }
        JOptionPane.showMessageDialog(null, """
                                             Transaction complete...  
                                            Thankyou for buying!
                                            """);
       int again = JOptionPane.showConfirmDialog(null," Next Customer? ", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if(again==JOptionPane.YES_OPTION){
                    total=total-total;
                    menu();
                    order();    }
                else{
                    System.exit(0);}
   }
    public static void main(String[] args) {
        menu();
       order();
}  
    }
    

