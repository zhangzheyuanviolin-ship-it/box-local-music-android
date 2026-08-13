            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OI1i01 implements Function1 {
                public final int I00iOIl;
                public OI1i0llli I00iiI;

                public OI1i01(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    boolean zContainsKey;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI1i0llli oI1i0llli = this.I00iiI;
/* 5 */             OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) obj;
                    switch (i) {
                        case 0:
/* 41 */                    zContainsKey = oI1i0llli.I000l1.containsKey(Integer.valueOf(oI1ilOI1ioo0.I00iiI.I00000oOI));
                            break;
                        default:
/* 20 */                    zContainsKey = oI1i0llli.I000l1.containsKey(Integer.valueOf(oI1ilOI1ioo0.I00iiI.I00000oOI));
                            break;
                    }
/* 26 */            return Boolean.valueOf(!zContainsKey);
                }
            }
