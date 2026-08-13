            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            
            public final class Ii0O1OIO1i implements OOiO01IO {
                public final int I00000oIO;
                public Object I00000oOI;

                public Ii0O1OIO1i(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object get() {
                    switch (this.I00000oIO) {
                        case 0:
/* 15 */                    Context context = (Context) ((Ii0O1OIO1i) this.I00000oOI).I00000oOI;
/* 19 */                    int i = 16;
/* 21 */                    loilIl10Ii loilil10ii = new loilIl10Ii(i);
/* 26 */                    iOloo0O0O ioloo0o0o = new iOloo0O0O(i);
/* 33 */                    IOO000ilo iOO000ilo = new IOO000ilo(10);
/* 36 */                    iOO000ilo.I00iiI = context;
/* 38 */                    iOO000ilo.I00iiO = loilil10ii;
/* 40 */                    iOO000ilo.I00iio = ioloo0o0o;
/* 42 */                    VarHandle.storeStoreFence();
/* 45 */                    return iOO000ilo;
                        default:
/* 6 */                     return this.I00000oOI;
                    }
                }
            }
