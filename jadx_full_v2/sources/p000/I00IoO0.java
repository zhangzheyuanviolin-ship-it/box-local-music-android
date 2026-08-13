            package p000;

            import java.io.ByteArrayOutputStream;
            
            public abstract class I00IoO0 implements I00IO1oi11O {
                public final byte[] I000iOII() {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 6 */             I00OIO1 i00oio1I0000O = I0000O();
/* 10 */            i00oio1I0000O.getClass();
/* 19 */            i00oio1I0000O.I000oI1ioi(new O1OIll00i(byteArrayOutputStream, 1), true);
/* 22 */            return byteArrayOutputStream.toByteArray();
                }

                public final byte[] I000lI() {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 6 */             I00OIO1 i00oio1I0000O = I0000O();
/* 10 */            i00oio1I0000O.getClass();
/* 19 */            new Ii0oiilIloiO(byteArrayOutputStream, 1).I00i0O(i00oio1I0000O);
/* 22 */            return byteArrayOutputStream.toByteArray();
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof I00IO1oi11O) {
/* 21 */                return I0000O().I0010o(((I00IO1oi11O) obj).I0000O());
                    }
/* 9 */             return false;
                }

                public int hashCode() {
/* 5 */             return I0000O().hashCode();
                }
            }
