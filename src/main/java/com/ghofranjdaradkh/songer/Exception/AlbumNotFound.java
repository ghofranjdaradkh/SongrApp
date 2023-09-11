package com.ghofranjdaradkh.songer.Exception;

public class AlbumNotFound  extends RuntimeException{

    public AlbumNotFound(String message){
        super(message);
    }
public AlbumNotFound(Throwable Cause){
        super(Cause);
}
}
