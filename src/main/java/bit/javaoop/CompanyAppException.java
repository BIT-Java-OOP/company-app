package bit.javaoop;

public class CompanyAppException extends Exception {
    public CompanyAppException(CompanyAppExceptionMessage companyAppExceptionMessage) {
        super(companyAppExceptionMessage.toString());
    }
}
