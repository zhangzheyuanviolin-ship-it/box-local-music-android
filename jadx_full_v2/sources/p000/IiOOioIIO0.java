            package p000;

            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.lang.reflect.Modifier;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
/* 32 */    public final class IiOOioIIO0 {
                public static final loIOiIO1O1 I0000Il00O = new loIOiIO1O1(10);
                public static int I0000O = 1;
                public static final int I0000oI00;
                public static final int I0001Ioi1lo;
                public static final int I000II;
                public static final int I000O01llI0;
                public static final int I000OOo1O;
                public static final int I000OiO;
                public static final int I000iOII;
                public static final int I000l1;
                public static final IiOOioIIO0 I000lI;
                public static final IiOOioIIO0 I000o00OoI0I;
                public static final IiOOioIIO0 I000oI1ioi;
                public static final IiOOioIIO0 I00100l0;
                public static final IiOOioIIO0 I00100o1O0lo;
                public static final ArrayList I0010I0i;
                public static final ArrayList I0010o;
                public final List I00000oIO;
                public final int I00000oOI;

                static {
/* 10 */            int iI000lI = loIOiIO1O1.I000lI();
/* 14 */            I0000oI00 = iI000lI;
/* 16 */            int iI000lI2 = loIOiIO1O1.I000lI();
/* 20 */            I0001Ioi1lo = iI000lI2;
/* 22 */            int iI000lI3 = loIOiIO1O1.I000lI();
/* 26 */            I000II = iI000lI3;
/* 28 */            int iI000lI4 = loIOiIO1O1.I000lI();
/* 32 */            I000O01llI0 = iI000lI4;
/* 34 */            int iI000lI5 = loIOiIO1O1.I000lI();
/* 38 */            I000OOo1O = iI000lI5;
/* 40 */            int iI000lI6 = loIOiIO1O1.I000lI();
/* 44 */            I000OiO = iI000lI6;
                    int iI000lI7 = loIOiIO1O1.I000lI() - 1;
/* 52 */            I000iOII = iI000lI7;
/* 56 */            int i = iI000lI | iI000lI2 | iI000lI3;
/* 57 */            I000l1 = i;
/* 69 */            I000lI = new IiOOioIIO0(iI000lI7);
/* 76 */            I000o00OoI0I = new IiOOioIIO0(iI000lI5 | iI000lI6);
/* 80 */            new IiOOioIIO0(iI000lI);
/* 85 */            new IiOOioIIO0(iI000lI2);
/* 90 */            new IiOOioIIO0(iI000lI3);
/* 98 */            I000oI1ioi = new IiOOioIIO0(i);
/* 102 */           new IiOOioIIO0(iI000lI4);
/* 110 */           I00100l0 = new IiOOioIIO0(iI000lI5);
/* 117 */           I00100o1O0lo = new IiOOioIIO0(iI000lI6);
/* 121 */           new IiOOioIIO0(iI000lI2 | iI000lI5 | iI000lI6);
/* 126 */           Field[] fields = IiOOioIIO0.class.getFields();
/* 132 */           ArrayList arrayList = new ArrayList();
/* 138 */           for (Field field : fields) {
/* 150 */               if (Modifier.isStatic(field.getModifiers())) {
/* 152 */                   arrayList.add(field);
                        }
                    }
/* 160 */           ArrayList arrayList2 = new ArrayList();
/* 163 */           Iterator it = arrayList.iterator();
                    while (true) {
/* 172 */               if (!it.hasNext()) {
                            break;
                        }
/* 178 */               Field field2 = (Field) it.next();
/* 180 */               Object obj = field2.get(null);
/* 191 */               IiOOioIIO0 iiOOioIIO0 = obj instanceof IiOOioIIO0 ? (IiOOioIIO0) obj : null;
/* 202 */               IiOOilo0 iiOOilo0 = iiOOioIIO0 != null ? new IiOOilo0(iiOOioIIO0.I00000oOI, field2.getName()) : null;
/* 205 */               if (iiOOilo0 != null) {
/* 207 */                   arrayList2.add(iiOOilo0);
                        }
                    }
/* 211 */           I0010I0i = arrayList2;
/* 213 */           Field[] fields2 = IiOOioIIO0.class.getFields();
/* 219 */           ArrayList arrayList3 = new ArrayList();
/* 223 */           for (Field field3 : fields2) {
/* 235 */               if (Modifier.isStatic(field3.getModifiers())) {
/* 237 */                   arrayList3.add(field3);
                        }
                    }
/* 245 */           ArrayList arrayList4 = new ArrayList();
/* 248 */           Iterator it2 = arrayList3.iterator();
/* 256 */           while (it2.hasNext()) {
/* 258 */               Object next = it2.next();
/* 275 */               if (O0000Ioio00.I0000O(((Field) next).getType(), Integer.TYPE)) {
/* 277 */                   arrayList4.add(next);
                        }
                    }
/* 283 */           ArrayList arrayList5 = new ArrayList();
/* 286 */           Iterator it3 = arrayList4.iterator();
/* 294 */           while (it3.hasNext()) {
/* 300 */               Field field4 = (Field) it3.next();
/* 308 */               int iIntValue = ((Integer) field4.get(null)).intValue();
/* 326 */               IiOOilo0 iiOOilo02 = iIntValue == ((-iIntValue) & iIntValue) ? new IiOOilo0(iIntValue, field4.getName()) : null;
/* 327 */               if (iiOOilo02 != null) {
/* 329 */                   arrayList5.add(iiOOilo02);
                        }
                    }
/* 333 */           I0010o = arrayList5;
                }

                public IiOOioIIO0(int i, List list) {
/* 4 */             this.I00000oIO = list;
/* 8 */             Iterator it = list.iterator();
/* 16 */            while (it.hasNext()) {
/* 29 */                i &= ~((IiOOi10) it.next()).I00000oIO();
                    }
/* 31 */            this.I00000oOI = i;
                }

                public final boolean I00000oIO(int i) {
                    return (this.I00000oOI & i) != 0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (!IiOOioIIO0.class.equals(obj != null ? obj.getClass() : null)) {
/* 19 */                return false;
                    }
/* 23 */            IiOOioIIO0 iiOOioIIO0 = (IiOOioIIO0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iiOOioIIO0.I00000oIO) && this.I00000oOI == iiOOioIIO0.I00000oOI;
                }

                public final int hashCode() {
/* 11 */            return (this.I00000oIO.hashCode() * 31) + this.I00000oOI;
                }

                public final String toString() throws IOException {
                    Object next;
/* 3 */             Iterator it = I0010I0i.iterator();
                    while (true) {
/* 12 */                if (!it.hasNext()) {
/* 28 */                    next = null;
                            break;
                        }
/* 14 */                next = it.next();
/* 25 */                if (((IiOOilo0) next).I00000oIO == this.I00000oOI) {
                            break;
                        }
                    }
/* 29 */            IiOOilo0 iiOOilo0 = (IiOOilo0) next;
/* 36 */            String strI00IlilI0i0i = iiOOilo0 != null ? iiOOilo0.I00000oOI : null;
/* 37 */            if (strI00IlilI0i0i == null) {
/* 41 */                ArrayList arrayList = new ArrayList();
/* 46 */                Iterator it2 = I0010o.iterator();
/* 54 */                while (it2.hasNext()) {
/* 60 */                    IiOOilo0 iiOOilo02 = (IiOOilo0) it2.next();
/* 73 */                    String str = I00000oIO(iiOOilo02.I00000oIO) ? iiOOilo02.I00000oOI : null;
/* 74 */                    if (str != null) {
/* 76 */                        arrayList.add(str);
                            }
                        }
/* 87 */                strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(arrayList, " | ", null, null, null, 62);
                    }
/* 95 */            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("DescriptorKindFilter(", strI00IlilI0i0i, ", ");
/* 101 */           sbI001IIilI0O.append(this.I00000oIO);
/* 106 */           sbI001IIilI0O.append(')');
/* 109 */           return sbI001IIilI0O.toString();
                }

/* 33 */        public IiOOioIIO0(int i) {
/* 35 */            this(i, Il01100l.I00iOIl);
                }
            }
