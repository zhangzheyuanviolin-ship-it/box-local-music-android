            package p000;

            import java.io.FilterOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.nio.ByteOrder;
            
/* 5 */     public final class IIIoiI01 extends FilterOutputStream {
                public OutputStream I00iOIl;
                public ByteOrder I00iiI;

                public final void I00000oIO(int i) throws IOException {
/* 1 */             OutputStream outputStream = this.I00iOIl;
/* 3 */             ByteOrder byteOrder = this.I00iiI;
/* 7 */             if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
/* 11 */                outputStream.write(i & 255);
/* 18 */                outputStream.write((i >>> 8) & 255);
/* 25 */                outputStream.write((i >>> 16) & 255);
/* 32 */                outputStream.write((i >>> 24) & 255);
/* 35 */                return;
                    }
/* 38 */            if (byteOrder == ByteOrder.BIG_ENDIAN) {
/* 44 */                outputStream.write((i >>> 24) & 255);
/* 51 */                outputStream.write((i >>> 16) & 255);
/* 58 */                outputStream.write((i >>> 8) & 255);
/* 63 */                outputStream.write(i & 255);
                    }
                }

                public final void I0000Il00O(short s) throws IOException {
/* 1 */             OutputStream outputStream = this.I00iOIl;
/* 3 */             ByteOrder byteOrder = this.I00iiI;
/* 7 */             if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
/* 11 */                outputStream.write(s & 255);
/* 18 */                outputStream.write((s >>> 8) & 255);
                    } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
/* 30 */                outputStream.write((s >>> 8) & 255);
/* 35 */                outputStream.write(s & 255);
                    }
                }

                @Override
                public final void write(byte[] bArr) throws IOException {
/* 3 */             this.I00iOIl.write(bArr);
                }

                @Override
/* 6 */         public final void write(byte[] bArr, int i, int i2) throws IOException {
/* 7 */             this.I00iOIl.write(bArr, i, i2);
                }
            }
