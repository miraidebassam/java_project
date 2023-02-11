package Exception;

public class DAOException extends  Exception{


    public DAOException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
