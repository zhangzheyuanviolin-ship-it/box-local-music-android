            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.BaseAdapter;
            import com.box.gallery.R;
            import java.util.ArrayList;
            
            public final class O10Ii01i0 extends BaseAdapter {
                public int I00000oIO = -1;
                public final O10Ii1IIil I00000oOI;

                public O10Ii01i0(O10Ii1IIil o10Ii1IIil) {
/* 1 */             this.I00000oOI = o10Ii1IIil;
/* 9 */             I00000oIO();
                }

                public final void I00000oIO() {
/* 3 */             O1illlIiilIl o1illlIiilIl = this.I00000oOI.I00iiO;
/* 5 */             O1ioIIl o1ioIIl = o1illlIiilIl.I001IO000;
/* 7 */             if (o1ioIIl != null) {
/* 9 */                 o1illlIiilIl.I000OOo1O();
/* 12 */                ArrayList arrayList = o1illlIiilIl.I000OiO;
/* 14 */                int size = arrayList.size();
/* 19 */                for (int i = 0; i < size; i++) {
/* 27 */                    if (((O1ioIIl) arrayList.get(i)) == o1ioIIl) {
/* 29 */                        this.I00000oIO = i;
/* 31 */                        return;
                            }
                        }
                    }
/* 36 */            this.I00000oIO = -1;
                }

                @Override
                public final O1ioIIl getItem(int i) {
/* 3 */             O1illlIiilIl o1illlIiilIl = this.I00000oOI.I00iiO;
/* 5 */             o1illlIiilIl.I000OOo1O();
/* 8 */             ArrayList arrayList = o1illlIiilIl.I000OiO;
/* 10 */            int i2 = this.I00000oIO;
/* 12 */            if (i2 >= 0 && i >= i2) {
/* 16 */                i++;
                    }
/* 22 */            return (O1ioIIl) arrayList.get(i);
                }

                @Override
                public final int getCount() {
/* 3 */             O1illlIiilIl o1illlIiilIl = this.I00000oOI.I00iiO;
/* 5 */             o1illlIiilIl.I000OOo1O();
/* 10 */            int size = o1illlIiilIl.I000OiO.size();
                    return this.I00000oIO < 0 ? size : size - 1;
                }

                @Override
                public final long getItemId(int i) {
/* 1 */             return i;
                }

                @Override
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             if (view == null) {
/* 11 */                view = this.I00000oOI.I00iiI.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
                    }
/* 22 */            ((O1l0lO0Ioo1) view).I00000oIO(getItem(i));
/* 98 */            return view;
                }

                @Override
                public final void notifyDataSetChanged() {
/* 1 */             I00000oIO();
/* 4 */             super.notifyDataSetChanged();
                }
            }
