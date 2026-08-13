            package p000;

            import android.graphics.drawable.Drawable;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.widget.HeaderViewListAdapter;
            import android.widget.ListAdapter;
            import androidx.appcompat.view.menu.ListMenuItemView;
            
            public final class O1l0I0i extends Iio010 {
                public int I00lli11;
                public int I00lll10;
                public O1ioI1 I00o0iI0io1;
                public O1ioIIl I00o0l1o1o0;

                @Override
                public final boolean onHoverEvent(MotionEvent motionEvent) {
                    O1ilIool o1ilIool;
                    int headersCount;
                    int iPointToPosition;
                    int i;
/* 3 */             if (this.I00o0iI0io1 != null) {
/* 5 */                 ListAdapter adapter = getAdapter();
/* 11 */                if (adapter instanceof HeaderViewListAdapter) {
/* 13 */                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
/* 15 */                    headersCount = headerViewListAdapter.getHeadersCount();
/* 23 */                    o1ilIool = (O1ilIool) headerViewListAdapter.getWrappedAdapter();
                        } else {
/* 26 */                    o1ilIool = (O1ilIool) adapter;
/* 28 */                    headersCount = 0;
                        }
/* 68 */                O1ioIIl o1ioIIlI00000oOI = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= o1ilIool.getCount()) ? null : o1ilIool.getItem(i);
/* 69 */                O1ioIIl o1ioIIl = this.I00o0l1o1o0;
/* 71 */                if (o1ioIIl != o1ioIIlI00000oOI) {
/* 73 */                    O1illlIiilIl o1illlIiilIl = o1ilIool.I00000oIO;
/* 75 */                    if (o1ioIIl != null) {
/* 79 */                        this.I00o0iI0io1.I0000Il00O(o1illlIiilIl, o1ioIIl);
                            }
/* 82 */                    this.I00o0l1o1o0 = o1ioIIlI00000oOI;
/* 84 */                    if (o1ioIIlI00000oOI != null) {
/* 88 */                        this.I00o0iI0io1.I000l1(o1illlIiilIl, o1ioIIlI00000oOI);
                            }
                        }
                    }
/* 91 */            return super.onHoverEvent(motionEvent);
                }

                @Override
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 5 */             ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
/* 8 */             if (listMenuItemView != null && i == this.I00lli11) {
/* 18 */                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
/* 38 */                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                        }
/* 7 */                 return true;
                    }
/* 42 */            if (listMenuItemView == null || i != this.I00lll10) {
/* 78 */                return super.onKeyDown(i, keyEvent);
                    }
/* 49 */            setSelection(-1);
/* 52 */            ListAdapter adapter = getAdapter();
/* 74 */            (adapter instanceof HeaderViewListAdapter ? (O1ilIool) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (O1ilIool) adapter).I00000oIO.I0000Il00O(false);
/* 7 */             return true;
                }

                public void setHoverListener(O1ioI1 o1ioI1) {
/* 1 */             this.I00o0iI0io1 = o1ioI1;
                }

                @Override
                public void setSelector(Drawable drawable) {
/* 1 */             super.setSelector(drawable);
                }
            }
