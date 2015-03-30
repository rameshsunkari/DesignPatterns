package org.thinkadv.dp.behavioural.iterator;

import java.util.List;

public interface ChannelCollection {
	
	public void addChannel(Channel c);

	public void removeChannel(Channel c);

	public List<Channel> getChannelList();

	public ChannelIterator iterator(ChannelTypeEnum type);
}
