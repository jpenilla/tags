package broccolai.tags.inject;

import broccolai.tags.service.data.DataService;
import broccolai.tags.service.user.UserPipeline;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public final class UserModule extends AbstractModule {

    @Provides
    @Singleton
    UserPipeline providesUserPipeline(final DataService dataService) {
        return new UserPipeline(dataService);
    }

}
