package web;

import dao.IHDM;
import dao.IUSB;
import dao.IVGA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC {
    @Autowired
    private IUSB iusb;

    @Autowired
    private IHDM ihdm;

    public int readData(){
      int r= iusb.read();
      return r;
    }
    public  void  printData(String data){
            ihdm.print(data.getBytes());
    }
}
