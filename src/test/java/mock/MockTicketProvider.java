package mock;

import academy.certif.erphrense.domain.Cancelable;
import academy.certif.erphrense.provider.CancelableProvider;

public class MockTicketProvider extends CancelableProvider{

    @Override
    public void persist(Cancelable cancelable){

    }

    @Override
    public boolean delete(int reference){
        return true;
    }
}
