            package p000;
            
            public final class ii100liOOI0 implements iiI1iio {
                public int I0000O;

                @Override
                public final Class annotationType() {
/* 1 */             return iiI1iio.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof iiI1iio)) {
/* 33 */                return false;
                    }
/* 9 */             iiI1iio iii1iio = (iiI1iio) obj;
                    return this.I0000O == iii1iio.zza() && ii1ll1l.I00iOIl.equals(iii1iio.zzb());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.I0000O ^ 14552422) + (ii1ll1l.I00iOIl.hashCode() ^ 2041407134);
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.I0000O + "intEncoding=" + ii1ll1l.I00iOIl + ')';
                }

                @Override
                public final int zza() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final ii1ll1l zzb() {
/* 1 */             return ii1ll1l.I00iOIl;
                }
            }
