            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.ListIterator;
            import kotlin.jvm.functions.Function1;
            
/* 18 */    public final class Oiill0lI1il1 implements OOooI0ioo1o {
                public Oiio1oll000 I00iOIl;
                public OIooliIO0 I00iiI;
                public OIooliIO0 I00iiO;
                public Function1 I00iio;
                public Io1I0l I00ilI0I1;
                public Function1 I00ilO0;
                public IIlio101Io I00io1l;
                public Ili1lII I00ioIO;
                public OIooliIO0 I00l0I0l0lO1;
                public IiO0o1I I00l0OO0IO;
                public OIOlIiiioi I00li1OI;
                public O0iOOo0Ii I00ll1;
                public OIooliIO0 I00lli11;
                public OIooliIO0 I00lll10;
                public OIooliIO0 I00o0iI0io1;
                public OIooliIO0 I00o0l1o1o0;
                public OIooliIO0 I00o101lO;
                public Oiil1o0OIi I00oI0i;
                public boolean I00oII;
                public Ii0110 I00oIiI10;
                public OO1O0I I00oO101o;
                public OI0lli1 I00oOio10iI1;
                public O0ioIllo0i1 I00ol1;
                public boolean I00olI;

                public final long I00000oIO(O0iOOo0Ii o0iOOo0Ii, long j) {
/* 1 */             O0iOOo0Ii o0iOOo0Ii2 = this.I00ll1;
/* 3 */             if (o0iOOo0Ii2 == null || !o0iOOo0Ii2.I0010o()) {
/* 21 */                return 9205357640488583168L;
                    }
/* 16 */            return I000lI().I00IoIO0lI(o0iOOo0Ii, j);
                }

                @Override
                public final void I00000oOI() {
/* 1 */             I00100o1O0lo();
                }

                public final void I0000Il00O() {
                    I1111OO10i i1111OO10iI000OiO;
                    Function1 function1;
                    int iNextIndex;
/* 1 */             Oiio1oll000 oiio1oll000 = this.I00iOIl;
/* 8 */             if (I000OOo1O() == null || oiio1oll000.I00000oIO().I0000oI00 == 0) {
/* 18 */                i1111OO10iI000OiO = null;
                    } else {
/* 23 */                I11110OIl i11110OIl = new I11110OIl();
/* 30 */                ArrayList arrayListI0000oI00 = oiio1oll000.I0000oI00(I000lI());
/* 38 */                ListIterator listIterator = arrayListI0000oI00.listIterator(arrayListI0000oI00.size());
                        while (true) {
/* 47 */                    if (!listIterator.hasPrevious()) {
/* 84 */                        iNextIndex = -1;
                                break;
                            }
/* 65 */                    OiiOlI0I oiiOlI0I = (OiiOlI0I) oiio1oll000.I00000oIO().I0000oI00(((OI0i1o0iOo0) listIterator.previous()).I00000oIO);
/* 67 */                    if (oiiOlI0I != null && oiiOlI0I.I00000oIO.I00000oOI != oiiOlI0I.I00000oOI.I00000oOI) {
/* 79 */                        iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        }
/* 85 */                if (iNextIndex != -1) {
/* 87 */                    int size = arrayListI0000oI00.size();
/* 92 */                    int i = 0;
/* 93 */                    while (i < size) {
/* 99 */                        OI0i1o0iOo0 oI0i1o0iOo0 = (OI0i1o0iOo0) arrayListI0000oI00.get(i);
/* 111 */                       OiiOlI0I oiiOlI0I2 = (OiiOlI0I) oiio1oll000.I00000oIO().I0000oI00(oI0i1o0iOo0.I00000oIO);
/* 113 */                       if (oiiOlI0I2 != null) {
/* 115 */                           I1111OO10i i1111OO10iI0000oI00 = oI0i1o0iOo0.I0000oI00();
/* 127 */                           long jI00000oIO = lOliOi0Oi.I00000oIO(oiiOlI0I2.I00000oIO.I00000oOI, oiiOlI0I2.I00000oOI.I00000oOI);
/* 135 */                           boolean z = i >= iNextIndex;
/* 144 */                           i11110OIl.I0000Il00O(i1111OO10iI0000oI00, Oo0lI00l.I000II(jI00000oIO), Oo0lI00l.I0001Ioi1lo(jI00000oIO));
/* 147 */                           if (!z) {
/* 153 */                               i11110OIl.I00iOIl.append('\n');
                                    }
                                }
/* 156 */                       i++;
                            }
                        }
/* 159 */               i1111OO10iI000OiO = i11110OIl.I000OiO();
                    }
/* 163 */           if (i1111OO10iI000OiO != null) {
/* 171 */               I1111OO10i i1111OO10i = i1111OO10iI000OiO.I00iiI.length() > 0 ? i1111OO10iI000OiO : null;
/* 174 */               if (i1111OO10i == null || (function1 = this.I00ilO0) == null) {
/* 245 */                   return;
                        }
/* 180 */               function1.invoke(i1111OO10i);
                    }
                }

                @Override
                public final void I0000O() {
/* 1 */             I00100o1O0lo();
                }

                public final OI0i1o0iOo0 I0001Ioi1lo(OiiOOli oiiOOli) {
/* 11 */            return (OI0i1o0iOo0) this.I00iOIl.I0000Il00O.I0000oI00(oiiOOli.I0000Il00O);
                }

                public final OIoi0IIoi I000II() {
                    int iNextIndex;
                    int iI000II;
                    int length;
/* 1 */             Oiio1oll000 oiio1oll000 = this.I00iOIl;
/* 7 */             if (I000OOo1O() == null || oiio1oll000.I00000oOI.isEmpty()) {
/* 215 */               return null;
                    }
/* 21 */            I11110OIl i11110OIl = new I11110OIl();
/* 28 */            ArrayList arrayListI0000oI00 = oiio1oll000.I0000oI00(I000lI());
/* 36 */            ListIterator listIterator = arrayListI0000oI00.listIterator(arrayListI0000oI00.size());
                    while (true) {
/* 45 */                if (!listIterator.hasPrevious()) {
/* 82 */                    iNextIndex = -1;
                            break;
                        }
/* 63 */                OiiOlI0I oiiOlI0I = (OiiOlI0I) oiio1oll000.I00000oIO().I0000oI00(((OI0i1o0iOo0) listIterator.previous()).I00000oIO);
/* 65 */                if (oiiOlI0I != null && oiiOlI0I.I00000oIO.I00000oOI != oiiOlI0I.I00000oOI.I00000oOI) {
/* 77 */                    iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
/* 83 */            if (iNextIndex != -1) {
/* 85 */                int size = arrayListI0000oI00.size();
/* 90 */                iI000II = -1;
/* 91 */                length = -1;
/* 92 */                int i = 0;
/* 93 */                while (i < size) {
/* 99 */                    OI0i1o0iOo0 oI0i1o0iOo0 = (OI0i1o0iOo0) arrayListI0000oI00.get(i);
/* 111 */                   OiiOlI0I oiiOlI0I2 = (OiiOlI0I) oiio1oll000.I00000oIO().I0000oI00(oI0i1o0iOo0.I00000oIO);
/* 113 */                   if (oiiOlI0I2 != null) {
/* 115 */                       I1111OO10i i1111OO10iI0000oI00 = oI0i1o0iOo0.I0000oI00();
/* 127 */                       long jI00000oIO = lOliOi0Oi.I00000oIO(oiiOlI0I2.I00000oIO.I00000oOI, oiiOlI0I2.I00000oOI.I00000oOI);
/* 135 */                       boolean z = i >= iNextIndex;
/* 136 */                       if (iI000II == -1) {
/* 138 */                           iI000II = Oo0lI00l.I000II(jI00000oIO);
/* 146 */                           i11110OIl.I0000Il00O(i1111OO10iI0000oI00, 0, Oo0lI00l.I000II(jI00000oIO));
                                }
/* 157 */                       i11110OIl.I0000Il00O(i1111OO10iI0000oI00, Oo0lI00l.I000II(jI00000oIO), Oo0lI00l.I0001Ioi1lo(jI00000oIO));
/* 160 */                       StringBuilder sb = i11110OIl.I00iOIl;
/* 162 */                       if (z) {
/* 170 */                           length = sb.length();
/* 184 */                           i11110OIl.I0000Il00O(i1111OO10iI0000oI00, Oo0lI00l.I0001Ioi1lo(jI00000oIO), i1111OO10iI0000oI00.I00iiI.length());
                                } else {
/* 166 */                           sb.append('\n');
                                }
                            }
/* 187 */                   i++;
                        }
                    } else {
/* 190 */               iI000II = -1;
/* 191 */               length = -1;
                    }
/* 192 */           I1111OO10i i1111OO10iI000OiO = i11110OIl.I000OiO();
/* 196 */           if (iI000II == -1 || length == -1) {
/* 215 */               return null;
                    }
/* 211 */           return new OIoi0IIoi(i1111OO10iI000OiO, Oo0lI00l.I00000oIO(lOliOi0Oi.I00000oIO(iI000II, length)));
                }

                public final Io11Oll I000O01llI0() {
/* 7 */             return (Io11Oll) this.I00o0l1o1o0.getValue();
                }

                public final OiiOlI0I I000OOo1O() {
/* 7 */             return (OiiOlI0I) this.I00iiI.getValue();
                }

                public final boolean I000OiO() {
/* 9 */             return ((Boolean) this.I00iiO.getValue()).booleanValue();
                }

                public final boolean I000iOII() {
/* 1 */             Oiio1oll000 oiio1oll000 = this.I00iOIl;
/* 3 */             OiiOlI0I oiiOlI0II000OOo1O = I000OOo1O();
/* 8 */             if (oiiOlI0II000OOo1O != null) {
/* 11 */                OiiOOli oiiOOli = oiiOlI0II000OOo1O.I00000oOI;
/* 13 */                OiiOOli oiiOOli2 = oiiOlI0II000OOo1O.I00000oIO;
/* 19 */                if (!O0000Ioio00.I0000O(oiiOOli2, oiiOOli)) {
/* 28 */                    if (oiiOOli2.I0000Il00O == oiiOOli.I0000Il00O) {
/* 76 */                        return true;
                            }
/* 35 */                    ArrayList arrayListI0000oI00 = oiio1oll000.I0000oI00(I000lI());
/* 39 */                    int size = arrayListI0000oI00.size();
/* 44 */                    for (int i = 0; i < size; i++) {
/* 62 */                        OiiOlI0I oiiOlI0I = (OiiOlI0I) oiio1oll000.I00000oIO().I0000oI00(((OI0i1o0iOo0) arrayListI0000oI00.get(i)).I00000oIO);
/* 64 */                        if (oiiOlI0I != null && oiiOlI0I.I00000oIO.I00000oOI != oiiOlI0I.I00000oOI.I00000oOI) {
/* 76 */                            return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final void I000l1() {
                    Io1I0l io1I0l;
/* 7 */             this.I00iOIl.I000iOII.setValue(O1IO1IIIO0OO.I00000oIO);
/* 11 */            I00100l0(false);
/* 15 */            this.I00oI0i = null;
/* 21 */            if (I000OOo1O() != null) {
/* 25 */                this.I00iio.invoke(null);
/* 32 */                if (!I000OiO() || (io1I0l = this.I00ilI0I1) == null) {
/* 55 */                    return;
                        }
/* 42 */                ((OO1IIll00O) io1I0l).I00000oIO(9);
                    }
                }

                public final O0iOOo0Ii I000lI() {
/* 1 */             O0iOOo0Ii o0iOOo0Ii = this.I00ll1;
/* 3 */             if (o0iOOo0Ii == null) {
/* 55 */                throw IlIi0I0.I0000oI00("null coordinates");
                    }
/* 9 */             if (!o0iOOo0Ii.I0010o()) {
/* 13 */                Ioll0IliO1l.I00000oIO("unattached coordinates");
                    }
/* 16 */            return o0iOOo0Ii;
                }

                public final void I000o00OoI0I(boolean z) {
/* 1 */             OIooliIO0 oIooliIO0 = this.I00iiO;
/* 13 */            if (((Boolean) oIooliIO0.getValue()).booleanValue() != z) {
/* 19 */                oIooliIO0.setValue(Boolean.valueOf(z));
/* 22 */                I00111O();
                    }
                }

                public final void I000oI1ioi(OiiOlI0I oiiOlI0I) {
                    long j;
                    char c;
                    long j2;
                    long j3;
                    OI0i1o0iOo0 oI0i1o0iOo0;
                    O0ll1IIi o0ll1IIi;
                    long j4;
                    char c2;
                    long j5;
/* 5 */             OIooliIO0 oIooliIO0 = this.I00iiI;
/* 15 */            if (O0000Ioio00.I0000O(oIooliIO0.getValue(), oiiOlI0I)) {
/* 437 */               return;
                    }
/* 19 */            oIooliIO0.setValue(oiiOlI0I);
/* 22 */            if (oiiOlI0I != null) {
/* 24 */                I0010I0i();
                    }
/* 27 */            Oiio1oll000 oiio1oll000 = this.I00iOIl;
/* 29 */            OI0lli1 oI0lli1 = this.I00oOio10iI1;
/* 31 */            long[] jArr = oI0lli1.I00000oIO;
                    int length = jArr.length - 2;
/* 36 */            long j6 = 255;
/* 38 */            char c3 = 7;
/* 39 */            long j7 = -9187201950435737472L;
/* 46 */            if (length >= 0) {
/* 48 */                int i = 0;
                        while (true) {
/* 49 */                    long j8 = jArr[i];
/* 51 */                    j3 = 128;
/* 59 */                    if ((((~j8) << c3) & j8 & j7) != j7) {
/* 66 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 68 */                        int i3 = 0;
/* 69 */                        while (i3 < i2) {
/* 75 */                            if ((j8 & j6) < 128) {
/* 79 */                                j4 = j6;
/* 81 */                                int i4 = (i << 3) + i3;
/* 85 */                                c2 = c3;
/* 87 */                                j5 = j7;
/* 89 */                                long j9 = oI0lli1.I00000oOI[i4];
/* 95 */                                O0ll1IIi o0ll1IIi2 = (O0ll1IIi) oI0lli1.I0000Il00O[i4];
/* 101 */                               boolean zI00000oOI = oiio1oll000.I00000oIO().I00000oOI(j9);
/* 105 */                               if (!zI00000oOI) {
/* 107 */                                   o0ll1IIi2.I00000oOI();
                                        }
/* 110 */                               if (!zI00000oOI) {
/* 112 */                                   oI0lli1.I000O01llI0(i4);
                                        }
                                    } else {
/* 116 */                               j4 = j6;
/* 118 */                               c2 = c3;
/* 120 */                               j5 = j7;
                                    }
/* 122 */                           j8 >>= 8;
/* 123 */                           i3++;
/* 125 */                           c3 = c2;
/* 127 */                           j6 = j4;
/* 129 */                           j7 = j5;
                                }
/* 132 */                       j = j6;
/* 134 */                       c = c3;
/* 136 */                       j2 = j7;
/* 138 */                       if (i2 != 8) {
                                    break;
                                }
                            } else {
/* 141 */                       j = j6;
/* 143 */                       c = c3;
/* 145 */                       j2 = j7;
                            }
/* 147 */                   if (i == length) {
                                break;
                            }
/* 149 */                   i++;
/* 151 */                   c3 = c;
/* 153 */                   j6 = j;
/* 155 */                   j7 = j2;
                        }
                    } else {
/* 158 */               j = 255;
/* 160 */               c = 7;
/* 162 */               j2 = -9187201950435737472L;
/* 164 */               j3 = 128;
                    }
/* 166 */           OI0lli1 oI0lli1I00000oIO = oiio1oll000.I00000oIO();
/* 170 */           long[] jArr2 = oI0lli1I00000oIO.I00000oOI;
/* 172 */           Object[] objArr = oI0lli1I00000oIO.I0000Il00O;
/* 174 */           long[] jArr3 = oI0lli1I00000oIO.I00000oIO;
                    int length2 = jArr3.length - 2;
/* 179 */           if (length2 < 0) {
/* 437 */               return;
                    }
/* 181 */           int i5 = 0;
                    while (true) {
/* 182 */               long j10 = jArr3[i5];
/* 192 */               if ((((~j10) << c) & j10 & j2) != j2) {
/* 199 */                   int i6 = 8 - ((~(i5 - length2)) >>> 31);
/* 202 */                   for (int i7 = 0; i7 < i6; i7++) {
/* 208 */                       if ((j10 & j) < j3) {
/* 212 */                           int i8 = (i5 << 3) + i7;
/* 213 */                           long j11 = jArr2[i8];
/* 217 */                           OiiOlI0I oiiOlI0I2 = (OiiOlI0I) objArr[i8];
/* 227 */                           if (oiiOlI0I2.I00000oIO.I00000oOI != oiiOlI0I2.I00000oOI.I00000oOI && (oI0i1o0iOo0 = (OI0i1o0iOo0) oiio1oll000.I0000Il00O.I0000oI00(j11)) != null && (o0ll1IIi = (O0ll1IIi) oI0i1o0iOo0.I0000O.invoke()) != null && !oI0lli1.I00000oOI(j11)) {
/* 257 */                               o0ll1IIi.I00000oIO();
/* 260 */                               oI0lli1.I000OOo1O(j11, o0ll1IIi);
                                    }
                                }
/* 263 */                       j10 >>= 8;
                            }
/* 267 */                   if (i6 != 8) {
/* 437 */                       return;
                            }
                        }
/* 269 */               if (i5 == length2) {
/* 437 */                   return;
                        } else {
/* 271 */                   i5++;
                        }
                    }
                }

                public final void I00100l0(boolean z) {
/* 1 */             this.I00olI = z;
/* 3 */             I00111O();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00100o1O0lo() {
/* 1 */             OI0lli1 oI0lli1 = this.I00oOio10iI1;
/* 3 */             Object[] objArr = oI0lli1.I0000Il00O;
/* 5 */             long[] jArr = oI0lli1.I00000oIO;
                    int length = jArr.length - 2;
/* 10 */            if (length >= 0) {
/* 13 */                int i = 0;
                        while (true) {
/* 14 */                    long j = jArr[i];
/* 28 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 37 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 40 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 49 */                            if ((255 & j) < 128) {
/* 58 */                                ((O0ll1IIi) objArr[(i << 3) + i3]).I00000oOI();
                                    }
/* 61 */                            j >>= 8;
                                }
/* 65 */                        if (i2 != 8) {
                                    break;
                                } else if (i == length) {
                                    break;
                                } else {
/* 69 */                            i++;
                                }
                            }
                        }
                    }
/* 72 */            oI0lli1.I00000oIO();
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0010I0i() {
                    long j;
                    OIOlIiiioi oIOlIiiioiI00000oIO;
                    OiiOOli oiiOOli;
                    OiiOOli oiiOOli2;
/* 3 */             OIooliIO0 oIooliIO0 = this.I00o0iI0io1;
/* 5 */             OIooliIO0 oIooliIO02 = this.I00lll10;
/* 7 */             OiiOlI0I oiiOlI0II000OOo1O = I000OOo1O();
/* 11 */            O0iOOo0Ii o0iOOo0Ii = this.I00ll1;
/* 13 */            OIOlIiiioi oIOlIiiioi = null;
/* 25 */            OI0i1o0iOo0 oI0i1o0iOo0I0001Ioi1lo = (oiiOlI0II000OOo1O == null || (oiiOOli2 = oiiOlI0II000OOo1O.I00000oIO) == null) ? null : I0001Ioi1lo(oiiOOli2);
/* 37 */            OI0i1o0iOo0 oI0i1o0iOo0I0001Ioi1lo2 = (oiiOlI0II000OOo1O == null || (oiiOOli = oiiOlI0II000OOo1O.I00000oOI) == null) ? null : I0001Ioi1lo(oiiOOli);
/* 45 */            O0iOOo0Ii o0iOOo0IiI0000Il00O = oI0i1o0iOo0I0001Ioi1lo != null ? oI0i1o0iOo0I0001Ioi1lo.I0000Il00O() : null;
/* 53 */            O0iOOo0Ii o0iOOo0IiI0000Il00O2 = oI0i1o0iOo0I0001Ioi1lo2 != null ? oI0i1o0iOo0I0001Ioi1lo2.I0000Il00O() : null;
/* 54 */            if (oiiOlI0II000OOo1O == null || o0iOOo0Ii == null || !o0iOOo0Ii.I0010o() || (o0iOOo0IiI0000Il00O == null && o0iOOo0IiI0000Il00O2 == null)) {
/* 174 */               oIooliIO02.setValue(null);
/* 177 */               oIooliIO0.setValue(null);
/* 245 */               return;
                    }
/* 69 */            OOo0IO oOo0IOI0000Il00O = iO0loiii.I0000Il00O(o0iOOo0Ii);
/* 78 */            if (o0iOOo0IiI0000Il00O != null) {
/* 81 */                j = 9205357640488583168L;
/* 86 */                long jI00000oIO = oI0i1o0iOo0I0001Ioi1lo.I00000oIO(oiiOlI0II000OOo1O, true);
/* 94 */                if ((jI00000oIO & 9223372034707292159L) != 9205357640488583168L) {
/* 101 */                   oIOlIiiioiI00000oIO = OIOlIiiioi.I00000oIO(o0iOOo0Ii.I00IoIO0lI(o0iOOo0IiI0000Il00O, jI00000oIO));
/* 105 */                   long j2 = oIOlIiiioiI00000oIO.I00000oIO;
/* 113 */                   if (I000O01llI0() != Io11Oll.I00iiI && !iO0loiii.I00000oIO(oOo0IOI0000Il00O, j2)) {
                            }
                        }
/* 128 */               oIooliIO02.setValue(oIOlIiiioiI00000oIO);
/* 131 */               if (o0iOOo0IiI0000Il00O2 != null) {
/* 134 */                   long jI00000oIO2 = oI0i1o0iOo0I0001Ioi1lo2.I00000oIO(oiiOlI0II000OOo1O, false);
/* 142 */                   if ((jI00000oIO2 & 9223372034707292159L) != j) {
/* 149 */                       OIOlIiiioi oIOlIiiioiI00000oIO2 = OIOlIiiioi.I00000oIO(o0iOOo0Ii.I00IoIO0lI(o0iOOo0IiI0000Il00O2, jI00000oIO2));
/* 153 */                       long j3 = oIOlIiiioiI00000oIO2.I00000oIO;
/* 161 */                       if (I000O01llI0() == Io11Oll.I00iiO || iO0loiii.I00000oIO(oOo0IOI0000Il00O, j3)) {
/* 169 */                           oIOlIiiioi = oIOlIiiioiI00000oIO2;
                                }
                            }
                        }
/* 170 */               oIooliIO0.setValue(oIOlIiiioi);
                    }
/* 122 */           j = 9205357640488583168L;
/* 127 */           oIOlIiiioiI00000oIO = null;
/* 128 */           oIooliIO02.setValue(oIOlIiiioiI00000oIO);
/* 131 */           if (o0iOOo0IiI0000Il00O2 != null) {
                    }
/* 170 */           oIooliIO0.setValue(oIOlIiiioi);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v6, types: [Ol0OlliioI0O] */
                /* JADX WARN: Type inference failed for: r46v0, types: [OiiOloi1o] */
                public final boolean I0010o(long j, long j2, boolean z, OiiOloi1o oiiOloi1o) {
                    OI0Olll10oI1 ol0OlliioI0O;
                    Oiio1oll000 oiio1oll000;
                    O0iOOo0Ii o0iOOo0IiI0000Il00O;
                    III0Ii iII0Ii;
                    OIOlIiiioi oIOlIiiioi;
                    Oo0iil0o0oI oo0iil0o0oI;
                    OIooliIO0 oIooliIO0;
                    int i;
                    ArrayList arrayList;
                    Oiio1oll000 oiio1oll0002;
                    ArrayList arrayList2;
                    int i2;
                    int i3;
                    Iii1I01II iii1I01III00000oIO;
                    Iii1I01II iii1I01II;
                    Iii1I01II iii1I01II2;
                    OiilIIlI00io oiilIIlI00io;
                    OI0ll0OIiO oI0ll0OIiO;
                    ArrayList arrayList3;
                    Iii1I01II iii1I01II3;
                    Iii1I01II iii1I01II4;
                    Iii1I01II iii1I01II5;
                    Iii1I01II iii1I01II6;
                    int i4;
                    int i5;
                    OiiOOli oiiOOli;
                    OI0ll0OIiO oI0ll0OIiO2;
                    ArrayList arrayList4;
                    OiiOOli oiiOOli2;
                    Iii1I01II iii1I01III00000oOI;
/* 5 */             boolean z2 = z;
/* 7 */             OIooliIO0 oIooliIO02 = this.I00o101lO;
/* 9 */             Oiio1oll000 oiio1oll0003 = this.I00iOIl;
/* 20 */            this.I00o0l1o1o0.setValue(z2 ? Io11Oll.I00iiI : Io11Oll.I00iiO);
/* 27 */            oIooliIO02.setValue(OIOlIiiioi.I00000oIO(j));
/* 30 */            O0iOOo0Ii o0iOOo0IiI000lI = I000lI();
/* 34 */            ArrayList arrayListI0000oI00 = oiio1oll0003.I0000oI00(o0iOOo0IiI000lI);
/* 38 */            int i6 = O1IO0i0l.I00000oIO;
/* 43 */            OI0ll0OIiO oI0ll0OIiO3 = new OI0ll0OIiO(6);
/* 46 */            int size = arrayListI0000oI00.size();
/* 51 */            for (int i7 = 0; i7 < size; i7++) {
/* 61 */                oI0ll0OIiO3.I0000oI00(i7, ((OI0i1o0iOo0) arrayListI0000oI00.get(i7)).I00000oIO);
                    }
/* 70 */            II1liooilI iI1liooilI = new II1liooilI(7);
/* 73 */            iI1liooilI.I00iiI = oI0ll0OIiO3;
/* 75 */            VarHandle.storeStoreFence();
/* 83 */            long j3 = j2 & 9223372034707292159L;
/* 96 */            OiiOlI0I oiiOlI0II000OOo1O = j3 == 9205357640488583168L ? null : I000OOo1O();
/* 106 */           Oiil1o0OIi oiil1o0OIi = j3 == 9205357640488583168L ? null : this.I00oI0i;
/* 115 */           int i8 = 1;
                    boolean z3 = !I000OiO();
/* 117 */           OiilIIlI00io oiilIIlI00io2 = new OiilIIlI00io();
/* 124 */           oiilIIlI00io2.I00000oIO = j;
/* 126 */           oiilIIlI00io2.I00000oOI = j2;
/* 128 */           oiilIIlI00io2.I0000Il00O = o0iOOo0IiI000lI;
/* 130 */           oiilIIlI00io2.I0000O = z2;
/* 132 */           oiilIIlI00io2.I0000oI00 = oiiOlI0II000OOo1O;
/* 134 */           oiilIIlI00io2.I0001Ioi1lo = oiil1o0OIi;
/* 138 */           oiilIIlI00io2.I000II = iI1liooilI;
/* 140 */           oiilIIlI00io2.I000O01llI0 = z3;
/* 145 */           OI0ll0OIiO oI0ll0OIiO4 = new OI0ll0OIiO(6);
/* 150 */           ArrayList arrayList5 = new ArrayList();
/* 154 */           oiilIIlI00io2.I000OOo1O = -1;
/* 156 */           oiilIIlI00io2.I000OiO = -1;
/* 158 */           oiilIIlI00io2.I000iOII = -1;
/* 160 */           VarHandle.storeStoreFence();
/* 163 */           int size2 = arrayListI0000oI00.size();
/* 167 */           int i9 = 0;
/* 179 */           while (i9 < size2) {
/* 189 */               OI0i1o0iOo0 oI0i1o0iOo0 = (OI0i1o0iOo0) arrayListI0000oI00.get(i9);
/* 191 */               int i10 = i8;
/* 193 */               O0iOOo0Ii o0iOOo0IiI0000Il00O2 = oI0i1o0iOo0.I0000Il00O();
/* 197 */               if (o0iOOo0IiI0000Il00O2 == null || (oo0iil0o0oI = (Oo0iil0o0oI) oI0i1o0iOo0.I0000Il00O.invoke()) == null) {
/* 199 */                   oI0ll0OIiO = oI0ll0OIiO4;
/* 201 */                   arrayList3 = arrayList5;
/* 203 */                   oIooliIO0 = oIooliIO02;
/* 205 */                   oiio1oll0002 = oiio1oll0003;
/* 207 */                   arrayList = arrayListI0000oI00;
/* 209 */                   i = size2;
/* 211 */                   i3 = i9;
/* 213 */                   oiilIIlI00io = oiilIIlI00io2;
                        } else {
/* 227 */                   oIooliIO0 = oIooliIO02;
/* 231 */                   long jI00IoIO0lI = oiilIIlI00io2.I0000Il00O.I00IoIO0lI(o0iOOo0IiI0000Il00O2, 0L);
/* 235 */                   ArrayList arrayList6 = arrayListI0000oI00;
/* 236 */                   i = size2;
/* 240 */                   long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(oiilIIlI00io2.I00000oIO, jI00IoIO0lI);
/* 244 */                   Oiil1o0OIi oiil1o0OIi2 = oiilIIlI00io2.I0001Ioi1lo;
/* 246 */                   arrayList = arrayList6;
/* 248 */                   oiio1oll0002 = oiio1oll0003;
/* 259 */                   OiiO01I11iI oiiO01I11iII0000Il00O = oiil1o0OIi2 != null ? oiil1o0OIi2.I0000Il00O(oI0i1o0iOo0.I00000oIO) : null;
/* 260 */                   if (oiiO01I11iII0000Il00O != null) {
/* 268 */                       i2 = z2 ? oiiO01I11iII0000Il00O.I0000Il00O : oiiO01I11iII0000Il00O.I0000O;
/* 266 */                       arrayList2 = arrayList5;
                            } else {
/* 271 */                       arrayList2 = arrayList5;
/* 272 */                       i2 = -1;
                            }
/* 273 */                   long j4 = oiilIIlI00io2.I00000oOI;
/* 284 */                   long jI0001Ioi1lo2 = (j4 & 9223372034707292159L) == 9205357640488583168L ? 9205357640488583168L : OIOlIiiioi.I0001Ioi1lo(j4, jI00IoIO0lI);
/* 288 */                   long j5 = oI0i1o0iOo0.I00000oIO;
/* 290 */                   long j6 = oo0iil0o0oI.I0000Il00O;
/* 292 */                   i3 = i9;
/* 302 */                   float f = (int) (j6 & 4294967295L);
/* 306 */                   int i11 = (int) (jI0001Ioi1lo >> 32);
/* 329 */                   Iii1I01II iii1I01II7 = Float.intBitsToFloat(i11) < 0.0f ? Iii1I01II.I00iOIl : Float.intBitsToFloat(i11) > ((float) ((int) (j6 >> 32))) ? Iii1I01II.I00iiO : Iii1I01II.I00iiI;
/* 333 */                   int i12 = (int) (jI0001Ioi1lo & 4294967295L);
/* 358 */                   Iii1I01II iii1I01II8 = Float.intBitsToFloat(i12) < 0.0f ? Iii1I01II.I00iOIl : Float.intBitsToFloat(i12) > f ? Iii1I01II.I00iiO : Iii1I01II.I00iiI;
/* 361 */                   II1liooilI iI1liooilI2 = oiilIIlI00io2.I000II;
/* 363 */                   if (z) {
/* 371 */                       Iii1I01II iii1I01II9 = iii1I01II7;
/* 373 */                       OiilIIlI00io oiilIIlI00io3 = oiilIIlI00io2;
/* 379 */                       iii1I01III00000oIO = l1i1IolIOl11.I00000oIO(iii1I01II9, iii1I01II8, oiilIIlI00io3, j5, oiiOlI0II000OOo1O != null ? oiiOlI0II000OOo1O.I00000oOI : null);
/* 383 */                       oI0ll0OIiO = oI0ll0OIiO4;
/* 385 */                       iii1I01II = iii1I01II9;
/* 387 */                       iii1I01II4 = iii1I01II;
/* 388 */                       iii1I01II3 = iii1I01II8;
/* 390 */                       iii1I01II2 = iii1I01II3;
/* 391 */                       oiilIIlI00io = oiilIIlI00io3;
/* 393 */                       arrayList3 = arrayList2;
/* 395 */                       iii1I01II5 = iii1I01III00000oIO;
/* 396 */                       iii1I01II6 = iii1I01II5;
                            } else {
/* 399 */                       Iii1I01II iii1I01II10 = iii1I01II7;
/* 401 */                       OiilIIlI00io oiilIIlI00io4 = oiilIIlI00io2;
/* 412 */                       iii1I01III00000oIO = l1i1IolIOl11.I00000oIO(iii1I01II10, iii1I01II8, oiilIIlI00io4, j5, oiiOlI0II000OOo1O != null ? oiiOlI0II000OOo1O.I00000oIO : null);
/* 416 */                       iii1I01II = iii1I01II10;
/* 418 */                       iii1I01II2 = iii1I01II8;
/* 420 */                       oiilIIlI00io = oiilIIlI00io4;
/* 422 */                       oI0ll0OIiO = oI0ll0OIiO4;
/* 424 */                       arrayList3 = arrayList2;
/* 426 */                       iii1I01II3 = iii1I01III00000oIO;
/* 427 */                       iii1I01II4 = iii1I01II3;
/* 428 */                       iii1I01II5 = iii1I01II;
/* 429 */                       iii1I01II6 = iii1I01II2;
                            }
/* 433 */                   if (oiilIIlI00io.I000O01llI0 || (iii1I01III00000oOI = lO1OIiO0i.I00000oOI(iii1I01II, iii1I01II2)) == Iii1I01II.I00iiI || iii1I01III00000oOI != iii1I01III00000oIO) {
/* 458 */                       int length = oo0iil0o0oI.I00000oIO.I00000oIO.I00iiI.length();
/* 462 */                       if (z) {
/* 464 */                           int iI00000oOI = l1i1IolIOl11.I00000oOI(jI0001Ioi1lo, oo0iil0o0oI);
/* 468 */                           if (oiiOlI0II000OOo1O == null || (oiiOOli2 = oiiOlI0II000OOo1O.I00000oOI) == null) {
/* 499 */                               length = iI00000oOI;
                                    } else {
/* 484 */                               int iCompare = iI1liooilI2.compare(Long.valueOf(oiiOOli2.I0000Il00O), Long.valueOf(j5));
/* 488 */                               if (iCompare < 0) {
/* 490 */                                   length = 0;
                                        } else if (iCompare <= 0) {
/* 496 */                                   length = oiiOOli2.I00000oOI;
                                        }
                                    }
/* 500 */                           i5 = length;
/* 502 */                           i4 = iI00000oOI;
                                } else {
/* 506 */                           int iI00000oOI2 = l1i1IolIOl11.I00000oOI(jI0001Ioi1lo, oo0iil0o0oI);
/* 510 */                           if (oiiOlI0II000OOo1O == null || (oiiOOli = oiiOlI0II000OOo1O.I00000oIO) == null) {
/* 541 */                               length = iI00000oOI2;
                                    } else {
/* 526 */                               int iCompare2 = iI1liooilI2.compare(Long.valueOf(oiiOOli.I0000Il00O), Long.valueOf(j5));
/* 530 */                               if (iCompare2 < 0) {
/* 532 */                                   length = 0;
                                        } else if (iCompare2 <= 0) {
/* 538 */                                   length = oiiOOli.I00000oOI;
                                        }
                                    }
/* 542 */                           i4 = length;
/* 544 */                           i5 = iI00000oOI2;
                                }
/* 561 */                       int iI00000oOI3 = i2 != -1 ? i2 : (jI0001Ioi1lo2 & 9223372034707292159L) == 9205357640488583168L ? -1 : l1i1IolIOl11.I00000oOI(jI0001Ioi1lo2, oo0iil0o0oI);
/* 569 */                       int i13 = oiilIIlI00io.I000iOII + 2;
/* 571 */                       oiilIIlI00io.I000iOII = i13;
/* 581 */                       OiiO01I11iI oiiO01I11iI = new OiiO01I11iI(j5, i13, i4, i5, iI00000oOI3, oo0iil0o0oI);
/* 594 */                       oiilIIlI00io.I000OOo1O = oiilIIlI00io.I00000oIO(oiilIIlI00io.I000OOo1O, iii1I01II4, iii1I01II3);
/* 604 */                       oiilIIlI00io.I000OiO = oiilIIlI00io.I00000oIO(oiilIIlI00io.I000OiO, iii1I01II5, iii1I01II6);
/* 610 */                       oI0ll0OIiO2 = oI0ll0OIiO;
/* 612 */                       oI0ll0OIiO2.I0000oI00(arrayList3.size(), j5);
/* 615 */                       arrayList4 = arrayList3;
/* 617 */                       arrayList4.add(oiiO01I11iI);
                            }
/* 620 */                   i9 = i3 + 1;
/* 624 */                   size2 = i;
/* 626 */                   z2 = z;
/* 628 */                   oI0ll0OIiO4 = oI0ll0OIiO2;
/* 629 */                   arrayList5 = arrayList4;
/* 630 */                   oiilIIlI00io2 = oiilIIlI00io;
/* 631 */                   i8 = i10;
/* 633 */                   oIooliIO02 = oIooliIO0;
/* 635 */                   oiio1oll0003 = oiio1oll0002;
/* 637 */                   arrayListI0000oI00 = arrayList;
                        }
/* 446 */               arrayList4 = arrayList3;
/* 448 */               oI0ll0OIiO2 = oI0ll0OIiO;
/* 620 */               i9 = i3 + 1;
/* 624 */               size2 = i;
/* 626 */               z2 = z;
/* 628 */               oI0ll0OIiO4 = oI0ll0OIiO2;
/* 629 */               arrayList5 = arrayList4;
/* 630 */               oiilIIlI00io2 = oiilIIlI00io;
/* 631 */               i8 = i10;
/* 633 */               oIooliIO02 = oIooliIO0;
/* 635 */               oiio1oll0003 = oiio1oll0002;
/* 637 */               arrayListI0000oI00 = arrayList;
                    }
/* 642 */           OIooliIO0 oIooliIO03 = oIooliIO02;
/* 644 */           Oiio1oll000 oiio1oll0004 = oiio1oll0003;
/* 646 */           OiilIIlI00io oiilIIlI00io5 = oiilIIlI00io2;
/* 647 */           int i14 = i8;
/* 651 */           OI0ll0OIiO oI0ll0OIiO5 = oI0ll0OIiO4;
/* 652 */           ArrayList arrayList7 = arrayList5;
/* 655 */           int i15 = oiilIIlI00io5.I000iOII + 1;
/* 657 */           int size3 = arrayList7.size();
/* 661 */           if (size3 == 0) {
/* 769 */               ol0OlliioI0O = null;
                    } else if (size3 != i14) {
/* 669 */               int i16 = oiilIIlI00io5.I000OOo1O;
/* 672 */               if (i16 == -1) {
/* 674 */                   i16 = i15;
                        }
/* 675 */               int i17 = oiilIIlI00io5.I000OiO;
/* 677 */               if (i17 != -1) {
/* 680 */                   i15 = i17;
                        }
/* 681 */               ol0OlliioI0O = new OI0Olll10oI1();
/* 684 */               ol0OlliioI0O.I00000oIO = oI0ll0OIiO5;
/* 686 */               ol0OlliioI0O.I00000oOI = arrayList7;
/* 688 */               ol0OlliioI0O.I0000Il00O = i16;
/* 690 */               ol0OlliioI0O.I0000O = i15;
/* 694 */               ol0OlliioI0O.I0000oI00 = z;
/* 696 */               ol0OlliioI0O.I0001Ioi1lo = oiiOlI0II000OOo1O;
/* 703 */               if (arrayList7.size() <= 1) {
/* 732 */                   Ioll0IliO1l.I0000Il00O("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList7.size() + ".");
                        }
/* 705 */               VarHandle.storeStoreFence();
                    } else {
/* 741 */               OiiO01I11iI oiiO01I11iI2 = (OiiO01I11iI) IOOi0Ool1i.I00OilO00Il(arrayList7);
/* 743 */               int i18 = oiilIIlI00io5.I000OOo1O;
/* 750 */               int i19 = i18 == -1 ? i15 : i18;
/* 751 */               int i20 = oiilIIlI00io5.I000OiO;
/* 764 */               ol0OlliioI0O = new Ol0OlliioI0O(oiilIIlI00io5.I0000O, i19, i20 == -1 ? i15 : i20, oiilIIlI00io5.I0000oI00, oiiO01I11iI2);
                    }
/* 770 */           if (ol0OlliioI0O == null) {
/* 175 */               return false;
                    }
/* 777 */           boolean zI000l1 = ol0OlliioI0O.I000l1(this.I00oI0i);
/* 781 */           if (zI000l1) {
/* 785 */               OiiOlI0I oiiOlI0II00000oIO = oiiOloi1o.I00000oIO(ol0OlliioI0O);
/* 797 */               if (O0000Ioio00.I0000O(oiiOlI0II00000oIO, I000OOo1O())) {
/* 871 */                   oiio1oll000 = oiio1oll0004;
                        } else {
/* 803 */                   if (I000OiO()) {
/* 805 */                       oiio1oll000 = oiio1oll0004;
/* 807 */                       ArrayList arrayList8 = oiio1oll000.I00000oOI;
/* 809 */                       int size4 = arrayList8.size();
/* 813 */                       int i21 = 0;
                                while (true) {
/* 815 */                           if (i21 >= size4) {
                                        break;
                                    }
/* 833 */                           if (((OI0i1o0iOo0) arrayList8.get(i21)).I0000oI00().I00iiI.length() > 0) {
/* 835 */                               Io1I0l io1I0l = this.I00ilI0I1;
/* 837 */                               if (io1I0l != null) {
/* 843 */                                   ((OO1IIll00O) io1I0l).I00000oIO(9);
                                        }
                                    } else {
/* 847 */                               i21++;
                                    }
                                }
                            } else {
/* 850 */                       oiio1oll000 = oiio1oll0004;
                            }
/* 858 */                   oiio1oll000.I000iOII.setValue(ol0OlliioI0O.I000lI(oiiOlI0II00000oIO));
/* 863 */                   this.I00iio.invoke(oiiOlI0II00000oIO);
/* 868 */                   this.I00oII = false;
                        }
/* 873 */               this.I00oI0i = ol0OlliioI0O;
                    } else {
/* 876 */               oiio1oll000 = oiio1oll0004;
                    }
/* 878 */           Oiil1o0OIi oiil1o0OIi3 = this.I00oI0i;
/* 880 */           if (oiil1o0OIi3 != null) {
/* 884 */               OiiO01I11iI oiiO01I11iII00000oOI = oiil1o0OIi3.I00000oOI();
/* 896 */               OI0i1o0iOo0 oI0i1o0iOo02 = (OI0i1o0iOo0) oiio1oll000.I0000Il00O.I0000oI00(oiiO01I11iII00000oOI.I00000oIO);
/* 898 */               if (oI0i1o0iOo02 != null && (o0iOOo0IiI0000Il00O = oI0i1o0iOo02.I0000Il00O()) != null && (iII0Ii = oI0i1o0iOo02.I0000oI00) != null && (oIOlIiiioi = (OIOlIiiioi) oIooliIO03.getValue()) != null) {
/* 930 */                   long jI00IoIO0lI2 = o0iOOo0IiI0000Il00O.I00IoIO0lI(I000lI(), oIOlIiiioi.I00000oIO);
/* 936 */                   OOo0ooi oOo0ooi = new OOo0ooi();
/* 943 */                   oOo0ooi.I00iOIl = lIl0looO.I00000oIO(jI00IoIO0lI2, 0L);
/* 949 */                   if (I000OiO()) {
/* 964 */                       OOo0IO oOo0IOI0000Il00O = oiiO01I11iII00000oOI.I0001Ioi1lo.I0000Il00O(oiil1o0OIi3.I00000oIO() ? oiiO01I11iII00000oOI.I0000Il00O : oiiO01I11iII00000oOI.I0000O);
/* 970 */                       OOo0IO oOo0IO = (OOo0IO) oOo0ooi.I00iOIl;
/* 1009 */                      oOo0ooi.I00iOIl = new OOo0IO(Math.min(oOo0IO.I00000oIO, oOo0IOI0000Il00O.I00000oIO), Math.min(oOo0IO.I00000oOI, oOo0IOI0000Il00O.I00000oOI), Math.max(oOo0IO.I0000Il00O, oOo0IOI0000Il00O.I0000Il00O), Math.max(oOo0IO.I0000O, oOo0IOI0000Il00O.I0000O));
                            }
/* 1013 */                  OOo0IO oOo0IO2 = (OOo0IO) oOo0ooi.I00iOIl;
/* 1069 */                  long jFloatToRawIntBits = (Float.floatToRawIntBits(lIiioliIlo.I00000oOI(Float.intBitsToFloat((int) (jI00IoIO0lI2 >> 32)), 0.0f, (int) (o0iOOo0IiI0000Il00O.I000iOII() >> 32))) << 32) | (Float.floatToRawIntBits(lIiioliIlo.I00000oOI(Float.intBitsToFloat((int) (jI00IoIO0lI2 & 4294967295L)), 0.0f, (int) (o0iOOo0IiI0000Il00O.I000iOII() & 4294967295L))) & 4294967295L);
/* 1076 */                  int i22 = (int) (jFloatToRawIntBits >> 32);
/* 1089 */                  int i23 = (int) (jFloatToRawIntBits & 4294967295L);
/* 1121 */                  oOo0ooi.I00iOIl = new OOo0IO(Math.min(oOo0IO2.I00000oIO, Float.intBitsToFloat(i22)), Math.min(oOo0IO2.I00000oOI, Float.intBitsToFloat(i23)), Math.max(oOo0IO2.I0000Il00O, Float.intBitsToFloat(i22)), Math.max(oOo0IO2.I0000O, Float.intBitsToFloat(i23)));
/* 1123 */                  Ii0110 ii0110 = this.I00oIiI10;
/* 1125 */                  if (ii0110 != null) {
/* 1138 */                      iOi1II01i0.I0000O(ii0110, null, Ii01I10.I00iio, new O1iIlllIoo(iII0Ii, oOo0ooi, null, 26), 1);
                            }
                        }
                    }
/* 1182 */          return zI000l1;
                }

                public final void I00111O() {
                    OlIl0i olIl0i;
/* 1 */             IIlio101Io iIlio101Io = this.I00io1l;
/* 15 */            if (((Boolean) this.I00l0I0l0lO1.getValue()).booleanValue()) {
/* 20 */                if (this.I00olI && I000OiO()) {
/* 36 */                    if (((OOo0IO) this.I00l0OO0IO.getValue()) == null) {
/* 110 */                       return;
                            }
/* 39 */                    iIlio101Io.I010101Oo1lO();
                        } else {
/* 45 */                    Oloo0l1lIl oloo0l1lIl = (Oloo0l1lIl) iIlio101Io.I00iiI;
/* 47 */                    if (oloo0l1lIl == null || (olIl0i = oloo0l1lIl.I00oO101o) == null) {
/* 110 */                       return;
                            }
/* 55 */                    olIl0i.I000II(null);
/* 58 */                    oloo0l1lIl.I00oO101o = null;
                        }
                    }
                }

                @Override
/* 19 */        public final void I0000oI00() {
                }
            }
