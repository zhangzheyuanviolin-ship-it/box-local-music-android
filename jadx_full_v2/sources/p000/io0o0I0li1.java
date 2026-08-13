            package p000;
            
            public final class io0o0I0li1 implements io1o0ol {
                public int I0000O;

                @Override
                public final Class annotationType() {
/* 1 */             return io1o0ol.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof io1o0ol)) {
/* 33 */                return false;
                    }
/* 9 */             io1o0ol io1o0olVar = (io1o0ol) obj;
                    return this.I0000O == io1o0olVar.zza() && io1iloIIiOol.I00iOIl.equals(io1o0olVar.zzb());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.I0000O ^ 14552422) + (io1iloIIiOol.I00iOIl.hashCode() ^ 2041407134);
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.I0000O + "intEncoding=" + io1iloIIiOol.I00iOIl + ')';
                }

                @Override
                public final int zza() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final io1iloIIiOol zzb() {
/* 1 */             return io1iloIIiOol.I00iOIl;
                }
            }
