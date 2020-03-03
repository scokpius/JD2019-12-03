package by.it.ban.calc;



import java.io.IOException;

class Printer {
    static ResManager lang = ResManager.INSTANCE;
    void print(Var var) throws CalcException, IOException {
        LogFile log= LogFile.getLogger();
        if (var != null){
            System.out.println(var);
            log.print(var.toString());
        }
        else
            throw new CalcException(lang.get(ErrorMessages.UNKNOWN));
    }


}
