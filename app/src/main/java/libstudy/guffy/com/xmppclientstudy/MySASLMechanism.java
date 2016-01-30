package libstudy.guffy.com.xmppclientstudy;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.sasl.SASLMechanism;

import javax.security.auth.callback.CallbackHandler;

/**
 * Created by gufran on 1/30/16.
 */
public class MySASLMechanism extends SASLMechanism {

    public static final String NAME = "X-GOOGLE-TOKEN";

    public MySASLMechanism() {
        super();
    }

    @Override
    public void authenticate(String host, String serviceName, CallbackHandler cbh) throws SmackException {
        super.authenticate(host, serviceName, cbh);
    }

    @Override
    protected void authenticateInternal(CallbackHandler cbh) throws SmackException {

    }

    @Override
    protected byte[] getAuthenticationText() throws SmackException {
        return new byte[0];
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public void checkIfSuccessfulOrThrow() throws SmackException {

    }

    @Override
    protected SASLMechanism newInstance() {
        return this;
    }
}
