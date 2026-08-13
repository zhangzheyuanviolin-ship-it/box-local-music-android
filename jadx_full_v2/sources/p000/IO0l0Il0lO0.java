            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
            public final class IO0l0Il0lO0 implements Map, O0IloOoIliOO {
                public static final String[] I00l0I0l0lO1 = new String[0];
                public static final Object[] I00l0OO0IO = new Object[0];
                public static final int[] I00li1OI = new int[0];
                public String[] I00iOIl;
                public Object[] I00iiI;
                public int I00iiO;
                public int[] I00iio;
                public int I00ilI0I1;
                public IO0iil I00ilO0;
                public IO0iil I00io1l;
                public IO0ioo1i0oo I00ioIO;

                public final int I00000oIO(String str) {
/* 3 */             if (this.I00iiO == 0) {
/* 22 */                return -1;
                    }
/* 6 */             int iI00000oIO = iOl11Ioo0O.I00000oIO(str);
/* 12 */            int length = this.I00iOIl.length;
                    while (true) {
/* 15 */                int i = iI00000oIO & (length - 1);
/* 18 */                String str2 = this.I00iOIl[i];
/* 20 */                if (str2 == null) {
/* 22 */                    return -1;
                        }
/* 28 */                if (str2.equalsIgnoreCase(str)) {
/* 30 */                    return i;
                        }
/* 31 */                iI00000oIO = i + 1;
/* 35 */                length = this.I00iOIl.length;
                    }
                }

                @Override
                public final Object put(String str, Object obj) {
                    int i;
                    int[] iArr;
                    String str2;
/* 6 */             int i2 = 0;
/* 7 */             if (this.I00iOIl == I00l0I0l0lO1) {
/* 13 */                this.I00iOIl = new String[8];
/* 17 */                this.I00iiI = new Object[8];
/* 19 */                int[] iArr2 = new int[8];
/* 22 */                for (int i3 = 0; i3 < 8; i3++) {
/* 24 */                    iArr2[i3] = -1;
                        }
/* 29 */                this.I00iio = iArr2;
                    }
/* 31 */            int iI00000oIO = iOl11Ioo0O.I00000oIO(str);
/* 40 */            int length = (this.I00iOIl.length - 1) & iI00000oIO;
                    while (true) {
/* 43 */                String str3 = this.I00iOIl[length];
/* 45 */                if (str3 == null) {
/* 49 */                    int i4 = this.I00iiO * 4;
/* 51 */                    String[] strArr = this.I00iOIl;
/* 56 */                    if (i4 >= strArr.length * 3) {
/* 59 */                        int length2 = strArr.length * 2;
/* 61 */                        Object[] objArr = this.I00iiI;
/* 63 */                        int[] iArr3 = this.I00iio;
/* 65 */                        int i5 = this.I00ilI0I1;
/* 69 */                        this.I00iOIl = new String[length2];
/* 73 */                        this.I00iiI = new Object[length2];
/* 75 */                        int[] iArr4 = new int[length2];
/* 78 */                        for (int i6 = 0; i6 < length2; i6++) {
/* 80 */                            iArr4[i6] = -1;
                                }
/* 85 */                        this.I00iio = iArr4;
/* 87 */                        this.I00iiO = 0;
/* 89 */                        this.I00ilI0I1 = 0;
/* 92 */                        for (int i7 = 0; i7 < i5; i7++) {
/* 94 */                            int i8 = iArr3[i7];
/* 96 */                            if (i8 >= 0 && (str2 = strArr[i8]) != null) {
/* 104 */                               put(str2, objArr[i8]);
                                    }
                                }
                            }
/* 112 */                   int length3 = this.I00iOIl.length;
                            while (true) {
/* 115 */                       i = iI00000oIO & (length3 - 1);
/* 116 */                       String[] strArr2 = this.I00iOIl;
/* 120 */                       if (strArr2[i] == null) {
                                    break;
                                }
/* 122 */                       iI00000oIO = i + 1;
/* 124 */                       length3 = strArr2.length;
                            }
/* 126 */                   int i9 = this.I00ilI0I1;
/* 131 */                   if (i9 == this.I00iio.length && i9 != 0) {
/* 136 */                       int i10 = 0;
                                while (true) {
/* 137 */                           iArr = this.I00iio;
/* 139 */                           if (i2 >= i9) {
                                        break;
                                    }
/* 141 */                           int i11 = iArr[i2];
/* 143 */                           if (i11 >= 0 && this.I00iOIl[i11] != null) {
/* 153 */                               iArr[i10] = i11;
/* 151 */                               i10++;
                                    }
/* 156 */                           i2++;
                                }
/* 159 */                       int length4 = iArr.length;
/* 161 */                       for (int i12 = i10; i12 < length4; i12++) {
/* 165 */                           this.I00iio[i12] = -1;
                                }
/* 170 */                       this.I00ilI0I1 = i10;
/* 172 */                       i9 = i10;
                            }
/* 175 */                   this.I00iOIl[i] = str;
/* 179 */                   this.I00iiI[i] = obj;
/* 181 */                   int[] iArr5 = this.I00iio;
/* 185 */                   this.I00ilI0I1 = i9 + 1;
/* 187 */                   iArr5[i9] = i;
                            this.I00iiO++;
/* 195 */                   return null;
                        }
/* 201 */               if (str3.equalsIgnoreCase(str)) {
/* 203 */                   Object[] objArr2 = this.I00iiI;
/* 205 */                   Object obj2 = objArr2[length];
/* 207 */                   objArr2[length] = obj;
/* 209 */                   return obj2;
                        }
/* 217 */               length = (length + 1) & (this.I00iOIl.length - 1);
                    }
                }

                @Override
                public final void clear() {
/* 3 */             if (this.I00iiO > 0) {
/* 8 */                 I1IoiO1l.I00111O(this.I00iOIl, null);
/* 13 */                I1IoiO1l.I00111O(this.I00iiI, null);
/* 16 */                int[] iArr = this.I00iio;
/* 21 */                Arrays.fill(iArr, 0, iArr.length, -1);
/* 24 */                this.I00iiO = 0;
/* 26 */                this.I00ilI0I1 = 0;
                    }
                }

                @Override
                public final boolean containsKey(Object obj) {
                    return (obj instanceof String) && I00000oIO((String) obj) >= 0;
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 2 */             if (obj == null || this.I00iiO == 0) {
/* 1 */                 return false;
                    }
/* 12 */            int length = this.I00iiI.length;
/* 14 */            for (int i = 0; i < length; i++) {
/* 20 */                if (this.I00iOIl[i] != null && O0000Ioio00.I0000O(this.I00iiI[i], obj)) {
/* 32 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                @Override
                public final Set entrySet() {
/* 1 */             IO0iil iO0iil = this.I00io1l;
/* 3 */             if (iO0iil != null) {
/* 5 */                 return iO0iil;
                    }
/* 9 */             IO0iil iO0iil2 = new IO0iil(this, 0);
/* 12 */            this.I00io1l = iO0iil2;
/* 29 */            return iO0iil2;
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IO0l0Il0lO0)) {
/* 7 */                 return false;
                    }
/* 11 */            IO0l0Il0lO0 iO0l0Il0lO0 = (IO0l0Il0lO0) obj;
/* 17 */            if (iO0l0Il0lO0.I00iiO != this.I00iiO) {
/* 7 */                 return false;
                    }
/* 22 */            int length = this.I00iOIl.length;
/* 24 */            for (int i = 0; i < length; i++) {
/* 28 */                String str = this.I00iOIl[i];
/* 30 */                if (str != null) {
/* 44 */                    if (!O0000Ioio00.I0000O(iO0l0Il0lO0.get(str), this.I00iiI[i])) {
/* 7 */                         return false;
                            }
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public final Object get(Object obj) {
                    int iI00000oIO;
/* 4 */             if ((obj instanceof String) && (iI00000oIO = I00000oIO((String) obj)) >= 0) {
/* 17 */                return this.I00iiI[iI00000oIO];
                    }
/* 3 */             return null;
                }

                @Override
                public final int hashCode() {
/* 3 */             int length = this.I00iOIl.length;
/* 6 */             int iHashCode = 0;
/* 7 */             for (int i = 0; i < length; i++) {
/* 11 */                String str = this.I00iOIl[i];
/* 13 */                if (str != null) {
/* 15 */                    int iI00000oIO = iOl11Ioo0O.I00000oIO(str);
/* 21 */                    Object obj = this.I00iiI[i];
/* 32 */                    iHashCode += iI00000oIO ^ (obj != null ? obj.hashCode() : 0);
                        }
                    }
/* 113 */           return iHashCode;
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iiO == 0;
                }

                @Override
                public final Set keySet() {
/* 1 */             IO0iil iO0iil = this.I00ilO0;
/* 3 */             if (iO0iil != null) {
/* 5 */                 return iO0iil;
                    }
/* 9 */             IO0iil iO0iil2 = new IO0iil(this, 1);
/* 12 */            this.I00ilO0 = iO0iil2;
/* 29 */            return iO0iil2;
                }

                @Override
                public final void putAll(Map map) {
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 31 */                put((String) entry.getKey(), entry.getValue());
                    }
                }

                @Override
                public final Object remove(Object obj) {
                    int iI00000oIO;
                    int i;
/* 4 */             if (!(obj instanceof String) || (iI00000oIO = I00000oIO((String) obj)) < 0) {
/* 3 */                 return null;
                    }
/* 18 */            Object obj2 = this.I00iiI[iI00000oIO];
/* 20 */            int i2 = this.I00ilI0I1;
/* 23 */            int i3 = 0;
                    while (true) {
/* 25 */                if (i3 >= i2) {
                            break;
                        }
/* 27 */                int[] iArr = this.I00iio;
/* 31 */                if (iArr[i3] == iI00000oIO) {
/* 33 */                    iArr[i3] = -1;
                            break;
                        }
/* 36 */                i3++;
                    }
/* 39 */            String[] strArr = this.I00iOIl;
/* 41 */            strArr[iI00000oIO] = null;
/* 45 */            this.I00iiI[iI00000oIO] = null;
                    this.I00iiO--;
/* 52 */            int i4 = iI00000oIO + 1;
/* 54 */            int length = strArr.length;
                    while (true) {
/* 57 */                int i5 = i4 & (length - 1);
/* 58 */                String[] strArr2 = this.I00iOIl;
/* 60 */                String str = strArr2[i5];
/* 62 */                if (str == null) {
/* 186 */                   return obj2;
                        }
/* 64 */                Object[] objArr = this.I00iiI;
/* 66 */                Object obj3 = objArr[i5];
/* 68 */                strArr2[i5] = null;
/* 70 */                objArr[i5] = null;
                        this.I00iiO--;
/* 77 */                int iI00000oIO2 = iOl11Ioo0O.I00000oIO(str);
/* 83 */                int length2 = this.I00iOIl.length;
                        while (true) {
/* 86 */                    i = iI00000oIO2 & (length2 - 1);
/* 87 */                    String[] strArr3 = this.I00iOIl;
/* 89 */                    String str2 = strArr3[i];
/* 91 */                    if (str2 == null) {
/* 93 */                        strArr3[i] = str;
/* 97 */                        this.I00iiI[i] = obj3;
                                this.I00iiO++;
                                break;
                            }
/* 110 */                   if (str2.equalsIgnoreCase(str)) {
/* 114 */                       this.I00iiI[i] = obj3;
                                break;
                            }
/* 139 */                   iI00000oIO2 = i + 1;
/* 143 */                   length2 = this.I00iOIl.length;
                        }
/* 116 */               int i6 = this.I00ilI0I1;
/* 118 */               int i7 = 0;
                        while (true) {
/* 119 */                   if (i7 < i6) {
/* 121 */                       int[] iArr2 = this.I00iio;
/* 125 */                       if (iArr2[i7] == i5) {
/* 127 */                           iArr2[i7] = i;
                                    break;
                                }
/* 130 */                       i7++;
                            }
                        }
/* 133 */               i4 = i5 + 1;
/* 137 */               length = this.I00iOIl.length;
                    }
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Collection values() {
/* 1 */             IO0ioo1i0oo iO0ioo1i0oo = this.I00ioIO;
/* 3 */             if (iO0ioo1i0oo != null) {
/* 5 */                 return iO0ioo1i0oo;
                    }
/* 8 */             IO0ioo1i0oo iO0ioo1i0oo2 = new IO0ioo1i0oo(this);
/* 11 */            this.I00ioIO = iO0ioo1i0oo2;
/* 29 */            return iO0ioo1i0oo2;
                }
            }
