            package p000;

            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public final class IlIO0iI10oI {
                public static final IlIO0iI10oI I0000Il00O;
                public Ol1Io01IOiO I00000oIO;
                public boolean I00000oOI;

                static {
/* 3 */             IlIO0iI10oI ilIO0iI10oI = new IlIO0iI10oI();
/* 11 */            ilIO0iI10oI.I00000oIO = Ol1Io01IOiO.I000II(0);
/* 13 */            ilIO0iI10oI.I0001Ioi1lo();
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I0000Il00O = ilIO0iI10oI;
                }

                public static int I0000Il00O(i011io1o0i i011io1o0iVar, Object obj) throws UnsupportedEncodingException {
                    switch (i011io1o0iVar.ordinal()) {
                        case 0:
/* 229 */                   ((Double) obj).getClass();
/* 7 */                     return 8;
                        case 1:
/* 223 */                   ((Float) obj).getClass();
/* 6 */                     return 4;
                        case 2:
/* 216 */                   return I1I1OO00o1o.I000OiO(((Long) obj).longValue());
                        case 3:
/* 205 */                   return I1I1OO00o1o.I000OiO(((Long) obj).longValue());
                        case 4:
/* 194 */                   return I1I1OO00o1o.I0001Ioi1lo(((Integer) obj).intValue());
                        case 5:
/* 184 */                   ((Long) obj).getClass();
/* 7 */                     return 8;
                        case 6:
/* 178 */                   ((Integer) obj).getClass();
/* 6 */                     return 4;
                        case 7:
/* 172 */                   ((Boolean) obj).getClass();
/* 5 */                     return 1;
                        case 8:
                            try {
/* 150 */                       byte[] bytes = ((String) obj).getBytes("UTF-8");
/* 160 */                       return I1I1OO00o1o.I000OOo1O(bytes.length) + bytes.length;
                            } catch (UnsupportedEncodingException e) {
/* 165 */                       OIiilo1Ool0o.I000iOII("UTF-8 not supported.", e);
/* 168 */                       return 0;
                            }
                        case 9:
/* 141 */                   return ((I01Ilioliio) obj).I0000Il00O();
                        case 10:
/* 134 */                   return I1I1OO00o1o.I000O01llI0((I01Ilioliio) obj);
                        case 11:
/* 104 */                   if (obj instanceof IIOII1) {
/* 106 */                       IIOII1 iioii1 = (IIOII1) obj;
/* 120 */                       return iioii1.size() + I1I1OO00o1o.I000OOo1O(iioii1.size());
                            }
/* 122 */                   byte[] bArr = (byte[]) obj;
/* 130 */                   return I1I1OO00o1o.I000OOo1O(bArr.length) + bArr.length;
                        case 12:
/* 97 */                    return I1I1OO00o1o.I000OOo1O(((Integer) obj).intValue());
                        case 13:
                            return obj instanceof Iooili11110O ? I1I1OO00o1o.I0001Ioi1lo(((Iooili11110O) obj).I00000oIO()) : I1I1OO00o1o.I0001Ioi1lo(((Integer) obj).intValue());
                        case 14:
/* 61 */                    ((Integer) obj).getClass();
/* 6 */                     return 4;
                        case 15:
/* 55 */                    ((Long) obj).getClass();
/* 7 */                     return 8;
                        case 16:
/* 39 */                    int iIntValue = ((Integer) obj).intValue();
/* 48 */                    return I1I1OO00o1o.I000OOo1O((iIntValue >> 31) ^ (iIntValue << 1));
                        case 17:
/* 22 */                    long jLongValue = ((Long) obj).longValue();
/* 32 */                    return I1I1OO00o1o.I000OiO((jLongValue >> 63) ^ (jLongValue << 1));
                        default:
/* 19 */                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                }

                public static int I0000O(Io0010Ill io0010Ill, Object obj) {
/* 1 */             i011io1o0i i011io1o0iVar = io0010Ill.I00iiI;
/* 3 */             int i = io0010Ill.I00iOIl;
/* 7 */             if (!io0010Ill.I00iiO) {
/* 44 */                int iI000iOII = I1I1OO00o1o.I000iOII(i);
/* 50 */                if (i011io1o0iVar == i011io1o0i.I00ilI0I1) {
/* 52 */                    iI000iOII *= 2;
                        }
/* 58 */                return I0000Il00O(i011io1o0iVar, obj) + iI000iOII;
                    }
/* 15 */            int iI0000Il00O = 0;
/* 20 */            for (Object obj2 : (List) obj) {
/* 26 */                int iI000iOII2 = I1I1OO00o1o.I000iOII(i);
/* 32 */                if (i011io1o0iVar == i011io1o0i.I00ilI0I1) {
/* 34 */                    iI000iOII2 *= 2;
                        }
/* 41 */                iI0000Il00O += I0000Il00O(i011io1o0iVar, obj2) + iI000iOII2;
                    }
/* 43 */            return iI0000Il00O;
                }

                public static boolean I0000oI00(Map.Entry entry) {
/* 5 */             Io0010Ill io0010Ill = (Io0010Ill) entry.getKey();
/* 13 */            if (io0010Ill.I00iiI.I00iOIl != i011loO.MESSAGE) {
/* 72 */                return true;
                    }
/* 18 */            if (io0010Ill.I00iiO) {
/* 26 */                Iterator it = ((List) entry.getValue()).iterator();
/* 34 */                while (it.hasNext()) {
/* 46 */                    if (!((I01Ilioliio) it.next()).I00000oOI()) {
                            }
                        }
/* 72 */                return true;
                    }
/* 49 */            Object value = entry.getValue();
/* 55 */            if (!(value instanceof I01Ilioliio)) {
/* 68 */                I000II.I000iOII("Wrong object type used with protocol message reflection.");
/* 17 */                return false;
                    }
/* 63 */            if (((I01Ilioliio) value).I00000oOI()) {
/* 72 */                return true;
                    }
/* 17 */            return false;
                }

                public static Object I000O01llI0(IOOOIOiO0io1 iOOOIOiO0io1, i011io1o0i i011io1o0iVar) {
                    switch (i011io1o0iVar.ordinal()) {
                        case 0:
/* 224 */                   return Double.valueOf(Double.longBitsToDouble(iOOOIOiO0io1.I000OiO()));
                        case 1:
/* 211 */                   return Float.valueOf(Float.intBitsToFloat(iOOOIOiO0io1.I000OOo1O()));
                        case 2:
/* 198 */                   return Long.valueOf(iOOOIOiO0io1.I000l1());
                        case 3:
/* 189 */                   return Long.valueOf(iOOOIOiO0io1.I000l1());
                        case 4:
/* 180 */                   return Integer.valueOf(iOOOIOiO0io1.I000iOII());
                        case 5:
/* 171 */                   return Long.valueOf(iOOOIOiO0io1.I000OiO());
                        case 6:
/* 162 */                   return Integer.valueOf(iOOOIOiO0io1.I000OOo1O());
                        case 7:
/* 153 */                   return Boolean.valueOf(iOOOIOiO0io1.I000l1() != 0);
                        case 8:
/* 98 */                    int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 102 */                   int i = iOOOIOiO0io1.I00000oOI;
/* 104 */                   int i2 = iOOOIOiO0io1.I0000O;
/* 109 */                   if (iI000iOII > i - i2 || iI000iOII <= 0) {
                                return iI000iOII == 0 ? "" : new String(iOOOIOiO0io1.I000O01llI0(iI000iOII), "UTF-8");
                            }
/* 117 */                   String str = new String(iOOOIOiO0io1.I00000oIO, i2, iI000iOII, "UTF-8");
                            iOOOIOiO0io1.I0000O += iI000iOII;
/* 125 */                   return str;
                        case 9:
/* 94 */                    I000II.I000iOII("readPrimitiveField() cannot handle nested groups.");
/* 5 */                     return null;
                        case 10:
/* 88 */                    I000II.I000iOII("readPrimitiveField() cannot handle embedded messages.");
/* 5 */                     return null;
                        case 11:
/* 81 */                    return iOOOIOiO0io1.I0001Ioi1lo();
                        case 12:
/* 76 */                    return Integer.valueOf(iOOOIOiO0io1.I000iOII());
                        case 13:
/* 68 */                    I000II.I000iOII("readPrimitiveField() cannot handle enums.");
/* 5 */                     return null;
                        case 14:
/* 61 */                    return Integer.valueOf(iOOOIOiO0io1.I000OOo1O());
                        case 15:
/* 52 */                    return Long.valueOf(iOOOIOiO0io1.I000OiO());
                        case 16:
/* 34 */                    int iI000iOII2 = iOOOIOiO0io1.I000iOII();
/* 43 */                    return Integer.valueOf((-(iI000iOII2 & 1)) ^ (iI000iOII2 >>> 1));
                        case 17:
/* 18 */                    long jI000l1 = iOOOIOiO0io1.I000l1();
/* 29 */                    return Long.valueOf((-(jI000l1 & 1)) ^ (jI000l1 >>> 1));
                        default:
/* 17 */                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I000OiO(i011io1o0i i011io1o0iVar, Object obj) {
/* 1 */             obj.getClass();
/* 10 */            boolean z = true;
/* 11 */            boolean z2 = false;
                    switch (i011io1o0iVar.I00iOIl) {
                        case INT:
/* 55 */                    z2 = obj instanceof Integer;
                            break;
                        case LONG:
/* 52 */                    z2 = obj instanceof Long;
                            break;
                        case FLOAT:
/* 49 */                    z2 = obj instanceof Float;
                            break;
                        case DOUBLE:
/* 46 */                    z2 = obj instanceof Double;
                            break;
                        case BOOLEAN:
/* 43 */                    z2 = obj instanceof Boolean;
                            break;
                        case STRING:
/* 40 */                    z2 = obj instanceof String;
                            break;
                        case BYTE_STRING:
/* 33 */                    if (!(obj instanceof IIOII1) && !(obj instanceof byte[])) {
/* 28 */                        z = false;
                            }
/* 29 */                    z2 = z;
                            break;
                        case ENUM:
/* 21 */                    if (!(obj instanceof Integer) && !(obj instanceof Iooili11110O)) {
                            }
/* 29 */                    z2 = z;
                            break;
                        case MESSAGE:
/* 16 */                    z2 = obj instanceof I01Ilioliio;
                            break;
                    }
/* 57 */            if (z2) {
/* 59 */                return;
                    }
/* 62 */            I000II.I000iOII("Wrong object type used with protocol message reflection.");
                }

                public static void I000iOII(I1I1OO00o1o i1I1OO00o1o, i011io1o0i i011io1o0iVar, Object obj) {
                    switch (i011io1o0iVar.ordinal()) {
                        case 0:
/* 241 */                   double dDoubleValue = ((Double) obj).doubleValue();
/* 245 */                   i1I1OO00o1o.getClass();
/* 252 */                   i1I1OO00o1o.I00IlilI0i0i(Double.doubleToRawLongBits(dDoubleValue));
                            break;
                        case 1:
/* 224 */                   float fFloatValue = ((Float) obj).floatValue();
/* 228 */                   i1I1OO00o1o.getClass();
/* 235 */                   i1I1OO00o1o.I00IioO0OiOi(Float.floatToRawIntBits(fFloatValue));
                            break;
                        case 2:
/* 218 */                   i1I1OO00o1o.I00Io1o110i(((Long) obj).longValue());
                            break;
                        case 3:
/* 208 */                   i1I1OO00o1o.I00Io1o110i(((Long) obj).longValue());
                            break;
                        case 4:
/* 198 */                   i1I1OO00o1o.I001lloI(((Integer) obj).intValue());
                            break;
                        case 5:
/* 188 */                   i1I1OO00o1o.I00IlilI0i0i(((Long) obj).longValue());
                            break;
                        case 6:
/* 178 */                   i1I1OO00o1o.I00IioO0OiOi(((Integer) obj).intValue());
                            break;
                        case 7:
/* 168 */                   i1I1OO00o1o.I00IO1(((Boolean) obj).booleanValue() ? 1 : 0);
                            break;
                        case 8:
/* 145 */                   i1I1OO00o1o.getClass();
/* 150 */                   byte[] bytes = ((String) obj).getBytes("UTF-8");
/* 155 */                   i1I1OO00o1o.I00Io1lO(bytes.length);
/* 158 */                   i1I1OO00o1o.I00IOO(bytes);
                            break;
                        case 9:
/* 136 */                   i1I1OO00o1o.getClass();
/* 139 */                   ((I01Ilioliio) obj).I0001Ioi1lo(i1I1OO00o1o);
                            break;
                        case 10:
/* 130 */                   i1I1OO00o1o.I00II0oii1o((I01Ilioliio) obj);
                            break;
                        case 11:
/* 97 */                    if (!(obj instanceof IIOII1)) {
/* 115 */                       byte[] bArr = (byte[]) obj;
/* 117 */                       i1I1OO00o1o.getClass();
/* 121 */                       i1I1OO00o1o.I00Io1lO(bArr.length);
/* 124 */                       i1I1OO00o1o.I00IOO(bArr);
                                break;
                            } else {
/* 99 */                        IIOII1 iioii1 = (IIOII1) obj;
/* 101 */                       i1I1OO00o1o.getClass();
/* 108 */                       i1I1OO00o1o.I00Io1lO(iioii1.size());
/* 111 */                       i1I1OO00o1o.I00IO1oi11O(iioii1);
                                break;
                            }
                        case 12:
/* 91 */                    i1I1OO00o1o.I00Io1lO(((Integer) obj).intValue());
                            break;
                        case 13:
/* 63 */                    if (!(obj instanceof Iooili11110O)) {
/* 81 */                        i1I1OO00o1o.I001lloI(((Integer) obj).intValue());
                                break;
                            } else {
/* 71 */                        i1I1OO00o1o.I001lloI(((Iooili11110O) obj).I00000oIO());
                                break;
                            }
                        case 14:
/* 57 */                    i1I1OO00o1o.I00IioO0OiOi(((Integer) obj).intValue());
                            break;
                        case 15:
/* 47 */                    i1I1OO00o1o.I00IlilI0i0i(((Long) obj).longValue());
                            break;
                        case 16:
/* 28 */                    int iIntValue = ((Integer) obj).intValue();
/* 37 */                    i1I1OO00o1o.I00Io1lO((iIntValue >> 31) ^ (iIntValue << 1));
                            break;
                        case 17:
/* 11 */                    long jLongValue = ((Long) obj).longValue();
/* 22 */                    i1I1OO00o1o.I00Io1o110i((jLongValue >> 63) ^ (jLongValue << 1));
                            break;
                    }
                }

                public final void I00000oIO(Io0010Ill io0010Ill, Object obj) {
                    List arrayList;
/* 1 */             Ol1Io01IOiO ol1Io01IOiO = this.I00000oIO;
/* 5 */             if (!io0010Ill.I00iiO) {
/* 35 */                I000II.I000iOII("addRepeatedField() can only be called on repeated fields.");
/* 89 */                return;
                    }
/* 9 */             I000OiO(io0010Ill.I00iiI, obj);
/* 12 */            Object obj2 = ol1Io01IOiO.get(io0010Ill);
/* 16 */            if (obj2 == null) {
/* 20 */                arrayList = new ArrayList();
/* 23 */                ol1Io01IOiO.put(io0010Ill, arrayList);
                    } else {
/* 27 */                arrayList = (List) obj2;
                    }
/* 29 */            arrayList.add(obj);
                }

                public final IlIO0iI10oI clone() {
/* 1 */             Ol1Io01IOiO ol1Io01IOiO = this.I00000oIO;
/* 5 */             IlIO0iI10oI ilIO0iI10oI = new IlIO0iI10oI();
/* 14 */            ilIO0iI10oI.I00000oIO = Ol1Io01IOiO.I000II(16);
/* 23 */            for (int i = 0; i < ol1Io01IOiO.I00iiI.size(); i++) {
/* 31 */                Map.Entry entry = (Map.Entry) ol1Io01IOiO.I00iiI.get(i);
/* 43 */                ilIO0iI10oI.I000OOo1O((Io0010Ill) entry.getKey(), entry.getValue());
                    }
/* 61 */            for (Map.Entry entry2 : ol1Io01IOiO.I0000Il00O()) {
/* 79 */                ilIO0iI10oI.I000OOo1O((Io0010Ill) entry2.getKey(), entry2.getValue());
                    }
/* 113 */           return ilIO0iI10oI;
                }

                public final void I0001Ioi1lo() {
/* 3 */             if (this.I00000oOI) {
/* 5 */                 return;
                    }
/* 6 */             Ol1Io01IOiO ol1Io01IOiO = this.I00000oIO;
/* 10 */            if (!ol1Io01IOiO.I00iio) {
/* 19 */                for (int i = 0; i < ol1Io01IOiO.I00iiI.size(); i++) {
/* 27 */                    Map.Entry entry = (Map.Entry) ol1Io01IOiO.I00iiI.get(i);
/* 37 */                    if (((Io0010Ill) entry.getKey()).I00iiO) {
/* 49 */                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                            }
                        }
/* 67 */                for (Map.Entry entry2 : ol1Io01IOiO.I0000Il00O()) {
/* 83 */                    if (((Io0010Ill) entry2.getKey()).I00iiO) {
/* 95 */                        entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                            }
                        }
                    }
/* 102 */           if (!ol1Io01IOiO.I00iio) {
/* 121 */               ol1Io01IOiO.I00iiO = ol1Io01IOiO.I00iiO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ol1Io01IOiO.I00iiO);
/* 123 */               ol1Io01IOiO.I00iio = true;
                    }
/* 125 */           this.I00000oOI = true;
                }

                public final void I000II(Map.Entry entry) {
/* 1 */             Ol1Io01IOiO ol1Io01IOiO = this.I00000oIO;
/* 7 */             Io0010Ill io0010Ill = (Io0010Ill) entry.getKey();
/* 9 */             Object value = entry.getValue();
/* 16 */            if (io0010Ill.I00iiO) {
/* 18 */                Object arrayList = ol1Io01IOiO.get(io0010Ill);
/* 22 */                if (arrayList == null) {
/* 26 */                    arrayList = new ArrayList();
                        }
/* 39 */                for (Object obj : (List) value) {
/* 46 */                    List list = (List) arrayList;
/* 50 */                    if (obj instanceof byte[]) {
/* 52 */                        byte[] bArr = (byte[]) obj;
/* 55 */                        byte[] bArr2 = new byte[bArr.length];
/* 58 */                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
/* 61 */                        obj = bArr2;
                            }
/* 62 */                    list.add(obj);
                        }
/* 66 */                ol1Io01IOiO.put(io0010Ill, arrayList);
/* 69 */                return;
                    }
/* 76 */            if (io0010Ill.I00iiI.I00iOIl != i011loO.MESSAGE) {
/* 126 */               if (value instanceof byte[]) {
/* 128 */                   byte[] bArr3 = (byte[]) value;
/* 131 */                   byte[] bArr4 = new byte[bArr3.length];
/* 134 */                   System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
/* 137 */                   value = bArr4;
                        }
/* 138 */               ol1Io01IOiO.put(io0010Ill, value);
/* 186 */               return;
                    }
/* 78 */            Object obj2 = ol1Io01IOiO.get(io0010Ill);
/* 82 */            if (obj2 != null) {
/* 120 */               ol1Io01IOiO.put(io0010Ill, ((I01Ilioliio) obj2).I0000oI00().I0000oI00((Io00OlOi0) ((I01Ilioliio) value)).I0000Il00O());
/* 123 */               return;
                    }
/* 86 */            if (value instanceof byte[]) {
/* 88 */                byte[] bArr5 = (byte[]) value;
/* 91 */                byte[] bArr6 = new byte[bArr5.length];
/* 94 */                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
/* 97 */                value = bArr6;
                    }
/* 98 */            ol1Io01IOiO.put(io0010Ill, value);
                }

                public final void I000OOo1O(Io0010Ill io0010Ill, Object obj) {
/* 1 */             boolean z = io0010Ill.I00iiO;
/* 3 */             i011io1o0i i011io1o0iVar = io0010Ill.I00iiI;
/* 5 */             if (!z) {
/* 47 */                I000OiO(i011io1o0iVar, obj);
                    } else {
/* 9 */                 if (!(obj instanceof List)) {
/* 43 */                    I000II.I000iOII("Wrong object type used with protocol message reflection.");
/* 46 */                    return;
                        }
/* 13 */                ArrayList arrayList = new ArrayList();
/* 18 */                arrayList.addAll((List) obj);
/* 21 */                Iterator it = arrayList.iterator();
/* 29 */                while (it.hasNext()) {
/* 35 */                    I000OiO(i011io1o0iVar, it.next());
                        }
/* 39 */                obj = arrayList;
                    }
/* 52 */            this.I00000oIO.put(io0010Ill, obj);
                }
            }
