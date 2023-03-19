package metier;

import dao.IHDM;
import dao.IVGA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HDMVGAdapter implements IVGA {

    @Autowired
    private IHDM ihdm;


    @Override
    public void print(String message) {
        byte[] b =message.getBytes();
       ihdm.print(b);
    }
}
