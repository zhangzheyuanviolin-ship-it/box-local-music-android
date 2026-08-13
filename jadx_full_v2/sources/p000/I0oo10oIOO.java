            package p000;

            import android.os.Trace;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class I0oo10oIOO implements Function1 {
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public I0oo10oIOO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    lolOiIoiillI loloiioiilli;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 228 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 230 */                   boolean z = this.I00iiI;
/* 235 */                   I0oO00o i0oO00o = (I0oO00o) this.I00iio;
/* 240 */                   II0oIl iI0oIl = (II0oIl) this.I00ilI0I1;
/* 243 */                   O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 245 */                   o0iiliOio.I00000oOI();
/* 248 */                   IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 260 */                   if (((Boolean) illOOo00lI.invoke()).booleanValue()) {
/* 263 */                       if (z) {
/* 265 */                           long jI00lli11 = iIolilIo.I00lli11();
/* 269 */                           IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 271 */                           long jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 279 */                           iOO000ilo.I0010o().I000II();
                                    try {
/* 290 */                               ((IIOOoll) iOO000ilo.I00iiI).I00i01iIIliI(-1.0f, 1.0f, jI00lli11);
/* 298 */                               IilloIOOO0i.I00111O(o0iiliOio, i0oO00o, 0L, 0.0f, iI0oIl, 46);
                                    } finally {
/* 307 */                               IIlIOloOOO.I001IO000(iOO000ilo, jI001iOo1i0O);
                                    }
                                } else {
/* 316 */                           IilloIOOO0i.I00111O(o0iiliOio, i0oO00o, 0L, 0.0f, iI0oIl, 46);
                                }
                            }
/* 319 */                   return ooiIlOl1iI;
                        case 1:
/* 102 */                   IOi10loi iOi10loi = (IOi10loi) this.I00iiO;
/* 106 */                   IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) this.I00iio;
/* 110 */                   Ili1i1o00Oo ili1i1o00Oo = (Ili1i1o00Oo) this.I00ilI0I1;
/* 112 */                   boolean z2 = this.I00iiI;
/* 114 */                   Throwable th = (Throwable) obj;
/* 118 */                   if (th != null) {
/* 125 */                       if (l11I11lO.I0000O(5, "CXCP")) {
/* 129 */                           Log.w("CXCP", "propagateToFocusMeteringResultDeferred: completed exceptionally!", th);
                                }
/* 132 */                       iOi10loi.I00iIO(th);
                            } else {
/* 140 */                       Oi10OoO0l oi10OoO0l = (Oi10OoO0l) iiIOI1ol0o.I000O01llI0();
/* 147 */                       if (l11I11lO.I0000O(3, "CXCP")) {
/* 149 */                           Objects.toString(oi10OoO0l);
                                }
/* 152 */                       int i2 = oi10OoO0l.I00000oIO;
/* 155 */                       if (i2 == 4) {
/* 159 */                           IIl001iO0Io.I001l0I00("Camera is not active.", iOi10loi);
                                } else {
/* 164 */                           int i3 = 11;
/* 166 */                           if (i2 == 2) {
/* 173 */                               iOi10loi.I00O10llo(new lolOiIoiillI(i3));
                                    } else {
/* 177 */                               if (i2 == 0) {
/* 179 */                                   I0oIl0101 i0oIl0101 = oi10OoO0l.I00000oOI;
/* 181 */                                   if (i0oIl0101 != null) {
                                            }
/* 193 */                                   if (z2) {
/* 196 */                                       List list = I0i10OI0o.I00000oOI;
/* 198 */                                       ArrayList arrayList = ili1i1o00Oo.I000lI;
/* 200 */                                       if (arrayList != null) {
/* 208 */                                           arrayList.contains(I0i10OI0o.I00000oIO(1));
                                                }
                                            }
/* 213 */                                   loloiioiilli = new lolOiIoiillI(i3);
                                        } else {
/* 219 */                                   loloiioiilli = new lolOiIoiillI(i3);
                                        }
/* 222 */                               iOi10loi.I00O10llo(loloiioiilli);
                                    }
                                }
                            }
/* 225 */                   return ooiIlOl1iI;
                        case 2:
/* 96 */                    return new Ol010000lo00((Set) this.I00iio, (IllOOo00lI) this.I00iiO, (Ol010l0o0O) obj, (Function1) this.I00ilI0I1, this.I00iiI);
                        default:
/* 10 */                    O10oIiIi0OI0 o10oIiIi0OI0 = (O10oIiIi0OI0) this.I00iiO;
/* 12 */                    boolean z3 = this.I00iiI;
/* 16 */                    String str = (String) this.I00iio;
/* 20 */                    i01ilO i01ilo = (i01ilO) this.I00ilI0I1;
/* 22 */                    Throwable th2 = (Throwable) obj;
/* 26 */                    if (th2 instanceof i01iIoo1loO) {
/* 32 */                        o10oIiIi0OI0.stop(((i01iIoo1loO) th2).I00iOIl);
                            }
/* 35 */                    if (z3 && str != null) {
/* 41 */                        O1oO0lOoI1 o1oO0lOoI1 = i01ilo.I0001Ioi1lo.I000oI1ioi;
/* 45 */                        int iHashCode = i01ilo.I00000oIO.hashCode();
/* 49 */                        o1oO0lOoI1.getClass();
/* 62 */                        String strSubstring = str.length() <= 127 ? str : null;
/* 63 */                        if (strSubstring == null) {
/* 66 */                            strSubstring = str.substring(0, 127);
                                }
/* 70 */                        Trace.endAsyncSection(strSubstring, iHashCode);
                            }
/* 73 */                    return ooiIlOl1iI;
                    }
                }
            }
