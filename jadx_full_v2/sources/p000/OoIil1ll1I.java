            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OoIil1ll1I extends OoIiOIo0i010 {
                public OO0o1ooIIi I00ilI0I1;

                @Override
                public final Object next() {
/* 1 */             int i = this.I00iio;
/* 5 */             this.I00iio = i + 2;
/* 9 */             OO0o1ooIIi oO0o1ooIIi = this.I00ilI0I1;
/* 11 */            Object[] objArr = this.I00iiI;
/* 13 */            Object obj = objArr[i];
/* 17 */            Object obj2 = objArr[i + 1];
/* 20 */            OI0lll1ooo oI0lll1ooo = new OI0lll1ooo(0, obj, obj2);
/* 23 */            oI0lll1ooo.I00iio = oO0o1ooIIi;
/* 25 */            oI0lll1ooo.I00ilI0I1 = obj2;
/* 27 */            VarHandle.storeStoreFence();
/* 55 */            return oI0lll1ooo;
                }
            }
