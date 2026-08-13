            package p000;

            import android.content.Context;
            import android.util.DisplayMetrics;
            
            public final class IiiO01oi1 implements Ol0iOll10l {
                public Context I00iOIl;

                @Override
                public final Object I00000oIO(OOllIOloOl01 oOllIOloOl01) {
/* 7 */             DisplayMetrics displayMetrics = this.I00iOIl.getResources().getDisplayMetrics();
/* 19 */            Iii10I11ll0 iii10I11ll0I00000oIO = iO1o1O.I00000oIO(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
/* 25 */            return new Ol0i11lo1l1I(iii10I11ll0I00000oIO, iii10I11ll0I00000oIO);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof IiiO01oi1) && O0000Ioio00.I0000O(this.I00iOIl, ((IiiO01oi1) obj).I00iOIl);
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }
            }
