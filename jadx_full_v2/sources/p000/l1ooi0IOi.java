            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public abstract class l1ooi0IOi {
                public static float[] I00000oIO(float[] fArr, int i) {
/* 1 */             if (i < 0) {
/* 23 */                OIiilo1Ool0o.I00100o1O0lo();
/* 26 */                return null;
                    }
/* 3 */             int length = fArr.length;
/* 4 */             if (length < 0) {
/* 22 */                throw new ArrayIndexOutOfBoundsException();
                    }
/* 6 */             int iMin = Math.min(i, length);
/* 10 */            float[] fArr2 = new float[i];
/* 13 */            System.arraycopy(fArr, 0, fArr2, 0, iMin);
/* 16 */            return fArr2;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
                /* JADX WARN: Removed duplicated region for block: B:72:0x00dd A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OO0iO1ll00[] I00000oOI(String str) {
                    int i;
                    String strTrim;
                    float[] fArrI00000oIO;
/* 5 */             ArrayList arrayList = new ArrayList();
/* 8 */             int i2 = 0;
/* 9 */             int i3 = 0;
/* 10 */            int i4 = 1;
/* 15 */            while (i4 < str.length()) {
/* 25 */                while (i4 < str.length()) {
/* 27 */                    char cCharAt = str.charAt(i4);
/* 36 */                    if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
/* 43 */                        if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                                    continue;
                                }
/* 50 */                        i4++;
                            }
/* 45 */                    if (cCharAt == 'e' || cCharAt == 'E') {
/* 50 */                        i4++;
                            } else {
/* 57 */                        strTrim = str.substring(i3, i4).trim();
/* 65 */                        if (!strTrim.isEmpty()) {
/* 73 */                            if (strTrim.charAt(i2) == 'z' || strTrim.charAt(i2) == 'Z') {
/* 201 */                               fArrI00000oIO = new float[i2];
                                    } else {
                                        try {
/* 89 */                                    float[] fArr = new float[strTrim.length()];
/* 91 */                                    int length = strTrim.length();
/* 95 */                                    int i5 = i2;
/* 96 */                                    int i6 = 1;
/* 97 */                                    while (i6 < length) {
/* 99 */                                        int i7 = i2;
/* 100 */                                       int i8 = i7;
/* 101 */                                       int i9 = i8;
/* 102 */                                       int i10 = i9;
/* 109 */                                       for (int i11 = i6; i11 < strTrim.length(); i11++) {
/* 111 */                                           char cCharAt2 = strTrim.charAt(i11);
/* 117 */                                           if (cCharAt2 == ' ') {
/* 146 */                                               i7 = 0;
/* 147 */                                               i9 = 1;
/* 148 */                                               if (i9 != 0) {
                                                        }
                                                    } else {
/* 119 */                                               if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                            switch (cCharAt2) {
                                                                case ',':
                                                                    break;
                                                                case BuildConfig.VERSION_CODE:
/* 137 */                                                           if (i11 != i6 && i7 == 0) {
/* 132 */                                                               i7 = 0;
/* 133 */                                                               i9 = 1;
/* 134 */                                                               i10 = 1;
                                                                        break;
                                                                    }
/* 142 */                                                           i7 = 0;
                                                                    break;
                                                                case '.':
/* 127 */                                                           if (i8 == 0) {
/* 129 */                                                               i7 = 0;
/* 130 */                                                               i8 = 1;
                                                                        break;
                                                                    } else {
/* 132 */                                                               i7 = 0;
/* 133 */                                                               i9 = 1;
/* 134 */                                                               i10 = 1;
                                                                        break;
                                                                    }
                                                                default:
/* 142 */                                                           i7 = 0;
                                                                    break;
                                                            }
                                                        } else {
/* 144 */                                                   i7 = 1;
                                                        }
/* 148 */                                               if (i9 != 0) {
                                                        }
                                                    }
/* 155 */                                           if (i6 < i11) {
/* 167 */                                               fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
/* 157 */                                               i5++;
                                                    }
/* 178 */                                           i6 = i10 == 0 ? i11 : i11 + 1;
/* 176 */                                           i2 = 0;
                                                }
/* 155 */                                       if (i6 < i11) {
                                                }
/* 178 */                                       if (i10 == 0) {
                                                }
/* 176 */                                       i2 = 0;
                                            }
/* 181 */                                   fArrI00000oIO = I00000oIO(fArr, i5);
/* 186 */                                   i2 = 0;
                                        } catch (NumberFormatException e) {
/* 196 */                                   OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("error in parsing \"", strTrim, "\""), e);
/* 199 */                                   return null;
                                        }
                                    }
/* 203 */                           char cCharAt3 = strTrim.charAt(i2);
/* 209 */                           OO0iO1ll00 oO0iO1ll00 = new OO0iO1ll00();
/* 212 */                           oO0iO1ll00.I00000oIO = cCharAt3;
/* 214 */                           oO0iO1ll00.I00000oOI = fArrI00000oIO;
/* 216 */                           VarHandle.storeStoreFence();
/* 219 */                           arrayList.add(oO0iO1ll00);
                                }
/* 224 */                       i3 = i4;
/* 222 */                       i4++;
/* 226 */                       i2 = 0;
                            }
                        }
/* 57 */                strTrim = str.substring(i3, i4).trim();
/* 65 */                if (!strTrim.isEmpty()) {
                        }
/* 224 */               i3 = i4;
/* 222 */               i4++;
/* 226 */               i2 = 0;
                    }
/* 231 */           if (i4 - i3 != 1 || i3 >= str.length()) {
/* 262 */               i = 0;
                    } else {
/* 239 */               char cCharAt4 = str.charAt(i3);
/* 243 */               i = 0;
/* 248 */               OO0iO1ll00 oO0iO1ll002 = new OO0iO1ll00();
/* 251 */               oO0iO1ll002.I00000oIO = cCharAt4;
/* 253 */               oO0iO1ll002.I00000oOI = new float[0];
/* 255 */               VarHandle.storeStoreFence();
/* 258 */               arrayList.add(oO0iO1ll002);
                    }
/* 269 */           return (OO0iO1ll00[]) arrayList.toArray(new OO0iO1ll00[i]);
                }

                public static OO0iO1ll00[] I0000Il00O(OO0iO1ll00[] oO0iO1ll00Arr) {
/* 2 */             OO0iO1ll00[] oO0iO1ll00Arr2 = new OO0iO1ll00[oO0iO1ll00Arr.length];
/* 6 */             for (int i = 0; i < oO0iO1ll00Arr.length; i++) {
/* 10 */                OO0iO1ll00 oO0iO1ll00 = oO0iO1ll00Arr[i];
/* 12 */                OO0iO1ll00 oO0iO1ll002 = new OO0iO1ll00();
/* 17 */                oO0iO1ll002.I00000oIO = oO0iO1ll00.I00000oIO;
/* 19 */                float[] fArr = oO0iO1ll00.I00000oOI;
/* 26 */                oO0iO1ll002.I00000oOI = I00000oIO(fArr, fArr.length);
/* 28 */                oO0iO1ll00Arr2[i] = oO0iO1ll002;
                    }
/* 77 */            return oO0iO1ll00Arr2;
                }
            }
