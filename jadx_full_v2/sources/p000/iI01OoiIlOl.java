            package p000;

            import java.io.IOException;
            import java.io.StringWriter;
            
            public abstract class iI01OoiIlOl {
                public final iI0IO110Iil I00000oOI() {
/* 3 */             if (this instanceof iI0IO110Iil) {
/* 5 */                 return (iI0IO110Iil) this;
                    }
/* 18 */            I000II.I001IO000("Not a JSON Object: ".concat(toString()));
/* 21 */            return null;
                }

                public final String toString() {
                    try {
/* 3 */                 StringWriter stringWriter = new StringWriter();
/* 8 */                 iI10Ol ii10ol = new iI10Ol(stringWriter);
/* 12 */                ii10ol.I00ioIO = 1;
/* 14 */                liiI00llO1i0.I00000oOI(ii10ol, this);
/* 17 */                return stringWriter.toString();
                    } catch (IOException e) {
/* 23 */                I000II.I000O01llI0(e);
/* 26 */                return null;
                    }
                }
            }
