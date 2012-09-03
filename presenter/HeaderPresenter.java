package org.elka.aTemplate.client.presenter;

import java.util.logging.Logger;

import org.elka.aTemplate.client.factory.ClientFactory;
import org.elka.aTemplate.client.view.main.HeaderView;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.Window;

public class HeaderPresenter implements Presenter, HeaderView.Presenter<Object> {

	final ClientFactory clientFactory;

	final HeaderView<Object> view;

	private static final Logger log = Logger.getLogger(HeaderPresenter.class.getName());

	public HeaderPresenter(final ClientFactory clientFactory, final HeaderView<Object> view) {
		this.clientFactory = clientFactory;
		this.view = view;
	}

	@Override
	public void goTo(final Place place) {
		this.clientFactory.getPlaceController().goTo(place);
	}

	@Override
	public void onClickButtonFetch() {
		Window.alert("Click");
	}

}
