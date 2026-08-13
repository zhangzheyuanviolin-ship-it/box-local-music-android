            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.DataInput;
            import java.io.DataInputStream;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.ByteOrder;
            import java.util.ArrayList;
            
/* 28 */    public final class O1il1OO implements DataInput {
                public ByteOrder I00iOIl;
                public long I00iiI;
                public int I00iiO;
                public boolean I00iio;
                public byte[] I00ilI0I1;
                public InputStream I00ilO0;
                public Io1OIO1l0o I00io1l;

                public final void I00000oIO() throws IOException {
/* 3 */             if (this.I00iio) {
/* 8 */                 IioIoO10iOiI.I000OOo1O("stream is closed");
                    }
                }

                public final void I00000oOI(long j) throws IOException {
/* 1 */             I00000oIO();
/* 8 */             if (j < 0) {
/* 18 */                I000II.I000iOII("trying to seek before flushed pos");
                    } else {
/* 11 */                this.I00iiO = 0;
/* 13 */                this.I00iiI = j;
                    }
                }

                public final void finalize() throws Throwable {
/* 3 */             if (this.I00iio) {
/* 113 */               return;
                    }
                    try {
/* 5 */                 I00000oIO();
/* 9 */                 this.I00iio = true;
/* 11 */                Io1OIO1l0o io1OIO1l0o = this.I00io1l;
/* 17 */                ((ArrayList) io1OIO1l0o.I00iiO).clear();
/* 22 */                io1OIO1l0o.I00iiI = 0L;
                    } finally {
/* 29 */                super.finalize();
                    }
                }

                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = 0;
/* 2 */             this.I00iiO = 0;
/* 4 */             long j = this.I00iiI;
/* 6 */             Io1OIO1l0o io1OIO1l0o = this.I00io1l;
/* 8 */             long j2 = io1OIO1l0o.I00iiI;
/* 12 */            if (j >= j2) {
/* 20 */                io1OIO1l0o.I00000oIO(this.I00ilO0, (int) ((j - j2) + i2));
                    }
/* 23 */            long j3 = this.I00iiI;
/* 25 */            io1OIO1l0o.getClass();
/* 30 */            if (i2 > bArr.length - i || i2 < 0 || i < 0) {
/* 93 */                OoOil11Ol1o.I001i1lo1io();
/* 1 */                 return 0;
                    }
/* 36 */            if (i2 != 0) {
/* 39 */                long j4 = io1OIO1l0o.I00iiI;
/* 43 */                if (j3 >= j4) {
/* 45 */                    i3 = -1;
                        } else {
/* 51 */                    if (i2 + j3 > j4) {
/* 54 */                        i2 = (int) (j4 - j3);
                            }
/* 68 */                    byte[] bArr2 = (byte[]) ((ArrayList) io1OIO1l0o.I00iiO).get((int) (j3 >> 9));
/* 73 */                    int i4 = (int) (j3 & 511);
/* 76 */                    int iMin = Math.min(i2, 512 - i4);
/* 80 */                    System.arraycopy(bArr2, i4, bArr, i, iMin);
/* 83 */                    i3 = iMin;
                        }
                    }
/* 84 */            if (i3 > 0) {
                        this.I00iiI += i3;
                    }
/* 92 */            return i3;
                }

                @Override
                public final boolean readBoolean() throws EOFException {
/* 1 */             int i = read();
/* 5 */             if (i >= 0) {
                        return i != 0;
                    }
/* 29 */            throw new EOFException("EOF reached");
                }

                @Override
                public final byte readByte() throws EOFException {
/* 1 */             int i = read();
/* 5 */             if (i >= 0) {
/* 7 */                 return (byte) i;
                    }
/* 29 */            throw new EOFException("EOF reached");
                }

                @Override
                public final char readChar() {
/* 5 */             return (char) readShort();
                }

                @Override
                public final double readDouble() {
/* 5 */             return Double.longBitsToDouble(readLong());
                }

                @Override
                public final float readFloat() {
/* 5 */             return Float.intBitsToFloat(readInt());
                }

                @Override
                public final void readFully(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
/* 26 */                OoOil11Ol1o.I001i1lo1io();
/* 215 */               return;
                    }
/* 10 */            while (i2 > 0) {
/* 12 */                int i3 = read(bArr, i, i2);
/* 17 */                if (i3 == -1) {
/* 22 */                    I000II.I001i1O0Ol();
/* 25 */                    return;
                        } else {
/* 19 */                    i += i3;
/* 20 */                    i2 -= i3;
                        }
                    }
                }

                @Override
                public final int readInt() throws EOFException {
/* 1 */             byte[] bArr = this.I00ilI0I1;
/* 9 */             if (read(bArr, 0, 4) >= 0) {
                        return this.I00iOIl == ByteOrder.BIG_ENDIAN ? ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255) : ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
                    }
