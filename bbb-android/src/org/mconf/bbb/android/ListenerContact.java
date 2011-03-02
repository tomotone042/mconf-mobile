package org.mconf.bbb.android;

import org.mconf.bbb.listeners.IListener;
import org.mconf.bbb.listeners.Listener;

public class ListenerContact extends Listener{

	
	public ListenerContact (IListener listener)
	{
		this.setCidName(listener.getCidName());
		this.setCidNum(listener.getCidNum());
		this.setLocked(listener.isLocked());
		this.setMuted(listener.isMuted());
		this.setTalking(listener.isTalking());
		this.setUserId(listener.getUserId());
	}
}
