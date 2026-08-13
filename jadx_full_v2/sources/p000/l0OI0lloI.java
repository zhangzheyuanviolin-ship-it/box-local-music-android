            package p000;
            
            public final class l0OI0lloI implements l0i0OoiiiI1 {
                public int I0000O;

                @Override
                public final Class annotationType() {
/* 1 */             return l0i0OoiiiI1.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof l0i0OoiiiI1)) {
/* 33 */                return false;
                    }
/* 9 */             l0i0OoiiiI1 l0i0ooiiii1 = (l0i0OoiiiI1) obj;
                    return this.I0000O == l0i0ooiiii1.zza() && l0OoOooo.I00iOIl.equals(l0i0ooiiii1.zzb());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.I0000O ^ 14552422) + (l0OoOooo.I00iOIl.hashCode() ^ 2041407134);
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.I0000O + "intEncoding=" + l0OoOooo.I00iOIl + ')';
                }

                @Override
                public final int zza() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final l0OoOooo zzb() {
/* 1 */             return l0OoOooo.I00iOIl;
                }
            }
