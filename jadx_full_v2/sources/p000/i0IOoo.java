            package p000;

            import android.os.Bundle;
            
            public final class i0IOoo extends i0IIo11i {
                public final int I000OiO;
                public final String I000iOII;
                public final int I000l1;
                public final i0Ii1l I000lI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IOoo(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll, int i, String str, int i2) {
/* 3 */             super(i0ii1l, oloIlI0ll);
/* 1 */             this.I000lI = i0ii1l;
/* 6 */             this.I000OiO = i;
/* 8 */             this.I000iOII = str;
/* 10 */            this.I000l1 = i2;
                }

                @Override
                public final void I00O0i0ii(Bundle bundle) {
/* 1 */             i0Ii1l i0ii1l = this.I000lI;
/* 7 */             i0ii1l.I0000O.I0000O(this.I000O01llI0);
/* 28 */            i0Ii1l.I000II.I00000oOI("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
/* 31 */            int i = this.I000l1;
/* 33 */            if (i > 0) {
/* 41 */                i0ii1l.I000OiO(this.I000OiO, i - 1, this.I000iOII);
                    }
                }
            }
