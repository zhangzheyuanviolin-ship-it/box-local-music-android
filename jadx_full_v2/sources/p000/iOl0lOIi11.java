            package p000;

            import android.graphics.drawable.Drawable;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.EOFException;
            import java.lang.invoke.VarHandle;
            import java.security.KeyFactory;
            import java.security.Provider;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
/* 53 */    public final class iOl0lOIi11 implements Ii100OlIo10, OolOliOI0Oii, Oi1lO01iooI, ioIli1, IIO1Oili, IOoOOI1ii, Il0OlI, OolIii00oi1, OIi0011o, i1lOii1oOOO, iiIi1oo0Io, lo11I0lO {
                public static iOl0lOIi11 I00iiI;
                public static final iOl0lOIi11 I00iiO = new iOl0lOIi11(1);
                public static final iOl0lOIi11 I00iio = new iOl0lOIi11(2);
                public static final iOl0lOIi11 I00ilI0I1 = new iOl0lOIi11(3);
                public static final iOl0lOIi11 I00ilO0 = new iOl0lOIi11(4);
                public static final iOl0lOIi11 I00io1l = new iOl0lOIi11(5);
                public static final iOl0lOIi11 I00ioIO = new iOl0lOIi11(6);
                public static final iOl0lOIi11 I00l0I0l0lO1 = new iOl0lOIi11(7);
                public static final iOl0lOIi11 I00l0OO0IO = new iOl0lOIi11(8);
                public static final iOl0lOIi11 I00li1OI = new iOl0lOIi11(20);
                public static final iOl0lOIi11 I00ll1 = new iOl0lOIi11(21);
                public static final iOl0lOIi11 I00lli11 = new iOl0lOIi11(22);
                public static final iOl0lOIi11 I00lll10 = new iOl0lOIi11(24);
                public static final iOl0lOIi11 I00o0iI0io1 = new iOl0lOIi11(25);
                public static final iOl0lOIi11 I00o0l1o1o0 = new iOl0lOIi11(27);
                public final int I00iOIl;

                public iOl0lOIi11(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static String I000O01llI0(String str, int i, int i2, String str2, int i3) throws EOFException {
/* 12 */            int i4 = (i3 & 1) != 0 ? 0 : i;
/* 23 */            int length = (i3 & 2) != 0 ? str.length() : i2;
/* 32 */            boolean z = (i3 & 8) == 0;
/* 39 */            boolean z2 = (i3 & 16) == 0;
/* 46 */            boolean z3 = (i3 & 32) == 0;
/* 49 */            boolean z4 = (i3 & 64) == 0;
/* 53 */            int iCharCount = i4;
/* 54 */            while (iCharCount < length) {
/* 56 */                int iCodePointAt = str.codePointAt(iCharCount);
/* 60 */                int i5 = Barcode.FORMAT_ITF;
/* 62 */                int i6 = 32;
/* 70 */                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || OlOoOIi0o.I00100l0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !I000OiO(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
/* 110 */                   III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 113 */                   iII1o0lOio0.I00oliIiO01i(i4, iCharCount, str);
/* 116 */                   III1o0lOio0 iII1o0lOio02 = null;
/* 117 */                   while (iCharCount < length) {
/* 119 */                       int iCodePointAt2 = str.codePointAt(iCharCount);
/* 123 */                       if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
/* 142 */                           if (iCodePointAt2 == 43 && z3) {
/* 153 */                               iII1o0lOio0.I00oo1iO0ll(z ? "+" : "%2B");
                                    } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z4) || OlOoOIi0o.I00100l0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !I000OiO(iCharCount, length, str)))))) {
/* 193 */                               if (iII1o0lOio02 == null) {
/* 197 */                                   iII1o0lOio02 = new III1o0lOio0();
                                        }
/* 200 */                               iII1o0lOio02.I00ooIo0(iCodePointAt2);
/* 207 */                               while (!iII1o0lOio02.I00II0Ol1O0l()) {
/* 209 */                                   byte b = iII1o0lOio02.readByte();
/* 217 */                                   iII1o0lOio0.I00lll10(37);
/* 224 */                                   char[] cArr = IoOi01OlIl1o.I000OiO;
/* 228 */                                   iII1o0lOio0.I00lll10(cArr[((b & 255) >> 4) & 15]);
/* 235 */                                   iII1o0lOio0.I00lll10(cArr[b & 15]);
                                        }
                                    } else {
/* 187 */                               iII1o0lOio0.I00ooIo0(iCodePointAt2);
                                    }
                                }
