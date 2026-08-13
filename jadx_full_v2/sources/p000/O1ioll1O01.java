            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.view.MenuItem;
            import android.view.View;
            import android.widget.AdapterView;
            import android.widget.FrameLayout;
            import android.widget.HeaderViewListAdapter;
            import android.widget.ListAdapter;
            import android.widget.PopupWindow;
            
/* 35 */    public abstract class O1ioll1O01 implements Ol01O0lOO, O1l0iiO, AdapterView.OnItemClickListener {
                public Rect I00iOIl;

                public static int I000lI(ListAdapter listAdapter, Context context, int i) {
/* 2 */             int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 6 */             int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 10 */            int count = listAdapter.getCount();
/* 15 */            int i2 = 0;
/* 16 */            int i3 = 0;
/* 17 */            FrameLayout frameLayout = null;
/* 18 */            View view = null;
/* 19 */            for (int i4 = 0; i4 < count; i4++) {
/* 21 */                int itemViewType = listAdapter.getItemViewType(i4);
/* 25 */                if (itemViewType != i3) {
/* 27 */                    view = null;
/* 28 */                    i3 = itemViewType;
                        }
/* 29 */                if (frameLayout == null) {
/* 33 */                    frameLayout = new FrameLayout(context);
                        }
/* 36 */                view = listAdapter.getView(i4, view, frameLayout);
/* 40 */                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 43 */                int measuredWidth = view.getMeasuredWidth();
/* 47 */                if (measuredWidth >= i) {
/* 49 */                    return i;
                        }
/* 50 */                if (measuredWidth > i2) {
/* 52 */                    i2 = measuredWidth;
                        }
                    }
/* 98 */            return i2;
                }

                @Override
                public final boolean I0000oI00(O1ioIIl o1ioIIl) {
/* 1 */             return false;
                }

                @Override
                public final boolean I000O01llI0(O1ioIIl o1ioIIl) {
/* 1 */             return false;
                }

                public abstract void I000l1(O1illlIiilIl o1illlIiilIl);

                public abstract void I000o00OoI0I(View view);

                public abstract void I000oI1ioi(boolean z);

                public abstract void I00100l0(int i);

                public abstract void I00100o1O0lo(int i);

                public abstract void I0010I0i(PopupWindow.OnDismissListener onDismissListener);

                public abstract void I0010o(boolean z);

                public abstract void I00111O(int i);

                @Override
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 5 */             ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
/* 39 */            (listAdapter instanceof HeaderViewListAdapter ? (O1ilIool) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (O1ilIool) listAdapter).I00000oIO.I00100o1O0lo((MenuItem) listAdapter.getItem(i), this, !(this instanceof IO0iOlIO1o) ? 0 : 4);
                }

                @Override
/* 36 */        public final void I000iOII(Context context, O1illlIiilIl o1illlIiilIl) {
                }
            }
