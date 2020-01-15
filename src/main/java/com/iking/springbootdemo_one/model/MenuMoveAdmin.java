package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class MenuMoveAdmin implements Serializable {

    /**
     * 要移动的菜单的ID
     */
    private Integer oldMenu;

    /**
     * 要接收的菜单ID
     */
    private Integer newMenu;

    /**
     * 在接受菜单ID的前还是后
     */
    private String state;

    public Integer getOldMenu() {
        return oldMenu;
    }

    public void setOldMenu(Integer oldMenu) {
        this.oldMenu = oldMenu;
    }

    public Integer getNewMenu() {
        return newMenu;
    }

    public void setNewMenu(Integer newMenu) {
        this.newMenu = newMenu;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
