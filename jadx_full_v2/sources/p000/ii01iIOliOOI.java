            package p000;

            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
            public final class ii01iIOliOOI implements Map, Serializable {
                public final int I00iOIl;
                public transient Object[] I00iiI;
                public transient AbstractCollection I00iiO;
                public transient AbstractCollection I00iio;
                public transient AbstractCollection I00ilI0I1;

                public ii01iIOliOOI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void clear() {
                    switch (this.I00iOIl) {
                        case 0:
/* 53 */                    throw new UnsupportedOperationException();
                        case 1:
/* 47 */                    throw new UnsupportedOperationException();
                        case 2:
/* 41 */                    throw new UnsupportedOperationException();
                        case 3:
/* 35 */                    throw new UnsupportedOperationException();
                        case 4:
/* 29 */                    throw new UnsupportedOperationException();
                        case 5:
/* 23 */                    throw new UnsupportedOperationException();
                        case 6:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final boolean containsKey(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 80 */                    if (get(obj) != null) {
                            }
                            break;
                        case 1:
/* 70 */                    if (get(obj) != null) {
                            }
                            break;
                        case 2:
/* 60 */                    if (get(obj) != null) {
                            }
                            break;
                        case 3:
/* 50 */                    if (get(obj) != null) {
                            }
                            break;
                        case 4:
/* 40 */                    if (get(obj) != null) {
                            }
                            break;
                        case 5:
/* 30 */                    if (get(obj) != null) {
                            }
                            break;
                        case 6:
/* 20 */                    if (get(obj) != null) {
                            }
                            break;
                        default:
/* 10 */                    if (get(obj) != null) {
                            }
                            break;
                    }
/* 14 */            return false;
                }

                @Override
                public final boolean containsValue(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 149 */                   ii00lIii10 ii00liii10 = (ii00lIii10) this.I00ilI0I1;
/* 151 */                   if (ii00liii10 == null) {
/* 157 */                       ii00liii10 = new ii00lIii10(this.I00iiI, 1);
/* 160 */                       this.I00ilI0I1 = ii00liii10;
                            }
/* 162 */                   return ii00liii10.contains(obj);
                        case 1:
/* 129 */                   ii1IOlol1 ii1iolol1 = (ii1IOlol1) this.I00ilI0I1;
/* 131 */                   if (ii1iolol1 == null) {
/* 137 */                       ii1iolol1 = new ii1IOlol1(this.I00iiI, 1);
/* 140 */                       this.I00ilI0I1 = ii1iolol1;
                            }
/* 142 */                   return ii1iolol1.contains(obj);
                        case 2:
/* 109 */                   iiIllO iiillo = (iiIllO) this.I00ilI0I1;
/* 111 */                   if (iiillo == null) {
/* 117 */                       iiillo = new iiIllO(this.I00iiI, 1);
/* 120 */                       this.I00ilI0I1 = iiillo;
                            }
/* 122 */                   return iiillo.contains(obj);
                        case 3:
/* 89 */                    iilolO0oO1 iilolo0oo1 = (iilolO0oO1) this.I00ilI0I1;
/* 91 */                    if (iilolo0oo1 == null) {
/* 97 */                        iilolo0oo1 = new iilolO0oO1(this.I00iiI, 1);
/* 100 */                       this.I00ilI0I1 = iilolo0oo1;
                            }
/* 102 */                   return iilolo0oo1.contains(obj);
                        case 4:
/* 69 */                    iio0oIio1Oo1 iio0oiio1oo1 = (iio0oIio1Oo1) this.I00ilI0I1;
/* 71 */                    if (iio0oiio1oo1 == null) {
/* 77 */                        iio0oiio1oo1 = new iio0oIio1Oo1(this.I00iiI, 1);
/* 80 */                        this.I00ilI0I1 = iio0oiio1oo1;
                            }
/* 82 */                    return iio0oiio1oo1.contains(obj);
                        case 5:
/* 49 */                    ilIol1o iliol1o = (ilIol1o) this.I00ilI0I1;
/* 51 */                    if (iliol1o == null) {
/* 57 */                        iliol1o = new ilIol1o(this.I00iiI, 1);
/* 60 */                        this.I00ilI0I1 = iliol1o;
                            }
/* 62 */                    return iliol1o.contains(obj);
                        case 6:
/* 29 */                    lIlIloOo lililooo = (lIlIloOo) this.I00ilI0I1;
/* 31 */                    if (lililooo == null) {
/* 37 */                        lililooo = new lIlIloOo(this.I00iiI, 1);
/* 40 */                        this.I00ilI0I1 = lililooo;
                            }
/* 42 */                    return lililooo.contains(obj);
                        default:
/* 9 */                     o0oIIlOOl1 o0oiilool1 = (o0oIIlOOl1) this.I00ilI0I1;
/* 11 */                    if (o0oiilool1 == null) {
/* 17 */                        o0oiilool1 = new o0oIIlOOl1(this.I00iiI, 1);
/* 20 */                        this.I00ilI0I1 = o0oiilool1;
                            }
/* 22 */                    return o0oiilool1.contains(obj);
                    }
                }

                /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v18, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v22, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v26, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Serializable, java.lang.Object[]] */
                @Override
                public final Set entrySet() {
/* 3 */             int i = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 126 */                   iOoi10 iooi10 = (iOoi10) this.I00iiO;
/* 128 */                   if (iooi10 != null) {
/* 140 */                       return iooi10;
                            }
/* 134 */                   iOoi10 iooi102 = new iOoi10(this, this.I00iiI, 0);
/* 137 */                   this.I00iiO = iooi102;
/* 139 */                   return iooi102;
                        case 1:
/* 109 */                   ii101lO ii101lo = (ii101lO) this.I00iiO;
/* 111 */                   if (ii101lo != null) {
/* 123 */                       return ii101lo;
                            }
/* 117 */                   ii101lO ii101lo2 = new ii101lO(this, this.I00iiI, i);
/* 120 */                   this.I00iiO = ii101lo2;
/* 122 */                   return ii101lo2;
                        case 2:
/* 92 */                    iiIIO0lOllo1 iiiio0lollo1 = (iiIIO0lOllo1) this.I00iiO;
/* 94 */                    if (iiiio0lollo1 != null) {
/* 106 */                       return iiiio0lollo1;
                            }
/* 100 */                   iiIIO0lOllo1 iiiio0lollo12 = new iiIIO0lOllo1(this, this.I00iiI, i);
/* 103 */                   this.I00iiO = iiiio0lollo12;
/* 105 */                   return iiiio0lollo12;
                        case 3:
/* 76 */                    iiliIl0lo iiliil0lo = (iiliIl0lo) this.I00iiO;
/* 78 */                    if (iiliil0lo != null) {
/* 89 */                        return iiliil0lo;
                            }
/* 84 */                    iiliIl0lo iiliil0lo2 = new iiliIl0lo(this, this.I00iiI, i);
/* 87 */                    this.I00iiO = iiliil0lo2;
/* 89 */                    return iiliil0lo2;
                        case 4:
/* 59 */                    iilo1IOIoli1 iilo1ioioli1 = (iilo1IOIoli1) this.I00iiO;
/* 61 */                    if (iilo1ioioli1 != null) {
/* 73 */                        return iilo1ioioli1;
                            }
/* 67 */                    iilo1IOIoli1 iilo1ioioli12 = new iilo1IOIoli1(this, this.I00iiI, i);
/* 70 */                    this.I00iiO = iilo1ioioli12;
/* 72 */                    return iilo1ioioli12;
                        case 5:
/* 42 */                    ilIioOloollI iliiooloolli = (ilIioOloollI) this.I00iiO;
/* 44 */                    if (iliiooloolli != null) {
/* 56 */                        return iliiooloolli;
                            }
/* 50 */                    ilIioOloollI iliiooloolli2 = new ilIioOloollI(this, this.I00iiI, 0);
/* 53 */                    this.I00iiO = iliiooloolli2;
/* 55 */                    return iliiooloolli2;
                        case 6:
/* 25 */                    lIioooi0O liioooi0o = (lIioooi0O) this.I00iiO;
/* 27 */                    if (liioooi0o != null) {
/* 39 */                        return liioooi0o;
                            }
/* 33 */                    lIioooi0O liioooi0o2 = new lIioooi0O(this, this.I00iiI, i);
/* 36 */                    this.I00iiO = liioooi0o2;
/* 38 */                    return liioooi0o2;
                        default:
/* 9 */                     o0Il1iI0il o0il1ii0il = (o0Il1iI0il) this.I00iiO;
/* 11 */                    if (o0il1ii0il != null) {
/* 22 */                        return o0il1ii0il;
                            }
/* 17 */                    o0Il1iI0il o0il1ii0il2 = new o0Il1iI0il(this, this.I00iiI, 0);
/* 20 */                    this.I00iiO = o0il1ii0il2;
/* 22 */                    return o0il1ii0il2;
                    }
                }

                @Override
                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 176 */                   if (this != obj) {
/* 182 */                       if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 1:
/* 152 */                   if (this != obj) {
/* 158 */                       if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 2:
/* 128 */                   if (this != obj) {
/* 134 */                       if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 3:
/* 104 */                   if (this != obj) {
/* 110 */                       if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 4:
/* 80 */                    if (this != obj) {
/* 86 */                        if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 5:
/* 56 */                    if (this != obj) {
/* 62 */                        if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 6:
/* 32 */                    if (this != obj) {
/* 38 */                        if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        default:
/* 8 */                     if (this != obj) {
/* 14 */                        if (obj instanceof Map) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                    }
/* 27 */            return entrySet().equals(((Map) obj).entrySet());
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get(Object obj) {
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    Object obj5;
                    Object obj6;
                    Object obj7;
                    Object obj8;
                    Object obj9;
                    switch (this.I00iOIl) {
                        case 0:
/* 198 */                   if (obj == null) {
/* 200 */                       obj2 = null;
                            } else {
/* 202 */                       Object[] objArr = this.I00iiI;
/* 204 */                       Object obj10 = objArr[0];
/* 206 */                       Objects.requireNonNull(obj10);
/* 213 */                       if (obj10.equals(obj)) {
/* 215 */                           obj2 = objArr[1];
/* 217 */                           Objects.requireNonNull(obj2);
                                }
                            }
/* 220 */                   if (obj2 == null) {
/* 4 */                         return null;
                            }
/* 223 */                   return obj2;
                        case 1:
/* 171 */                   if (obj == null) {
/* 173 */                       obj3 = null;
                            } else {
/* 175 */                       Object[] objArr2 = this.I00iiI;
/* 177 */                       Object obj11 = objArr2[0];
/* 179 */                       Objects.requireNonNull(obj11);
/* 186 */                       if (obj11.equals(obj)) {
/* 188 */                           obj3 = objArr2[1];
/* 190 */                           Objects.requireNonNull(obj3);
                                }
                            }
/* 193 */                   if (obj3 == null) {
/* 4 */                         return null;
                            }
/* 196 */                   return obj3;
                        case 2:
/* 144 */                   if (obj == null) {
/* 146 */                       obj4 = null;
                            } else {
/* 148 */                       Object[] objArr3 = this.I00iiI;
/* 150 */                       Object obj12 = objArr3[0];
/* 152 */                       obj12.getClass();
/* 159 */                       if (obj12.equals(obj)) {
/* 161 */                           obj4 = objArr3[1];
/* 163 */                           obj4.getClass();
                                }
                            }
/* 166 */                   if (obj4 == null) {
/* 4 */                         return null;
                            }
/* 169 */                   return obj4;
                        case 3:
/* 117 */                   Object[] objArr4 = this.I00iiI;
/* 119 */                   if (obj == null) {
/* 121 */                       obj5 = null;
                            } else {
/* 123 */                       Object obj13 = objArr4[0];
/* 125 */                       obj13.getClass();
/* 132 */                       if (obj13.equals(obj)) {
/* 134 */                           obj5 = objArr4[1];
/* 136 */                           obj5.getClass();
                                }
                            }
/* 139 */                   if (obj5 == null) {
/* 4 */                         return null;
                            }
/* 142 */                   return obj5;
                        case 4:
/* 90 */                    if (obj == null) {
/* 92 */                        obj6 = null;
                            } else {
/* 94 */                        Object[] objArr5 = this.I00iiI;
/* 96 */                        Object obj14 = objArr5[0];
/* 98 */                        Objects.requireNonNull(obj14);
/* 105 */                       if (obj14.equals(obj)) {
/* 107 */                           obj6 = objArr5[1];
/* 109 */                           Objects.requireNonNull(obj6);
                                }
                            }
/* 112 */                   if (obj6 == null) {
/* 4 */                         return null;
                            }
/* 115 */                   return obj6;
                        case 5:
/* 63 */                    if (obj == null) {
/* 65 */                        obj7 = null;
                            } else {
/* 67 */                        Object[] objArr6 = this.I00iiI;
/* 69 */                        Object obj15 = objArr6[0];
/* 71 */                        Objects.requireNonNull(obj15);
/* 78 */                        if (obj15.equals(obj)) {
/* 80 */                            obj7 = objArr6[1];
/* 82 */                            Objects.requireNonNull(obj7);
                                }
                            }
/* 85 */                    if (obj7 == null) {
/* 4 */                         return null;
                            }
/* 88 */                    return obj7;
                        case 6:
/* 36 */                    if (obj == null) {
/* 38 */                        obj8 = null;
                            } else {
/* 40 */                        Object[] objArr7 = this.I00iiI;
/* 42 */                        Object obj16 = objArr7[0];
/* 44 */                        Objects.requireNonNull(obj16);
/* 51 */                        if (obj16.equals(obj)) {
/* 53 */                            obj8 = objArr7[1];
/* 55 */                            Objects.requireNonNull(obj8);
                                }
                            }
/* 58 */                    if (obj8 == null) {
/* 4 */                         return null;
                            }
/* 61 */                    return obj8;
                        default:
/* 9 */                     Object[] objArr8 = this.I00iiI;
/* 11 */                    if (obj == null) {
/* 13 */                        obj9 = null;
                            } else {
/* 15 */                        Object obj17 = objArr8[0];
/* 17 */                        obj17.getClass();
/* 24 */                        if (obj17.equals(obj)) {
/* 26 */                            obj9 = objArr8[1];
/* 28 */                            obj9.getClass();
                                }
                            }
/* 31 */                    if (obj9 == null) {
/* 4 */                         return null;
                            }
/* 34 */                    return obj9;
                    }
                }

                @Override
                public final Object getOrDefault(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 62 */                    Object obj3 = get(obj);
                            return obj3 != null ? obj3 : obj2;
                        case 1:
/* 54 */                    Object obj4 = get(obj);
                            return obj4 != null ? obj4 : obj2;
                        case 2:
/* 46 */                    Object obj5 = get(obj);
                            return obj5 != null ? obj5 : obj2;
                        case 3:
/* 38 */                    Object obj6 = get(obj);
                            return obj6 != null ? obj6 : obj2;
                        case 4:
/* 30 */                    Object obj7 = get(obj);
                            return obj7 != null ? obj7 : obj2;
                        case 5:
/* 22 */                    Object obj8 = get(obj);
                            return obj8 != null ? obj8 : obj2;
                        case 6:
/* 14 */                    Object obj9 = get(obj);
                            return obj9 != null ? obj9 : obj2;
                        default:
/* 6 */                     Object obj10 = get(obj);
                            return obj10 != null ? obj10 : obj2;
                    }
                }

                /* JADX WARN: Type inference failed for: r0v15, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v23, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v38, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v43, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v51, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r2v23, types: [java.io.Serializable, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r2v42, types: [java.io.Serializable, java.lang.Object[]] */
                @Override
                public final int hashCode() {
/* 3 */             int i = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 280 */                   iOoi10 iooi10 = (iOoi10) this.I00iiO;
/* 282 */                   if (iooi10 == null) {
/* 288 */                       iOoi10 iooi102 = new iOoi10(this, this.I00iiI, 0);
/* 291 */                       this.I00iiO = iooi102;
/* 293 */                       iooi10 = iooi102;
                            }
/* 294 */                   Iterator it = iooi10.iterator();
/* 298 */                   int iHashCode = 0;
/* 303 */                   while (it.hasNext()) {
/* 305 */                       Object next = it.next();
/* 317 */                       iHashCode += next != null ? next.hashCode() : 0;
                            }
/* 319 */                   return iHashCode;
                        case 1:
/* 238 */                   ii101lO ii101lo = (ii101lO) this.I00iiO;
/* 240 */                   if (ii101lo == null) {
/* 246 */                       ii101lO ii101lo2 = new ii101lO(this, this.I00iiI, i);
/* 249 */                       this.I00iiO = ii101lo2;
/* 251 */                       ii101lo = ii101lo2;
                            }
/* 252 */                   Iterator it2 = ii101lo.iterator();
/* 256 */                   int iHashCode2 = 0;
/* 261 */                   while (it2.hasNext()) {
/* 263 */                       Object next2 = it2.next();
/* 275 */                       iHashCode2 += next2 != null ? next2.hashCode() : 0;
                            }
/* 277 */                   return iHashCode2;
                        case 2:
/* 196 */                   iiIIO0lOllo1 iiiio0lollo1 = (iiIIO0lOllo1) this.I00iiO;
/* 198 */                   if (iiiio0lollo1 == null) {
/* 204 */                       iiIIO0lOllo1 iiiio0lollo12 = new iiIIO0lOllo1(this, this.I00iiI, i);
/* 207 */                       this.I00iiO = iiiio0lollo12;
/* 209 */                       iiiio0lollo1 = iiiio0lollo12;
                            }
/* 210 */                   Iterator it3 = iiiio0lollo1.iterator();
/* 214 */                   int iHashCode3 = 0;
/* 219 */                   while (it3.hasNext()) {
/* 221 */                       Object next3 = it3.next();
/* 233 */                       iHashCode3 += next3 != null ? next3.hashCode() : 0;
                            }
/* 235 */                   return iHashCode3;
                        case 3:
/* 155 */                   iiliIl0lo iiliil0lo = (iiliIl0lo) this.I00iiO;
/* 157 */                   if (iiliil0lo == null) {
/* 163 */                       iiliil0lo = new iiliIl0lo(this, this.I00iiI, i);
/* 166 */                       this.I00iiO = iiliil0lo;
                            }
/* 168 */                   Iterator it4 = iiliil0lo.iterator();
/* 172 */                   int iHashCode4 = 0;
/* 177 */                   while (it4.hasNext()) {
/* 179 */                       Object next4 = it4.next();
/* 191 */                       iHashCode4 += next4 != null ? next4.hashCode() : 0;
                            }
/* 193 */                   return iHashCode4;
                        case 4:
/* 113 */                   iilo1IOIoli1 iilo1ioioli1 = (iilo1IOIoli1) this.I00iiO;
/* 115 */                   if (iilo1ioioli1 == null) {
/* 121 */                       iilo1IOIoli1 iilo1ioioli12 = new iilo1IOIoli1(this, this.I00iiI, i);
/* 124 */                       this.I00iiO = iilo1ioioli12;
/* 126 */                       iilo1ioioli1 = iilo1ioioli12;
                            }
/* 127 */                   Iterator it5 = iilo1ioioli1.iterator();
/* 131 */                   int iHashCode5 = 0;
/* 136 */                   while (it5.hasNext()) {
/* 138 */                       Object next5 = it5.next();
/* 150 */                       iHashCode5 += next5 != null ? next5.hashCode() : 0;
                            }
/* 152 */                   return iHashCode5;
                        case 5:
/* 92 */                    ilIioOloollI iliiooloolli = (ilIioOloollI) this.I00iiO;
/* 94 */                    if (iliiooloolli == null) {
/* 100 */                       ilIioOloollI iliiooloolli2 = new ilIioOloollI(this, this.I00iiI, 0);
/* 103 */                       this.I00iiO = iliiooloolli2;
/* 105 */                       iliiooloolli = iliiooloolli2;
                            }
/* 106 */                   return lilol10O.I00000oIO(iliiooloolli);
                        case 6:
/* 50 */                    lIioooi0O liioooi0o = (lIioooi0O) this.I00iiO;
/* 52 */                    if (liioooi0o == null) {
/* 58 */                        lIioooi0O liioooi0o2 = new lIioooi0O(this, this.I00iiI, i);
/* 61 */                        this.I00iiO = liioooi0o2;
/* 63 */                        liioooi0o = liioooi0o2;
                            }
/* 64 */                    Iterator it6 = liioooi0o.iterator();
/* 68 */                    int iHashCode6 = 0;
/* 73 */                    while (it6.hasNext()) {
/* 75 */                        Object next6 = it6.next();
/* 87 */                        iHashCode6 += next6 != null ? next6.hashCode() : 0;
                            }
/* 89 */                    return iHashCode6;
                        default:
/* 9 */                     o0Il1iI0il o0il1ii0il = (o0Il1iI0il) this.I00iiO;
/* 11 */                    if (o0il1ii0il == null) {
/* 17 */                        o0il1ii0il = new o0Il1iI0il(this, this.I00iiI, 0);
/* 20 */                        this.I00iiO = o0il1ii0il;
                            }
/* 22 */                    Iterator it7 = o0il1ii0il.iterator();
/* 26 */                    int iHashCode7 = 0;
/* 31 */                    while (it7.hasNext()) {
/* 33 */                        Object next7 = it7.next();
/* 45 */                        iHashCode7 += next7 != null ? next7.hashCode() : 0;
                            }
/* 47 */                    return iHashCode7;
                    }
                }

                @Override
                public final boolean isEmpty() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return false;
                }

                @Override
                public final Set keySet() {
/* 3 */             int i = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 164 */                   iOoi10 iooi10 = (iOoi10) this.I00iio;
/* 166 */                   if (iooi10 != null) {
/* 183 */                       return iooi10;
                            }
/* 177 */                   iOoi10 iooi102 = new iOoi10(this, new ii00lIii10(this.I00iiI, 0), 1);
/* 180 */                   this.I00iio = iooi102;
/* 182 */                   return iooi102;
                        case 1:
/* 142 */                   ii101lO ii101lo = (ii101lO) this.I00iio;
/* 144 */                   if (ii101lo != null) {
/* 161 */                       return ii101lo;
                            }
/* 155 */                   ii101lO ii101lo2 = new ii101lO(this, new ii1IOlol1(this.I00iiI, 0), i);
/* 158 */                   this.I00iio = ii101lo2;
/* 160 */                   return ii101lo2;
                        case 2:
/* 120 */                   iiIIO0lOllo1 iiiio0lollo1 = (iiIIO0lOllo1) this.I00iio;
/* 122 */                   if (iiiio0lollo1 != null) {
/* 139 */                       return iiiio0lollo1;
                            }
/* 133 */                   iiIIO0lOllo1 iiiio0lollo12 = new iiIIO0lOllo1(this, new iiIllO(this.I00iiI, 0), i);
/* 136 */                   this.I00iio = iiiio0lollo12;
/* 138 */                   return iiiio0lollo12;
                        case 3:
/* 98 */                    iiliIl0lo iiliil0lo = (iiliIl0lo) this.I00iio;
/* 100 */                   if (iiliil0lo != null) {
/* 117 */                       return iiliil0lo;
                            }
/* 111 */                   iiliIl0lo iiliil0lo2 = new iiliIl0lo(this, new iilolO0oO1(this.I00iiI, 0), i);
/* 114 */                   this.I00iio = iiliil0lo2;
/* 116 */                   return iiliil0lo2;
                        case 4:
/* 76 */                    iilo1IOIoli1 iilo1ioioli1 = (iilo1IOIoli1) this.I00iio;
/* 78 */                    if (iilo1ioioli1 != null) {
/* 95 */                        return iilo1ioioli1;
                            }
/* 89 */                    iilo1IOIoli1 iilo1ioioli12 = new iilo1IOIoli1(this, new iio0oIio1Oo1(this.I00iiI, 0), i);
/* 92 */                    this.I00iio = iilo1ioioli12;
/* 94 */                    return iilo1ioioli12;
                        case 5:
/* 54 */                    ilIioOloollI iliiooloolli = (ilIioOloollI) this.I00iio;
/* 56 */                    if (iliiooloolli != null) {
/* 73 */                        return iliiooloolli;
                            }
/* 67 */                    ilIioOloollI iliiooloolli2 = new ilIioOloollI(this, new ilIol1o(this.I00iiI, 0), 1);
/* 70 */                    this.I00iio = iliiooloolli2;
/* 72 */                    return iliiooloolli2;
                        case 6:
/* 32 */                    lIioooi0O liioooi0o = (lIioooi0O) this.I00iio;
/* 34 */                    if (liioooi0o != null) {
/* 51 */                        return liioooi0o;
                            }
/* 45 */                    lIioooi0O liioooi0o2 = new lIioooi0O(this, new lIlIloOo(this.I00iiI, 0), i);
/* 48 */                    this.I00iio = liioooi0o2;
/* 50 */                    return liioooi0o2;
                        default:
/* 10 */                    o0Il1iI0il o0il1ii0il = (o0Il1iI0il) this.I00iio;
/* 12 */                    if (o0il1ii0il != null) {
/* 29 */                        return o0il1ii0il;
                            }
/* 23 */                    o0Il1iI0il o0il1ii0il2 = new o0Il1iI0il(this, new o0oIIlOOl1(this.I00iiI, 0), 1);
/* 26 */                    this.I00iio = o0il1ii0il2;
/* 28 */                    return o0il1ii0il2;
                    }
                }

                @Override
                public final Object put(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 53 */                    throw new UnsupportedOperationException();
                        case 1:
/* 47 */                    throw new UnsupportedOperationException();
                        case 2:
/* 41 */                    throw new UnsupportedOperationException();
                        case 3:
/* 35 */                    throw new UnsupportedOperationException();
                        case 4:
/* 29 */                    throw new UnsupportedOperationException();
                        case 5:
/* 23 */                    throw new UnsupportedOperationException();
                        case 6:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final void putAll(Map map) {
                    switch (this.I00iOIl) {
                        case 0:
/* 53 */                    throw new UnsupportedOperationException();
                        case 1:
/* 47 */                    throw new UnsupportedOperationException();
                        case 2:
/* 41 */                    throw new UnsupportedOperationException();
                        case 3:
/* 35 */                    throw new UnsupportedOperationException();
                        case 4:
/* 29 */                    throw new UnsupportedOperationException();
                        case 5:
/* 23 */                    throw new UnsupportedOperationException();
                        case 6:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final Object remove(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 53 */                    throw new UnsupportedOperationException();
                        case 1:
/* 47 */                    throw new UnsupportedOperationException();
                        case 2:
/* 41 */                    throw new UnsupportedOperationException();
                        case 3:
/* 35 */                    throw new UnsupportedOperationException();
                        case 4:
/* 29 */                    throw new UnsupportedOperationException();
                        case 5:
/* 23 */                    throw new UnsupportedOperationException();
                        case 6:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return 1;
                }

                public final String toString() {
/* 10 */            boolean z = true;
                    switch (this.I00iOIl) {
                        case 0:
/* 399 */                   StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
/* 402 */                   sb.append('{');
/* 411 */                   Iterator it = ((iOoi10) entrySet()).iterator();
/* 419 */                   while (it.hasNext()) {
/* 425 */                       Map.Entry entry = (Map.Entry) it.next();
/* 427 */                       if (!z) {
/* 429 */                           sb.append(", ");
                                }
/* 432 */                       OooioIOo1.I00111O(entry, sb, '=');
/* 435 */                       z = false;
                            }
/* 437 */                   sb.append('}');
/* 440 */                   return sb.toString();
                        case 1:
/* 346 */                   StringBuilder sb2 = new StringBuilder((int) Math.min(8L, 1073741824L));
/* 349 */                   sb2.append('{');
/* 358 */                   Iterator it2 = ((ii101lO) entrySet()).iterator();
/* 366 */                   while (it2.hasNext()) {
/* 372 */                       Map.Entry entry2 = (Map.Entry) it2.next();
/* 374 */                       if (!z) {
/* 376 */                           sb2.append(", ");
                                }
/* 379 */                       OooioIOo1.I00111O(entry2, sb2, '=');
/* 382 */                       z = false;
                            }
/* 384 */                   sb2.append('}');
/* 387 */                   return sb2.toString();
                        case 2:
/* 293 */                   StringBuilder sb3 = new StringBuilder((int) Math.min(8L, 1073741824L));
/* 296 */                   sb3.append('{');
/* 305 */                   Iterator it3 = ((iiIIO0lOllo1) entrySet()).iterator();
/* 313 */                   while (it3.hasNext()) {
/* 319 */                       Map.Entry entry3 = (Map.Entry) it3.next();
/* 321 */                       if (!z) {
/* 323 */                           sb3.append(", ");
                                }
/* 326 */                       OooioIOo1.I00111O(entry3, sb3, '=');
/* 329 */                       z = false;
                            }
/* 331 */                   sb3.append('}');
/* 334 */                   return sb3.toString();
                        case 3:
/* 240 */                   StringBuilder sb4 = new StringBuilder((int) Math.min(8L, 1073741824L));
/* 243 */                   sb4.append('{');
/* 252 */                   Iterator it4 = ((iiliIl0lo) entrySet()).iterator();
/* 260 */                   while (it4.hasNext()) {
/* 266 */                       Map.Entry entry4 = (Map.Entry) it4.next();
/* 268 */                       if (!z) {
/* 270 */                           sb4.append(", ");
                                }
/* 273 */                       OooioIOo1.I00111O(entry4, sb4, '=');
/* 276 */                       z = false;
                            }
/* 278 */                   sb4.append('}');
/* 281 */                   return sb4.toString();
                        case 4:
/* 187 */                   StringBuilder sb5 = new StringBuilder((int) Math.min(8L, 1073741824L));
/* 190 */                   sb5.append('{');
/* 199 */                   Iterator it5 = ((iilo1IOIoli1) entrySet()).iterator();
/* 207 */                   while (it5.hasNext()) {
/* 213 */                       Map.Entry entry5 = (Map.Entry) it5.next();
/* 215 */                       if (!z) {
/* 217 */                           sb5.append(", ");
                                }
/* 220 */                       OooioIOo1.I00111O(entry5, sb5, '=');
/* 223 */                       z = false;
                            }
/* 225 */                   sb5.append('}');
/* 228 */                   return sb5.toString();
                        case 5:
/* 134 */                   StringBuilder sb6 = new StringBuilder((int) Math.min(8L, 1073741824L));
/* 137 */                   sb6.append('{');
/* 146 */                   Iterator it6 = ((ilIioOloollI) entrySet()).iterator();
/* 154 */                   while (it6.hasNext()) {
/* 160 */                       Map.Entry entry6 = (Map.Entry) it6.next();
/* 162 */                       if (!z) {
/* 164 */                           sb6.append(", ");
                                }
/* 167 */                       OooioIOo1.I00111O(entry6, sb6, '=');
/* 170 */                       z = false;
                            }
/* 172 */                   sb6.append('}');
/* 175 */                   return sb6.toString();
                        case 6:
/* 81 */                    StringBuilder sb7 = new StringBuilder((int) Math.min(8L, 1073741824L));
/* 84 */                    sb7.append('{');
/* 93 */                    Iterator it7 = ((lIioooi0O) entrySet()).iterator();
/* 101 */                   while (it7.hasNext()) {
/* 107 */                       Map.Entry entry7 = (Map.Entry) it7.next();
/* 109 */                       if (!z) {
/* 111 */                           sb7.append(", ");
                                }
/* 114 */                       OooioIOo1.I00111O(entry7, sb7, '=');
/* 117 */                       z = false;
                            }
/* 119 */                   sb7.append('}');
/* 122 */                   return sb7.toString();
                        default:
/* 28 */                    StringBuilder sb8 = new StringBuilder((int) Math.min(8L, 1073741824L));
/* 31 */                    sb8.append('{');
/* 40 */                    Iterator it8 = ((o0Il1iI0il) entrySet()).iterator();
/* 48 */                    while (it8.hasNext()) {
/* 54 */                        Map.Entry entry8 = (Map.Entry) it8.next();
/* 56 */                        if (!z) {
/* 58 */                            sb8.append(", ");
                                }
/* 61 */                        OooioIOo1.I00111O(entry8, sb8, '=');
/* 64 */                        z = false;
                            }
/* 66 */                    sb8.append('}');
/* 69 */                    return sb8.toString();
                    }
                }

                @Override
                public final Collection values() {
                    switch (this.I00iOIl) {
                        case 0:
/* 121 */                   ii00lIii10 ii00liii10 = (ii00lIii10) this.I00ilI0I1;
/* 123 */                   if (ii00liii10 != null) {
/* 134 */                       return ii00liii10;
                            }
/* 129 */                   ii00lIii10 ii00liii102 = new ii00lIii10(this.I00iiI, 1);
/* 132 */                   this.I00ilI0I1 = ii00liii102;
/* 134 */                   return ii00liii102;
                        case 1:
/* 105 */                   ii1IOlol1 ii1iolol1 = (ii1IOlol1) this.I00ilI0I1;
/* 107 */                   if (ii1iolol1 != null) {
/* 118 */                       return ii1iolol1;
                            }
/* 113 */                   ii1IOlol1 ii1iolol12 = new ii1IOlol1(this.I00iiI, 1);
/* 116 */                   this.I00ilI0I1 = ii1iolol12;
/* 118 */                   return ii1iolol12;
                        case 2:
/* 89 */                    iiIllO iiillo = (iiIllO) this.I00ilI0I1;
/* 91 */                    if (iiillo != null) {
/* 102 */                       return iiillo;
                            }
/* 97 */                    iiIllO iiillo2 = new iiIllO(this.I00iiI, 1);
/* 100 */                   this.I00ilI0I1 = iiillo2;
/* 102 */                   return iiillo2;
                        case 3:
/* 73 */                    iilolO0oO1 iilolo0oo1 = (iilolO0oO1) this.I00ilI0I1;
/* 75 */                    if (iilolo0oo1 != null) {
/* 86 */                        return iilolo0oo1;
                            }
/* 81 */                    iilolO0oO1 iilolo0oo12 = new iilolO0oO1(this.I00iiI, 1);
/* 84 */                    this.I00ilI0I1 = iilolo0oo12;
/* 86 */                    return iilolo0oo12;
                        case 4:
/* 57 */                    iio0oIio1Oo1 iio0oiio1oo1 = (iio0oIio1Oo1) this.I00ilI0I1;
/* 59 */                    if (iio0oiio1oo1 != null) {
/* 70 */                        return iio0oiio1oo1;
                            }
/* 65 */                    iio0oIio1Oo1 iio0oiio1oo12 = new iio0oIio1Oo1(this.I00iiI, 1);
/* 68 */                    this.I00ilI0I1 = iio0oiio1oo12;
/* 70 */                    return iio0oiio1oo12;
                        case 5:
/* 41 */                    ilIol1o iliol1o = (ilIol1o) this.I00ilI0I1;
/* 43 */                    if (iliol1o != null) {
/* 54 */                        return iliol1o;
                            }
/* 49 */                    ilIol1o iliol1o2 = new ilIol1o(this.I00iiI, 1);
/* 52 */                    this.I00ilI0I1 = iliol1o2;
/* 54 */                    return iliol1o2;
                        case 6:
/* 25 */                    lIlIloOo lililooo = (lIlIloOo) this.I00ilI0I1;
/* 27 */                    if (lililooo != null) {
/* 38 */                        return lililooo;
                            }
/* 33 */                    lIlIloOo lililooo2 = new lIlIloOo(this.I00iiI, 1);
/* 36 */                    this.I00ilI0I1 = lililooo2;
/* 38 */                    return lililooo2;
                        default:
/* 9 */                     o0oIIlOOl1 o0oiilool1 = (o0oIIlOOl1) this.I00ilI0I1;
/* 11 */                    if (o0oiilool1 != null) {
/* 22 */                        return o0oiilool1;
                            }
/* 17 */                    o0oIIlOOl1 o0oiilool12 = new o0oIIlOOl1(this.I00iiI, 1);
/* 20 */                    this.I00ilI0I1 = o0oiilool12;
/* 22 */                    return o0oiilool12;
                    }
                }
            }
