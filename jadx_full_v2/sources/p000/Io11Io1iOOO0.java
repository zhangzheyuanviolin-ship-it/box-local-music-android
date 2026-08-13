            package p000;

            import java.lang.reflect.Type;
            import java.lang.reflect.WildcardType;
            import java.util.Objects;
            
            public final class Io11Io1iOOO0 implements WildcardType {
                public final int I00iOIl;
                public final Type I00iiI;
                public final Type I00iiO;

                public Io11Io1iOOO0(Type[] typeArr, Type[] typeArr2, int i) {
/* 1 */             this.I00iOIl = i;
                    switch (i) {
                        case 1:
/* 90 */                    int length = typeArr2.length;
/* 91 */                    if (length > 1) {
/* 152 */                       I000II.I000iOII("At most one lower bound is supported");
/* 155 */                       throw null;
                            }
/* 94 */                    if (typeArr.length != 1) {
/* 148 */                       I000II.I000iOII("Exactly one upper bound must be specified");
/* 151 */                       throw null;
                            }
/* 96 */                    if (length != 1) {
/* 129 */                       Objects.requireNonNull(typeArr[0]);
/* 134 */                       iO1lo1I1iI.I0000oI00(typeArr[0]);
/* 137 */                       this.I00iiO = null;
/* 145 */                       this.I00iiI = iO1lo1I1iI.I00000oIO(typeArr[0]);
/* 147 */                       return;
                            }
/* 100 */                   Objects.requireNonNull(typeArr2[0]);
/* 105 */                   iO1lo1I1iI.I0000oI00(typeArr2[0]);
/* 110 */                   if (typeArr[0] != Object.class) {
/* 123 */                       I000II.I000iOII("When lower bound is specified, upper bound must be Object");
/* 126 */                       throw null;
                            }
/* 118 */                   this.I00iiO = iO1lo1I1iI.I00000oIO(typeArr2[0]);
/* 120 */                   this.I00iiI = Object.class;
/* 147 */                   return;
                        default:
/* 21 */                    if (typeArr2.length > 1) {
/* 83 */                        I000II.I000iOII("At most one lower bound is supported");
/* 86 */                        throw null;
                            }
/* 24 */                    if (typeArr.length != 1) {
/* 79 */                        I000II.I000iOII("Exactly one upper bound must be specified");
/* 82 */                        throw null;
                            }
/* 27 */                    if (typeArr2.length != 1) {
/* 60 */                        Objects.requireNonNull(typeArr[0]);
/* 65 */                        iIllolOO.I00000oOI(typeArr[0]);
/* 68 */                        this.I00iiO = null;
/* 76 */                        this.I00iiI = iIllolOO.I00000oIO(typeArr[0]);
/* 78 */                        return;
                            }
/* 31 */                    Objects.requireNonNull(typeArr2[0]);
/* 36 */                    iIllolOO.I00000oOI(typeArr2[0]);
/* 41 */                    if (typeArr[0] != Object.class) {
/* 54 */                        I000II.I000iOII("When lower bound is specified, upper bound must be Object");
/* 57 */                        throw null;
                            }
/* 49 */                    this.I00iiO = iIllolOO.I00000oIO(typeArr2[0]);
/* 51 */                    this.I00iiI = Object.class;
/* 78 */                    return;
                    }
                }

                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    if ((obj instanceof WildcardType) && iIllolOO.I0000Il00O(this, (WildcardType) obj)) {
                                break;
                            }
                            break;
                        default:
/* 10 */                    if ((obj instanceof WildcardType) && iO1lo1I1iI.I0000Il00O(this, (WildcardType) obj)) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Type[] getLowerBounds() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             Type type = this.I00iiO;
                    switch (i) {
                        case 0:
                            return type != null ? new Type[]{type} : iIllolOO.I00000oIO;
                        default:
                            return type != null ? new Type[]{type} : iO1lo1I1iI.I00000oIO;
                    }
                }

                @Override
                public final Type[] getUpperBounds() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             Type type = this.I00iiI;
                    switch (i) {
                        case 0:
/* 15 */                    return new Type[]{type};
                        default:
/* 10 */                    return new Type[]{type};
                    }
                }

                public final int hashCode() {
                    int iHashCode;
                    int iHashCode2;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Type type = this.I00iiI;
/* 6 */             Type type2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 33 */                    iHashCode = type2 != null ? type2.hashCode() + 31 : 1;
/* 35 */                    iHashCode2 = type.hashCode();
                            break;
                        default:
/* 17 */                    iHashCode = type2 != null ? type2.hashCode() + 31 : 1;
/* 19 */                    iHashCode2 = type.hashCode();
                            break;
                    }
/* 25 */            return (iHashCode2 + 31) ^ iHashCode;
                }

                public final String toString() {
/* 1 */             int i = this.I00iOIl;
/* 9 */             Type type = this.I00iiI;
/* 13 */            Type type2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 49 */                    if (type2 != null) {
/* 63 */                        return "? super " + iIllolOO.I000O01llI0(type2);
                            }
/* 68 */                    if (type == Object.class) {
/* 5 */                         return "?";
                            }
/* 83 */                    return "? extends " + iIllolOO.I000O01llI0(type);
                        default:
                            return type2 != null ? "? super ".concat(String.valueOf(iO1lo1I1iI.I0000O(type2))) : type == Object.class ? "?" : "? extends ".concat(String.valueOf(iO1lo1I1iI.I0000O(type)));
                    }
                }
            }
