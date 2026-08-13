            package p000;

            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            import kotlin.jvm.functions.Function1;
            
/* 8 */     public final class IliIlOOIoIo implements O0Iioo1lO0o {
                public static final IliIlOOIoIo I00iiO = new IliIlOOIoIo("NONE");
                public static final IliIlOOIoIo I00iio = new IliIlOOIoIo("FULL");
                public final int I00iOIl;
                public String I00iiI;

                public IliIlOOIoIo(String str) {
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00iiI = str;
                }

                public static final CharSequence I0000O(Object obj) {
/* 1 */             Objects.requireNonNull(obj);
                    return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
                }

                @Override
                public void I00000oIO(Throwable th, IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00ilI0I1;
/* 7 */             IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(19);
/* 10 */            iiioilIl1Il.I00iiI = illOOo00lI;
/* 12 */            iiioilIl1Il.I00iiO = th;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            I0000Il00O(o0oO1Ii0, iiioilIl1Il);
                }

                @Override
                public void I00000oOI(IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00iiI;
/* 6 */             I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(4);
/* 9 */             i11i0ol0l0.I00iiI = illOOo00lI;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I0000Il00O(o0oO1Ii0, i11i0ol0l0);
                }

                public void I0000Il00O(O0oO1Ii0 o0oO1Ii0, Function1 function1) {
                    boolean zIsLoggable;
/* 1 */             String str = this.I00iiI;
/* 3 */             int iOrdinal = o0oO1Ii0.ordinal();
/* 12 */            if (iOrdinal == 0) {
/* 51 */                zIsLoggable = Log.isLoggable(str, 2);
                    } else if (iOrdinal == 1) {
/* 46 */                zIsLoggable = Log.isLoggable(str, 3);
                    } else if (iOrdinal == 2) {
/* 41 */                zIsLoggable = Log.isLoggable(str, 4);
                    } else if (iOrdinal == 3) {
/* 36 */                zIsLoggable = Log.isLoggable(str, 5);
                    } else if (iOrdinal == 4) {
/* 31 */                zIsLoggable = Log.isLoggable(str, 6);
                    } else {
/* 22 */                if (iOrdinal != 5) {
/* 26 */                    I000II.I00000oIO();
/* 29 */                    return;
                        }
/* 24 */                zIsLoggable = false;
                    }
/* 55 */            if (zIsLoggable) {
/* 59 */                O0Il0I1001 o0Il0I1001 = new O0Il0I1001();
/* 62 */                function1.invoke(o0Il0I1001);
/* 65 */                int iOrdinal2 = o0oO1Ii0.ordinal();
/* 69 */                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
/* 332 */                   return;
                        }
/* 73 */                if (iOrdinal2 == 2) {
/* 106 */                   Log.i(str, o0Il0I1001.I00000oIO, o0Il0I1001.I00000oOI);
/* 332 */                   return;
                        }
/* 75 */                if (iOrdinal2 == 3) {
/* 98 */                    Log.w(str, o0Il0I1001.I00000oIO, o0Il0I1001.I00000oOI);
                        } else if (iOrdinal2 == 4) {
/* 90 */                    Log.e(str, o0Il0I1001.I00000oIO, o0Il0I1001.I00000oOI);
                        } else {
/* 79 */                    if (iOrdinal2 == 5) {
/* 332 */                       return;
                            }
/* 82 */                    I000II.I00000oIO();
                        }
                    }
                }

                @Override
                public void I000II(IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00iiO;
/* 6 */             I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(2);
/* 9 */             i11i0ol0l0.I00iiI = illOOo00lI;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I0000Il00O(o0oO1Ii0, i11i0ol0l0);
                }

                @Override
                public void I000OOo1O(IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00ilI0I1;
/* 6 */             I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(5);
/* 9 */             i11i0ol0l0.I00iiI = illOOo00lI;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I0000Il00O(o0oO1Ii0, i11i0ol0l0);
                }

                @Override
                public void I000OiO(IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00iio;
/* 6 */             I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(3);
/* 9 */             i11i0ol0l0.I00iiI = illOOo00lI;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I0000Il00O(o0oO1Ii0, i11i0ol0l0);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return this.I00iiI;
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