/* 247 */                       iCharCount += Character.charCount(iCodePointAt2);
/* 249 */                       i5 = Barcode.FORMAT_ITF;
/* 251 */                       i6 = 32;
                            }
/* 255 */                   return iII1o0lOio0.I00Ol00();
                        }
/* 106 */               iCharCount += Character.charCount(iCodePointAt);
                    }
/* 260 */           return str.substring(i4, length);
                }

                public static Ol1il1o1 I000OOo1O() {
/* 7 */             return (Ol1il1o1) Ol1l1lI1Ili.I00000oOI.I0010I0i();
                }

                public static boolean I000OiO(int i, int i2, String str) {
/* 1 */             int i3 = i + 2;
                    return i3 < i2 && str.charAt(i) == '%' && OollIoI001lo.I00100o1O0lo(str.charAt(i + 1)) != -1 && OollIoI001lo.I00100o1O0lo(str.charAt(i3)) != -1;
                }

                public static Ol1il1o1 I000iOII(Ol1il1o1 ol1il1o1) {
/* 4 */             if (ol1il1o1 instanceof OoIOO1001) {
/* 7 */                 OoIOO1001 ooIOO1001 = (OoIOO1001) ol1il1o1;
/* 17 */                if (ooIOO1001.I00111O == lOllI0.I00000oIO()) {
/* 19 */                    ooIOO1001.I0010I0i = null;
/* 21 */                    return ol1il1o1;
                        }
                    }
/* 24 */            if (ol1il1o1 instanceof OoIOOo1) {
/* 27 */                OoIOOo1 ooIOOo1 = (OoIOOo1) ol1il1o1;
/* 37 */                if (ooIOOo1.I000OOo1O == lOllI0.I00000oIO()) {
/* 39 */                    ooIOOo1.I000O01llI0 = null;
/* 41 */                    return ol1il1o1;
                        }
                    }
/* 43 */            Ol1il1o1 ol1il1o1I0000oI00 = Ol1l1lI1Ili.I0000oI00(ol1il1o1, null, false);
/* 47 */            ol1il1o1I0000oI00.I000OiO();
/* 77 */            return ol1il1o1I0000oI00;
                }

                public static Object I000l1(IOli1011IlIo iOli1011IlIo, IllOOo00lI illOOo00lI) {
                    Ol1il1o1 ooIOO1001;
/* 7 */             Ol1il1o1 ol1il1o1 = (Ol1il1o1) Ol1l1lI1Ili.I00000oOI.I0010I0i();
/* 11 */            if (ol1il1o1 instanceof OoIOO1001) {
/* 14 */                OoIOO1001 ooIOO10012 = (OoIOO1001) ol1il1o1;
/* 24 */                if (ooIOO10012.I00111O == lOllI0.I00000oIO()) {
/* 26 */                    Function1 function1 = ooIOO10012.I0010I0i;
/* 28 */                    Function1 function12 = ooIOO10012.I0010o;
                            try {
/* 38 */                        ((OoIOO1001) ol1il1o1).I0010I0i = Ol1l1lI1Ili.I000OOo1O(iOli1011IlIo, function1, true);
/* 42 */                        ((OoIOO1001) ol1il1o1).I0010o = function12;
/* 44 */                        return illOOo00lI.invoke();
                            } finally {
/* 55 */                        ooIOO10012.I0010I0i = function1;
/* 57 */                        ooIOO10012.I0010o = function12;
                            }
                        }
                    }
/* 60 */            if (ol1il1o1 == null || (ol1il1o1 instanceof OI10OloOOoi)) {
/* 87 */                ooIOO1001 = new OoIOO1001(ol1il1o1 instanceof OI10OloOOoi ? (OI10OloOOoi) ol1il1o1 : null, iOli1011IlIo, null, true, false);
                    } else {
/* 68 */                ooIOO1001 = ol1il1o1.I001IIilI0O(iOli1011IlIo);
                    }
                    try {
/* 91 */                Ol1il1o1 ol1il1o1I000OiO = ooIOO1001.I000OiO();
                        try {
/* 95 */                    Object objInvoke = illOOo00lI.invoke();
/* 99 */                    Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
/* 102 */                   ooIOO1001.I0000Il00O();
/* 105 */                   return objInvoke;
                        } catch (Throwable th) {
/* 111 */                   Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
/* 114 */                   throw th;
                        }
                    } catch (Throwable th2) {
/* 115 */               ooIOO1001.I0000Il00O();
/* 332 */               throw th2;
                    }
                }

                public static String I000lI(int i, int i2, int i3, String str) {
                    int i4;
/* 4 */             if ((i3 & 1) != 0) {
/* 6 */                 i = 0;
                    }
/* 9 */             if ((i3 & 2) != 0) {
/* 11 */                i2 = str.length();
                    }
/* 17 */            boolean z = (i3 & 4) == 0;
/* 21 */            int iCharCount = i;
/* 22 */            while (iCharCount < i2) {
/* 24 */                char cCharAt = str.charAt(iCharCount);
/* 32 */                if (cCharAt == '%' || (cCharAt == '+' && z)) {
/* 44 */                    III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 47 */                    iII1o0lOio0.I00oliIiO01i(i, iCharCount, str);
/* 50 */                    while (iCharCount < i2) {
/* 52 */                        int iCodePointAt = str.codePointAt(iCharCount);
/* 56 */                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
/* 68 */                            int iI00100o1O0lo = OollIoI001lo.I00100o1O0lo(str.charAt(iCharCount + 1));
/* 76 */                            int iI00100o1O0lo2 = OollIoI001lo.I00100o1O0lo(str.charAt(i4));
/* 81 */                            if (iI00100o1O0lo == -1 || iI00100o1O0lo2 == -1) {
/* 110 */                               iII1o0lOio0.I00ooIo0(iCodePointAt);
/* 117 */                               iCharCount += Character.charCount(iCodePointAt);
                                    } else {
/* 88 */                                iII1o0lOio0.I00lll10((iI00100o1O0lo << 4) + iI00100o1O0lo2);
/* 95 */                                iCharCount = Character.charCount(iCodePointAt) + i4;
                                    }
                                } else if (iCodePointAt == 43 && z) {
/* 104 */                           iII1o0lOio0.I00lll10(32);
/* 107 */                           iCharCount++;
                                } else {
/* 110 */                           iII1o0lOio0.I00ooIo0(iCodePointAt);
/* 117 */                           iCharCount += Character.charCount(iCodePointAt);
                                }
                            }
/* 119 */                   return iII1o0lOio0.I00Ol00();
                        }
/* 39 */                iCharCount++;
                    }
