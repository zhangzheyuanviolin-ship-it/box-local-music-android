            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.util.ArrayList;
            import java.util.Arrays;
            
            public final class IoIIIIi {
                public III1o0lOio0 I00000oIO;
                public int I00000oOI;
                public boolean I0000Il00O;
                public int I0000O;
                public Io1IiiI11[] I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;

                public final void I00000oIO(int i) {
                    int i2;
/* 1 */             if (i > 0) {
                        int length = this.I0000oI00.length - 1;
/* 8 */                 int i3 = 0;
                        while (true) {
/* 9 */                     i2 = this.I0001Ioi1lo;
/* 11 */                    if (length < i2 || i <= 0) {
                                break;
                            }
/* 19 */                    int i4 = this.I0000oI00[length].I0000Il00O;
/* 21 */                    i -= i4;
                            this.I000O01llI0 -= i4;
                            this.I000II--;
/* 33 */                    i3++;
                            length--;
                        }
/* 38 */                Io1IiiI11[] io1IiiI11Arr = this.I0000oI00;
/* 40 */                int i5 = i2 + 1;
/* 46 */                System.arraycopy(io1IiiI11Arr, i5, io1IiiI11Arr, i5 + i3, this.I000II);
/* 49 */                Io1IiiI11[] io1IiiI11Arr2 = this.I0000oI00;
/* 53 */                int i6 = this.I0001Ioi1lo + 1;
/* 58 */                Arrays.fill(io1IiiI11Arr2, i6, i6 + i3, (Object) null);
                        this.I0001Ioi1lo += i3;
                    }
                }

                public final void I00000oOI(Io1IiiI11 io1IiiI11) {
/* 1 */             int i = io1IiiI11.I0000Il00O;
/* 3 */             int i2 = this.I0000O;
/* 6 */             if (i > i2) {
/* 11 */                I1IoiO1l.I00111O(this.I0000oI00, null);
/* 19 */                this.I0001Ioi1lo = this.I0000oI00.length - 1;
/* 21 */                this.I000II = 0;
/* 23 */                this.I000O01llI0 = 0;
/* 25 */                return;
                    }
/* 30 */            I00000oIO((this.I000O01llI0 + i) - i2);
/* 35 */            int i3 = this.I000II + 1;
/* 37 */            Io1IiiI11[] io1IiiI11Arr = this.I0000oI00;
/* 40 */            if (i3 > io1IiiI11Arr.length) {
/* 45 */                Io1IiiI11[] io1IiiI11Arr2 = new Io1IiiI11[io1IiiI11Arr.length * 2];
/* 49 */                System.arraycopy(io1IiiI11Arr, 0, io1IiiI11Arr2, io1IiiI11Arr.length, io1IiiI11Arr.length);
/* 57 */                this.I0001Ioi1lo = this.I0000oI00.length - 1;
/* 59 */                this.I0000oI00 = io1IiiI11Arr2;
/* 61 */                io1IiiI11Arr = io1IiiI11Arr2;
                    }
/* 62 */            int i4 = this.I0001Ioi1lo;
/* 66 */            this.I0001Ioi1lo = i4 - 1;
/* 68 */            io1IiiI11Arr[i4] = io1IiiI11;
                    this.I000II++;
                    this.I000O01llI0 += i;
                }

                public final void I0000Il00O(IIOIIi1ilIO iIOIIi1ilIO) throws EOFException {
/* 1 */             III1o0lOio0 iII1o0lOio0 = this.I00000oIO;
/* 3 */             int[] iArr = IoOi1IlO1li.I00000oIO;
/* 5 */             int iI00000oOI = iIOIIi1ilIO.I00000oOI();
/* 9 */             long j = 0;
/* 12 */            long j2 = 0;
/* 14 */            for (int i = 0; i < iI00000oOI; i++) {
/* 16 */                byte bI000II = iIOIIi1ilIO.I000II(i);
/* 20 */                byte[] bArr = OollIoI001lo.I00000oIO;
/* 29 */                j2 += IoOi1IlO1li.I00000oOI[bI000II & 255];
                    }
/* 46 */            if (((int) ((j2 + 7) >> 3)) >= iIOIIi1ilIO.I00000oOI()) {
/* 134 */               I0000oI00(iIOIIi1ilIO.I00000oOI(), 127, 0);
/* 137 */               iII1o0lOio0.I00l0I0l0lO1(iIOIIi1ilIO);
/* 186 */               return;
                    }
/* 50 */            III1o0lOio0 iII1o0lOio02 = new III1o0lOio0();
/* 53 */            int[] iArr2 = IoOi1IlO1li.I00000oIO;
/* 55 */            int iI00000oOI2 = iIOIIi1ilIO.I00000oOI();
/* 59 */            int i2 = 0;
/* 60 */            for (int i3 = 0; i3 < iI00000oOI2; i3++) {
/* 62 */                byte bI000II2 = iIOIIi1ilIO.I000II(i3);
/* 66 */                byte[] bArr2 = OollIoI001lo.I00000oIO;
/* 68 */                int i4 = bI000II2 & 255;
/* 72 */                int i5 = IoOi1IlO1li.I00000oIO[i4];
/* 76 */                byte b = IoOi1IlO1li.I00000oOI[i4];
/* 80 */                j = (j << b) | i5;
/* 81 */                i2 += b;
/* 84 */                while (i2 >= 8) {
                            i2 -= 8;
/* 91 */                    iII1o0lOio02.I00lll10((int) (j >> i2));
                        }
                    }
/* 98 */            if (i2 > 0) {
/* 108 */               iII1o0lOio02.I00lll10((int) ((j << (8 - i2)) | (255 >>> i2)));
                    }
/* 113 */           IIOIIi1ilIO iIOIIi1ilIOI00IOO = iII1o0lOio02.I00IOO(iII1o0lOio02.I00iiI);
/* 123 */           I0000oI00(iIOIIi1ilIOI00IOO.I00000oOI(), 127, Barcode.FORMAT_ITF);
/* 126 */           iII1o0lOio0.I00l0I0l0lO1(iIOIIi1ilIOI00IOO);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000O(ArrayList arrayList) throws EOFException {
                    int length;
                    int length2;
/* 4 */             if (this.I0000Il00O) {
/* 6 */                 int i = this.I00000oOI;
/* 14 */                if (i < this.I0000O) {
/* 16 */                    I0000oI00(i, 31, 32);
                        }
/* 19 */                this.I0000Il00O = false;
/* 24 */                this.I00000oOI = Integer.MAX_VALUE;
/* 28 */                I0000oI00(this.I0000O, 31, 32);
                    }
/* 31 */            int size = arrayList.size();
/* 36 */            for (int i2 = 0; i2 < size; i2++) {
/* 42 */                Io1IiiI11 io1IiiI11 = (Io1IiiI11) arrayList.get(i2);
/* 46 */                IIOIIi1ilIO iIOIIi1ilIOI000lI = io1IiiI11.I00000oIO.I000lI();
/* 50 */                IIOIIi1ilIO iIOIIi1ilIO = io1IiiI11.I00000oOI;
/* 58 */                Integer num = (Integer) IoIIO11iI.I00000oOI.get(iIOIIi1ilIOI000lI);
/* 61 */                if (num != null) {
/* 63 */                    int iIntValue = num.intValue();
/* 67 */                    length2 = iIntValue + 1;
/* 70 */                    if (2 > length2 || length2 >= 8) {
/* 106 */                       length = length2;
/* 107 */                       length2 = -1;
                            } else {
/* 76 */                        Io1IiiI11[] io1IiiI11Arr = IoIIO11iI.I00000oIO;
/* 86 */                        if (O0000Ioio00.I0000O(io1IiiI11Arr[iIntValue].I00000oOI, iIOIIi1ilIO)) {
/* 88 */                            length = length2;
                                } else if (O0000Ioio00.I0000O(io1IiiI11Arr[length2].I00000oOI, iIOIIi1ilIO)) {
/* 100 */                           length2 = iIntValue + 2;
/* 104 */                           length = length2;
                                }
                            }
                        } else {
/* 109 */                   length = -1;
/* 110 */                   length2 = -1;
                        }
/* 111 */               if (length2 == -1) {
/* 115 */                   int i3 = this.I0001Ioi1lo + 1;
/* 119 */                   int length3 = this.I0000oI00.length;
                            while (true) {
/* 120 */                       if (i3 >= length3) {
                                    break;
                                }
/* 132 */                       if (O0000Ioio00.I0000O(this.I0000oI00[i3].I00000oIO, iIOIIi1ilIOI000lI)) {
/* 144 */                           if (O0000Ioio00.I0000O(this.I0000oI00[i3].I00000oOI, iIOIIi1ilIO)) {
/* 152 */                               length2 = IoIIO11iI.I00000oIO.length + (i3 - this.I0001Ioi1lo);
                                        break;
                                    } else if (length == -1) {
/* 163 */                               length = (i3 - this.I0001Ioi1lo) + IoIIO11iI.I00000oIO.length;
                                    }
                                }
/* 164 */                       i3++;
                            }
                        }
/* 167 */               if (length2 != -1) {
/* 173 */                   I0000oI00(length2, 127, Barcode.FORMAT_ITF);
                        } else if (length == -1) {
/* 183 */                   this.I00000oIO.I00lll10(64);
/* 186 */                   I0000Il00O(iIOIIi1ilIOI000lI);
/* 189 */                   I0000Il00O(iIOIIi1ilIO);
/* 192 */                   I00000oOI(io1IiiI11);
                        } else {
/* 196 */                   IIOIIi1ilIO iIOIIi1ilIO2 = Io1IiiI11.I0000O;
/* 198 */                   iIOIIi1ilIOI000lI.getClass();
/* 209 */                   if (!iIOIIi1ilIOI000lI.I000OOo1O(0, iIOIIi1ilIO2, iIOIIi1ilIO2.I00000oOI()) || O0000Ioio00.I0000O(Io1IiiI11.I000OOo1O, iIOIIi1ilIOI000lI)) {
/* 230 */                       I0000oI00(length, 63, 64);
/* 233 */                       I0000Il00O(iIOIIi1ilIO);
/* 236 */                       I00000oOI(io1IiiI11);
                            } else {
/* 221 */                       I0000oI00(length, 15, 0);
/* 224 */                       I0000Il00O(iIOIIi1ilIO);
                            }
                        }
                    }
                }

                public final void I0000oI00(int i, int i2, int i3) {
/* 1 */             III1o0lOio0 iII1o0lOio0 = this.I00000oIO;
/* 3 */             if (i < i2) {
/* 6 */                 iII1o0lOio0.I00lll10(i | i3);
/* 9 */                 return;
                    }
/* 11 */            iII1o0lOio0.I00lll10(i3 | i2);
/* 14 */            int i4 = i - i2;
/* 17 */            while (i4 >= 128) {
/* 22 */                iII1o0lOio0.I00lll10(128 | (i4 & 127));
/* 25 */                i4 >>>= 7;
                    }
/* 28 */            iII1o0lOio0.I00lll10(i4);
                }
            }
