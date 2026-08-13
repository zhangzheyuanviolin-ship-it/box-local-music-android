            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class il1iiOiOlllo {
                /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, float f, long j, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    boolean z;
/* 4 */             iloI0lOlll1.I00i0O(75144485);
/* 7 */             int i4 = i2 & 1;
/* 9 */             if (i4 != 0) {
/* 11 */                i3 = i | 6;
                    } else if ((i & 6) == 0) {
/* 27 */                i3 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 29 */                i3 = i;
                    }
/* 30 */            int i5 = i2 & 2;
/* 34 */            if (i5 != 0) {
/* 36 */                i3 |= 48;
                    } else if ((i & 48) == 0) {
/* 53 */                i3 |= iloI0lOlll1.I0000O(f) ? 32 : 16;
                    }
/* 70 */            int i6 = i3 | (((i2 & 4) == 0 && iloI0lOlll1.I0001Ioi1lo(j)) ? 256 : Barcode.FORMAT_ITF);
/* 76 */            boolean z2 = true;
/* 88 */            if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 147) != 146)) {
/* 90 */                iloI0lOlll1.I00Ol00();
/* 95 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 114 */                   if (i4 != 0) {
/* 116 */                       o1ooiI111i = O1ooIo101ll.I00000oIO;
                            }
/* 118 */                   if (i5 != 0) {
/* 120 */                       f = Iiiio0oi1l0O.I00000oIO;
                            }
/* 124 */                   if ((i2 & 4) != 0) {
/* 126 */                       float f2 = Iiiio0oi1l0O.I00000oIO;
/* 130 */                       j = IOOl0iiliOl.I0000oI00(Iiil10.I00000oIO, iloI0lOlll1);
/* 111 */                       i6 &= -897;
                            }
/* 135 */                   iloI0lOlll1.I0010o();
/* 144 */                   O1ooiI111i o1ooiI111iI000II = Ol0iOOO0.I000II(Ol0iOOO0.I0000oI00(o1ooiI111i, 1.0f), f);
/* 154 */                   boolean z3 = (i6 & 112) != 32;
/* 159 */                   if ((((i6 & 896) ^ 384) > 256 || !iloI0lOlll1.I0001Ioi1lo(j)) && (i6 & 384) != 256) {
/* 172 */                       z2 = false;
                            }
/* 173 */                   z = z3 | z2;
/* 175 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 179 */                   if (!z) {
                                Object obj = objI00O0i0ii;
/* 183 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 187 */                           Iiiio11O1 iiiio11O1 = new Iiiio11O1();
/* 190 */                           iiiio11O1.I00iOIl = f;
/* 192 */                           iiiio11O1.I00iiI = j;
/* 194 */                           VarHandle.storeStoreFence();
/* 197 */                           iloI0lOlll1.I00iio(iiiio11O1);
                                    obj = iiiio11O1;
                                }
/* 202 */                       iOl0ilO1.I00000oIO(o1ooiI111iI000II, (Function1) obj, iloI0lOlll1, 0);
                            }
                        } else {
/* 104 */                   iloI0lOlll1.I00OilO00Il();
/* 109 */                   if ((i2 & 4) != 0) {
/* 111 */                       i6 &= -897;
                            }
/* 135 */                   iloI0lOlll1.I0010o();
/* 144 */                   O1ooiI111i o1ooiI111iI000II2 = Ol0iOOO0.I000II(Ol0iOOO0.I0000oI00(o1ooiI111i, 1.0f), f);
/* 154 */                   if ((i6 & 112) != 32) {
                            }
/* 159 */                   if (((i6 & 896) ^ 384) > 256) {
/* 172 */                       z2 = false;
/* 173 */                       z = z3 | z2;
/* 175 */                       Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 179 */                       if (!z) {
                                }
                            } else {
/* 172 */                       z2 = false;
/* 173 */                       z = z3 | z2;
/* 175 */                       Object objI00O0i0ii22 = iloI0lOlll1.I00O0i0ii();
/* 179 */                       if (!z) {
                                }
                            }
                        }
                    } else {
/* 206 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 209 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 213 */           if (oOloioIlI001IO000 != null) {
/* 217 */               Iiil01lolOIO iiil01lolOIO = new Iiil01lolOIO();
/* 220 */               iiil01lolOIO.I00iOIl = o1ooiI111i;
/* 222 */               iiil01lolOIO.I00iiI = f;
/* 224 */               iiil01lolOIO.I00iiO = j;
/* 226 */               iiil01lolOIO.I00iio = i;
/* 228 */               iiil01lolOIO.I00ilI0I1 = i2;
/* 230 */               VarHandle.storeStoreFence();
/* 233 */               oOloioIlI001IO000.I0000O = iiil01lolOIO;
                    }
                }
            }
