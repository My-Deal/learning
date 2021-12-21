package javapractice.multithreading;

import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.util.concurrent.Exchanger;

public class FillAndEmptyWithExchanger {
    Exchanger<DataBuffer> exchanger=new Exchanger<>();
    DataBuffer initialBuffer=new DataBufferInt(10);
    DataBuffer fullBuffer=new DataBufferInt(10);

     class FillingLoop implements Runnable{


        @Override
        public void run() {
            DataBuffer currentBuffer=initialBuffer;
            while (currentBuffer!=null){
                addToBuffer(currentBuffer);
            }
        }
        private void addToBuffer(DataBuffer buffer){

        }
    }

}
