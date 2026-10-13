package repository;

public class RepositoryException extends Exception {
    public RepositoryException(String message){
        super(message); // call Exception constructor, which calls Throwable constructor,
                            // which provides the getMessage() method
    }
}
