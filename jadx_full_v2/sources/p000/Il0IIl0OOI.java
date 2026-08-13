            package p000;

            import java.util.HashMap;
            
            public abstract class Il0IIl0OOI implements IIi0O1OOO1i0 {
                public final HashMap I00iOIl = new HashMap(250);
                public final HashMap I00iiI = new HashMap(250);

                public static Il0IIl0OOI I00000oOI(IIi0I0I0o iIi0I0I0o) {
/* 7 */             if (IIi0I0I0o.I0IO1iOI1.equals(iIi0I0I0o)) {
/* 9 */                 return OlIlI0.I00iio;
                    }
/* 18 */            if (IIi0I0I0o.I0IliI0i.equals(iIi0I0I0o)) {
/* 20 */                return i00I0Iil.I00iio;
                    }
/* 29 */            if (IIi0I0I0o.I01oi1lO0O1o.equals(iIi0I0I0o)) {
/* 31 */                return O1O1l10.I00iio;
                    }
/* 40 */            if (IIi0I0I0o.I01oi1lIIO.equals(iIi0I0I0o)) {
/* 42 */                return O1O1O0.I00iio;
                    }
/* 45 */            return null;
                }

                public final void I00000oIO(int i, String str) {
/* 7 */             this.I00iOIl.put(Integer.valueOf(i), str);
/* 10 */            HashMap map = this.I00iiI;
/* 16 */            if (map.containsKey(str)) {
/* 89 */                return;
                    }
/* 22 */            map.put(str, Integer.valueOf(i));
                }

                public final String I0000Il00O(int i) {
/* 11 */            String str = (String) this.I00iOIl.get(Integer.valueOf(i));
                    return str != null ? str : ".notdef";
                }
            }
