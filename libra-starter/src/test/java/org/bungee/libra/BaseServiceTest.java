package org.bungee.libra;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseServiceTest {

    @Test
    public void testNewErrorCode(){
        try {
            throw new NetException(ErrorCode.IP_ERR_CODE, "1.1.1.1");
        }catch (NetException e){
            System.out.println(e.getErrorDescription());
            try {
                throw new NetException(ErrorCode.NETWORK_ERR_CODE, "eth4");
            }catch (NetException ne){
                System.out.println(ne.getErrorDescription());
                try {
                    throw new NetException(ErrorCode.IP_ERR_CODE, "1.1.2.1");
                }catch (NetException ex){
                    System.out.println(ex.getErrorDescription());
                }
            }
        }

    }
}
