            package p000;

            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.BaseAdapter;
            import androidx.appcompat.view.menu.ListMenuItemView;
            import java.util.ArrayList;
            
            public final class O1ilIool extends BaseAdapter {
                public final O1illlIiilIl I00000oIO;
                public int I00000oOI = -1;
                public boolean I0000Il00O;
                public final boolean I0000O;
                public final LayoutInflater I0000oI00;
                public final int I0001Ioi1lo;

                public O1ilIool(O1illlIiilIl o1illlIiilIl, LayoutInflater layoutInflater, boolean z, int i) {
/* 7 */             this.I0000O = z;
/* 9 */             this.I0000oI00 = layoutInflater;
/* 11 */            this.I00000oIO = o1illlIiilIl;
/* 13 */            this.I0001Ioi1lo = i;
/* 15 */            I00000oIO();
                }

                public final void I00000oIO() {
/* 1 */             O1illlIiilIl o1illlIiilIl = this.I00000oIO;
/* 3 */             O1ioIIl o1ioIIl = o1illlIiilIl.I001IO000;
/* 5 */             if (o1ioIIl != null) {
/* 7 */                 o1illlIiilIl.I000OOo1O();
/* 10 */                ArrayList arrayList = o1illlIiilIl.I000OiO;
/* 12 */                int size = arrayList.size();
/* 17 */                for (int i = 0; i < size; i++) {
/* 25 */                    if (((O1ioIIl) arrayList.get(i)) == o1ioIIl) {
/* 27 */                        this.I00000oOI = i;
/* 29 */                        return;
                            }
                        }
                    }
/* 34 */            this.I00000oOI = -1;
                }

                @Override
                public final O1ioIIl getItem(int i) {
                    ArrayList arrayListI000l1;
/* 1 */             boolean z = this.I0000O;
/* 3 */             O1illlIiilIl o1illlIiilIl = this.I00000oIO;
/* 5 */             if (z) {
/* 7 */                 o1illlIiilIl.I000OOo1O();
/* 10 */                arrayListI000l1 = o1illlIiilIl.I000OiO;
                    } else {
/* 13 */                arrayListI000l1 = o1illlIiilIl.I000l1();
                    }
/* 17 */            int i2 = this.I00000oOI;
/* 19 */            if (i2 >= 0 && i >= i2) {
/* 23 */                i++;
                    }
/* 29 */            return (O1ioIIl) arrayListI000l1.get(i);
                }

                @Override
                public final int getCount() {
                    ArrayList arrayListI000l1;
/* 1 */             boolean z = this.I0000O;
/* 3 */             O1illlIiilIl o1illlIiilIl = this.I00000oIO;
/* 5 */             if (z) {
/* 7 */                 o1illlIiilIl.I000OOo1O();
/* 10 */                arrayListI000l1 = o1illlIiilIl.I000OiO;
                    } else {
/* 13 */                arrayListI000l1 = o1illlIiilIl.I000l1();
                    }
                    return this.I00000oOI < 0 ? arrayListI000l1.size() : arrayListI000l1.size() - 1;
                }

                @Override
                public final long getItemId(int i) {
/* 1 */             return i;
                }

                @Override
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             boolean z = false;
/* 2 */             if (view == null) {
/* 8 */                 view = this.I0000oI00.inflate(this.I0001Ioi1lo, viewGroup, false);
                    }
/* 16 */            int i2 = getItem(i).I00000oOI;
                    int i3 = i - 1;
/* 29 */            int i4 = i3 >= 0 ? getItem(i3).I00000oOI : i2;
/* 31 */            ListMenuItemView listMenuItemView = (ListMenuItemView) view;
/* 40 */            if (this.I00000oIO.I000lI() && i2 != i4) {
/* 44 */                z = true;
                    }
/* 45 */            listMenuItemView.setGroupDividerEnabled(z);
/* 49 */            O1l0lO0Ioo1 o1l0lO0Ioo1 = (O1l0lO0Ioo1) view;
/* 53 */            if (this.I0000Il00O) {
/* 55 */                listMenuItemView.setForceShowIcon(true);
                    }
/* 62 */            o1l0lO0Ioo1.I00000oIO(getItem(i));
/* 98 */            return view;
                }

                @Override
                public final void notifyDataSetChanged() {
/* 1 */             I00000oIO();
/* 4 */             super.notifyDataSetChanged();
                }
            }
