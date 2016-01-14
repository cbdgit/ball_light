package com.bosong.ball_light.model.adapter;

import com.bosong.ball_light.R;
import com.bosong.ball_light.model.bean.ContextMemberBean;
import com.bosong.ball_light.util.LogUtil;

import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ContextMemberAdapter extends BaseAdapter {
	private List<ContextMemberBean> mList = new LinkedList<ContextMemberBean>();
	private LayoutInflater inflater;

	private enum Mode {
		DEL, NORMAL
	};

	private Mode mMode = Mode.NORMAL;

	public ContextMemberAdapter(Context mContext) {
		inflater = LayoutInflater.from(mContext);
		initList();
	}

	private void initList() {
		mList.add(new ContextMemberBean(R.drawable.home, true));
		mList.add(new ContextMemberBean(R.drawable.outside, false));
		mList.add(new ContextMemberBean(R.drawable.dinner, false));
		mList.add(new ContextMemberBean(R.drawable.theatre, false));
		mList.add(new ContextMemberBean(R.drawable.bed, false));
		mList.add(new ContextMemberBean(R.drawable.sleep, false));
		mList.add(new ContextMemberBean(R.drawable.party, false));
		mList.add(new ContextMemberBean(R.drawable.birthday, false));
		mList.add(new ContextMemberBean(R.drawable.celebrate, false));
	}

	@Override
	public int getCount() {
		return mList.size();
	}

	@Override
	public Object getItem(int position) {
		if (position >= mList.size())
			position = mList.size() - 1;
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.grid_item, null);
			holder.icon = (ImageView) convertView.findViewById(R.id.item_icon);
			holder.del = (ImageView) convertView.findViewById(R.id.item_del);
			holder.online = (ImageView) convertView
					.findViewById(R.id.item_online_state);
			holder.offline = (ImageView) convertView
					.findViewById(R.id.item_offline_state);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		if (position == mList.size()) {
			holder.icon.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {

				}
			});
			holder.online.setVisibility(View.GONE);
			holder.offline.setVisibility(View.GONE);
			holder.del.setVisibility(View.GONE);
		} else if (position == mList.size() + 1) {
			holder.icon.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					if (mMode == Mode.NORMAL) {
						mMode = Mode.DEL;
					} else {
						mMode = Mode.NORMAL;
					}
					refreshUI();
				}
			});
			holder.online.setVisibility(View.GONE);
			holder.offline.setVisibility(View.GONE);
			holder.del.setVisibility(View.GONE);
		} else {
			holder.icon.setImageResource(mList.get(position).getIconId());
			holder.icon.setOnLongClickListener(new View.OnLongClickListener() {
				@Override
				public boolean onLongClick(View v) {
					mMode = Mode.DEL;
					refreshUI();
					return true;
				}
			});
			int resOnlineId = 0;
			int resOfflineId = 0;
			if (mList.get(position).isOnline()) {
				resOnlineId = R.drawable.member_online;
				resOfflineId = R.drawable.member_offline;
			}
			holder.online.setVisibility(View.VISIBLE);
			holder.offline.setVisibility(View.VISIBLE);
			holder.online.setImageResource(resOnlineId);
			holder.offline.setImageResource(resOfflineId);
			if (mMode == Mode.NORMAL) {
				holder.del.setVisibility(View.GONE);
			} else {
				holder.del.setVisibility(View.VISIBLE);
				holder.online.setVisibility(View.GONE);
				holder.offline.setVisibility(View.GONE);
			}

			holder.del.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					deleteItem(position);
					refreshUI();
				}
			});

			holder.del.setOnKeyListener(new OnKeyListener() {

				@Override
				public boolean onKey(View v, int keyCode, KeyEvent event) {
					if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
						mMode = Mode.NORMAL;
					}
					return false;
				}
			});
		}

		return convertView;
	}

	public void refreshUI() {
		notifyDataSetChanged();
	}

	public void addItem(ContextMemberBean contextMemberBean){
		mList.add(contextMemberBean);
		refreshUI();
	}
	public void deleteItem(int position){
		mList.remove(position);
		refreshUI();
	}

	private class ViewHolder {
		ImageView icon;
		ImageView del;
		ImageView online;
		ImageView offline;
	}
}
