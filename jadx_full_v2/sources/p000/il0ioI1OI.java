            package p000;

            import java.io.IOException;
            import java.io.StringWriter;
            
            public abstract class il0ioI1OI {
                public final il0oiOo1loi1 I00000oOI() {
/* 3 */             if (this instanceof il0oiOo1loi1) {
/* 5 */                 return (il0oiOo1loi1) this;
                    }
/* 18 */            I000II.I001IO000("Not a JSON Object: ".concat(toString()));
/* 21 */            return null;
                }

                public final String toString() {
                    try {
/* 3 */                 StringWriter stringWriter = new StringWriter();
/* 8 */                 ilOlO0l ilolo0l = new ilOlO0l(stringWriter);
/* 12 */                ilolo0l.I00ioIO = 1;
/* 14 */                liloiiO1o.I00000oOI(ilolo0l, this);
/* 17 */                return stringWriter.toString();
                    } catch (IOException e) {
/* 23 */                I000II.I000O01llI0(e);
/* 26 */                return null;
                    }
                }
            }
