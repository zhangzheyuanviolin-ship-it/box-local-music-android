            package p000;
            
            public final class lioll0I0i1 implements ll0I1l0 {
                public int I0000O;

                @Override
                public final Class annotationType() {
/* 1 */             return ll0I1l0.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof ll0I1l0)) {
/* 33 */                return false;
                    }
/* 9 */             ll0I1l0 ll0i1l0 = (ll0I1l0) obj;
                    return this.I0000O == ll0i1l0.zza() && ll01ll.I00iOIl.equals(ll0i1l0.zzb());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.I0000O ^ 14552422) + (ll01ll.I00iOIl.hashCode() ^ 2041407134);
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.I0000O + "intEncoding=" + ll01ll.I00iOIl + ')';
                }

                @Override
                public final int zza() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final ll01ll zzb() {
/* 1 */             return ll01ll.I00iOIl;
                }
            }
