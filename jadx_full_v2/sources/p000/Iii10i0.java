            package p000;

            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            
            public final class Iii10i0 extends IiI0lOI {
                public int I00ilO0;

                @Override
                public final Object I00000oIO(Object obj) {
/* 1 */             ByteBuffer byteBuffer = (ByteBuffer) obj;
/* 3 */             byteBuffer.clear();
/* 8 */             byteBuffer.order(ByteOrder.BIG_ENDIAN);
/* 49 */            return byteBuffer;
                }

                @Override
                public final Object I0000Il00O() {
/* 3 */             return ByteBuffer.allocateDirect(this.I00ilO0);
                }

                @Override
                public final void I000O01llI0(Object obj) {
/* 1 */             ByteBuffer byteBuffer = (ByteBuffer) obj;
/* 11 */            if (byteBuffer.capacity() != this.I00ilO0) {
/* 24 */                I000II.I001IO000("Check failed.");
                    } else {
/* 17 */                if (byteBuffer.isDirect()) {
/* 19 */                    return;
                        }
/* 20 */                I000II.I001IO000("Check failed.");
                    }
                }
            }
