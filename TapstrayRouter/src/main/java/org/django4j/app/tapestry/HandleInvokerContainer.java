package org.django4j.app.tapestry;

import org.django4j.api.IAppendable;

public interface HandleInvokerContainer extends IAppendable<RouterInvoker> {
    RouterInvoker match(int argSize);
}