/* 124 */           return str.substring(i, i2);
                }

                public static void I000oI1ioi(Ol1il1o1 ol1il1o1, Ol1il1o1 ol1il1o12, Function1 function1) {
/* 1 */             if (ol1il1o1 != ol1il1o12) {
/* 27 */                ol1il1o12.getClass();
/* 30 */                Ol1il1o1.I00100o1O0lo(ol1il1o1);
/* 33 */                ol1il1o12.I0000Il00O();
                    } else if (ol1il1o1 instanceof OoIOO1001) {
/* 9 */                 ((OoIOO1001) ol1il1o1).I0010I0i = function1;
                    } else if (ol1il1o1 instanceof OoIOOo1) {
/* 18 */                ((OoIOOo1) ol1il1o1).I000O01llI0 = function1;
                    } else {
/* 23 */                IOOlIIilOl0.I000lI("Non-transparent snapshot was reused: ", ol1il1o1);
                    }
                }

                public static ArrayList I00100l0(String str) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             int i = 0;
/* 11 */            while (i <= str.length()) {
/* 16 */                int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, '&', i, 4);
/* 21 */                if (iI001i1O0Ol == -1) {
/* 23 */                    iI001i1O0Ol = str.length();
                        }
/* 29 */                int iI001i1O0Ol2 = OlOoOIi0o.I001i1O0Ol(str, '=', i, 4);
/* 33 */                if (iI001i1O0Ol2 == -1 || iI001i1O0Ol2 > iI001i1O0Ol) {
/* 59 */                    arrayList.add(str.substring(i, iI001i1O0Ol));
/* 63 */                    arrayList.add(null);
                        } else {
/* 42 */                    arrayList.add(str.substring(i, iI001i1O0Ol2));
/* 51 */                    arrayList.add(str.substring(iI001i1O0Ol2 + 1, iI001i1O0Ol));
                        }
