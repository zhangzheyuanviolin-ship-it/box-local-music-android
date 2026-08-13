            package p000;

            import java.io.IOException;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.MappedByteBuffer;
            
            public abstract class l1OOloO {
                public static O1liIlo I00000oIO(MappedByteBuffer mappedByteBuffer) throws IOException {
                    long j;
/* 1 */             ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
/* 7 */             byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
/* 16 */            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
/* 26 */            int i = byteBufferDuplicate.getShort() & 65535;
/* 32 */            if (i > 100) {
/* 214 */               IioIoO10iOiI.I000OOo1O("Cannot read metadata.");
/* 29 */                return null;
                    }
/* 40 */            byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
/* 44 */            int i2 = 0;
                    while (true) {
/* 52 */                if (i2 >= i) {
/* 91 */                    j = -1;
                            break;
                        }
/* 54 */                int i3 = byteBufferDuplicate.getInt();
/* 64 */                byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
/* 72 */                j = byteBufferDuplicate.getInt() & 4294967295L;
/* 79 */                byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
/* 85 */                if (1835365473 == i3) {
                            break;
                        }
/* 88 */                i2++;
                    }
/* 94 */            if (j != -1) {
/* 109 */               byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - byteBufferDuplicate.position())));
/* 118 */               byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
/* 126 */               long j2 = byteBufferDuplicate.getInt() & 4294967295L;
/* 131 */               for (int i4 = 0; i4 < j2; i4++) {
/* 133 */                   int i5 = byteBufferDuplicate.getInt();
/* 142 */                   long j3 = byteBufferDuplicate.getInt() & 4294967295L;
/* 143 */                   byteBufferDuplicate.getInt();
/* 149 */                   if (1164798569 == i5 || 1701669481 == i5) {
/* 162 */                       byteBufferDuplicate.position((int) (j3 + j));
/* 167 */                       O1liIlo o1liIlo = new O1liIlo(0);
/* 172 */                       byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
/* 187 */                       int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
/* 188 */                       o1liIlo.I00iiI = byteBufferDuplicate;
/* 190 */                       o1liIlo.I00iOIl = iPosition;
/* 196 */                       int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
/* 197 */                       o1liIlo.I00iiO = i6;
/* 207 */                       o1liIlo.I00iio = ((ByteBuffer) o1liIlo.I00iiI).getShort(i6);
/* 209 */                       return o1liIlo;
                            }
                        }
                    }
/* 210 */           IioIoO10iOiI.I000OOo1O("Cannot read metadata.");
/* 29 */            return null;
                }
            }
