            package p000;
            
            public final class I1Ool1110li implements OOi1lOi {
                public int I0000O;

                @Override
                public final Class annotationType() {
/* 1 */             return OOi1lOi.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof OOi1lOi)) {
/* 33 */                return false;
                    }
/* 9 */             OOi1lOi oOi1lOi = (OOi1lOi) obj;
                    return this.I0000O == oOi1lOi.tag() && OOi1ilOOi.I00iOIl.equals(oOi1lOi.intEncoding());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.I0000O ^ 14552422) + (OOi1ilOOi.I00iOIl.hashCode() ^ 2041407134);
                }

                @Override
                public final OOi1ilOOi intEncoding() {
/* 1 */             return OOi1ilOOi.I00iOIl;
                }

                @Override
                public final int tag() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.I0000O + "intEncoding=" + OOi1ilOOi.I00iOIl + ')';
                }
            }
