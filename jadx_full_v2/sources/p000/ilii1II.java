            package p000;

            import java.util.concurrent.Callable;
            
            public final class ilii1II implements Callable {
                public static final ilii1II I00000oOI = new ilii1II(0);
                public static final ilii1II I0000Il00O = new ilii1II(1);
                public final int I00000oIO;

                public ilii1II(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object call() {
                    switch (this.I00000oIO) {
                        case 0:
/* 13 */                    lOiIIOo loiiioo = new lOiIIOo("internal.platform", 4);
/* 26 */                    loiiioo.I00iiI.put("getVersion", new lOiIIOo("getVersion", 3));
/* 29 */                    return loiiioo;
                        default:
/* 6 */                     return null;
                    }
                }
            }
