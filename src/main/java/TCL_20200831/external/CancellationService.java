
package TCL_20200831.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="cook", url="http://localhost:8082")
public interface CancellationService {

    @RequestMapping(method= RequestMethod.GET, path="/cancellations")
    public void cancel(@RequestBody Cancellation cancellation);

}