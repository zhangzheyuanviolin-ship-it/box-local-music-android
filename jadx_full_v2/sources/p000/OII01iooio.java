            package p000;

            import android.os.Bundle;
            import java.io.Serializable;
            
            public class OII01iooio extends OII0I1ii {
                public Class I000l1;

                @Override
                public final Object I00000oIO(String str, Bundle bundle) {
/* 5 */             return (Serializable) bundle.get(str);
                }

                @Override
                public String I00000oOI() {
/* 3 */             return this.I000l1.getName();
                }

                @Override
                public final void I0000oI00(Bundle bundle, String str, Object obj) {
/* 1 */             Serializable serializable = (Serializable) obj;
/* 5 */             this.I000l1.cast(serializable);
/* 8 */             bundle.putSerializable(str, serializable);
                }

                @Override
                public Serializable I0000Il00O(String str) {
/* 29 */            throw new UnsupportedOperationException("Serializables don't support default values.");
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof OII01iooio) {
/* 17 */                return O0000Ioio00.I0000O(this.I000l1, ((OII01iooio) obj).I000l1);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I000l1.hashCode();
                }
            }
