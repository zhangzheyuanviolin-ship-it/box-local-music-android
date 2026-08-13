            package p000;
            
            public final class il0I01IoO0I implements il0o1iIIol {
                public int I0000O;

                @Override
                public final Class annotationType() {
/* 1 */             return il0o1iIIol.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof il0o1iIIol)) {
/* 33 */                return false;
                    }
/* 9 */             il0o1iIIol il0o1iiiol = (il0o1iIIol) obj;
                    return this.I0000O == il0o1iiiol.zza() && il0li1O11OI0.I00iOIl.equals(il0o1iiiol.zzb());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.I0000O ^ 14552422) + (il0li1O11OI0.I00iOIl.hashCode() ^ 2041407134);
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.I0000O + "intEncoding=" + il0li1O11OI0.I00iOIl + ')';
                }

                @Override
                public final int zza() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final il0li1O11OI0 zzb() {
/* 1 */             return il0li1O11OI0.I00iOIl;
                }
            }
