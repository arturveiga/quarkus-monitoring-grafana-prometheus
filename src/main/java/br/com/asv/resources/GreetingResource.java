package br.com.asv.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Gauge;
import org.eclipse.microprofile.metrics.annotation.Timed;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(
        name = "veiga count"
    )
    @Timed(
        name = "Duration Veiga"
    )
    public String hello() {
        System.out.println("Count");
        return "hello";
    }

    @Gauge(
        name = "Memory Count Veiga",
        unit = MetricUnits.BITS
    )
    public long memoryCount(){
        System.out.println("Memory");
        return Runtime.getRuntime().freeMemory();
    }
}