import com.antonio.jsonlist_mvp.BuildConfig;
import com.antonio.jsonlist_mvp.JsonListApplication;
import com.antonio.jsonlist_mvp.model.APIService;
import com.antonio.jsonlist_mvp.model.Data;
import com.antonio.jsonlist_mvp.presenter.SplashPresenter;
import com.antonio.jsonlist_mvp.view.SplashView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.io.IOException;

import utils.MockData;


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class SplashPresenterTest {

    SplashPresenter presenter;
    SplashView view;
    APIService apiService;

    @Before
    public void setUp() {
        JsonListApplication application = (JsonListApplication) RuntimeEnvironment.application;

        apiService = Mockito.mock(APIService.class);
        application.setAPIService(apiService);

        presenter = new SplashPresenter();
        view = Mockito.mock(SplashView.class);
        Mockito.when(view.getContext()).thenReturn(application);
        presenter.attachView(view);
    }

    @Test
    public void loadDataSuccesfully() throws IOException {
        Mockito.when(apiService.listGuides()).thenReturn(MockData.okResponse());
        presenter.loadNetworkData();
        Mockito.verify(view).moveToNextScreen(Mockito.any(Data.class));
    }

    @Test
    public void loadDataFail() throws  IOException{
        Mockito.when(apiService.listGuides()).thenReturn(MockData.errorResponse());
        presenter.loadNetworkData();
        Mockito.verify(view).displayErrorMessage();
    }



    @After
    public void tearDown() {
        presenter.detachView();
    }
}
