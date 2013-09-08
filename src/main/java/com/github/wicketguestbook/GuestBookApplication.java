package com.github.wicketguestbook;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class GuestBookApplication extends WebApplication {
    public GuestBookApplication() {
    }

    @Override
    public Class< ? extends Page> getHomePage() {
        return GuestBook.class;
    }
}
