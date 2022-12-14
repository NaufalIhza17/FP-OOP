# FP-OOP
###### Final Project OOP - 5025211260

## Online Movie Ticket Application

Code that will be implemented in this project:

<sub>All This Code Are only one from many (but not all)</sub>

- [x] Casting/Conversion

  https://github.com/NaufalIhza17/FP-OOP/blob/1da95656e5832d533bb1ddd080059891047d7947/src/main/java/com/mycompany/movietixapp/Register.java#L190-L194

- [x] Constructor
 
  https://github.com/NaufalIhza17/FP-OOP/blob/6049bb64a376001fef6145907293be284a759fc9/src/main/java/com/mycompany/movietixapp/PopUpVoucher.java#L13-L41

- [x] Overloading
  
  https://github.com/NaufalIhza17/FP-OOP/blob/6049bb64a376001fef6145907293be284a759fc9/src/main/java/com/mycompany/movietixapp/WriteData.java#L18-L74

- [x] Overriding
  
  https://github.com/NaufalIhza17/FP-OOP/blob/6049bb64a376001fef6145907293be284a759fc9/src/main/java/com/mycompany/movietixapp/Membership.java#L14-L54

- [x] Encapsulation
 
  https://github.com/NaufalIhza17/FP-OOP/blob/6049bb64a376001fef6145907293be284a759fc9/src/main/java/com/mycompany/movietixapp/Membership.java#L18-L41

- [x] Inheritance

  https://github.com/NaufalIhza17/FP-OOP/blob/42cf4987f4a19ab2dfe72204e7fab1c47962d91b/src/main/java/com/mycompany/movietixapp/Membership.java#L17-L23
  
  https://github.com/NaufalIhza17/FP-OOP/blob/42cf4987f4a19ab2dfe72204e7fab1c47962d91b/src/main/java/com/mycompany/movietixapp/GoldMember.java#L15-L25
  
  https://github.com/NaufalIhza17/FP-OOP/blob/42cf4987f4a19ab2dfe72204e7fab1c47962d91b/src/main/java/com/mycompany/movietixapp/SilverMember.java#L13-L17

- [x] Polymorphism
  
  https://github.com/NaufalIhza17/FP-OOP/blob/c18e725d1cc43689ea051e9e1ba1bb63a6b2fbed/src/main/java/com/mycompany/movietixapp/Membership.java#L42-L54
  
  https://github.com/NaufalIhza17/FP-OOP/blob/c18e725d1cc43689ea051e9e1ba1bb63a6b2fbed/src/main/java/com/mycompany/movietixapp/GoldMember.java#L36-L53
  
  https://github.com/NaufalIhza17/FP-OOP/blob/42cf4987f4a19ab2dfe72204e7fab1c47962d91b/src/main/java/com/mycompany/movietixapp/SilverMember.java#L35-L47
  
  

- [x] ArrayList

  https://github.com/NaufalIhza17/FP-OOP/blob/c18e725d1cc43689ea051e9e1ba1bb63a6b2fbed/src/main/java/com/mycompany/movietixapp/WelcomeFrame.java#L905-L916

- [x] Exception Handling
 
  ```bash
      //WriteData
       try {
          FileWriter fileWriter = new FileWriter(data, true);
          PrintWriter printWriter = new PrintWriter(fileWriter, false);
                
          printWriter.println(username + ":" + password); 
                
           printWriter.close();
        } catch (Exception ignored) {
            ignored.printStackTrace();
        }    
  ```

  

- [x] GUI

  ![loginPageUI](https://user-images.githubusercontent.com/89951546/207502843-dea21f38-1e75-4488-a8a4-98fba15c1363.png)
  
  ![registerPageUI](https://user-images.githubusercontent.com/89951546/207502859-25981ed9-feb8-4f33-ab41-32f0c5f1218c.png)
  
  ![homePageUI2](https://user-images.githubusercontent.com/89951546/207502864-1f8c6dde-f05c-46e4-9cb2-3cbeb1d7e85e.png)

- [x] Interface
 
  ```bash
        interface Voucher {
          public void DiscVoucher();
        }

        public class Membership implements Voucher {
        
        ...
        
            @Override
            public void DiscVoucher() {
            String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            Random rnd = new Random();

            while (salt.length() < 10) { // length of the random string.
                int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                salt.append(SALTCHARS.charAt(index));
            }
                salt.append("05");
            }
        
        }
  ```
  
  https://github.com/NaufalIhza17/FP-OOP/blob/c18e725d1cc43689ea051e9e1ba1bb63a6b2fbed/src/main/java/com/mycompany/movietixapp/WriteData.java#L23-L37
  
- [x] Abstract Class
 
  ```bash
        abstract class Cut {
            Queue<Integer> discVTotal = new PriorityQueue<>();
            int totalCut = 0;
            public abstract void PaymentCut(String code);
            
            ...
            
        }

      public class Payment extends Cut {
          @Override
          public void PaymentCut(String code) {
                  String value = code;
                  String lastTwo = null;
                  
                  ...
                  
          }
  ```

- [x] Generics
 
  ```bash
      //WelcomeFrame line 30
      
      static <T> String genericDisplayBalance(T element) {
            return "Rp " + element;
        }

        static String statusrn;
        private Payment pushCoupon;

        public WelcomeFrame(String username, Payment pushCoupon) {
            initComponents();
            this.username = username;
            money.setEditable(false);
            balanceFieldOrderPage.setEditable(false);
            notEnough.setVisible(false);
            enough.setVisible(false);
            scanDataTable(username);

            TopUp balance = new TopUp();
            money.setText(genericDisplayBalance(balance.getBalance(this.username) - fprice));
            balanceFieldOrderPage.setText("Balance : " + genericDisplayBalance(balance.getBalance(this.username) - fprice));
            
        ...
        
        }
  ```

- [x] Collection
 
  ```bash
        //Payment
        Queue<Integer> discVTotal = new PriorityQueue<>();
        int totalCut = 0;
        public abstract void PaymentCut(String code);
        public int getPayment() {
            Iterator iterator = discVTotal.iterator();
            while(iterator.hasNext()) {
                totalCut += (int)iterator.next();
            }
            return totalCut;
        }
  ```

- [x] Input Output

  *Input*
 
  ```bash
      //WriteData
      public void WriteData (String dataName, String username, String password) {
            File data = new File(dataName + ".txt");

            new Thread(() -> {
                try {
                    FileWriter fileWriter = new FileWriter(data, true);
                    PrintWriter printWriter = new PrintWriter(fileWriter, false);

                    printWriter.println(username + ":" + password); 

                    printWriter.close();
                } catch (Exception ignored) {
                    ignored.printStackTrace();
                }
            }).start();
        }
  ```

  *Ouput*
  
  ```bash
      //Login
      private boolean checkUsername(String username, String password) {
            try {
                Scanner dataScanner = new Scanner(data);
                while (dataScanner.hasNextLine()) {
                    String[] keyValue = dataScanner.nextLine().split(":");
                    if (keyValue[0].equals(username) && keyValue[1].equals(password)) {
                        return false;
                    }
                }
                dataScanner.close();
            } catch (Exception e) {
                return true;
            }
            return true;
        }
  ```
