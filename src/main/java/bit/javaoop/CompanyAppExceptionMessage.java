package bit.javaoop;

public enum CompanyAppExceptionMessage {
    NULL_ARG("Argument can not be null!"),
    EMPLOYEE_ALREADY_HIRED("Employee is already hired!"),
    BUDGET_OVERFLOW("Employee can not be hired! Budget overflow."),
    EMPLOYEES_LIMID_EXCEEDED("Manager can not hire any other employee."),
    CAN_NOT_BE_HIRED("Employee can not be hired");

    private final String message;

    CompanyAppExceptionMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
