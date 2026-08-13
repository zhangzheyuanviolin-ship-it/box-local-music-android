            package p000;

            import android.os.Bundle;
            
            public abstract class ll0I11O {
                public static void I00000oIO(Bundle bundle, Object obj) {
/* 5 */             if (obj instanceof Double) {
/* 13 */                bundle.putDouble("value", ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
/* 27 */                bundle.putLong("value", ((Long) obj).longValue());
                    } else {
/* 35 */                bundle.putString("value", obj.toString());
                    }
                }

                public static Object I00000oOI(Bundle bundle, String str, Class cls, Object obj) {
/* 1 */             Object obj2 = bundle.get(str);
/* 5 */             if (obj2 == null) {
/* 7 */                 return obj;
                    }
/* 16 */            if (cls.isAssignableFrom(obj2.getClass())) {
/* 18 */                return obj2;
                    }
/* 19 */            String canonicalName = cls.getCanonicalName();
/* 47 */            I000II.I001IO000(IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
/* 50 */            return null;
                }
            }
