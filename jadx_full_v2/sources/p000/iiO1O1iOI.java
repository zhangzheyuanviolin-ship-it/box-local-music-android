            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iiO1O1iOI {
                public String I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public byte I0000O;

                public final iiOiIO0ooI0 I00000oIO() {
                    String str;
/* 4 */             if (this.I0000O == 3 && (str = this.I00000oIO) != null) {
/* 13 */                int i = this.I00000oOI;
/* 15 */                int i2 = this.I0000Il00O;
/* 17 */                iiOiIO0ooI0 iioiio0ooi0 = new iiOiIO0ooI0();
/* 20 */                iioiio0ooi0.I00000oIO = str;
/* 22 */                iioiio0ooi0.I00000oOI = i;
/* 24 */                iioiio0ooi0.I0000Il00O = i2;
/* 26 */                VarHandle.storeStoreFence();
/* 29 */                return iioiio0ooi0;
                    }
/* 32 */            StringBuilder sb = new StringBuilder();
/* 37 */            if (this.I00000oIO == null) {
/* 41 */                sb.append(" rendererName");
                    }
/* 48 */            if ((this.I0000O & 1) == 0) {
/* 52 */                sb.append(" majorVersion");
                    }
/* 59 */            if ((this.I0000O & 2) == 0) {
/* 63 */                sb.append(" minorVersion");
                    }
/* 76 */            I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 79 */            return null;
                }
            }
