            package p000;

            import io.github.darriousliu.katex.freetype.FreeTypeAndroid;
            import java.nio.ByteBuffer;
            
            public final class O0oO1ilo extends OO1Ooo1oI {
                public final Il1oollOO1iI I00000oIO(byte[] bArr) {
/* 1 */             FreeTypeAndroid freeTypeAndroid = IoOil1.I00000oIO;
/* 4 */             OI1OOIOiOI1 oI1OOIOiOI1NewBuffer = freeTypeAndroid.newBuffer(bArr.length);
/* 15 */            int iPosition = oI1OOIOiOI1NewBuffer.I00000oIO.position() + bArr.length;
/* 16 */            ByteBuffer byteBuffer = oI1OOIOiOI1NewBuffer.I00000oIO;
/* 18 */            byteBuffer.limit(iPosition);
/* 22 */            freeTypeAndroid.fillBuffer(bArr, oI1OOIOiOI1NewBuffer, bArr.length);
/* 33 */            long jNewMemoryFace = freeTypeAndroid.newMemoryFace(this.I00000oIO, oI1OOIOiOI1NewBuffer, byteBuffer.remaining(), 0L);
/* 41 */            if (jNewMemoryFace == 0) {
/* 43 */                freeTypeAndroid.deleteBuffer(oI1OOIOiOI1NewBuffer);
/* 46 */                return null;
                    }
/* 50 */            Il1oollOO1iI il1oollOO1iI = new Il1oollOO1iI(jNewMemoryFace);
/* 53 */            il1oollOO1iI.I00000oOI = oI1OOIOiOI1NewBuffer;
/* 186 */           return il1oollOO1iI;
                }
            }
