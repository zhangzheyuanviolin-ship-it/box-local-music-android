            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            
            public final class Ii101ioOoI implements I00II0Ol1O0l {
                public IiIiIOo I00iOIl;
                public int I00iiI;

                @Override
                public final I00OIO1 I0000O() {
                    try {
/* 1 */                 return I000OiO();
                    } catch (IOException e) {
/* 13 */                I000II.I000lI("IOException converting stream to byte array: ", e.getMessage(), e);
/* 16 */                return null;
                    }
                }

                @Override
                public final InputStream I0001Ioi1lo() throws IOException {
                    String str;
/* 1 */             IiIiIOo iiIiIOo = this.I00iOIl;
/* 3 */             int i = iiIiIOo.I00iio;
/* 7 */             if (i >= 1) {
/* 9 */                 int i2 = iiIiIOo.read();
/* 13 */                this.I00iiI = i2;
/* 15 */                if (i2 > 0) {
/* 18 */                    if (i < 2) {
/* 30 */                        str = "zero length data with non-zero pad bits";
                            } else if (i2 > 7) {
/* 24 */                        str = "pad bits cannot be greater than 7 or less than 0";
                            }
                        }
/* 33 */                return iiIiIOo;
                    }
/* 34 */            str = "content octets cannot be empty";
/* 26 */            I000II.I001IO000(str);
/* 6 */             return null;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final I00OIO1 I000OiO() {
/* 7 */             return I001lloI.I001i1O0Ol(this.I00iOIl.I0000Il00O());
                }
            }
