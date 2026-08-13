            package p000;

            import android.content.Context;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.Callable;
            
            public final class IliiOOi1 implements Callable {
                public final int I00000oIO;
                public String I00000oOI;
                public Context I0000Il00O;
                public int I0000O;
                public Object I0000oI00;

                public IliiOOi1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object call() {
                    switch (this.I00000oIO) {
                        case 0:
/* 42 */                    return IliiOlIoO.I00000oOI(this.I00000oOI, this.I0000Il00O, List.of((IliiOI0I0) this.I0000oI00), this.I0000O);
                        default:
                            try {
/* 16 */                        return IliiOlIoO.I00000oOI(this.I00000oOI, this.I0000Il00O, (ArrayList) this.I0000oI00, this.I0000O);
                            } catch (Throwable unused) {
/* 24 */                        return new IliiOioI1l1I(-3);
                            }
                    }
                }
            }
