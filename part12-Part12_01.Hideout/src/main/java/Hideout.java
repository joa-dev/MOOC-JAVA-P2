/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joa-dev
 */
public class Hideout<T> {

    private T hideout;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        hideout = toHide;
    }

    public T takeFromHideout() {
        T value = hideout;
        hideout = null;
        return value;
    }

    public boolean isInHideout() {
        return hideout == null ? false : true;
    }
}
