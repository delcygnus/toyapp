package com.delcygnus.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.delcygnus.ToyApp;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(720, 405);
        }

        @Override
        public ApplicationListener createApplicationListener () {
                return new ToyApp();
        }
}