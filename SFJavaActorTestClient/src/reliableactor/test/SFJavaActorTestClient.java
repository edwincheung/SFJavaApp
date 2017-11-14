package reliableactor.test;

import reliableactor.SFJavaActor;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

import microsoft.servicefabric.actors.ActorExtensions;
import microsoft.servicefabric.actors.ActorId;
import microsoft.servicefabric.actors.ActorProxyBase;

public class SFJavaActorTestClient {

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) throws URISyntaxException, InterruptedException, ExecutionException {
        SFJavaActor actorProxy = ActorProxyBase.create(SFJavaActor.class, new ActorId("From Actor 1"), new URI("fabric:/SFJavaApp/SFJavaActorService"));
        int count = actorProxy.getCountAsync().get();
        System.out.println("From Actor:" + ActorExtensions.getActorId(actorProxy) + " CurrentValue:" + count);
        actorProxy.setCountAsync(count + 1).get();
    }
}
