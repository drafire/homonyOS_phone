package com.drafire.phone.adapter.base;

import com.drafire.phone.adapter.ViewHolder;

/**
 * Item View
 *
 * @param <T> type
 */
public interface ItemViewDelegate<T> {
    /**
     * get item view id
     *
     * @return xml
     */
    int getItemViewLayoutId();

    /**
     * is for View Type
     *
     * @param item     item
     * @param position position
     * @return false
     */
    boolean isForViewType(T item, int position);

    /**
     * convert
     *
     * @param viewHolder viewHolder
     * @param type       type
     * @param position   position
     */
    void convert(ViewHolder viewHolder, T type, int position);
}
