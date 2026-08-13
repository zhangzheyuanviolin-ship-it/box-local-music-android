            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.DataInput;
            import java.io.DataInputStream;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.ByteOrder;
            
/* 11 */    public class Il1Iii0iO extends InputStream implements DataInput {
                public final DataInputStream I00iOIl;
                public int I00iiI;
                public ByteOrder I00iiO;
                public byte[] I00iio;
                public final int I00ilI0I1;

                public Il1Iii0iO(InputStream inputStream, ByteOrder byteOrder) {
/* 6 */             DataInputStream dataInputStream = new DataInputStream(inputStream);
/* 9 */             this.I00iOIl = dataInputStream;
/* 12 */            dataInputStream.mark(0);
/* 15 */            this.I00iiI = 0;
/* 17 */            this.I00iiO = byteOrder;
/* 29 */            this.I00ilI0I1 = inputStream instanceof Il1Iii0iO ? ((Il1Iii0iO) inputStream).I00ilI0I1 : -1;
                }

                public final void I00000oIO(int i) throws IOException {
/* 2 */             int i2 = 0;
/* 3 */             while (i2 < i) {
/* 5 */                 int i3 = i - i2;
/* 8 */                 DataInputStream dataInputStream = this.I00iOIl;
/* 14 */                int iSkip = (int) dataInputStream.skip(i3);
/* 15 */                if (iSkip <= 0) {
/* 21 */                    if (this.I00iio == null) {
/* 25 */                        this.I00iio = new byte[8192];
                            }
/* 33 */                    iSkip = dataInputStream.read(this.I00iio, 0, Math.min(8192, i3));
/* 38 */                    if (iSkip == -1) {
/* 54 */                        throw new EOFException(IIlIOloOOO.I00100l0("Reached EOF while skipping ", i, " bytes."));
                            }
                        }
/* 55 */                i2 += iSkip;
                    }
                    this.I00iiI += i2;
                }

                @Override
                public final int available() {
/* 3 */             return this.I00iOIl.available();
                }

                @Override
                public final void mark(int i) {
/* 29 */            throw new UnsupportedOperationException("Mark is currently unsupported");
                }

                @Override
                public final int read() {
                    this.I00iiI++;
/* 9 */             return this.I00iOIl.read();
                }

                @Override
                public final boolean readBoolean() {
                    this.I00iiI++;
/* 9 */             return this.I00iOIl.readBoolean();
                }

                @Override
                public final byte readByte() throws IOException {
                    this.I00iiI++;
/* 9 */             int i = this.I00iOIl.read();
/* 13 */            if (i >= 0) {
/* 15 */                return (byte) i;
                    }
/* 17 */            I000II.I001i1O0Ol();
/* 20 */            return (byte) 0;
                }

                @Override
                public final char readChar() {
                    this.I00iiI += 2;
/* 9 */             return this.I00iOIl.readChar();
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
                public final void readFully(byte[] bArr) throws IOException {
                    this.I00iiI += bArr.length;
/* 9 */             this.I00iOIl.readFully(bArr);
                }

                @Override
                public final int readInt() throws IOException {
                    this.I00iiI += 4;
/* 7 */             DataInputStream dataInputStream = this.I00iOIl;
/* 9 */             int i = dataInputStream.read();
/* 13 */            int i2 = dataInputStream.read();
/* 17 */            int i3 = dataInputStream.read();
/* 21 */            int i4 = dataInputStream.read();
/* 29 */            if ((i | i2 | i3 | i4) < 0) {
/* 70 */                I000II.I001i1O0Ol();
/* 73 */                return 0;
                    }
/* 31 */            ByteOrder byteOrder = this.I00iiO;
/* 35 */            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
/* 45 */                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
                    }
/* 49 */            if (byteOrder == ByteOrder.BIG_ENDIAN) {
/* 59 */                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
                    }
/* 65 */            I000II.I00111O("Invalid byte order: ", this.I00iiO);
/* 68 */            return 0;
                }

                @Override
                public final String readLine() {
/* 1 */             return null;
                }

                @Override
                public final long readLong() throws IOException {
                    this.I00iiI += 8;
/* 10 */            DataInputStream dataInputStream = this.I00iOIl;
/* 12 */            int i = dataInputStream.read();
/* 16 */            int i2 = dataInputStream.read();
/* 20 */            int i3 = dataInputStream.read();
/* 24 */            int i4 = dataInputStream.read();
/* 28 */            int i5 = dataInputStream.read();
/* 32 */            int i6 = dataInputStream.read();
/* 36 */            int i7 = dataInputStream.read();
/* 40 */            int i8 = dataInputStream.read();
/* 52 */            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
/* 137 */               I000II.I001i1O0Ol();
/* 140 */               return 0L;
                    }
/* 54 */            ByteOrder byteOrder = this.I00iiO;
/* 70 */            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
/* 95 */                return (i8 << 56) + (i7 << 48) + (i6 << 40) + (i5 << 32) + (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
                    }
/* 99 */            if (byteOrder == ByteOrder.BIG_ENDIAN) {
/* 125 */               return (i << 56) + (i2 << 48) + (i3 << 40) + (i4 << 32) + (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
                    }
/* 131 */           I000II.I00111O("Invalid byte order: ", this.I00iiO);
/* 134 */           return 0L;
                }

                @Override
                public final short readShort() throws IOException {
                    this.I00iiI += 2;
/* 7 */             DataInputStream dataInputStream = this.I00iOIl;
/* 9 */             int i = dataInputStream.read();
/* 13 */            int i2 = dataInputStream.read();
/* 19 */            if ((i | i2) < 0) {
/* 50 */                I000II.I001i1O0Ol();
/* 53 */                return (short) 0;
                    }
/* 21 */            ByteOrder byteOrder = this.I00iiO;
/* 25 */            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
/* 30 */                return (short) ((i2 << 8) + i);
                    }
/* 34 */            if (byteOrder == ByteOrder.BIG_ENDIAN) {
/* 39 */                return (short) ((i << 8) + i2);
                    }
/* 45 */            I000II.I00111O("Invalid byte order: ", this.I00iiO);
/* 48 */            return (short) 0;
                }

                @Override
                public final String readUTF() {
                    this.I00iiI += 2;
/* 9 */             return this.I00iOIl.readUTF();
                }

                @Override
                public final int readUnsignedByte() {
                    this.I00iiI++;
/* 9 */             return this.I00iOIl.readUnsignedByte();
                }

                @Override
                public final int readUnsignedShort() throws IOException {
                    this.I00iiI += 2;
/* 7 */             DataInputStream dataInputStream = this.I00iOIl;
/* 9 */             int i = dataInputStream.read();
/* 13 */            int i2 = dataInputStream.read();
/* 19 */            if ((i | i2) < 0) {
/* 48 */                I000II.I001i1O0Ol();
/* 51 */                return 0;
                    }
/* 21 */            ByteOrder byteOrder = this.I00iiO;
/* 25 */            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
/* 29 */                return (i2 << 8) + i;
                    }
/* 33 */            if (byteOrder == ByteOrder.BIG_ENDIAN) {
/* 37 */                return (i << 8) + i2;
                    }
/* 43 */            I000II.I00111O("Invalid byte order: ", this.I00iiO);
/* 46 */            return 0;
                }

                @Override
                public final void reset() {
/* 20 */            throw new UnsupportedOperationException("Reset is currently unsupported");
                }

                @Override
                public final int skipBytes(int i) {
/* 29 */            throw new UnsupportedOperationException("skipBytes is currently unsupported");
                }

                @Override
/* 12 */        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
                    this.I00iiI += i2;
/* 14 */            this.I00iOIl.readFully(bArr, i, i2);
                }

                @Override
/* 13 */        public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 14 */            int i3 = this.I00iOIl.read(bArr, i, i2);
                    this.I00iiI += i3;
                    return i3;
                }

/* 31 */        public Il1Iii0iO(InputStream inputStream) {
/* 32 */            this(inputStream, ByteOrder.BIG_ENDIAN);
                }

/* 32 */        public Il1Iii0iO(byte[] bArr) {
/* 33 */            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
/* 34 */            this.I00ilI0I1 = bArr.length;
                }
            }