/* 72 */            I000II.I001i1O0Ol();
/* 75 */            return 0;
                }

                @Override
                public final String readLine() throws IOException {
/* 5 */             StringBuilder sb = new StringBuilder(80);
/* 8 */             boolean z = true;
                    while (true) {
/* 9 */                 int i = read();
/* 14 */                if (i != -1) {
/* 19 */                    if (i == 10) {
                                break;
                            }
/* 24 */                    if (i == 13) {
/* 26 */                        int i2 = read();
/* 30 */                        if (i2 != 10 && i2 != -1) {
/* 34 */                            I00000oIO();
/* 42 */                            I00000oOI(this.I00iiI - 1);
                                }
                            } else {
/* 48 */                        sb.append((char) i);
/* 51 */                        z = false;
                            }
                        } else {
                            break;
                        }
                    }
/* 45 */            z = false;
/* 53 */            if (z) {
/* 55 */                return null;
                    }
/* 57 */            return sb.toString();
                }

                @Override
                public final long readLong() throws EOFException {
/* 1 */             byte[] bArr = this.I00ilI0I1;
/* 10 */            if (read(bArr, 0, 8) < 0) {
/* 145 */               I000II.I001i1O0Ol();
/* 148 */               return 0L;
                    }
/* 30 */            if (this.I00iOIl != ByteOrder.BIG_ENDIAN) {
/* 143 */               return ((((bArr[4] & 255) | ((((bArr[7] & 255) << 24) | ((bArr[6] & 255) << 16)) | ((bArr[5] & 255) << 8))) & 4294967295L) << 32) | ((((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255)) & 4294967295L);
                    }
/* 86 */            return (((((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) & 4294967295L) << 32) | (((bArr[7] & 255) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8)) & 4294967295L);
                }

                @Override
                public final short readShort() throws EOFException {
/* 1 */             byte[] bArr = this.I00ilI0I1;
/* 9 */             if (read(bArr, 0, 2) >= 0) {
                        return this.I00iOIl == ByteOrder.BIG_ENDIAN ? (short) ((bArr[0] << 8) | (bArr[1] & 255)) : (short) ((bArr[1] << 8) | (bArr[0] & 255));
                    }
/* 40 */            I000II.I001i1O0Ol();
/* 43 */            return (short) 0;
                }

                @Override
                public final String readUTF() throws IOException {
/* 1 */             ByteOrder byteOrder = this.I00iOIl;
/* 5 */             this.I00iOIl = ByteOrder.BIG_ENDIAN;
/* 7 */             int unsignedShort = readUnsignedShort();
/* 13 */            char[] cArr = new char[unsignedShort];
/* 16 */            readFully(new byte[unsignedShort], 0, unsignedShort);
/* 19 */            this.I00iOIl = byteOrder;
/* 33 */            return new DataInputStream(new ByteArrayInputStream(this.I00ilI0I1)).readUTF();
                }

                @Override
                public final int readUnsignedByte() throws EOFException {
/* 1 */             int i = read();
/* 5 */             if (i >= 0) {
/* 7 */                 return i;
                    }
/* 29 */            throw new EOFException("EOF reached");
                }

                @Override
                public final int readUnsignedShort() {
/* 8 */             return readShort() & 65535;
                }

                @Override
                public final int skipBytes(int i) throws IOException {
                    long j = i;
/* 2 */             I00000oIO();
/* 8 */             I00000oOI(this.I00iiI + j);
/* 11 */            return (int) j;
                }

                @Override
/* 29 */        public final void readFully(byte[] bArr) throws IOException {
/* 30 */            readFully(bArr, 0, bArr.length);
                }

/* 96 */        public final int read() {
/* 97 */            this.I00iiO = 0;
/* 98 */            long j = this.I00iiI;
                    Io1OIO1l0o io1OIO1l0o = this.I00io1l;
/* 99 */            long j2 = io1OIO1l0o.I00iiI;
                    if (j >= j2) {
                        int i = (int) ((j - j2) + 1);
/* 100 */               if (io1OIO1l0o.I00000oIO(this.I00ilO0, i) < i) {
                            return -1;
                        }
                    }
/* 101 */           long j3 = this.I00iiI;
/* 104 */           int i2 = j3 < io1OIO1l0o.I00iiI ? ((byte[]) ((ArrayList) io1OIO1l0o.I00iiO).get((int) (j3 >> 9)))[(int) (j3 & 511)] & 255 : -1;
                    if (i2 >= 0) {
                        this.I00iiI++;
                    }
                    return i2;
                }
            }
