            package p000;

            import android.os.Handler;
            import android.os.Looper;
            
            public final class IiIOOioOO extends O0iO10011II implements IllOOo00lI {
                public static final IiIOOioOO I00iiI;
                public static final IiIOOioOO I00iiO;
                public static final IiIOOioOO I00iio;
                public static final IiIOOioOO I00ilI0I1;
                public static final IiIOOioOO I00ilO0;
                public static final IiIOOioOO I00io1l;
                public final int I00iOIl;

                static {
/* 3 */             int i = 0;
/* 8 */             I00iiI = new IiIOOioOO(i, 0);
/* 16 */            I00iiO = new IiIOOioOO(i, 1);
/* 24 */            I00iio = new IiIOOioOO(i, 2);
/* 32 */            I00ilI0I1 = new IiIOOioOO(i, 3);
/* 40 */            I00ilO0 = new IiIOOioOO(i, 4);
/* 48 */            I00io1l = new IiIOOioOO(i, 5);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IiIOOioOO(int i, int i2) {
/* 3 */             super(i);
/* 1 */             this.I00iOIl = i2;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 3 */                     return null;
                        case 1:
/* 28 */                    return new Handler(Looper.getMainLooper());
                        case 2:
/* 19 */                    return Boolean.TRUE;
                        case 3:
/* 15 */                    return new OIOlo0OloOi(new OIOlo00i());
                        case 4:
                        default:
/* 3 */                     return null;
                    }
                }
            }
