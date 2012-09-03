package org.elka.aTemplate.client.presenter;

import com.google.gwt.place.shared.Place;

public interface Presenter {

	/**
	 * Goes to the specified place.
	 * 
	 * @param place
	 *            the place to go.
	 */
	void goTo(Place place);

}
