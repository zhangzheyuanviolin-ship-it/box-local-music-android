            package p000;

            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            
            public final class OI0illOo0i {
                public ByteBuffer I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public long I0000O;
                public long I0000oI00;
                public int I0001Ioi1lo;

                public final void I00000oIO() {
/* 1 */             ByteBuffer byteBuffer = this.I00000oIO;
/* 3 */             byteBuffer.flip();
/* 12 */            while (byteBuffer.remaining() >= this.I0000Il00O) {
/* 14 */                I00000oOI(byteBuffer);
                    }
/* 18 */            byteBuffer.compact();
                }

                public final void I00000oOI(ByteBuffer byteBuffer) {
/* 1 */             long j = byteBuffer.getLong();
/* 5 */             long j2 = byteBuffer.getLong();
/* 29 */            long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.I0000O;
/* 30 */            this.I0000O = jRotateLeft;
/* 34 */            long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
/* 38 */            long j3 = this.I0000oI00;
/* 48 */            this.I0000O = ((jRotateLeft2 + j3) * 5) + 1390208809;
/* 58 */            long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
/* 59 */            this.I0000oI00 = jRotateLeft3;
/* 73 */            this.I0000oI00 = ((Long.rotateLeft(jRotateLeft3, 31) + this.I0000O) * 5) + 944331445;
                    this.I0001Ioi1lo += 16;
                }

                public final OI0illOo0i I0000Il00O(byte[] bArr) {
/* 9 */             ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
/* 13 */            int iRemaining = byteBufferOrder.remaining();
/* 17 */            ByteBuffer byteBuffer = this.I00000oIO;
/* 23 */            if (iRemaining <= byteBuffer.remaining()) {
/* 25 */                byteBuffer.put(byteBufferOrder);
/* 34 */                if (byteBuffer.remaining() < 8) {
/* 36 */                    I00000oIO();
                        }
/* 39 */                return this;
                    }
/* 46 */            int iPosition = this.I00000oOI - byteBuffer.position();
/* 47 */            for (int i = 0; i < iPosition; i++) {
/* 53 */                byteBuffer.put(byteBufferOrder.get());
                    }
/* 59 */            I00000oIO();
/* 68 */            while (byteBufferOrder.remaining() >= this.I0000Il00O) {
/* 70 */                I00000oOI(byteBufferOrder);
                    }
/* 74 */            byteBuffer.put(byteBufferOrder);
/* 77 */            return this;
                }
            }
