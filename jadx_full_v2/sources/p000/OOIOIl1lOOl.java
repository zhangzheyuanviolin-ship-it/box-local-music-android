            package p000;

            import java.security.GeneralSecurityException;
            import java.security.InvalidKeyException;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class OOIOIl1lOOl extends ThreadLocal {
                public final o00io0IiOOo0 I00000oIO;

                public OOIOIl1lOOl(o00io0IiOOo0 o00io0iiooo0) {
/* 1 */             this.I00000oIO = o00io0iiooo0;
                }

                @Override
                public final Object initialValue() throws InvalidKeyException {
/* 1 */             o00io0IiOOo0 o00io0iiooo0 = this.I00000oIO;
                    try {
/* 3 */                 Il0O1l0i il0O1l0i = Il0O1l0i.I0000Il00O;
/* 15 */                Mac mac = (Mac) il0O1l0i.I00000oIO.I00IO1oi11O((String) o00io0iiooo0.I00iio);
/* 21 */                mac.init((SecretKeySpec) o00io0iiooo0.I00ilI0I1);
/* 24 */                return mac;
                    } catch (GeneralSecurityException e) {
/* 26 */                OoOil11Ol1o.I000oI1ioi(e);
/* 29 */                return null;
                    }
                }
            }
