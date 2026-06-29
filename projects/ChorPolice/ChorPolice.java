package projects.ChorPolice;

public class ChorPolice {

        static void chor(int amt,boolean isCaught) throws MyException{
            if(amt<0){
                throw new ArithmeticException("The thief is innocent");
            }
            if(isCaught){
                throw new MyException("The thief is caught");
            }

        }
        public static void main(String[] args) {

            try{
                chor(-250,true);
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            catch(MyException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
