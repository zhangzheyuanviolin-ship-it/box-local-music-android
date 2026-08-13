            package p000;

            import java.lang.reflect.Modifier;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.Arrays;
            import java.util.Objects;
            
            public final class Io11IlI10ill implements ParameterizedType {
                public final int I00iOIl;
                public final Type I00iiI;
                public final Type I00iiO;
                public final Type[] I00iio;

                public Io11IlI10ill(Type type, Class cls, Type[] typeArr, int i) {
/* 1 */             this.I00iOIl = i;
/* 5 */             int i2 = 0;
                    switch (i) {
                        case 1:
/* 96 */                    Objects.requireNonNull(cls);
/* 99 */                    if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
/* 126 */                       I000II.I000iOII("Must specify owner type for ".concat(String.valueOf(cls)));
/* 129 */                       throw null;
                            }
/* 137 */                   this.I00iiI = type != null ? iO1lo1I1iI.I00000oIO(type) : null;
/* 143 */                   this.I00iiO = iO1lo1I1iI.I00000oIO(cls);
/* 149 */                   Type[] typeArr2 = (Type[]) typeArr.clone();
/* 151 */                   this.I00iio = typeArr2;
/* 153 */                   int length = typeArr2.length;
/* 154 */                   while (i2 < length) {
/* 160 */                       Objects.requireNonNull(this.I00iio[i2]);
/* 167 */                       iO1lo1I1iI.I0000oI00(this.I00iio[i2]);
/* 170 */                       Type[] typeArr3 = this.I00iio;
/* 178 */                       typeArr3[i2] = iO1lo1I1iI.I00000oIO(typeArr3[i2]);
/* 180 */                       i2++;
                            }
/* 183 */                   return;
                        default:
/* 13 */                    Objects.requireNonNull(cls);
/* 16 */                    if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
/* 35 */                        IioIoO10iOiI.I000OiO("Must specify owner type for ", cls);
/* 38 */                        throw null;
                            }
/* 46 */                    this.I00iiI = type != null ? iIllolOO.I00000oIO(type) : null;
/* 52 */                    this.I00iiO = iIllolOO.I00000oIO(cls);
/* 58 */                    Type[] typeArr4 = (Type[]) typeArr.clone();
/* 60 */                    this.I00iio = typeArr4;
/* 62 */                    int length2 = typeArr4.length;
/* 63 */                    while (i2 < length2) {
/* 69 */                        Objects.requireNonNull(this.I00iio[i2]);
/* 76 */                        iIllolOO.I00000oOI(this.I00iio[i2]);
/* 79 */                        Type[] typeArr5 = this.I00iio;
/* 87 */                        typeArr5[i2] = iIllolOO.I00000oIO(typeArr5[i2]);
/* 89 */                        i2++;
                            }
/* 92 */                    return;
                    }
                }

                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    if ((obj instanceof ParameterizedType) && iIllolOO.I0000Il00O(this, (ParameterizedType) obj)) {
                                break;
                            }
                            break;
                        default:
/* 10 */                    if ((obj instanceof ParameterizedType) && iO1lo1I1iI.I0000Il00O(this, (ParameterizedType) obj)) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Type[] getActualTypeArguments() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Type[] typeArr = this.I00iio;
                    switch (i) {
                    }
/* 12 */            return (Type[]) typeArr.clone();
                }

                @Override
                public final Type getOwnerType() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iiI;
                }

                @Override
                public final Type getRawType() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iiO;
                }

                public final int hashCode() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Type type = this.I00iiI;
/* 6 */             Type[] typeArr = this.I00iio;
/* 8 */             Type type2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 45 */                    return (type2.hashCode() ^ Arrays.hashCode(typeArr)) ^ (type != null ? type.hashCode() : 0);
                        default:
/* 28 */                    return (type2.hashCode() ^ Arrays.hashCode(typeArr)) ^ (type != null ? type.hashCode() : 0);
                    }
                }

                public final String toString() {
/* 1 */             int i = this.I00iOIl;
/* 10 */            Type[] typeArr = this.I00iio;
/* 12 */            int i2 = 1;
/* 13 */            Type type = this.I00iiO;
                    switch (i) {
                        case 0:
/* 79 */                    int length = typeArr.length;
/* 80 */                    if (length == 0) {
/* 82 */                        return iIllolOO.I000O01llI0(type);
                            }
/* 93 */                    StringBuilder sb = new StringBuilder((length + 1) * 30);
/* 100 */                   sb.append(iIllolOO.I000O01llI0(type));
/* 103 */                   sb.append("<");
/* 112 */                   sb.append(iIllolOO.I000O01llI0(typeArr[0]));
/* 115 */                   while (i2 < length) {
/* 117 */                       sb.append(", ");
/* 126 */                       sb.append(iIllolOO.I000O01llI0(typeArr[i2]));
/* 129 */                       i2++;
                            }
/* 132 */                   sb.append(">");
/* 135 */                   return sb.toString();
                        default:
/* 18 */                    int length2 = typeArr.length;
/* 19 */                    if (length2 == 0) {
/* 21 */                        return iO1lo1I1iI.I0000O(type);
                            }
/* 32 */                    StringBuilder sb2 = new StringBuilder((length2 + 1) * 30);
/* 39 */                    sb2.append(iO1lo1I1iI.I0000O(type));
/* 42 */                    sb2.append("<");
/* 51 */                    sb2.append(iO1lo1I1iI.I0000O(typeArr[0]));
/* 54 */                    while (i2 < length2) {
/* 56 */                        sb2.append(", ");
/* 65 */                        sb2.append(iO1lo1I1iI.I0000O(typeArr[i2]));
/* 68 */                        i2++;
                            }
/* 71 */                    sb2.append(">");
/* 74 */                    return sb2.toString();
                    }
                }
            }
