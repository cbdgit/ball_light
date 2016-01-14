package com.bosong.ball_light.model.bean;

public class ContextMemberBean {
	private int iconId;
	private boolean isOnline;

	public ContextMemberBean(int iconId, boolean isOnline) {
		super();
		this.iconId = iconId;
		this.isOnline = isOnline;
	}

	public int getIconId() {
		return iconId;
	}

	public void setIconId(int iconId) {
		this.iconId = iconId;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

}
