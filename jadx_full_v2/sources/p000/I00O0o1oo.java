            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.Arrays;
            
/* 27 */    public abstract class I00O0o1oo extends I00OIO1 implements I00O10llo {
                public static final I001lllioOl I00iiI = new I001lllioOl(6, I00O0o1oo.class);
                public static final byte[] I00iiO = new byte[0];
                public final byte[] I00iOIl;

                public I00O0o1oo(byte[] bArr) {
/* 4 */             if (bArr != null) {
/* 6 */                 this.I00iOIl = bArr;
                    } else {
/* 11 */                IOOlIIilOl0.I000II("'string' cannot be null");
/* 49 */                throw null;
                    }
                }

                public static I00O0o1oo I001i1O0Ol(Object obj) {
/* 1 */             if (obj == null || (obj instanceof I00O0o1oo)) {
/* 71 */                return (I00O0o1oo) obj;
                    }
/* 11 */            if (obj instanceof I00IO1oi11O) {
/* 16 */                I00OIO1 i00oio1I0000O = ((I00IO1oi11O) obj).I0000O();
/* 22 */                if (i00oio1I0000O instanceof I00O0o1oo) {
/* 24 */                    return (I00O0o1oo) i00oio1I0000O;
                        }
                    } else if (obj instanceof byte[]) {
                        try {
/* 39 */                    return (I00O0o1oo) I00iiI.I0000Il00O((byte[]) obj);
                        } catch (IOException e) {
/* 49 */                    IoOOl0iOl1io.I001l0I00("failed to construct OCTET STRING from byte[]: ", e.getMessage());
/* 10 */                    return null;
                        }
                    }
/* 67 */            I000II.I000iOII("illegal object in getInstance: ".concat(obj.getClass().getName()));
/* 10 */            return null;
                }

                @Override
                public final InputStream I00000oOI() {
/* 5 */             return new ByteArrayInputStream(this.I00iOIl);
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 3 */             if (i00oio1 instanceof I00O0o1oo) {
/* 13 */                return Arrays.equals(this.I00iOIl, ((I00O0o1oo) i00oio1).I00iOIl);
                    }
/* 5 */             return false;
                }

                @Override
                public I00OIO1 I001IIilI0O() {
/* 5 */             return new Ii0oii1lIil(this.I00iOIl);
                }

                @Override
                public I00OIO1 I001IO000() {
/* 5 */             return new Ii0oii1lIil(this.I00iOIl);
                }

                @Override
                public final int hashCode() {
/* 3 */             return iOO1iOiOl.I00000oOI(this.I00iOIl);
                }

                public final String toString() {
/* 1 */             OlOO1i11110 olOO1i11110 = Io1i1OIoO.I00000oIO;
/* 3 */             byte[] bArr = this.I00iOIl;
/* 16 */            return "#".concat(OlOoIoi11.I00000oIO(Io1i1OIoO.I00000oIO(bArr.length, bArr)));
                }

                @Override
/* 28 */        public final I00OIO1 I000OiO() {
/* 29 */            return this;
                }
            }
