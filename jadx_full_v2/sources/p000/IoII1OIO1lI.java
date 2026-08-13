            package p000;

            import java.io.IOException;
            import java.util.ArrayList;
            
            public final class IoII1OIO1lI {
                public int I00000oIO;
                public ArrayList I00000oOI;
                public OOliO0 I0000Il00O;
                public Io1IiiI11[] I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;

                public final int I00000oIO(int i) {
                    int i2;
/* 1 */             int i3 = 0;
/* 2 */             if (i > 0) {
/* 6 */                 int length = this.I0000O.length;
                        while (true) {
                            length--;
/* 9 */                     i2 = this.I0000oI00;
/* 11 */                    if (length < i2 || i <= 0) {
                                break;
                            }
/* 19 */                    int i4 = this.I0000O[length].I0000Il00O;
/* 21 */                    i -= i4;
                            this.I000II -= i4;
                            this.I0001Ioi1lo--;
/* 33 */                    i3++;
                        }
/* 38 */                Io1IiiI11[] io1IiiI11Arr = this.I0000O;
/* 47 */                System.arraycopy(io1IiiI11Arr, i2 + 1, io1IiiI11Arr, i2 + 1 + i3, this.I0001Ioi1lo);
                        this.I0000oI00 += i3;
                    }
/* 186 */           return i3;
                }

                public final IIOIIi1ilIO I00000oOI(int i) throws IOException {
/* 1 */             if (i >= 0) {
/* 3 */                 Io1IiiI11[] io1IiiI11Arr = IoIIO11iI.I00000oIO;
/* 8 */                 if (i <= io1IiiI11Arr.length - 1) {
/* 12 */                    return io1IiiI11Arr[i].I00000oIO;
                        }
                    }
/* 24 */            int length = this.I0000oI00 + 1 + (i - IoIIO11iI.I00000oIO.length);
/* 25 */            if (length >= 0) {
/* 27 */                Io1IiiI11[] io1IiiI11Arr2 = this.I0000O;
/* 30 */                if (length < io1IiiI11Arr2.length) {
/* 34 */                    return io1IiiI11Arr2[length].I00000oIO;
                        }
                    }
/* 186 */           throw new IOException("Header index too large " + (i + 1));
                }

                public final void I0000Il00O(Io1IiiI11 io1IiiI11) {
/* 3 */             this.I00000oOI.add(io1IiiI11);
/* 6 */             int i = io1IiiI11.I0000Il00O;
/* 8 */             int i2 = this.I00000oIO;
/* 11 */            if (i > i2) {
/* 16 */                I1IoiO1l.I00111O(this.I0000O, null);
/* 24 */                this.I0000oI00 = this.I0000O.length - 1;
/* 26 */                this.I0001Ioi1lo = 0;
/* 28 */                this.I000II = 0;
/* 30 */                return;
                    }
/* 35 */            I00000oIO((this.I000II + i) - i2);
/* 40 */            int i3 = this.I0001Ioi1lo + 1;
/* 42 */            Io1IiiI11[] io1IiiI11Arr = this.I0000O;
/* 45 */            if (i3 > io1IiiI11Arr.length) {
/* 50 */                Io1IiiI11[] io1IiiI11Arr2 = new Io1IiiI11[io1IiiI11Arr.length * 2];
/* 54 */                System.arraycopy(io1IiiI11Arr, 0, io1IiiI11Arr2, io1IiiI11Arr.length, io1IiiI11Arr.length);
/* 62 */                this.I0000oI00 = this.I0000O.length - 1;
/* 64 */                this.I0000O = io1IiiI11Arr2;
/* 66 */                io1IiiI11Arr = io1IiiI11Arr2;
                    }
/* 67 */            int i4 = this.I0000oI00;
/* 71 */            this.I0000oI00 = i4 - 1;
/* 73 */            io1IiiI11Arr[i4] = io1IiiI11;
                    this.I0001Ioi1lo++;
                    this.I000II += i;
                }

                public final IIOIIi1ilIO I0000O() {
/* 1 */             OOliO0 oOliO0 = this.I0000Il00O;
/* 3 */             byte b = oOliO0.readByte();
/* 7 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 9 */             int i = b & 255;
/* 14 */            int i2 = 0;
/* 19 */            boolean z = (b & 128) == 128;
/* 22 */            long jI0000oI00 = I0000oI00(i, 127);
/* 27 */            if (!z) {
/* 137 */               return oOliO0.I0000Il00O(jI0000oI00);
                    }
/* 31 */            III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 34 */            IoOi0looIo ioOi0looIo = IoOi1IlO1li.I0000Il00O;
/* 38 */            IoOi0looIo ioOi0looIo2 = ioOi0looIo;
/* 40 */            int i3 = 0;
/* 43 */            for (long j = 0; j < jI0000oI00; j++) {
/* 45 */                byte b2 = oOliO0.readByte();
/* 49 */                byte[] bArr2 = OollIoI001lo.I00000oIO;
/* 55 */                i2 = (i2 << 8) | (b2 & 255);
/* 56 */                i3 += 8;
/* 60 */                while (i3 >= 8) {
/* 72 */                    ioOi0looIo2 = ((IoOi0looIo[]) ioOi0looIo2.I00iiO)[(i2 >>> (i3 - 8)) & 255];
/* 78 */                    if (((IoOi0looIo[]) ioOi0looIo2.I00iiO) == null) {
/* 82 */                        iII1o0lOio0.I00lll10(ioOi0looIo2.I00iOIl);
/* 87 */                        i3 -= ioOi0looIo2.I00iiI;
/* 88 */                        ioOi0looIo2 = ioOi0looIo;
                            } else {
                                i3 -= 8;
                            }
                        }
                    }
/* 97 */            while (i3 > 0) {
/* 109 */               IoOi0looIo ioOi0looIo3 = ((IoOi0looIo[]) ioOi0looIo2.I00iiO)[(i2 << (8 - i3)) & 255];
/* 111 */               int i4 = ioOi0looIo3.I00iiI;
/* 117 */               if (((IoOi0looIo[]) ioOi0looIo3.I00iiO) != null || i4 > i3) {
                            break;
                        }
/* 124 */               iII1o0lOio0.I00lll10(ioOi0looIo3.I00iOIl);
/* 127 */               i3 -= i4;
/* 128 */               ioOi0looIo2 = ioOi0looIo;
                    }
/* 132 */           return iII1o0lOio0.I00IOO(iII1o0lOio0.I00iiI);
                }

                public final int I0000oI00(int i, int i2) {
/* 1 */             int i3 = i & i2;
/* 2 */             if (i3 < i2) {
/* 4 */                 return i3;
                    }
/* 5 */             int i4 = 0;
                    while (true) {
/* 8 */                 byte b = this.I0000Il00O.readByte();
/* 12 */                byte[] bArr = OollIoI001lo.I00000oIO;
/* 14 */                int i5 = b & 255;
/* 18 */                if ((b & 128) == 0) {
/* 29 */                    return i2 + (i5 << i4);
                        }
/* 23 */                i2 += (b & Byte.MAX_VALUE) << i4;
/* 24 */                i4 += 7;
                    }
                }
            }
