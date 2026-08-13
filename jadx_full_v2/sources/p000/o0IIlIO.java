            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class o0IIlIO {
                public String I00000oIO;
                public int I00000oOI;
                public byte I0000Il00O;

                public final o0IiIio1Ii1i I00000oIO() {
/* 1 */             byte b = this.I0000Il00O;
/* 3 */             String str = this.I00000oIO;
/* 6 */             if (b == 3) {
/* 10 */                int i = this.I00000oOI;
/* 12 */                o0IiIio1Ii1i o0iiiio1ii1i = new o0IiIio1Ii1i();
/* 15 */                o0iiiio1ii1i.I00000oIO = str;
/* 17 */                o0iiiio1ii1i.I00000oOI = i;
/* 19 */                VarHandle.storeStoreFence();
/* 22 */                return o0iiiio1ii1i;
                    }
/* 25 */            StringBuilder sb = new StringBuilder();
/* 32 */            if ((this.I0000Il00O & 1) == 0) {
/* 36 */                sb.append(" enableFirelog");
                    }
/* 43 */            if ((this.I0000Il00O & 2) == 0) {
/* 47 */                sb.append(" firelogEventType");
                    }
/* 60 */            I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 63 */            return null;
                }
            }