/* 66 */                i = iI001i1O0Ol + 1;
                    }
/* 77 */            return arrayList;
                }

                public static void I0010I0i(StringBuilder sb, ArrayList arrayList) {
/* 11 */            IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, arrayList.size()), 2);
/* 15 */            int i = iooO0oO00II000II.I00iOIl;
/* 17 */            int i2 = iooO0oO00II000II.I00iiI;
/* 19 */            int i3 = iooO0oO00II000II.I00iiO;
/* 21 */            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
/* 106 */               return;
                    }
                    while (true) {
/* 33 */                String str = (String) arrayList.get(i);
/* 41 */                String str2 = (String) arrayList.get(i + 1);
/* 43 */                if (i > 0) {
/* 47 */                    sb.append('&');
                        }
/* 50 */                sb.append(str);
/* 53 */                if (str2 != null) {
/* 57 */                    sb.append('=');
/* 60 */                    sb.append(str2);
                        }
/* 63 */                if (i == i2) {
/* 106 */                   return;
                        } else {
/* 65 */                    i += i3;
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
                
                    if (r12[r13] <= (-65)) goto L11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
                
                    r13 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
                
                    if (r12[r13] <= (-65)) goto L11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x008c, code lost:
                
                    if (r12[r13] <= (-65)) goto L11;
                 */
                /* JADX WARN: Removed duplicated region for block: B:62:0x009b A[ADDED_TO_REGION, LOOP:1: B:62:0x009b->B:124:0x009b, LOOP_START, PHI: r13
                  0x009b: PHI (r13v3 int) = (r13v2 int), (r13v7 int) binds: [B:60:0x0098, B:124:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static int I0010o(int i, byte[] bArr, int i2, int i3) {
                    int i4;
                    int i5;
/* 15 */            if (i == 0) {
/* 144 */               while (i2 < i3 && bArr[i2] >= 0) {
/* 150 */                   i2++;
                        }
/* 153 */               if (i2 < i3) {
/* 156 */                   while (i2 < i3) {
/* 159 */                       int i6 = i2 + 1;
/* 161 */                       byte b = bArr[i2];
/* 163 */                       if (b >= 0) {
/* 248 */                           i2 = i6;
                                } else if (b < -32) {
/* 167 */                           if (i6 >= i3) {
/* 169 */                               return b;
                                    }
/* 170 */                           if (b >= -62) {
/* 172 */                               i2 += 2;
/* 176 */                               if (bArr[i6] > -65) {
                                        }
                                    }
                                } else if (b < -16) {
/* 183 */                           if (i6 >= i3 - 1) {
/* 185 */                               return l0O1O1.I00000oIO(bArr, i6, i3);
                                    }
/* 190 */                           int i7 = i2 + 2;
/* 192 */                           byte b2 = bArr[i6];
/* 194 */                           if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
/* 204 */                               i2 += 3;
/* 208 */                               if (bArr[i7] > -65) {
                                        }
                                    }
                                } else {
/* 213 */                           if (i6 >= i3 - 2) {
/* 215 */                               return l0O1O1.I00000oIO(bArr, i6, i3);
                                    }
/* 220 */                           int i8 = i2 + 2;
/* 222 */                           byte b3 = bArr[i6];
/* 224 */                           if (b3 <= -65) {
/* 233 */                               if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
/* 235 */                                   int i9 = i2 + 3;
/* 239 */                                   if (bArr[i8] <= -65) {
/* 241 */                                       i2 += 4;
/* 245 */                                       if (bArr[i9] > -65) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
/* 7 */                 return 0;
                    }
/* 17 */            if (i2 >= i3) {
/* 19 */                return i;
                    }
/* 20 */            byte b4 = (byte) i;
/* 21 */            if (b4 >= -32) {
/* 36 */                int i10 = ~(i >> 8);
/* 37 */                if (b4 < -16) {
/* 39 */                    byte b5 = (byte) i10;
/* 40 */                    if (b5 == 0) {
/* 42 */                        int i11 = i2 + 1;
/* 44 */                        byte b6 = bArr[i2];
/* 46 */                        if (i11 >= i3) {
/* 52 */                            return l0O1O1.I0000O(b4, b6);
                                }
/* 49 */                        i2 = i11;
/* 50 */                        b5 = b6;
                            }
/* 57 */                    if (b5 <= -65 && ((b4 != -32 || b5 >= -96) && (b4 != -19 || b5 < -96))) {
/* 67 */                        i5 = i2 + 1;
                            }
                        } else {
/* 74 */                    byte b7 = (byte) i10;
/* 75 */                    if (b7 == 0) {
/* 77 */                        int i12 = i2 + 1;
/* 79 */                        b7 = bArr[i2];
/* 81 */                        if (i12 >= i3) {
/* 86 */                            return l0O1O1.I0000O(b4, b7);
                                }
/* 83 */                        i2 = i12;
/* 84 */                        i4 = 0;
                            } else {
/* 91 */                        i4 = i >> 16;
                            }
/* 93 */                    if (i4 == 0) {
/* 95 */                        int i13 = i2 + 1;
/* 97 */                        byte b8 = bArr[i2];
/* 99 */                        if (i13 >= i3) {
/* 105 */                           iOl0lOIi11 iol0loii11 = l0O1O1.I00000oIO;
/* 109 */                           if (b4 > -12 || b7 > -65 || b8 > -65) {
/* 14 */                                return -1;
                                    }
/* 121 */                           return ((b7 << 8) ^ b4) ^ (b8 << 16);
                                }
/* 102 */                       i2 = i13;
/* 103 */                       i4 = b8;
                            }
/* 124 */                   if (b7 <= -65) {
/* 133 */                       if ((((b7 + 112) + (b4 << 28)) >> 30) == 0 && i4 <= -65) {
/* 137 */                           i5 = i2 + 1;
                                }
                            }
                        }
                    } else if (b4 >= -62) {
/* 25 */                i5 = i2 + 1;
                    }
/* 144 */           while (i2 < i3) {
/* 150 */               i2++;
                    }
/* 153 */           if (i2 < i3) {
                    }
/* 7 */             return 0;
/* 14 */            return -1;
                }

                public static synchronized void I00111O() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new iOl0lOIi11(0);
                    }
                }

                public static void I001IIilI0O(i1IoOl i1iool, Map.Entry entry) {
/* 5 */             ill110ll ill110llVar = (ill110ll) entry.getKey();
/* 7 */             l0OIO1o l0oio1o = l0OIO1o.I00iiI;
/* 9 */             ill110llVar.getClass();
/* 37 */            throw null;
                }

                @Override
                public byte[] I00000oIO(byte[] bArr, int i, int i2) {
/* 2 */             return Arrays.copyOfRange(bArr, i, i2 + i);
                }

                @Override
                public long I00000oOI(long j, long j2) {
/* 1 */             float fI00000oIO = iioI1oI00I.I00000oIO(j, j2);
/* 26 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fI00000oIO) << 32) | (Float.floatToRawIntBits(fI00000oIO) & 4294967295L);
/* 27 */            int i = OiO101lO.I00000oIO;
/* 37 */            return jFloatToRawIntBits;
                }

                @Override
                public Object I0000Il00O(IIl00I iIl00I, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             return Boolean.FALSE;
                }

                @Override
                public boolean I0000O() {
/* 1 */             return false;
                }

                @Override
                public Object I0000oI00(String str, Provider provider) {
                    return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
                }

                @Override
                public Iterable I0001Ioi1lo(Object obj) {
/* 3 */             int i = O0lO0l1iOO.I00100l0;
/* 35 */            IlIo0o ilIo0o = new IlIo0o(new OoI10o0iO11O(IOOi0Ool1i.I001IO000(((OI000ilOol) obj).I000OOo1O().I0000oI00()), IiOi0I1.I00oO101o), false, new OiioI1Io0o(4));
/* 41 */            I1IollOi01 i1IollOi01 = new I1IollOi01(2);
/* 44 */            i1IollOi01.I00iiI = ilIo0o;
/* 46 */            VarHandle.storeStoreFence();
/* 77 */            return i1IollOi01;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000II(Drawable drawable, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(257732500);
/* 17 */            int i2 = i | (iloI0lOlll1.I000OOo1O(drawable) ? 4 : 2);
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 38 */                O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(O1ooIo101ll.I00000oIO, IOoiIOo1.I0000oI00);
/* 42 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(drawable);
/* 46 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 50 */                if (!zI000OOo1O) {
                            Object obj = objI00O0i0ii;
/* 54 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 59 */                        Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(5);
/* 62 */                        ol1OiIli00Ii.I00iiI = drawable;
/* 64 */                        VarHandle.storeStoreFence();
/* 67 */                        iloI0lOlll1.I00iio(ol1OiIli00Ii);
                                obj = ol1OiIli00Ii;
                            }
/* 76 */                    II1oOI10.I00000oIO(iIO01l11OlO.I00000oIO(o1ooiI111iI000lI, (Function1) obj), iloI0lOlll1, 0);
                        }
                    } else {
/* 80 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 83 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 87 */            if (oOloioIlI001IO000 != null) {
/* 93 */                O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(29);
/* 96 */                o1oiiIIo111o.I00iiI = this;
/* 98 */                o1oiiIIo111o.I00iiO = drawable;
/* 100 */               VarHandle.storeStoreFence();
/* 103 */               oOloioIlI001IO000.I0000O = o1oiiIIo111o;
                    }
                }

                @Override
                public OI0oiliol10O I000o00OoI0I() {
/* 1 */             return OI0oiliol10O.I000OOo1O();
                }

                @Override
                public OolIl0ii1 I00100o1O0lo() {
/* 3 */             return new O1ll0OooIO();
                }

                @Override
                public void onFailure(Exception exc) {
/* 16 */            i0OOOllloIII.I000OiO.I0000oI00(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 131 */                   List list = iol1II1ii1i.I00000oIO;
/* 147 */                   return (String) iIII0oi.I00000oIO.get();
                        case PoseLandmark.LEFT_THUMB:
/* 96 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 100 */                   iI1lO0li.I00iiI.get();
/* 126 */                   return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue());
                        case PoseLandmark.RIGHT_THUMB:
/* 70 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 74 */                    iI1lO0li.I00iiI.get();
/* 93 */                    return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.config.url_scheme", 8, "https").get();
                        case PoseLandmark.LEFT_HIP:
                        default:
/* 8 */                     return new LinkedHashSet();
                        case PoseLandmark.RIGHT_HIP:
/* 35 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 39 */                    iI1lO0li.I00iiI.get();
/* 65 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(30, 3000L, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
                        case PoseLandmark.LEFT_KNEE:
/* 12 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 16 */                    iIO0ooOool.I00iiI.get();
/* 32 */                    return (Boolean) iIO1lO.I00000oIO.I0010o(true, "measurement.rb.attribution.client2", 1).get();
                    }
                }

                @Override
                public ioilo0olI0lI mo38zzb(Class cls) {
/* 8 */             if (!illOil.class.isAssignableFrom(cls)) {
/* 51 */                I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 7 */                 return null;
                    }
                    try {
/* 23 */                return (ioilo0olI0lI) illOil.I0001Ioi1lo(cls.asSubclass(illOil.class)).I000oI1ioi(3, null);
                    } catch (Exception e) {
/* 37 */                OIiilo1Ool0o.I000iOII("Unable to get message info for ".concat(cls.getName()), e);
/* 7 */                 return null;
                    }
                }

                @Override
                public boolean mo34zzc(Class cls) {
                    switch (this.I00iOIl) {
                        case 7:
/* 10 */                    return illOil.class.isAssignableFrom(cls);
                        default:
/* 6 */                     return false;
                    }
                }

                @Override
/* 54 */        public i1o1Ioll0I zzb(Class cls) {
/* 55 */            throw new IllegalStateException("This should never be called.");
                }
            }
