            package p000;

            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class OiI01lII01oI extends IIOII1 {
                public static final int[] I00ioIO;
                public final int I00iiI;
                public final IIOII1 I00iiO;
                public final IIOII1 I00iio;
                public final int I00ilI0I1;
                public final int I00ilO0;
                public int I00io1l = 0;

                static {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             int i = 1;
/* 7 */             int i2 = 1;
/* 8 */             while (i > 0) {
/* 14 */                arrayList.add(Integer.valueOf(i));
/* 17 */                int i3 = i2 + i;
/* 19 */                i2 = i;
/* 20 */                i = i3;
                    }
/* 29 */            arrayList.add(Integer.MAX_VALUE);
/* 38 */            I00ioIO = new int[arrayList.size()];
/* 40 */            int i4 = 0;
                    while (true) {
/* 41 */                int[] iArr = I00ioIO;
/* 44 */                if (i4 >= iArr.length) {
/* 113 */                   return;
                        }
/* 56 */                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
/* 58 */                i4++;
                    }
                }

                public OiI01lII01oI(IIOII1 iioii1, IIOII1 iioii12) {
/* 7 */             this.I00iiO = iioii1;
/* 9 */             this.I00iio = iioii12;
/* 11 */            int size = iioii1.size();
/* 15 */            this.I00ilI0I1 = size;
/* 22 */            this.I00iiI = iioii12.size() + size;
/* 38 */            this.I00ilO0 = Math.max(iioii1.I000OOo1O(), iioii12.I000OOo1O()) + 1;
                }

                @Override
                public final void I0001Ioi1lo(int i, byte[] bArr, int i2, int i3) {
/* 1 */             int i4 = i + i3;
/* 3 */             IIOII1 iioii1 = this.I00iiO;
/* 5 */             int i5 = this.I00ilI0I1;
/* 7 */             if (i4 <= i5) {
/* 9 */                 iioii1.I0001Ioi1lo(i, bArr, i2, i3);
/* 12 */                return;
                    }
/* 13 */            IIOII1 iioii12 = this.I00iio;
/* 15 */            if (i >= i5) {
/* 18 */                iioii12.I0001Ioi1lo(i - i5, bArr, i2, i3);
/* 21 */                return;
                    }
/* 22 */            int i6 = i5 - i;
/* 23 */            iioii1.I0001Ioi1lo(i, bArr, i2, i6);
/* 29 */            iioii12.I0001Ioi1lo(0, bArr, i2 + i6, i3 - i6);
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final boolean I000OiO() {
                    return this.I00iiI >= I00ioIO[this.I00ilO0];
                }

                @Override
                public final boolean I000iOII() {
/* 6 */             int iI000oI1ioi = this.I00iiO.I000oI1ioi(0, 0, this.I00ilI0I1);
/* 10 */            IIOII1 iioii1 = this.I00iio;
                    return iioii1.I000oI1ioi(iI000oI1ioi, 0, iioii1.size()) == 0;
                }

                @Override
                public final int I000o00OoI0I(int i, int i2, int i3) {
/* 1 */             int i4 = i2 + i3;
/* 3 */             IIOII1 iioii1 = this.I00iiO;
/* 5 */             int i5 = this.I00ilI0I1;
/* 7 */             if (i4 <= i5) {
/* 9 */                 return iioii1.I000o00OoI0I(i, i2, i3);
                    }
/* 14 */            IIOII1 iioii12 = this.I00iio;
/* 16 */            if (i2 >= i5) {
/* 19 */                return iioii12.I000o00OoI0I(i, i2 - i5, i3);
                    }
/* 24 */            int i6 = i5 - i2;
/* 31 */            return iioii12.I000o00OoI0I(iioii1.I000o00OoI0I(i, i2, i6), 0, i3 - i6);
                }

                @Override
                public final int I000oI1ioi(int i, int i2, int i3) {
/* 1 */             int i4 = i2 + i3;
/* 3 */             IIOII1 iioii1 = this.I00iiO;
/* 5 */             int i5 = this.I00ilI0I1;
/* 7 */             if (i4 <= i5) {
/* 9 */                 return iioii1.I000oI1ioi(i, i2, i3);
                    }
/* 14 */            IIOII1 iioii12 = this.I00iio;
/* 16 */            if (i2 >= i5) {
/* 19 */                return iioii12.I000oI1ioi(i, i2 - i5, i3);
                    }
/* 24 */            int i6 = i5 - i2;
/* 31 */            return iioii12.I000oI1ioi(iioii1.I000oI1ioi(i, i2, i6), 0, i3 - i6);
                }

                @Override
                public final int I00100o1O0lo() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final String I0010I0i() {
                    byte[] bArr;
/* 3 */             int i = this.I00iiI;
/* 5 */             if (i == 0) {
/* 7 */                 bArr = IoolI10lO0ol.I00000oIO;
                    } else {
/* 10 */                byte[] bArr2 = new byte[i];
/* 13 */                I0001Ioi1lo(0, bArr2, 0, i);
/* 16 */                bArr = bArr2;
                    }
/* 19 */            return new String(bArr, "UTF-8");
                }

                @Override
                public final void I00111O(OutputStream outputStream, int i, int i2) {
/* 1 */             int i3 = i + i2;
/* 3 */             IIOII1 iioii1 = this.I00iiO;
/* 5 */             int i4 = this.I00ilI0I1;
/* 7 */             if (i3 <= i4) {
/* 9 */                 iioii1.I00111O(outputStream, i, i2);
/* 12 */                return;
                    }
/* 13 */            IIOII1 iioii12 = this.I00iio;
/* 15 */            if (i >= i4) {
/* 18 */                iioii12.I00111O(outputStream, i - i4, i2);
/* 21 */                return;
                    }
/* 22 */            int i5 = i4 - i;
/* 23 */            iioii1.I00111O(outputStream, i, i5);
/* 28 */            iioii12.I00111O(outputStream, 0, i2 - i5);
                }

                public final boolean equals(Object obj) {
                    int iI00100o1O0lo;
/* 1 */             if (obj == this) {
/* 91 */                return true;
                    }
/* 7 */             if (obj instanceof IIOII1) {
/* 10 */                IIOII1 iioii1 = (IIOII1) obj;
/* 12 */                int size = iioii1.size();
/* 16 */                int i = this.I00iiI;
/* 18 */                if (i == size) {
/* 21 */                    if (i == 0) {
/* 91 */                        return true;
                            }
/* 26 */                    if (this.I00io1l == 0 || (iI00100o1O0lo = iioii1.I00100o1O0lo()) == 0 || this.I00io1l == iI00100o1O0lo) {
/* 41 */                        OIIloI0Iil oIIloI0Iil = new OIIloI0Iil(this);
/* 44 */                        O1101ooIo0l o1101ooIo0lI00000oIO = oIIloI0Iil.I00000oIO();
/* 50 */                        OIIloI0Iil oIIloI0Iil2 = new OIIloI0Iil(iioii1);
/* 53 */                        O1101ooIo0l o1101ooIo0lI00000oIO2 = oIIloI0Iil2.I00000oIO();
/* 57 */                        int i2 = 0;
/* 58 */                        int i3 = 0;
/* 59 */                        int i4 = 0;
                                while (true) {
/* 63 */                            int length = o1101ooIo0lI00000oIO.I00iiI.length - i2;
/* 67 */                            int length2 = o1101ooIo0lI00000oIO2.I00iiI.length - i3;
/* 68 */                            int iMin = Math.min(length, length2);
/* 83 */                            if (!(i2 == 0 ? o1101ooIo0lI00000oIO.I001IIilI0O(o1101ooIo0lI00000oIO2, i3, iMin) : o1101ooIo0lI00000oIO2.I001IIilI0O(o1101ooIo0lI00000oIO, i2, iMin))) {
                                        break;
                                    }
/* 86 */                            i4 += iMin;
/* 87 */                            if (i4 >= i) {
/* 89 */                                if (i4 == i) {
/* 91 */                                    return true;
                                        }
/* 93 */                                IOOlIIilOl0.I000iOII();
/* 6 */                                 return false;
                                    }
/* 97 */                            if (iMin == length) {
/* 99 */                                o1101ooIo0lI00000oIO = oIIloI0Iil.I00000oIO();
/* 103 */                               i2 = 0;
                                    } else {
/* 105 */                               i2 += iMin;
                                    }
/* 106 */                           if (iMin == length2) {
/* 108 */                               o1101ooIo0lI00000oIO2 = oIIloI0Iil2.I00000oIO();
/* 112 */                               i3 = 0;
                                    } else {
/* 114 */                               i3 += iMin;
                                    }
                                }
                            }
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 1 */             int iI000o00OoI0I = this.I00io1l;
/* 3 */             if (iI000o00OoI0I == 0) {
/* 5 */                 int i = this.I00iiI;
/* 8 */                 iI000o00OoI0I = I000o00OoI0I(i, 0, i);
/* 12 */                if (iI000o00OoI0I == 0) {
/* 14 */                    iI000o00OoI0I = 1;
                        }
/* 15 */                this.I00io1l = iI000o00OoI0I;
                    }
/* 29 */            return iI000o00OoI0I;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             OiI01O1ilo oiI01O1ilo = new OiI01O1ilo();
/* 8 */             OIIloI0Iil oIIloI0Iil = new OIIloI0Iil(this);
/* 11 */            oiI01O1ilo.I00iOIl = oIIloI0Iil;
/* 23 */            oiI01O1ilo.I00iiI = (O1100oi0Iio) oIIloI0Iil.I00000oIO().iterator();
/* 27 */            oiI01O1ilo.I00iiO = this.I00iiI;
/* 29 */            VarHandle.storeStoreFence();
/* 113 */           return oiI01O1ilo;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiI;
                }
            }
