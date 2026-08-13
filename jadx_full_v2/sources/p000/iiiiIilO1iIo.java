            package p000;
            
            public final class iiiiIilO1iIo implements iilO1lOO {
                public int I0000O;

                @Override
                public final Class annotationType() {
/* 1 */             return iilO1lOO.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof iilO1lOO)) {
/* 33 */                return false;
                    }
/* 9 */             iilO1lOO iilo1loo = (iilO1lOO) obj;
                    return this.I0000O == iilo1loo.zza() && iilIoo01O.I00iOIl.equals(iilo1loo.zzb());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.I0000O ^ 14552422) + (iilIoo01O.I00iOIl.hashCode() ^ 2041407134);
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.I0000O + "intEncoding=" + iilIoo01O.I00iOIl + ')';
                }

                @Override
                public final int zza() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final iilIoo01O zzb() {
/* 1 */             return iilIoo01O.I00iOIl;
                }
            }
