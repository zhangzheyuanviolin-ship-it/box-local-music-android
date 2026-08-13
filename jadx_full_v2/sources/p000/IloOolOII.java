            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.os.SystemClock;
            import kotlin.jvm.functions.Function1;
            
            public final class IloOolOII implements IoOoo0ll {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public IloOolOII(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void I00000oIO(Oio0oi11l oio0oi11l) throws Exception {
                    switch (this.I00iOIl) {
                        case 0:
/* 113 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 117 */                   long[] jArr = (long[]) this.I00ilI0I1;
/* 121 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 125 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iio;
/* 127 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 141 */                   if (!((Boolean) oI10i0Il.getValue()).booleanValue() && jElapsedRealtime - jArr[0] >= ((Number) oI10i0Il2.getValue()).longValue()) {
/* 163 */                       jArr[0] = jElapsedRealtime;
/* 171 */                       ((Function1) oI10i0Il3.getValue()).invoke(oio0oi11l);
                                break;
                            } else {
/* 175 */                       oio0oi11l.close();
                                break;
                            }
                            break;
                        default:
/* 8 */                     IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiI;
/* 12 */                    OOo0o0oO oOo0o0oO = (OOo0o0oO) this.I00iiO;
/* 16 */                    IIo0l1 iIo0l1 = (IIo0l1) this.I00iio;
/* 20 */                    IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00ilI0I1;
/* 28 */                    long jLongValue = ((Number) illOOo00lI.invoke()).longValue();
/* 36 */                    if (jLongValue > 0) {
/* 38 */                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 48 */                        if (jElapsedRealtime2 - oOo0o0oO.I00iOIl < jLongValue) {
/* 50 */                            oio0oi11l.close();
                                    break;
                                } else {
/* 54 */                            oOo0o0oO.I00iOIl = jElapsedRealtime2;
                                }
                            }
/* 56 */                    Bitmap bitmapI00000oIO = ioOiOIli1i.I00000oIO(oio0oi11l);
/* 62 */                    int iI0000Il00O = oio0oi11l.I00ilI0I1.I0000Il00O();
/* 68 */                    Matrix matrix = new Matrix();
/* 71 */                    if (iI0000Il00O != 0) {
/* 74 */                        matrix.postRotate(iI0000Il00O);
                            }
/* 83 */                    if (O0000Ioio00.I0000O(iIo0l1, IIo0l1.I00000oOI)) {
/* 89 */                        matrix.postScale(-1.0f, 1.0f);
                            }
/* 107 */                   illiIl1l11O.invoke(Bitmap.createBitmap(bitmapI00000oIO, 0, 0, bitmapI00000oIO.getWidth(), bitmapI00000oIO.getHeight(), matrix, true), oio0oi11l);
                            break;
                    }
                }
            }
