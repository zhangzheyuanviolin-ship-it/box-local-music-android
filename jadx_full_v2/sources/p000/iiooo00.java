            package p000;
            
            public final class iiooo00 implements il0iOo0oII10 {
                public int I0000O;

                @Override
                public final Class annotationType() {
/* 1 */             return il0iOo0oII10.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof il0iOo0oII10)) {
/* 33 */                return false;
                    }
/* 9 */             il0iOo0oII10 il0ioo0oii10 = (il0iOo0oII10) obj;
                    return this.I0000O == il0ioo0oii10.zza() && il0OlIOI.I00iOIl.equals(il0ioo0oii10.zzb());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.I0000O ^ 14552422) + (il0OlIOI.I00iOIl.hashCode() ^ 2041407134);
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.I0000O + "intEncoding=" + il0OlIOI.I00iOIl + ')';
                }

                @Override
                public final int zza() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final il0OlIOI zzb() {
/* 1 */             return il0OlIOI.I00iOIl;
                }
            }
