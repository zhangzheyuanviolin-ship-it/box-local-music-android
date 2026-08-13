            package p000;

            import android.os.Bundle;
            import android.os.Parcelable;
            import java.io.Serializable;
            
            public final class OII00oI extends OII0I1ii {
                public Class I000l1;

                @Override
                public final Object I00000oIO(String str, Bundle bundle) {
/* 1 */             return bundle.get(str);
                }

                @Override
                public final String I00000oOI() {
/* 3 */             return this.I000l1.getName();
                }

                @Override
                public final Object I0000Il00O(String str) {
/* 29 */            throw new UnsupportedOperationException("Parcelables don't support default values.");
                }

                @Override
                public final void I0000oI00(Bundle bundle, String str, Object obj) {
/* 3 */             this.I000l1.cast(obj);
/* 6 */             if (obj == null || (obj instanceof Parcelable)) {
/* 25 */                bundle.putParcelable(str, (Parcelable) obj);
                    } else if (obj instanceof Serializable) {
/* 19 */                bundle.putSerializable(str, (Serializable) obj);
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || !OII00oI.class.equals(obj.getClass())) {
/* 31 */                return false;
                    }
/* 26 */            return O0000Ioio00.I0000O(this.I000l1, ((OII00oI) obj).I000l1);
                }

                public final int hashCode() {
/* 3 */             return this.I000l1.hashCode();
                }
            }
