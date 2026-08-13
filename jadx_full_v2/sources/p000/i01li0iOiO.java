            package p000;

            import java.io.IOException;
            import java.io.Serializable;
            import java.util.List;
            
            public final class i01li0iOiO implements Serializable {
                public final transient IO0lli1io I00iOIl;
                public final transient Il1oi01OOI1 I00iiI;

                public i01li0iOiO(byte[] bArr) throws IOException {
                    try {
/* 4 */                 List list = IO0llIOO.I00000oIO;
/* 6 */                 I00OIO1 i00oio1I00111O = I00OIO1.I00111O(bArr);
/* 10 */                if (i00oio1I00111O == null) {
/* 39 */                    throw new IOException("no content found");
                        }
/* 12 */                IO0lli1io iO0lli1ioI000o00OoI0I = IO0lli1io.I000o00OoI0I(i00oio1I00111O);
/* 19 */                this.I00iOIl = iO0lli1ioI000o00OoI0I;
/* 25 */                this.I00iiI = iO0lli1ioI000o00OoI0I.I00iiI.I00ll1;
                    } catch (ClassCastException e) {
/* 186 */               throw new I00IlilI0i0i("malformed data: " + e.getMessage(), e, 1);
                    } catch (IllegalArgumentException e2) {
/* 61 */                throw new I00IlilI0i0i("malformed data: " + e2.getMessage(), e2, 1);
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof i01li0iOiO) {
/* 17 */                return this.I00iOIl.equals(((i01li0iOiO) obj).I00iOIl);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }
            }
