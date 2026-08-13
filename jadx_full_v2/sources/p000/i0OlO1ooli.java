            package p000;

            import android.os.SystemClock;
            import com.google.android.gms.common.api.Status;
            import java.lang.invoke.VarHandle;
            
            public final class i0OlO1ooli implements OIOolOo {
                public Io0iOoo I00iOIl;
                public int I00iiI;
                public I11Oil I00iiO;
                public long I00iio;
                public long I00ilI0I1;

                /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static IOloii1OiOI I00000oIO(i0Ol1Ool00 i0ol1ool00, I1oIol10O i1oIol10O, int i) {
/* 1 */             l1O1o0o10o l1o1o0o10o = i1oIol10O.I001i1O0Ol;
/* 8 */             IOloii1OiOI iOloii1OiOI = l1o1o0o10o == null ? null : l1o1o0o10o.I00iio;
/* 10 */            if (iOloii1OiOI != null && iOloii1OiOI.I00iiI) {
/* 16 */                int[] iArr = iOloii1OiOI.I00iio;
/* 18 */                int i2 = 0;
/* 19 */                if (iArr == null) {
/* 21 */                    int[] iArr2 = iOloii1OiOI.I00ilO0;
/* 23 */                    if (iArr2 != null) {
/* 27 */                        while (i2 < iArr2.length) {
/* 31 */                            if (iArr2[i2] == i) {
                                        break;
                                    }
/* 34 */                            i2++;
                                }
/* 48 */                        if (i0ol1ool00.I0010I0i < iOloii1OiOI.I00ilI0I1) {
                                    break;
                                }
                            } else if (i0ol1ool00.I0010I0i < iOloii1OiOI.I00ilI0I1) {
/* 50 */                        return iOloii1OiOI;
                            }
                        } else {
/* 38 */                    while (i2 < iArr.length) {
/* 42 */                        if (iArr[i2] != i) {
/* 51 */                            i2++;
                                } else if (i0ol1ool00.I0010I0i < iOloii1OiOI.I00ilI0I1) {
                                }
                            }
                        }
                    }
/* 3 */             return null;
                }

                @Override
                public final void onComplete(OloIIoII1oo oloIIoII1oo) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    long j;
                    long j2;
/* 3 */             Io0iOoo io0iOoo = this.I00iOIl;
/* 9 */             if (io0iOoo.I0000oI00()) {
/* 19 */                Oi1oo0 oi1oo0 = (Oi1oo0) Oi1ol0llI.I000l1().I00iiI;
/* 21 */                if (oi1oo0 == null || oi1oo0.I00iiI) {
/* 35 */                    i0Ol1Ool00 i0ol1ool00 = (i0Ol1Ool00) io0iOoo.I00l0OO0IO.get(this.I00iiO);
/* 37 */                    if (i0ol1ool00 != null) {
/* 39 */                        Io0OoIoOo io0OoIoOo = i0ol1ool00.I000O01llI0;
/* 43 */                        if (io0OoIoOo instanceof I1oIol10O) {
/* 45 */                            Io0OoIoOo io0OoIoOo2 = io0OoIoOo;
/* 47 */                            long j3 = this.I00iio;
/* 54 */                            int i6 = 0;
/* 59 */                            boolean z = j3 > 0;
/* 60 */                            int i7 = io0OoIoOo2.I00100o1O0lo;
/* 64 */                            if (oi1oo0 != null) {
/* 68 */                                z &= oi1oo0.I00iiO;
/* 69 */                                i = oi1oo0.I00iio;
/* 71 */                                i3 = oi1oo0.I00ilI0I1;
/* 73 */                                i2 = oi1oo0.I00iOIl;
/* 77 */                                if (io0OoIoOo2.I001i1O0Ol != null && !io0OoIoOo2.I00100o1O0lo()) {
/* 87 */                                    IOloii1OiOI iOloii1OiOII00000oIO = I00000oIO(i0ol1ool00, io0OoIoOo2, this.I00iiI);
/* 91 */                                    if (iOloii1OiOII00000oIO == null) {
/* 437 */                                       return;
                                            }
/* 95 */                                    boolean z2 = iOloii1OiOII00000oIO.I00iiO && j3 > 0;
/* 101 */                                   i3 = iOloii1OiOII00000oIO.I00ilI0I1;
/* 103 */                                   z = z2;
                                        }
                                    } else {
/* 106 */                               i = 5000;
/* 108 */                               i2 = 0;
/* 109 */                               i3 = 100;
                                    }
/* 104 */                           int i8 = i;
/* 115 */                           int iElapsedRealtime = -1;
/* 116 */                           if (oloIIoII1oo.I000OOo1O()) {
/* 118 */                               i5 = 0;
                                    } else if (((o0IiOl) oloIIoII1oo).I0000O) {
/* 128 */                               i6 = -1;
/* 129 */                               i5 = 100;
                                    } else {
/* 131 */                               Exception excI0001Ioi1lo = oloIIoII1oo.I0001Ioi1lo();
/* 137 */                               if (excI0001Ioi1lo instanceof I11OiOl) {
/* 141 */                                   Status status = ((I11OiOl) excI0001Ioi1lo).I00iOIl;
/* 143 */                                   i4 = status.I00iOIl;
/* 145 */                                   IOlo10lO1iOl iOlo10lO1iOl = status.I00iio;
/* 147 */                                   if (iOlo10lO1iOl != null) {
/* 154 */                                       i5 = i4;
/* 152 */                                       i6 = iOlo10lO1iOl.I00iiI;
                                            }
                                        } else {
/* 157 */                                   i4 = 101;
                                        }
/* 149 */                               i5 = i4;
/* 150 */                               i6 = -1;
                                    }
/* 160 */                           if (z) {
/* 162 */                               long j4 = this.I00ilI0I1;
/* 164 */                               long jCurrentTimeMillis = System.currentTimeMillis();
/* 174 */                               iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
/* 175 */                               j2 = jCurrentTimeMillis;
/* 177 */                               j = j3;
                                    } else {
/* 182 */                               j = 0;
/* 184 */                               j2 = 0;
                                    }
/* 199 */                           O1lli10oolO o1lli10oolO = new O1lli10oolO(this.I00iiI, i5, i6, j, j2, null, null, i7, iElapsedRealtime);
/* 205 */                           i0OlOI1 i0oloi1 = new i0OlOI1();
/* 208 */                           i0oloi1.I00000oIO = o1lli10oolO;
/* 210 */                           i0oloi1.I00000oOI = i2;
/* 212 */                           i0oloi1.I0000Il00O = i8;
/* 214 */                           i0oloi1.I0000O = i3;
/* 216 */                           VarHandle.storeStoreFence();
/* 219 */                           O1oo1il01OoO o1oo1il01OoO = io0iOoo.I00lli11;
/* 227 */                           o1oo1il01OoO.sendMessage(o1oo1il01OoO.obtainMessage(18, i0oloi1));
                                }
                            }
                        }
                    }
                }
            }
