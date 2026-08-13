            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class ii01o0lo extends IOOOI0 {
                public InputStream I0000Il00O;
                public byte[] I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;

                @Override
                public final void I00IioO0OiOi(int i) {
/* 1 */             this.I000OiO = i;
/* 3 */             I00ilO0();
                }

                @Override
                public final boolean I00IlilI0i0i() {
                    return this.I000II == this.I0000oI00 && !I00ioIO(1);
                }

                @Override
                public final boolean I00Io1lO() {
                    return I00lll10() != 0;
                }

                @Override
                public final boolean I00Io1o110i(int i) throws ii0iI11ol {
                    int iI00Ol10;
/* 1 */             byte[] bArr = this.I0000O;
/* 3 */             int i2 = i & 7;
/* 5 */             int i3 = 0;
/* 7 */             if (i2 == 0) {
/* 75 */                if (this.I0000oI00 - this.I000II >= 10) {
/* 77 */                    while (i3 < 10) {
/* 79 */                        int i4 = this.I000II;
/* 83 */                        this.I000II = i4 + 1;
/* 87 */                        if (bArr[i4] < 0) {
/* 90 */                            i3++;
                                }
                            }
/* 93 */                    OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered a malformed varint.");
/* 30 */                    return false;
                        }
/* 97 */                while (i3 < 10) {
/* 103 */                   if (this.I000II == this.I0000oI00) {
/* 105 */                       I00io1l(1);
                            }
/* 108 */                   int i5 = this.I000II;
/* 112 */                   this.I000II = i5 + 1;
/* 116 */                   if (bArr[i5] < 0) {
/* 118 */                       i3++;
                            }
                        }
/* 122 */               OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered a malformed varint.");
/* 30 */                return false;
/* 6 */                 return true;
                    }
/* 9 */             if (i2 == 1) {
/* 62 */                I00iio(8);
/* 6 */                 return true;
                    }
/* 12 */            if (i2 == 2) {
/* 56 */                I00iio(I00ll1());
/* 6 */                 return true;
                    }
/* 16 */            if (i2 == 3) {
/* 43 */                do {
/* 33 */                    iI00Ol10 = I00Ol10();
/* 37 */                    if (iI00Ol10 == 0) {
                                break;
                            }
/* 43 */                } while (I00Io1o110i(iI00Ol10));
/* 48 */                I00iiO(((i >>> 3) << 3) | 4);
/* 6 */                 return true;
                    }
/* 18 */            if (i2 == 4) {
/* 5 */                 return false;
                    }
/* 21 */            if (i2 == 5) {
/* 23 */                I00iio(4);
/* 6 */                 return true;
                    }
/* 27 */            OoOil11Ol1o.I001IO000();
/* 30 */            return false;
                }

                @Override
                public final double I00O0i0ii() {
/* 5 */             return Double.longBitsToDouble(I00lli11());
                }

                @Override
                public final float I00OI1() {
/* 5 */             return Float.intBitsToFloat(I00li1OI());
                }

                @Override
                public final int I00OIO1() {
/* 5 */             return this.I000OOo1O + this.I000II;
                }

                @Override
                public final int I00OIl(int i) throws ii0iI11ol {
/* 1 */             if (i < 0) {
/* 36 */                OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 26 */                return 0;
                    }
/* 8 */             int i2 = this.I000OOo1O + this.I000II + i;
/* 9 */             if (i2 < 0) {
/* 30 */                OoOil11Ol1o.I001iOo1i0O("Failed to parse the message.");
/* 26 */                return 0;
                    }
/* 11 */            int i3 = this.I000OiO;
/* 13 */            if (i2 > i3) {
/* 23 */                OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 26 */                return 0;
                    }
/* 15 */            this.I000OiO = i2;
/* 17 */            I00ilO0();
/* 20 */            return i3;
                }

                @Override
                public final int I00OIo() {
/* 1 */             return I00ll1();
                }

                @Override
                public final int I00OOll1() {
/* 1 */             return I00li1OI();
                }

                @Override
                public final int I00OilO00Il() {
/* 1 */             return I00ll1();
                }

                @Override
                public final int I00Oio() {
/* 1 */             return I00li1OI();
                }

                @Override
                public final int I00Ol00() {
/* 5 */             return IOOOI0.I00IoIO0lI(I00ll1());
                }

                @Override
                public final int I00Ol10() throws ii0iI11ol {
/* 5 */             if (I00IlilI0i0i()) {
/* 8 */                 this.I000O01llI0 = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iI00ll1 = I00ll1();
/* 15 */            this.I000O01llI0 = iI00ll1;
/* 19 */            if ((iI00ll1 >>> 3) != 0) {
/* 21 */                return iI00ll1;
                    }
/* 24 */            OoOil11Ol1o.I001iOo1i0O("Protocol message contained an invalid tag (zero).");
/* 27 */            return 0;
                }

                @Override
                public final int I00Ol1ll1() {
/* 1 */             return I00ll1();
                }

                @Override
                public final long I00OloOo() {
/* 1 */             return I00lli11();
                }

                @Override
                public final long I00i01iIIliI() {
/* 1 */             return I00lll10();
                }

                @Override
                public final long I00i0O() {
/* 1 */             return I00lli11();
                }

                @Override
                public final long I00i0ilIl0i() {
/* 5 */             return IOOOI0.I00IoO0(I00lll10());
                }

                @Override
                public final long I00i0oil() {
/* 1 */             return I00lll10();
                }

                @Override
                public final ii01iiOoo I00iIO() throws IOException {
/* 1 */             byte[] bArr = this.I0000O;
/* 3 */             int iI00ll1 = I00ll1();
/* 7 */             int i = this.I0000oI00;
/* 9 */             int i2 = this.I000II;
/* 12 */            if (iI00ll1 <= i - i2 && iI00ll1 > 0) {
/* 17 */                ii01iiOoo ii01iioooI0010o = ii01lO0l11ii.I0010o(bArr, i2, iI00ll1);
                        this.I000II += iI00ll1;
/* 26 */                return ii01iioooI0010o;
                    }
/* 27 */            if (iI00ll1 == 0) {
/* 29 */                return ii01lO0l11ii.I00iiI;
                    }
/* 32 */            if (iI00ll1 < 0) {
/* 103 */               OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 106 */               return null;
                    }
/* 34 */            byte[] bArrI00l0OO0IO = I00l0OO0IO(iI00ll1);
/* 39 */            if (bArrI00l0OO0IO != null) {
/* 42 */                return ii01lO0l11ii.I0010o(bArrI00l0OO0IO, 0, bArrI00l0OO0IO.length);
                    }
/* 47 */            int i3 = this.I000II;
/* 49 */            int i4 = this.I0000oI00;
/* 51 */            int i5 = i4 - i3;
                    this.I000OOo1O += i4;
/* 58 */            this.I000II = 0;
/* 60 */            this.I0000oI00 = 0;
/* 64 */            ArrayList arrayListI00ilI0I1 = I00ilI0I1(iI00ll1 - i5);
/* 68 */            byte[] bArr2 = new byte[iI00ll1];
/* 70 */            System.arraycopy(bArr, i3, bArr2, 0, i5);
/* 73 */            Iterator it = arrayListI00ilI0I1.iterator();
/* 81 */            while (it.hasNext()) {
/* 87 */                byte[] bArr3 = (byte[]) it.next();
/* 89 */                int length = bArr3.length;
/* 90 */                System.arraycopy(bArr3, 0, bArr2, i5, length);
/* 93 */                i5 += length;
                    }
/* 97 */            return new ii01iiOoo(bArr2);
                }

                @Override
                public final String I00iOIl() throws ii0iI11ol {
/* 1 */             byte[] bArr = this.I0000O;
/* 3 */             int iI00ll1 = I00ll1();
/* 7 */             if (iI00ll1 > 0) {
/* 9 */                 int i = this.I0000oI00;
/* 11 */                int i2 = this.I000II;
/* 14 */                if (iI00ll1 <= i - i2) {
/* 21 */                    String str = new String(bArr, i2, iI00ll1, ii0i1ll10I0.I00000oIO);
                            this.I000II += iI00ll1;
/* 29 */                    return str;
                        }
                    }
/* 30 */            if (iI00ll1 == 0) {
/* 32 */                return "";
                    }
/* 35 */            if (iI00ll1 < 0) {
/* 73 */                OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 76 */                return null;
                    }
/* 39 */            if (iI00ll1 > this.I0000oI00) {
/* 67 */                return new String(I00l0I0l0lO1(iI00ll1), ii0i1ll10I0.I00000oIO);
                    }
/* 41 */            I00io1l(iI00ll1);
/* 50 */            String str2 = new String(bArr, this.I000II, iI00ll1, ii0i1ll10I0.I00000oIO);
                    this.I000II += iI00ll1;
/* 58 */            return str2;
                }

                @Override
                public final String I00iiI() throws IOException {
/* 1 */             byte[] bArrI00l0I0l0lO1 = this.I0000O;
/* 3 */             int iI00ll1 = I00ll1();
/* 7 */             int i = this.I000II;
/* 9 */             int i2 = this.I0000oI00;
/* 13 */            if (iI00ll1 <= i2 - i && iI00ll1 > 0) {
/* 19 */                this.I000II = i + iI00ll1;
                    } else {
/* 22 */                if (iI00ll1 == 0) {
/* 24 */                    return "";
                        }
/* 27 */                if (iI00ll1 < 0) {
/* 49 */                    OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 52 */                    return null;
                        }
/* 29 */                i = 0;
/* 30 */                if (iI00ll1 <= i2) {
/* 32 */                    I00io1l(iI00ll1);
/* 35 */                    this.I000II = iI00ll1;
                        } else {
/* 38 */                    bArrI00l0I0l0lO1 = I00l0I0l0lO1(iI00ll1);
                        }
                    }
/* 42 */            return ii10i1o.I0000O(bArrI00l0I0l0lO1, i, iI00ll1);
                }

                @Override
                public final void I00iiO(int i) throws ii0iI11ol {
/* 3 */             if (this.I000O01llI0 == i) {
/* 5 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I001iOo1i0O("Protocol message end-group tag did not match expected tag.");
                }

                public final void I00iio(int i) throws ii0iI11ol {
/* 1 */             InputStream inputStream = this.I0000Il00O;
/* 3 */             int i2 = this.I0000oI00;
/* 5 */             int i3 = this.I000II;
/* 7 */             int i4 = i2 - i3;
/* 8 */             if (i <= i4 && i >= 0) {
/* 14 */                this.I000II = i3 + i;
/* 16 */                return;
                    }
/* 17 */            if (i < 0) {
/* 166 */               OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 437 */               return;
                    }
/* 19 */            int i5 = this.I000OOo1O;
/* 21 */            int i6 = i5 + i3;
/* 23 */            int i7 = this.I000OiO;
/* 27 */            if (i6 + i > i7) {
/* 155 */               I00iio((i7 - i5) - i3);
/* 160 */               OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 163 */               return;
                    }
/* 29 */            this.I000OOo1O = i6;
/* 32 */            this.I0000oI00 = 0;
/* 34 */            this.I000II = 0;
/* 37 */            while (i4 < i) {
/* 39 */                long j = i - i4;
                        try {
                            try {
/* 42 */                        long jSkip = inputStream.skip(j);
/* 50 */                        if (jSkip < 0 || jSkip > j) {
/* 100 */                           throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                                }
/* 56 */                        if (jSkip == 0) {
                                    break;
                                } else {
/* 60 */                            i4 += (int) jSkip;
                                }
                            } catch (ii0iI11ol e) {
/* 104 */                       e.I00iOIl = true;
/* 106 */                       throw e;
                            }
                        } catch (Throwable th) {
                            this.I000OOo1O += i4;
/* 112 */                   I00ilO0();
/* 115 */                   throw th;
                        }
                    }
                    this.I000OOo1O += i4;
/* 121 */           I00ilO0();
/* 124 */           if (i4 >= i) {
/* 152 */               return;
                    }
/* 126 */           int i8 = this.I0000oI00;
/* 130 */           int i9 = i8 - this.I000II;
/* 132 */           this.I000II = i8;
/* 134 */           I00io1l(1);
                    while (true) {
/* 137 */               int i10 = i - i9;
/* 139 */               int i11 = this.I0000oI00;
/* 141 */               if (i10 <= i11) {
/* 150 */                   this.I000II = i10;
/* 152 */                   return;
                        } else {
/* 143 */                   i9 += i11;
/* 144 */                   this.I000II = i11;
/* 146 */                   I00io1l(1);
                        }
                    }
                }

                public final ArrayList I00ilI0I1(int i) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             while (i > 0) {
/* 10 */                int iMin = Math.min(i, Barcode.FORMAT_AZTEC);
/* 14 */                byte[] bArr = new byte[iMin];
/* 16 */                int i2 = 0;
/* 17 */                while (i2 < iMin) {
/* 23 */                    int i3 = this.I0000Il00O.read(bArr, i2, iMin - i2);
/* 28 */                    if (i3 == -1) {
/* 39 */                        OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 42 */                        return null;
                            }
                            this.I000OOo1O += i3;
/* 35 */                    i2 += i3;
                        }
/* 44 */                i -= iMin;
/* 45 */                arrayList.add(bArr);
                    }
/* 77 */            return arrayList;
                }

                public final void I00ilO0() {
/* 5 */             int i = this.I0000oI00 + this.I0001Ioi1lo;
/* 6 */             this.I0000oI00 = i;
/* 10 */            int i2 = this.I000OOo1O + i;
/* 11 */            int i3 = this.I000OiO;
/* 13 */            if (i2 <= i3) {
/* 23 */                this.I0001Ioi1lo = 0;
/* 55 */                return;
                    }
/* 15 */            int i4 = i2 - i3;
/* 16 */            this.I0001Ioi1lo = i4;
/* 19 */            this.I0000oI00 = i - i4;
                }

                public final void I00io1l(int i) throws ii0iI11ol {
/* 5 */             if (I00ioIO(i)) {
/* 29 */                return;
                    }
/* 16 */            if (i > (Integer.MAX_VALUE - this.I000OOo1O) - this.I000II) {
/* 20 */                OoOil11Ol1o.I001iOo1i0O("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    } else {
/* 26 */                OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }

                public final boolean I00ioIO(int i) throws IOException {
/* 1 */             InputStream inputStream = this.I0000Il00O;
/* 3 */             byte[] bArr = this.I0000O;
/* 5 */             int i2 = this.I000II;
/* 7 */             int i3 = i2 + i;
/* 9 */             int i4 = this.I0000oI00;
/* 11 */            if (i3 <= i4) {
/* 117 */               I000II.I001IO000(IIlIOloOOO.I00100l0("refillBuffer() called when ", i, " bytes were already available in buffer"));
/* 103 */               return false;
                    }
/* 13 */            int i5 = this.I000OOo1O;
/* 22 */            if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.I000OiO) {
/* 21 */                return false;
                    }
/* 33 */            if (i2 > 0) {
/* 35 */                if (i4 > i2) {
/* 38 */                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                        }
/* 43 */                i5 = this.I000OOo1O + i2;
/* 44 */                this.I000OOo1O = i5;
/* 48 */                i4 = this.I0000oI00 - i2;
/* 49 */                this.I0000oI00 = i4;
/* 51 */                this.I000II = 0;
                    }
                    try {
/* 62 */                int i6 = inputStream.read(bArr, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
/* 66 */                if (i6 == 0 || i6 < -1 || i6 > 4096) {
/* 100 */                   iilo0lOo110.I00000oOI(i6, inputStream.getClass());
/* 103 */                   return false;
                        }
/* 75 */                if (i6 <= 0) {
/* 21 */                    return false;
                        }
                        this.I0000oI00 += i6;
/* 82 */                I00ilO0();
/* 87 */                if (this.I0000oI00 >= i) {
/* 61 */                    return true;
                        }
/* 90 */                return I00ioIO(i);
                    } catch (ii0iI11ol e) {
/* 106 */               e.I00iOIl = true;
/* 108 */               throw e;
                    }
                }

                public final byte[] I00l0I0l0lO1(int i) throws IOException {
/* 1 */             byte[] bArrI00l0OO0IO = I00l0OO0IO(i);
/* 5 */             if (bArrI00l0OO0IO != null) {
/* 7 */                 return bArrI00l0OO0IO;
                    }
/* 8 */             int i2 = this.I000II;
/* 10 */            int i3 = this.I0000oI00;
/* 12 */            int i4 = i3 - i2;
                    this.I000OOo1O += i3;
/* 20 */            this.I000II = 0;
/* 22 */            this.I0000oI00 = 0;
/* 26 */            ArrayList arrayListI00ilI0I1 = I00ilI0I1(i - i4);
/* 30 */            byte[] bArr = new byte[i];
/* 34 */            System.arraycopy(this.I0000O, i2, bArr, 0, i4);
/* 37 */            Iterator it = arrayListI00ilI0I1.iterator();
/* 45 */            while (it.hasNext()) {
/* 51 */                byte[] bArr2 = (byte[]) it.next();
/* 53 */                int length = bArr2.length;
/* 54 */                System.arraycopy(bArr2, 0, bArr, i4, length);
/* 57 */                i4 += length;
                    }
/* 77 */            return bArr;
                }

                public final byte[] I00l0OO0IO(int i) throws IOException {
/* 1 */             InputStream inputStream = this.I0000Il00O;
/* 3 */             if (i == 0) {
/* 5 */                 return ii0i1ll10I0.I00000oOI;
                    }
/* 8 */             int i2 = this.I000OOo1O;
/* 10 */            int i3 = this.I000II;
/* 14 */            int i4 = i2 + i3 + i;
/* 19 */            if ((-2147483647) + i4 > 0) {
/* 110 */               OoOil11Ol1o.I001iOo1i0O("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
/* 92 */                return null;
                    }
/* 21 */            int i5 = this.I000OiO;
/* 25 */            if (i4 > i5) {
/* 101 */               I00iio((i5 - i2) - i3);
/* 104 */               OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 92 */                return null;
                    }
/* 29 */            int i6 = this.I0000oI00 - i3;
/* 30 */            int i7 = i - i6;
/* 35 */            if (i7 >= 4096) {
                        try {
/* 41 */                    if (i7 > inputStream.available()) {
/* 44 */                        return null;
                            }
                        } catch (ii0iI11ol e) {
/* 47 */                    e.I00iOIl = true;
/* 49 */                    throw e;
                        }
                    }
/* 50 */            byte[] bArr = new byte[i];
/* 57 */            System.arraycopy(this.I0000O, this.I000II, bArr, 0, i6);
                    this.I000OOo1O += this.I0000oI00;
/* 67 */            this.I000II = 0;
/* 69 */            this.I0000oI00 = 0;
/* 71 */            while (i6 < i) {
                        try {
/* 75 */                    int i8 = inputStream.read(bArr, i6, i - i6);
/* 80 */                    if (i8 == -1) {
/* 89 */                        OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 92 */                        return null;
                            }
                            this.I000OOo1O += i8;
/* 87 */                    i6 += i8;
                        } catch (ii0iI11ol e2) {
/* 95 */                    e2.I00iOIl = true;
/* 97 */                    throw e2;
                        }
                    }
/* 98 */            return bArr;
                }

                public final int I00li1OI() throws ii0iI11ol {
/* 1 */             int i = this.I000II;
/* 7 */             if (this.I0000oI00 - i < 4) {
/* 9 */                 I00io1l(4);
/* 12 */                i = this.I000II;
                    }
/* 14 */            byte[] bArr = this.I0000O;
/* 18 */            this.I000II = i + 4;
/* 50 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final int I00ll1() {
                    int i;
/* 1 */             int i2 = this.I000II;
/* 3 */             int i3 = this.I0000oI00;
/* 5 */             if (i3 != i2) {
/* 9 */                 byte[] bArr = this.I0000O;
/* 11 */                int i4 = i2 + 1;
/* 13 */                byte b = bArr[i2];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I000II = i4;
/* 19 */                    return b;
                        }
/* 23 */                if (i3 - i4 >= 9) {
/* 25 */                    int i5 = i2 + 2;
/* 31 */                    int i6 = (bArr[i4] << 7) ^ b;
/* 32 */                    if (i6 < 0) {
/* 34 */                        i = i6 ^ (-128);
                            } else {
/* 37 */                        int i7 = i2 + 3;
/* 43 */                        int i8 = (bArr[i5] << 14) ^ i6;
/* 44 */                        if (i8 >= 0) {
/* 46 */                            i = i8 ^ 16256;
                                } else {
/* 50 */                            int i9 = i2 + 4;
/* 56 */                            int i10 = i8 ^ (bArr[i7] << 21);
/* 57 */                            if (i10 < 0) {
/* 62 */                                i = (-2080896) ^ i10;
                                    } else {
/* 65 */                                i7 = i2 + 5;
/* 67 */                                byte b2 = bArr[i9];
/* 75 */                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
/* 76 */                                if (b2 < 0) {
/* 78 */                                    i9 = i2 + 6;
/* 82 */                                    if (bArr[i7] < 0) {
/* 84 */                                        i7 = i2 + 7;
/* 88 */                                        if (bArr[i9] < 0) {
/* 90 */                                            i9 = i2 + 8;
/* 94 */                                            if (bArr[i7] < 0) {
/* 96 */                                                i7 = i2 + 9;
/* 100 */                                               if (bArr[i9] < 0) {
/* 102 */                                                   int i12 = i2 + 10;
/* 106 */                                                   if (bArr[i7] >= 0) {
/* 110 */                                                       i5 = i12;
/* 111 */                                                       i = i11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
/* 115 */                                   i = i11;
                                        }
/* 113 */                               i = i11;
                                    }
/* 63 */                            i5 = i9;
                                }
/* 48 */                        i5 = i7;
                            }
/* 117 */                   this.I000II = i5;
/* 119 */                   return i;
                        }
                    }
/* 124 */           return (int) I00o0iI0io1();
                }

                public final long I00lli11() throws ii0iI11ol {
/* 3 */             int i = this.I000II;
/* 10 */            if (this.I0000oI00 - i < 8) {
/* 12 */                I00io1l(8);
/* 15 */                i = this.I000II;
                    }
/* 17 */            byte[] bArr = this.I0000O;
/* 21 */            this.I000II = i + 8;
/* 23 */            long j = bArr[i];
/* 38 */            long j2 = bArr[i + 2];
/* 43 */            long j3 = bArr[i + 3];
/* 106 */           return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
                }

                public final long I00lll10() {
                    long j;
                    long j2;
/* 1 */             int i = this.I000II;
/* 3 */             int i2 = this.I0000oI00;
/* 5 */             if (i2 != i) {
/* 9 */                 byte[] bArr = this.I0000O;
/* 11 */                int i3 = i + 1;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.I000II = i3;
/* 19 */                    return b;
                        }
/* 24 */                if (i2 - i3 >= 9) {
/* 26 */                    int i4 = i + 2;
/* 32 */                    int i5 = (bArr[i3] << 7) ^ b;
/* 33 */                    if (i5 < 0) {
/* 35 */                        j = i5 ^ (-128);
                            } else {
/* 40 */                        int i6 = i + 3;
/* 46 */                        int i7 = (bArr[i4] << 14) ^ i5;
/* 47 */                        if (i7 >= 0) {
/* 49 */                            j = i7 ^ 16256;
                                } else {
/* 55 */                            int i8 = i + 4;
/* 61 */                            int i9 = i7 ^ (bArr[i6] << 21);
/* 62 */                            if (i9 < 0) {
/* 67 */                                long j3 = (-2080896) ^ i9;
/* 70 */                                i4 = i8;
/* 71 */                                j = j3;
                                    } else {
/* 74 */                                i6 = i + 5;
/* 83 */                                long j4 = (bArr[i8] << 28) ^ i9;
/* 88 */                                if (j4 >= 0) {
/* 93 */                                    j = j4 ^ 266354560;
                                        } else {
/* 96 */                                    i4 = i + 6;
/* 104 */                                   long j5 = (bArr[i6] << 35) ^ j4;
/* 107 */                                   if (j5 < 0) {
/* 109 */                                       j2 = -34093383808L;
                                            } else {
/* 117 */                                       int i10 = i + 7;
/* 125 */                                       long j6 = j5 ^ (bArr[i4] << 42);
/* 128 */                                       if (j6 >= 0) {
/* 135 */                                           j = j6 ^ 4363953127296L;
                                                } else {
/* 139 */                                           i4 = i + 8;
/* 147 */                                           j5 = j6 ^ (bArr[i10] << 49);
/* 150 */                                           if (j5 < 0) {
/* 152 */                                               j2 = -558586000294016L;
                                                    } else {
/* 158 */                                               i10 = i + 9;
/* 172 */                                               long j7 = (j5 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
/* 175 */                                               if (j7 < 0) {
/* 177 */                                                   i4 = i + 10;
/* 184 */                                                   if (bArr[i10] >= 0) {
/* 186 */                                                       j = j7;
                                                            }
                                                        } else {
/* 188 */                                                   j = j7;
                                                        }
                                                    }
                                                }
/* 137 */                                       i4 = i10;
                                            }
/* 114 */                                   j = j5 ^ j2;
                                        }
                                    }
                                }
/* 52 */                        i4 = i6;
                            }
/* 190 */                   this.I000II = i4;
/* 192 */                   return j;
                        }
                    }
/* 193 */           return I00o0iI0io1();
                }

                public final long I00o0iI0io1() throws ii0iI11ol {
/* 2 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 12 */                if (this.I000II == this.I0000oI00) {
/* 15 */                    I00io1l(1);
                        }
/* 18 */                byte[] bArr = this.I0000O;
/* 20 */                int i2 = this.I000II;
/* 24 */                this.I000II = i2 + 1;
/* 32 */                j |= (r3 & Byte.MAX_VALUE) << i;
/* 35 */                if ((bArr[i2] & 128) == 0) {
/* 37 */                    return j;
                        }
                    }
/* 43 */            OoOil11Ol1o.I001iOo1i0O("CodedInputStream encountered a malformed varint.");
/* 46 */            return 0L;
                }
            }
