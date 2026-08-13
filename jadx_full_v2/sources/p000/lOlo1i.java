            package p000;
            
            public final class lOlo1i implements lOoOIlIlIO {
                public int I0000O;

                @Override
                public final Class annotationType() {
/* 1 */             return lOoOIlIlIO.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof lOoOIlIlIO)) {
/* 33 */                return false;
                    }
/* 9 */             lOoOIlIlIO loooililio = (lOoOIlIlIO) obj;
                    return this.I0000O == loooililio.zza() && lOoI1o0.I00iOIl.equals(loooililio.zzb());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.I0000O ^ 14552422) + (lOoI1o0.I00iOIl.hashCode() ^ 2041407134);
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.I0000O + "intEncoding=" + lOoI1o0.I00iOIl + ')';
                }

                @Override
                public final int zza() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final lOoI1o0 zzb() {
/* 1 */             return lOoI1o0.I00iOIl;
                }
            }
