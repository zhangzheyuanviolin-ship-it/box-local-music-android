            package p000;

            import android.content.Context;
            import android.view.MenuItem;
            import java.lang.invoke.VarHandle;
            
            public final class O1l0IO extends O10O00o implements O1ioI1 {
                public Oi0Oooi I00oo1iO0ll;

                @Override
                public final void I0000Il00O(O1illlIiilIl o1illlIiilIl, MenuItem menuItem) {
/* 1 */             Oi0Oooi oi0Oooi = this.I00oo1iO0ll;
/* 3 */             if (oi0Oooi != null) {
/* 5 */                 oi0Oooi.I0000Il00O(o1illlIiilIl, menuItem);
                    }
                }

                @Override
                public final void I000l1(O1illlIiilIl o1illlIiilIl, O1ioIIl o1ioIIl) {
/* 1 */             Oi0Oooi oi0Oooi = this.I00oo1iO0ll;
/* 3 */             if (oi0Oooi != null) {
/* 5 */                 oi0Oooi.I000l1(o1illlIiilIl, o1ioIIl);
                    }
                }

                @Override
                public final Iio010 I00100o1O0lo(Context context, boolean z) {
/* 3 */             O1l0I0i o1l0I0i = new O1l0I0i(context, z);
/* 23 */            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
/* 25 */                o1l0I0i.I00lli11 = 21;
/* 27 */                o1l0I0i.I00lll10 = 22;
                    } else {
/* 33 */                o1l0I0i.I00lli11 = 22;
/* 35 */                o1l0I0i.I00lll10 = 21;
                    }
/* 29 */            VarHandle.storeStoreFence();
/* 38 */            o1l0I0i.setHoverListener(this);
/* 106 */           return o1l0I0i;
                }
            }
