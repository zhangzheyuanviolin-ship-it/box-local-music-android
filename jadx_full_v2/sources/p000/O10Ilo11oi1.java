            package p000;

            import android.database.DataSetObserver;
            
            public final class O10Ilo11oi1 extends DataSetObserver {
                public final O10O00o I00000oIO;

                public O10Ilo11oi1(O10O00o o10O00o) {
/* 1 */             this.I00000oIO = o10O00o;
                }

                @Override
                public final void onChanged() {
/* 1 */             O10O00o o10O00o = this.I00000oIO;
/* 9 */             if (o10O00o.I00oliIiO01i.isShowing()) {
/* 11 */                o10O00o.I0001Ioi1lo();
                    }
                }

                @Override
                public final void onInvalidated() {
/* 3 */             this.I00000oIO.dismiss();
                }
            }
