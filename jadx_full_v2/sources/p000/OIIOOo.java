            package p000;

            import android.net.NetworkRequest;
            
            public final class OIIOOo {
                public static final String I00000oOI = IIi0oIl.I000OiO("NetworkRequestCompat");
                public final Object I00000oIO;

                public OIIOOo(NetworkRequest networkRequest) {
/* 4 */             this.I00000oIO = networkRequest;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OIIOOo) && O0000Ioio00.I0000O(this.I00000oIO, ((OIIOOo) obj).I00000oIO);
                }

                public final int hashCode() {
/* 1 */             Object obj = this.I00000oIO;
/* 3 */             if (obj == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return obj.hashCode();
                }

                public final String toString() {
/* 18 */            return "NetworkRequestCompat(wrapped=" + this.I00000oIO + ')';
                }
            }
