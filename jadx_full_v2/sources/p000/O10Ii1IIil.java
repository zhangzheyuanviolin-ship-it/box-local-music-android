            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.WindowManager;
            import android.widget.AdapterView;
            import androidx.appcompat.view.menu.ExpandedMenuView;
            
            public final class O10Ii1IIil implements O1l0iiO, AdapterView.OnItemClickListener {
                public Context I00iOIl;
                public LayoutInflater I00iiI;
                public O1illlIiilIl I00iiO;
                public ExpandedMenuView I00iio;
                public O1l0OiO10IoI I00ilI0I1;
                public O10Ii01i0 I00ilO0;

                public O10Ii1IIil(ContextWrapper contextWrapper) {
/* 4 */             this.I00iOIl = contextWrapper;
/* 10 */            this.I00iiI = LayoutInflater.from(contextWrapper);
                }

                @Override
                public final boolean I00000oOI(Oli1l1l0 oli1l1l0) {
/* 1 */             boolean zHasVisibleItems = oli1l1l0.hasVisibleItems();
/* 5 */             Context context = oli1l1l0.I00000oIO;
/* 7 */             if (!zHasVisibleItems) {
/* 9 */                 return false;
                    }
/* 13 */            O1iloOI1l o1iloOI1l = new O1iloOI1l();
/* 16 */            o1iloOI1l.I00iOIl = oli1l1l0;
/* 21 */            O1I1OO o1i1oo = new O1I1OO(context, 1);
/* 28 */            I0il0olIi1OO i0il0olIi1OO = (I0il0olIi1OO) o1i1oo.I00iiO;
/* 32 */            O10Ii1IIil o10Ii1IIil = new O10Ii1IIil(i0il0olIi1OO.I00000oIO);
/* 35 */            o1iloOI1l.I00iiO = o10Ii1IIil;
/* 37 */            o10Ii1IIil.I00ilI0I1 = o1iloOI1l;
/* 39 */            oli1l1l0.I00000oOI(o10Ii1IIil, context);
/* 42 */            O10Ii1IIil o10Ii1IIil2 = o1iloOI1l.I00iiO;
/* 44 */            O10Ii01i0 o10Ii01i0 = o10Ii1IIil2.I00ilO0;
/* 46 */            if (o10Ii01i0 == null) {
/* 50 */                o10Ii01i0 = new O10Ii01i0(o10Ii1IIil2);
/* 53 */                o10Ii1IIil2.I00ilO0 = o10Ii01i0;
                    }
/* 55 */            i0il0olIi1OO.I000II = o10Ii01i0;
/* 57 */            i0il0olIi1OO.I000O01llI0 = o1iloOI1l;
/* 59 */            View view = oli1l1l0.I000oI1ioi;
/* 61 */            if (view != null) {
/* 63 */                i0il0olIi1OO.I0000oI00 = view;
                    } else {
/* 68 */                i0il0olIi1OO.I0000Il00O = oli1l1l0.I000o00OoI0I;
/* 72 */                i0il0olIi1OO.I0000O = oli1l1l0.I000lI;
                    }
/* 74 */            i0il0olIi1OO.I0001Ioi1lo = o1iloOI1l;
/* 76 */            I0ilIO0oloO1 i0ilIO0oloO1I0000oI00 = o1i1oo.I0000oI00();
/* 80 */            o1iloOI1l.I00iiI = i0ilIO0oloO1I0000oI00;
/* 82 */            i0ilIO0oloO1I0000oI00.setOnDismissListener(o1iloOI1l);
/* 91 */            WindowManager.LayoutParams attributes = o1iloOI1l.I00iiI.getWindow().getAttributes();
/* 97 */            attributes.type = 1003;
                    attributes.flags |= 131072;
/* 108 */           o1iloOI1l.I00iiI.show();
/* 111 */           O1l0OiO10IoI o1l0OiO10IoI = this.I00ilI0I1;
/* 113 */           if (o1l0OiO10IoI != null) {
/* 115 */               o1l0OiO10IoI.I000lI(oli1l1l0);
                    }
/* 20 */            return true;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                @Override
                public final void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
/* 1 */             O1l0OiO10IoI o1l0OiO10IoI = this.I00ilI0I1;
/* 3 */             if (o1l0OiO10IoI != null) {
/* 5 */                 o1l0OiO10IoI.I0000O(o1illlIiilIl, z);
                    }
                }

                @Override
                public final boolean I0000oI00(O1ioIIl o1ioIIl) {
/* 1 */             return false;
                }

                @Override
                public final void I000II(O1l0OiO10IoI o1l0OiO10IoI) {
                    throw null;
                }

                @Override
                public final boolean I000O01llI0(O1ioIIl o1ioIIl) {
/* 1 */             return false;
                }

                @Override
                public final void I000OOo1O() {
/* 1 */             O10Ii01i0 o10Ii01i0 = this.I00ilO0;
/* 3 */             if (o10Ii01i0 != null) {
/* 5 */                 o10Ii01i0.notifyDataSetChanged();
                    }
                }

                @Override
                public final void I000iOII(Context context, O1illlIiilIl o1illlIiilIl) {
/* 3 */             if (this.I00iOIl != null) {
/* 5 */                 this.I00iOIl = context;
/* 9 */                 if (this.I00iiI == null) {
/* 15 */                    this.I00iiI = LayoutInflater.from(context);
                        }
                    }
/* 17 */            this.I00iiO = o1illlIiilIl;
/* 19 */            O10Ii01i0 o10Ii01i0 = this.I00ilO0;
/* 21 */            if (o10Ii01i0 != null) {
/* 23 */                o10Ii01i0.notifyDataSetChanged();
                    }
                }

                @Override
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 10 */            this.I00iiO.I00100o1O0lo(this.I00ilO0.getItem(i), this, 0);
                }
            }
