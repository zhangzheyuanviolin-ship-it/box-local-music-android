            package p000;

            import android.os.Bundle;
            import java.io.Serializable;
            
            public final class OII01I110I11 extends OII0I1ii {
                public Class I000l1;

                @Override
                public final Object I00000oIO(String str, Bundle bundle) {
/* 5 */             return (Serializable[]) bundle.get(str);
                }

                @Override
                public final String I00000oOI() {
/* 3 */             return this.I000l1.getName();
                }

                @Override
                public final Object I0000Il00O(String str) {
/* 29 */            throw new UnsupportedOperationException("Arrays don't support default values.");
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
                @Override
                public final void I0000oI00(Bundle bundle, String str, Object obj) {
/* 1 */             ?? r3 = (Serializable[]) obj;
/* 5 */             this.I000l1.cast(r3);
/* 8 */             bundle.putSerializable(str, r3);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || !OII01I110I11.class.equals(obj.getClass())) {
/* 31 */                return false;
                    }
/* 26 */            return O0000Ioio00.I0000O(this.I000l1, ((OII01I110I11) obj).I000l1);
                }

                public final int hashCode() {
/* 3 */             return this.I000l1.hashCode();
                }
            }
