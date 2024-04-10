package hyperauto.factories;

import hyperauto.exceptions.BrowserNotSupportedException;

public interface IFactory<T> {
    T create() throws BrowserNotSupportedException;
}
