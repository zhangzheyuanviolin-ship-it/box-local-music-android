            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public final class looOi1oiO {
                public static final looOi1oiO I0000Il00O;
                public o0OIiOo0oOi I00000oIO;
                public boolean I00000oOI;

                static {
/* 5 */             o0OIiOo0oOi o0oiioo0ooi = new o0OIiOo0oOi();
/* 8 */             looOi1oiO loooi1oio = new looOi1oiO();
/* 11 */            loooi1oio.I00000oIO = o0oiioo0ooi;
/* 13 */            loooi1oio.I0000oI00();
/* 16 */            loooi1oio.I0000oI00();
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            I0000Il00O = loooi1oio;
                }

                public static int I00000oIO(looolOIIo loooloiio, Object obj) {
                    int iI0000oI00;
                    int iI00100l0;
/* 1 */             o0ilooOIO0 o0iloooio0 = loooloiio.I00iOIl;
/* 3 */             List list = (List) obj;
/* 5 */             int size = list.size();
/* 10 */            int i = 0;
/* 11 */            for (int i2 = 0; i2 < size; i2++) {
/* 13 */                Object obj2 = list.get(i2);
/* 20 */                int iI00100l02 = loliO00.I00100l0(1616448016);
/* 26 */                if (o0iloooio0 == o0ilooOIO0.I00iiI) {
/* 31 */                    Charset charset = o00oIoII0l1.I00000oIO;
/* 33 */                    iI00100l02 += iI00100l02;
                        }
/* 34 */                o0iolO0OI o0iolo0oi = o0iolO0OI.I00iOIl;
/* 40 */                int iI00000oIO = 4;
                        switch (o0iloooio0.ordinal()) {
                            case 0:
/* 260 */                       ((Double) obj2).getClass();
/* 94 */                        iI00000oIO = 8;
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 1:
/* 254 */                       ((Float) obj2).getClass();
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 2:
/* 247 */                       iI00000oIO = loliO00.I00000oIO(((Long) obj2).longValue());
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 3:
/* 236 */                       iI00000oIO = loliO00.I00000oIO(((Long) obj2).longValue());
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 4:
/* 225 */                       iI00000oIO = loliO00.I00000oIO(((Integer) obj2).intValue());
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 5:
/* 214 */                       ((Long) obj2).getClass();
/* 94 */                        iI00000oIO = 8;
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 6:
/* 208 */                       ((Integer) obj2).getClass();
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 7:
/* 201 */                       ((Boolean) obj2).getClass();
/* 204 */                       iI00000oIO = 1;
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 8:
/* 179 */                       if (obj2 instanceof lol1I010) {
/* 183 */                           iI0000oI00 = ((lol1I010) obj2).I0000oI00();
/* 187 */                           iI00100l0 = loliO00.I00100l0(iI0000oI00);
/* 143 */                           iI00000oIO = iI00100l0 + iI0000oI00;
/* 266 */                           i += iI00100l02 + iI00000oIO;
                                } else {
/* 194 */                           iI00000oIO = loliO00.I000oI1ioi((String) obj2);
/* 266 */                           i += iI00100l02 + iI00000oIO;
                                }
                            case 9:
/* 172 */                       iI00000oIO = ((o001IlOi0O) ((loOo1oOil) obj2)).I000l1();
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 10:
/* 159 */                       iI0000oI00 = ((o001IlOi0O) ((loOo1oOil) obj2)).I000l1();
/* 163 */                       iI00100l0 = loliO00.I00100l0(iI0000oI00);
/* 143 */                       iI00000oIO = iI00100l0 + iI0000oI00;
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 11:
/* 131 */                       if (obj2 instanceof lol1I010) {
/* 135 */                           iI0000oI00 = ((lol1I010) obj2).I0000oI00();
/* 139 */                           iI00100l0 = loliO00.I00100l0(iI0000oI00);
                                } else {
/* 149 */                           iI0000oI00 = ((byte[]) obj2).length;
/* 150 */                           iI00100l0 = loliO00.I00100l0(iI0000oI00);
                                }
/* 143 */                       iI00000oIO = iI00100l0 + iI0000oI00;
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 12:
/* 123 */                       iI00000oIO = loliO00.I00100l0(((Integer) obj2).intValue());
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 13:
/* 111 */                       iI00000oIO = loliO00.I00000oIO(((Integer) obj2).intValue());
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 14:
/* 99 */                        ((Integer) obj2).getClass();
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 15:
/* 91 */                        ((Long) obj2).getClass();
/* 94 */                        iI00000oIO = 8;
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 16:
/* 74 */                        int iIntValue = ((Integer) obj2).intValue();
/* 83 */                        iI00000oIO = loliO00.I00100l0((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            case 17:
/* 56 */                        long jLongValue = ((Long) obj2).longValue();
/* 66 */                        iI00000oIO = loliO00.I00000oIO((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 266 */                       i += iI00100l02 + iI00000oIO;
                            default:
/* 53 */                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    }
/* 271 */           return i;
                }

                public static boolean I000OOo1O(Map.Entry entry) {
/* 13 */            if (((looolOIIo) entry.getKey()).I00iOIl.I00iOIl != o0iolO0OI.I00l0I0l0lO1) {
/* 55 */                return true;
                    }
/* 19 */            List list = (List) entry.getValue();
/* 21 */            int size = list.size();
/* 27 */            for (int i = 0; i < size; i++) {
/* 29 */                Object obj = list.get(i);
/* 35 */                if (!(obj instanceof o0IIiol0oIo)) {
/* 51 */                    I000II.I000iOII("Wrong object type used with protocol message reflection.");
/* 25 */                    return false;
                        }
/* 43 */                if (!((o0IIiol0oIo) obj).zzt()) {
/* 25 */                    return false;
                        }
                    }
/* 55 */            return true;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public static final void I000OiO(looolOIIo loooloiio, Object obj) {
                    boolean z;
/* 1 */             o0ilooOIO0 o0iloooio0 = loooloiio.I00iOIl;
/* 3 */             Charset charset = o00oIoII0l1.I00000oIO;
/* 5 */             obj.getClass();
/* 8 */             o0ilooOIO0 o0iloooio02 = o0ilooOIO0.I00iiI;
/* 10 */            o0iolO0OI o0iolo0oi = o0iolO0OI.I00iOIl;
                    switch (o0iloooio0.I00iOIl.ordinal()) {
                        case 0:
/* 56 */                    z = obj instanceof Integer;
/* 58 */                    if (z) {
                            }
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                        case 1:
/* 53 */                    z = obj instanceof Long;
/* 58 */                    if (z) {
                            }
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                        case 2:
/* 50 */                    z = obj instanceof Float;
/* 58 */                    if (z) {
                            }
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                        case 3:
/* 47 */                    z = obj instanceof Double;
/* 58 */                    if (z) {
                            }
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                        case 4:
/* 44 */                    z = obj instanceof Boolean;
/* 58 */                    if (z) {
                            }
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                        case 5:
/* 41 */                    z = obj instanceof String;
/* 58 */                    if (z) {
                            }
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                        case 6:
/* 34 */                    if ((obj instanceof lol1I010) || (obj instanceof byte[])) {
                            }
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                        case 7:
/* 29 */                    if (obj instanceof Integer) {
                            }
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                        case 8:
/* 24 */                    if (obj instanceof loOo1oOil) {
                            }
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                        default:
/* 86 */                    OIiilo1Ool0o.I000l1("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, loooloiio.I00iOIl.I00iOIl, obj.getClass().getName()});
                            break;
                    }
                }

                public final looOi1oiO clone() {
/* 3 */             looOi1oiO loooi1oio = new looOi1oiO();
/* 11 */            loooi1oio.I00000oIO = new o0OIiOo0oOi();
/* 13 */            o0OIiOo0oOi o0oiioo0ooi = this.I00000oIO;
/* 15 */            int i = o0oiioo0ooi.I00iiI;
/* 18 */            for (int i2 = 0; i2 < i; i2++) {
/* 20 */                o0OOOl0I1IO1 o0oool0i1io1I0000Il00O = o0oiioo0ooi.I0000Il00O(i2);
/* 30 */                loooi1oio.I0001Ioi1lo((looolOIIo) o0oool0i1io1I0000Il00O.I00iOIl, o0oool0i1io1I0000Il00O.I00iiI);
                    }
/* 48 */            for (Map.Entry entry : o0oiioo0ooi.I00000oIO()) {
/* 66 */                loooi1oio.I0001Ioi1lo((looolOIIo) entry.getKey(), entry.getValue());
                    }
/* 110 */           return loooi1oio;
                }

                public final Iterator I0000Il00O() {
/* 1 */             o0OIiOo0oOi o0oiioo0ooi = this.I00000oIO;
                    return o0oiioo0ooi.isEmpty() ? Collections.emptyIterator() : ((I1IlioI1o1I) o0oiioo0ooi.entrySet()).iterator();
                }

                public final void I0000O(looolOIIo loooloiio, Object obj) {
                    List arrayList;
/* 1 */             I000OiO(loooloiio, obj);
/* 4 */             o0OIiOo0oOi o0oiioo0ooi = this.I00000oIO;
/* 6 */             Object obj2 = o0oiioo0ooi.get(loooloiio);
/* 10 */            if (obj2 == null) {
/* 14 */                arrayList = new ArrayList();
/* 17 */                o0oiioo0ooi.put(loooloiio, arrayList);
                    } else {
/* 21 */                arrayList = (List) obj2;
                    }
/* 23 */            arrayList.add(obj);
                }

                public final void I0000oI00() {
/* 1 */             o0OIiOo0oOi o0oiioo0ooi = this.I00000oIO;
/* 5 */             if (this.I00000oOI) {
/* 7 */                 return;
                    }
/* 8 */             int i = o0oiioo0ooi.I00iiI;
/* 12 */            for (int i2 = 0; i2 < i; i2++) {
/* 18 */                Object obj = o0oiioo0ooi.I0000Il00O(i2).I00iiI;
/* 22 */                if (obj instanceof o001IlOi0O) {
/* 24 */                    o001IlOi0O o001iloi0o = (o001IlOi0O) obj;
/* 26 */                    o001iloi0o.getClass();
/* 39 */                    o0Ioolo.I0000Il00O.I00000oIO(o001iloi0o.getClass()).I00000oIO(o001iloi0o);
/* 42 */                    o001iloi0o.I0000oI00();
                        }
                    }
/* 50 */            if (!o0oiioo0ooi.I00iio) {
/* 54 */                for (int i3 = 0; i3 < o0oiioo0ooi.I00iiI; i3++) {
/* 56 */                    o0OOOl0I1IO1 o0oool0i1io1I0000Il00O = o0oiioo0ooi.I0000Il00O(i3);
/* 64 */                    ((looolOIIo) o0oool0i1io1I0000Il00O.I00iOIl).getClass();
/* 75 */                    o0oool0i1io1I0000Il00O.setValue(Collections.unmodifiableList((List) o0oool0i1io1I0000Il00O.I00iiI));
                        }
/* 93 */                for (Map.Entry entry : o0oiioo0ooi.I00000oIO()) {
/* 107 */                   ((looolOIIo) entry.getKey()).getClass();
/* 120 */                   entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
/* 127 */           if (!o0oiioo0ooi.I00iio) {
/* 146 */               o0oiioo0ooi.I00iiO = o0oiioo0ooi.I00iiO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o0oiioo0ooi.I00iiO);
/* 165 */               o0oiioo0ooi.I00ilO0 = o0oiioo0ooi.I00ilO0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o0oiioo0ooi.I00ilO0);
/* 167 */               o0oiioo0ooi.I00iio = true;
                    }
/* 169 */           this.I00000oOI = true;
                }

                public final void I0001Ioi1lo(looolOIIo loooloiio, Object obj) {
/* 1 */             loooloiio.getClass();
/* 6 */             if (!(obj instanceof List)) {
/* 43 */                I000II.I000iOII("Wrong object type used with protocol message reflection.");
/* 106 */               return;
                    }
/* 8 */             List list = (List) obj;
/* 10 */            int size = list.size();
/* 16 */            ArrayList arrayList = new ArrayList(size);
/* 20 */            for (int i = 0; i < size; i++) {
/* 22 */                Object obj2 = list.get(i);
/* 26 */                I000OiO(loooloiio, obj2);
/* 29 */                arrayList.add(obj2);
                    }
/* 37 */            this.I00000oIO.put(loooloiio, arrayList);
                }

                public final boolean I000II() {
/* 1 */             o0OIiOo0oOi o0oiioo0ooi = this.I00000oIO;
/* 3 */             int i = o0oiioo0ooi.I00iiI;
/* 6 */             int i2 = 0;
                    while (true) {
/* 7 */                 if (i2 >= i) {
/* 27 */                    Iterator it = o0oiioo0ooi.I00000oIO().iterator();
/* 35 */                    while (it.hasNext()) {
/* 47 */                        if (!I000OOo1O((Map.Entry) it.next())) {
                                }
                            }
/* 50 */                    return true;
                        }
/* 17 */                if (!I000OOo1O(o0oiioo0ooi.I0000Il00O(i2))) {
                            break;
                        }
/* 20 */                i2++;
                    }
/* 5 */             return false;
                }

                public final void I000O01llI0(Map.Entry entry) {
/* 5 */             looolOIIo loooloiio = (looolOIIo) entry.getKey();
/* 7 */             Object value = entry.getValue();
/* 11 */            loooloiio.getClass();
/* 14 */            o0OIiOo0oOi o0oiioo0ooi = this.I00000oIO;
/* 16 */            Object arrayList = o0oiioo0ooi.get(loooloiio);
/* 20 */            List list = (List) value;
/* 22 */            int size = list.size();
/* 26 */            if (arrayList == null) {
/* 30 */                arrayList = new ArrayList(size);
                    }
/* 34 */            List list2 = (List) arrayList;
/* 38 */            for (int i = 0; i < size; i++) {
/* 40 */                Object obj = list.get(i);
/* 46 */                if (obj instanceof byte[]) {
/* 48 */                    byte[] bArr = (byte[]) obj;
/* 50 */                    int length = bArr.length;
/* 51 */                    byte[] bArr2 = new byte[length];
/* 53 */                    System.arraycopy(bArr, 0, bArr2, 0, length);
/* 56 */                    obj = bArr2;
                        }
/* 57 */                list2.add(obj);
                    }
/* 63 */            o0oiioo0ooi.put(loooloiio, arrayList);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof looOi1oiO) {
/* 17 */                return this.I00000oIO.equals(((looOi1oiO) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
