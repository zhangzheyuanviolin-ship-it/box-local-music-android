            package p000;

            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.Type;
            import java.util.Objects;
            
            public final class Io11IIoOI implements GenericArrayType {
                public final int I00iOIl;
                public final Type I00iiI;

                public Io11IIoOI(Type type, int i) {
/* 1 */             this.I00iOIl = i;
                    switch (i) {
                        case 1:
/* 22 */                    Objects.requireNonNull(type);
/* 29 */                    this.I00iiI = iO1lo1I1iI.I00000oIO(type);
                            break;
                        default:
/* 9 */                     Objects.requireNonNull(type);
/* 16 */                    this.I00iiI = iIllolOO.I00000oIO(type);
                            break;
                    }
                }

                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    if ((obj instanceof GenericArrayType) && iIllolOO.I0000Il00O(this, (GenericArrayType) obj)) {
                                break;
                            }
                            break;
                        default:
/* 10 */                    if ((obj instanceof GenericArrayType) && iO1lo1I1iI.I0000Il00O(this, (GenericArrayType) obj)) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Type getGenericComponentType() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iiI;
                }

                public final int hashCode() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.hashCode();
                }

                public final String toString() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             Type type = this.I00iiI;
                    switch (i) {
                        case 0:
/* 38 */                    return iIllolOO.I000O01llI0(type) + "[]";
                        default:
/* 18 */                    return String.valueOf(iO1lo1I1iI.I0000O(type)).concat("[]");
                    }
                }
            }
