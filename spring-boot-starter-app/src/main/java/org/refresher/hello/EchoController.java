/**
 * Created by kulkamah on 12/24/2016.
 */
package org.refresher.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @RequestMapping("/echo")
    public String getHello() {
        return "Greetings world, Echo Controller";
    }
}
