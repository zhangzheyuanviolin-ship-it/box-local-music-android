            package p000;

            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            
            public final class l0lIilo1 extends OlloI01I {
                public static l0lIilo1 I000iOII(ByteBuffer byteBuffer) {
/* 4 */             l0lIilo1 l0liilo1 = new l0lIilo1(1);
/* 9 */             byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
/* 25 */            l0liilo1.I000OiO(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
/* 29 */            return l0liilo1;
                }
            }
